/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation for {@link IViewEditpart}.
 * 
 * @param <M>
 */
public class ViewEditpart<M extends YView> extends ElementEditpart<M> implements
		IViewEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ViewEditpart.class);
	private IEmbeddableEditpart content;
	private IViewContext context;
	private IViewPresentation<?> presentation;
	private IBindingSetEditpart bindingSet;

	/**
	 * Default constructor.
	 */
	public ViewEditpart() {

	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		M model = (M) CoreModelFactory.eINSTANCE.createYView();

		return model;
	}

	@Override
	public IViewContext getContext() {
		return context;
	}

	@Override
	public void render(Map<String, Object> options) throws ContextException {

		// render the view presentation
		renderPresentation(options);

		// render the bindings
		renderBindings(options);

	}

	/**
	 * Renders the presentation of that view.
	 * 
	 * @param options
	 * @throws ContextException
	 */
	protected void renderPresentation(Map<String, Object> options)
			throws ContextException {
		IViewPresentation<?> presentation = getPresentation();
		if (presentation == null) {
			throw new ContextException("Presenter must not be null!");
		}
		presentation.render(options);
	}

	/**
	 * Renders the bindings of that view.
	 * 
	 * @param options
	 * @throws ContextException
	 */
	protected void renderBindings(Map<String, Object> options)
			throws ContextException {
		IBindingSetEditpart bindingSet = getBindingSet();
		if (bindingSet == null) {
			throw new ContextException("BindingSet must not be null!");
		}
		// call to activate not required. Pending bindings are bound
		// automatically
	}

	@Override
	// BEGIN SUPRESS CATCH EXCEPTION
	public void setContext(IViewContext context) throws RuntimeException {
		// END SUPRESS CATCH EXCEPTION
		if (this.context == context) {
			return;
		}

		if (this.context != null && this.context.isRendered()) {
			throw new RuntimeException(
					"Already rendered! Changing context not allowed!");
		}
		this.context = context;
	}

	@Override
	public String getName() {
		return getModel().getViewName();
	}

	@Override
	public void setContent(IEmbeddableEditpart content) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			M yView = getModel();
			YEmbeddable yElement = content != null ? (YEmbeddable) content
					.getModel() : null;
			yView.setContent(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public IEmbeddableEditpart getContent() {
		if (content == null) {
			loadContent();
		}
		return content;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadContent() {
		if (content == null) {
			YEmbeddable yContent = getModel().getContent();
			internalSetContent((IEmbeddableEditpart) getEditpart(yContent));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param content
	 *            The content to be set
	 */
	protected void internalSetContent(IEmbeddableEditpart content) {
		this.content = content;
	}

	@Override
	public void setBindingSet(IBindingSetEditpart bindingSet) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			M yView = getModel();
			YBindingSet yBindingSet = bindingSet != null ? (YBindingSet) bindingSet
					.getModel() : null;
			yView.setBindingSet(yBindingSet);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public IBindingSetEditpart getBindingSet() {
		if (bindingSet == null) {
			loadBindingSet();
		}
		return bindingSet;
	}

	/**
	 * Loads the bindingSet of the view.
	 */
	protected void loadBindingSet() {
		if (bindingSet == null) {
			YBindingSet yBindingSet = getModel().getBindingSet();
			internalSetBindingSet((IBindingSetEditpart) getEditpart(yBindingSet));
		}
	}

	/**
	 * May be invoked by a model change and the bindingSet of the edit part
	 * should be set.
	 * 
	 * @param bindingSet
	 *            The bindingSet to be set
	 */
	protected void internalSetBindingSet(IBindingSetEditpart bindingSet) {
		if (this.bindingSet == bindingSet) {
			return;
		}

		IBindingSetEditpart current = this.bindingSet;
		this.bindingSet = bindingSet;

		// dispose current binding set
		if (current != null) {
			current.dispose();
		}

		// activate the new binding set
		if (this.bindingSet != null && !this.bindingSet.isActive()) {
			this.bindingSet.activate();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YVIEW__CONTENT:
			YEmbeddable yNewContent = (YEmbeddable) notification.getNewValue();

			IEmbeddableEditpart editPart = (IEmbeddableEditpart) getEditpart(yNewContent);
			internalSetContent(editPart);

			// handle the presentation
			//
			if (isRendered()) {
				getPresentation().setContent(
						editPart != null ? editPart.getPresentation() : null);
			}

			// fire event
			firePropertyChangedEditpart(PROP_CONTENT, notification);
			break;
		case CoreModelPackage.YVIEW__BINDING_SET:
			YBindingSet yNewBindingSet = (YBindingSet) notification
					.getNewValue();
			IBindingSetEditpart bsEditPart = (IBindingSetEditpart) getEditpart(yNewBindingSet);
			internalSetBindingSet(bsEditPart);
			// handle the presentation
			//
			if (isRendered()) {
				// getPresentation().setContent(editPart != null ?
				// editPart.getPresentation() : null);
			}

			// fire event
			firePropertyChangedEditpart(PROP_CONTENT, notification);
			break;
		default:
			break;
		}
	}

	/**
	 * Returns true, if the editpart is currently rendered.
	 * 
	 * @return
	 */
	private boolean isRendered() {
		return internalGetPresentation() != null
				&& internalGetPresentation().isRendered();
	}

	@Override
	protected void internalDispose() {
		try {

			// remove from the parent
			IViewSetEditpart parent = getParent();
			if (parent != null) {
				parent.removeView(this);
			}

			// dispose the presenter
			//
			if (presentation != null) {
				presentation.dispose();
				presentation = null;
			}

			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet,
			// but exist in the model.
			// TODO think about it!!!

			if (getContent() != null) {
				content.dispose();
				content = null;
			}

			if (getBindingSet() != null) {
				bindingSet.dispose();
				bindingSet = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public IViewSetEditpart getParent() {
		YViewSet yViewSet = getModel().getRoot();
		return yViewSet != null ? (IViewSetEditpart) getEditpart(yViewSet)
				: null;
	}

	/**
	 * Returns the instance of the presentation, but does not load it.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @return presentation
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IWidgetPresentation<?>> A internalGetPresentation() {
		return (A) presentation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IViewPresentation<?>> A getPresentation() {
		if (presentation == null) {
			presentation = createPresentation();
		}
		return (A) presentation;
	}

	/**
	 * Is called to created the presenter for this edit part.
	 * 
	 * @param <A>
	 *            An instance of {@link IViewPresentation}
	 * 
	 * @return The created presentation.
	 */
	protected <A extends IViewPresentation<?>> A createPresentation() {
		return DelegatingPresenterFactory.getInstance().createPresentation(
				getContext(), this);
	}
}
