/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.common.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;

import org.lunifera.ecview.core.common.disposal.AbstractDisposable;
import org.lunifera.ecview.core.common.editpart.IExposedActionEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.services.IWidgetAssocationsService;
import org.lunifera.ecview.core.common.tooling.IWidgetMouseClickService;
import org.lunifera.ecview.core.common.visibility.IVisibilityManager;
import org.lunifera.ecview.core.common.visibility.impl.VisibilityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the {@link IViewContext}.
 */
public class ViewContext extends DisposableContext implements IViewContext {

	private static final Logger logger = LoggerFactory
			.getLogger(ViewContext.class);

	// preparations for final disposal after view has been disposed
	private Map<String, Object> finalDispose = new HashMap<String, Object>();

	private VisibilityManager visibilityManager;
	private final IViewEditpart viewEditpart;
	private Object rootLayout;
	private String presentationURI;

	private boolean rendered;

	/**
	 * Default Constructor for tests only! Do not use.
	 */
	protected ViewContext() {
		this.viewEditpart = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param viewEditpart
	 *            The view editpart
	 */
	public ViewContext(IViewEditpart viewEditpart) {
		this.viewEditpart = viewEditpart;
		this.viewEditpart.setContext(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPresentationURI() {
		checkDisposed();

		return presentationURI;
	}

	/**
	 * Delegates the service request to the view set.
	 * 
	 * @param selector
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected <S> S delegateGetService(String selector) {
		IViewSetContext parentContext = getParentContext();

		if (selector.equals(ILocaleChangedService.ID)) {
			LocaleChangedService service = new LocaleChangedService();
			registerService(selector, service);
			return (S) service;
		} else if (selector.equals(IWidgetMouseClickService.ID)) {
			IWidgetMouseClickService service = getViewEditpart().createService(
					IWidgetMouseClickService.class);
			registerService(selector, service);
			return (S) service;
		} else if (selector.equals(IWidgetAssocationsService.ID)) {
			IWidgetAssocationsService<?, ?> service = getViewEditpart()
					.createService(IWidgetAssocationsService.class);
			registerService(selector, service);
			return (S) service;
		} else {
			if (parentContext != null) {
				return parentContext.getService(selector);
			}
		}

		return null;
	}

	/**
	 * Sets the URI that is used to determine the UI kit that should be used to
	 * render the UI.
	 * 
	 * @param presentationURI
	 *            URI selecting the UI-Kit
	 */
	public void setPresentationURI(String presentationURI) {
		checkDisposed();

		if (isRendered()) {
			throw new IllegalArgumentException("Not valid if already rendered!");
		}

		this.presentationURI = presentationURI;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IViewEditpart getViewEditpart() {
		checkDisposed();

		return viewEditpart;
	}

	@Override
	public IVisibilityManager getVisibilityManager() {
		if (visibilityManager == null) {
			visibilityManager = new VisibilityManager(this);
		}
		return visibilityManager;
	}

	@Override
	public List<IExposedActionEditpart> getExposedActions() {
		return getViewEditpart().getExposedActions();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IViewSetContext getParentContext() {
		checkDisposed();

		IViewSetEditpart parent = viewEditpart.getParent();
		return parent != null ? parent.getContext() : null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getRootLayout() {
		checkDisposed();

		return rootLayout;
	}

	@Override
	synchronized public void dispose() {
		preDispose();

		super.dispose();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	synchronized public void render(String presentationURI, Object rootLayout,
			Map<String, Object> parameter) throws ContextException {
		checkDisposed();

		if (rootLayout == null) {
			throw new ContextException("RootLayout must not be null!");
		}

		if (rendered) {
			throw new ContextException("Has already been rendered!");
		}

		try {
			this.presentationURI = presentationURI;
			this.rootLayout = rootLayout;

			// start to render
			//
			IViewEditpart editPart = getViewEditpart();

			if (parameter != null) {
				// Set the configuration
				IConfiguration config = (IConfiguration) parameter
						.get(IViewContext.PARAM_CONFIGURATION);
				if (config != null) {
					editPart.setConfiguration(config);
				}

				// Register all services
				@SuppressWarnings("unchecked")
				Map<String, Object> services = (Map<String, Object>) parameter
						.get(IViewContext.PARAM_SERVICES);
				if (services != null) {
					for (Map.Entry<String, Object> entry : services.entrySet()) {
						registerService(entry.getKey(), entry.getValue());
					}
				}
			}

			// render the UI
			editPart.render(parameter);
		} catch (Exception ex) {
			logger.error("{}", ex);
		} finally {
			rendered = true;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isRendered() {
		checkDisposed();

		return rendered;
	}

	@Override
	public void exec(Runnable runnable) {
		checkDisposed();

		getViewEditpart().exec(runnable);
	}

	@Override
	public Future<?> execAsync(Runnable runnable) {
		checkDisposed();

		return getViewEditpart().execAsync(runnable);
	}

	@Override
	protected void updateLocale(Locale locale) {
		ILocaleChangedService service = getService(ILocaleChangedService.ID);
		if (service != null) {
			service.notifyLocaleChanged(locale);
		}
	}
	
	@Override
	public Object findModelElement(String id) {
		return viewEditpart.findModelElement(id);
	}

	protected void preDispose() {
		super.preDispose();

		finalDispose.put(IWidgetAssocationsService.class.getName(),
				getService(IWidgetAssocationsService.ID));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void internalDispose() {
		try {
			viewEditpart.dispose();

			// Clear all associations
			@SuppressWarnings("rawtypes")
			IWidgetAssocationsService service = (IWidgetAssocationsService) finalDispose
					.get(IWidgetAssocationsService.ID);
			service.clear();
			finalDispose = null;
			visibilityManager = null;
		} finally {
			super.internalDispose();
		}
	}

	/**
	 * This service notifies interested parties about a locale change.
	 */
	public class LocaleChangedService extends AbstractDisposable implements
			ILocaleChangedService {

		private List<LocaleListener> listeners;

		@Override
		public void addLocaleListener(LocaleListener listener) {
			checkDisposed();

			if (listeners == null) {
				listeners = new ArrayList<ILocaleChangedService.LocaleListener>();
			}

			if (!listeners.contains(listener)) {
				listeners.add(listener);
			}
		}

		@Override
		public void removeLocaleListener(LocaleListener listener) {
			checkDisposed();

			if (listeners == null) {
				return;
			}

			listeners.remove(listener);
		}

		public void notifyLocaleChanged(Locale locale) {
			for (LocaleListener listener : listeners
					.toArray(new LocaleListener[listeners.size()])) {
				listener.localeChanged(locale);
			}
		}

		@Override
		protected void internalDispose() {
			if (listeners != null) {
				listeners.clear();
				listeners = null;
			}
		}

	}

}
