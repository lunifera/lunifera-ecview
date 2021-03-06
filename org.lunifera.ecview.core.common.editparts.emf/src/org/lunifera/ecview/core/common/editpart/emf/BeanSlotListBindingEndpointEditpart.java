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

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.binding.observables.ContextObservables;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IBeanSlotListBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindableListEndpointEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.uri.URIHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create a context observable based on the given bean slot.
 */
public class BeanSlotListBindingEndpointEditpart extends
		BindableListEndpointEditpart<YBeanSlotListBindingEndpoint> implements
		IBeanSlotListBindingEndpointEditpart {
	private static final Logger logger = LoggerFactory
			.getLogger(BeanSlotListBindingEndpointEditpart.class);

	@Override
	protected YBeanSlotListBindingEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYBeanSlotListBindingEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableList> A getObservable() {
		if (getModel().getAttributePath() == null
				|| getModel().getAttributePath().equals("")) {
			logger.error("Attribute path must not be null!");
			return null;
		}

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
			return (A) ContextObservables.observeList(
					viewEditpart.getContext(), targetURI, getModel()
							.getCollectionType());
		} else if (container instanceof YViewSet) {
			URI targetURI = getURI(yBeanSlot);
			IViewSetEditpart viewSetEditpart = DelegatingEditPartManager
					.getInstance().getEditpart(container);
			return (A) ContextObservables.observeList(viewSetEditpart
					.getContext(), targetURI, getModel().getCollectionType());
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
			uri = URIHelper.view().bean(yBeanSlot.getName())
					.fragment(getModel().getAttributePath()).toURI();
		} else if (container instanceof YViewSet) {
			uri = URIHelper.viewset().bean(yBeanSlot.getName())
					.fragment(getModel().getAttributePath()).toURI();
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
