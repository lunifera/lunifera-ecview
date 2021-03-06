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

import java.net.URI;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.binding.observables.ContextObservables;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IBeanSlotValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.uri.URIHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create a context observable based on the given bean slot.
 */
public class BeanSlotValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YBeanSlotValueBindingEndpoint> implements
		IBeanSlotValueBindingEndpointEditpart {
	private static final Logger logger = LoggerFactory
			.getLogger(BeanSlotValueBindingEndpointEditpart.class);

	@Override
	protected YBeanSlotValueBindingEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYBeanSlotValueBindingEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		YBeanSlot yBeanSlot = getModel().getBeanSlot();
		if (yBeanSlot == null) {
			logger.error("BeanSlot must not be null!");
			return null;
		}

		// view or viewset
		Object container = getModel().getBeanSlot().eContainer();
		if (container instanceof YView) {
			URI targetURI = getURI(yBeanSlot);
			IViewEditpart viewEditpart = DelegatingEditPartManager
					.getInstance().getEditpart(container);
			return (A) ContextObservables.observeValue(
					viewEditpart.getContext(), targetURI);
		} else if (container instanceof YViewSet) {
			URI targetURI = getURI(yBeanSlot);
			IViewSetEditpart viewSetEditpart = DelegatingEditPartManager
					.getInstance().getEditpart(container);
			return (A) ContextObservables.observeValue(
					viewSetEditpart.getContext(), targetURI);
		}

		throw new IllegalArgumentException(container
				+ " is not a valid super type!");
	}

	/**
	 * Returns the URI for the given bean slot. The URI may be used with the
	 * {@link URIHelper} to access the bean slot.
	 * 
	 * @param yBeanSlot
	 * @return
	 */
	private URI getURI(YBeanSlot yBeanSlot) {
		EObject container = yBeanSlot.eContainer();
		URI uri = null;
		if (container instanceof YView) {
			if (getModel().getAttributePath() == null
					|| getModel().getAttributePath().equals("")) {
				uri = URIHelper.view().bean(yBeanSlot.getName()).toURI();
			} else {
				uri = URIHelper.view().bean(yBeanSlot.getName())
						.fragment(getModel().getAttributePath()).toURI();
			}
		} else if (container instanceof YViewSet) {
			if (getModel().getAttributePath() == null
					|| getModel().getAttributePath().equals("")) {
				uri = URIHelper.viewset().bean(yBeanSlot.getName()).toURI();
			} else {
				uri = URIHelper.viewset().bean(yBeanSlot.getName())
						.fragment(getModel().getAttributePath()).toURI();
			}
		} else {
			throw new RuntimeException(container + " is not a valid type!");
		}

		return uri;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
