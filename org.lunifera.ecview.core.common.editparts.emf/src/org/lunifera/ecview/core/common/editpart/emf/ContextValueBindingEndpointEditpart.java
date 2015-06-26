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
import org.lunifera.ecview.core.common.binding.observables.ContextObservables;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IContextValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create a context observables.
 */
public class ContextValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YContextValueBindingEndpoint> implements
		IContextValueBindingEndpointEditpart {
	private static final Logger logger = LoggerFactory
			.getLogger(ContextValueBindingEndpointEditpart.class);

	@Override
	protected YContextValueBindingEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYContextValueBindingEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		YView yView = null;
		try {
			yView = getModel().getBinding().getBindingSet().getView();
		} catch (NullPointerException e) {
			logger.error("{}", e);
			throw new RuntimeException("View must not be null!", e);
		}

		if (getModel().getUrlString() == null
				|| getModel().getUrlString().equals("")) {
			logger.error("URLString must not be null!");
			return null;
		}

		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);
		return (A) ContextObservables.observeValue(viewEditpart.getContext(),
				URI.create(getModel().getUrlString()));
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
