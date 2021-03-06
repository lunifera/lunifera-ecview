/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.core.common.editpart.emf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.context.IViewSetContext;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An implementation of {@link IViewEditpart}.
 * 
 * @param <M>
 */
public class ViewSetEditpart<M extends YViewSet> extends ElementEditpart<M>
		implements IViewSetEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ViewSetEditpart.class);

	private List<IViewEditpart> uiViewEditparts;

	private IViewSetContext context;

	/**
	 * The default constructor.
	 */
	protected ViewSetEditpart() {

	}

	@Override
	public IViewSetContext getContext() {
		return context;
	}

	@Override
	public void setContext(IViewSetContext context) {
		if (this.context == context) {
			return;
		}

		if (this.context != null) {
			throw new RuntimeException("Changing context not allowed!");
		}
		this.context = context;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		M model = (M) CoreModelFactory.eINSTANCE.createYViewSet();
		return model;
	}

	@Override
	public List<IViewEditpart> getViews() {
		if (uiViewEditparts == null) {
			internalLoadViews();
		}

		return Collections.unmodifiableList(uiViewEditparts);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: view parts also have to be disposed if they have
			// not been loaded yet,
			// but exist in the model.
			if (uiViewEditparts != null || getModel().getViews().size() > 0) {
				List<IViewEditpart> tempViews = getViews();
				synchronized (uiViewEditparts) {
					for (IViewEditpart editpart : tempViews
							.toArray(new IViewEditpart[tempViews.size()])) {
						editpart.dispose();
					}
				}
				uiViewEditparts = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void addView(IViewEditpart view) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			M yView = getModel();
			YView yElement = (YView) view.getModel();
			yView.getViews().add(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeView(IViewEditpart view) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			M yView = getModel();
			YView yElement = (YView) view.getModel();
			yView.getViews().remove(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YVIEW_SET__VIEWS:
			YView yElement = (YView) notification.getNewValue();
			internalAddElement((IViewEditpart) getEditpart(yElement));
			break;
		case CoreModelPackage.YVIEW_SET__BEAN_SLOTS:
			YBeanSlot yBeanSlot = (YBeanSlot) notification.getNewValue();
			internalAddBeanSlot(yBeanSlot);
			break;
		default:
			break;
		}
	}

	/**
	 * Registers the given bean slot.
	 * 
	 * @param yBeanSlot
	 */
	protected void internalAddBeanSlot(YBeanSlot yBeanSlot) {
		checkDisposed();
		context.createBeanSlot(yBeanSlot.getName(), yBeanSlot.getValueType());
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YVIEW_SET__VIEWS:
			YView yElement = (YView) notification.getOldValue();
			internalRemoveElement((IViewEditpart) getEditpart(yElement));
			break;
		case CoreModelPackage.YVIEW_SET__BEAN_SLOTS:
			throw new IllegalStateException("Viewslots must not be removed!");
		default:
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	protected void internalAddElement(IViewEditpart editpart) {
		checkDisposed();

		if (uiViewEditparts == null) {
			internalLoadViews();
		}
		if (!uiViewEditparts.contains(editpart)) {
			uiViewEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of elements.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveElement(IViewEditpart editpart) {
		checkDisposed();

		if (uiViewEditparts != null && editpart != null) {
			uiViewEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all elements.
	 */
	protected void internalLoadViews() {
		checkDisposed();

		if (uiViewEditparts == null) {
			uiViewEditparts = new ArrayList<IViewEditpart>();
			for (YView yElement : getModel().getViews()) {
				IViewEditpart editPart = getEditpart(yElement);
				internalAddElement(editPart);
			}
		}
	}
}
