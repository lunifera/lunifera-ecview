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
package org.lunifera.ecview.core.common.editpart.emf.binding;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.binding.IVisibilityProcessorValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint;
import org.lunifera.ecview.core.common.visibility.IVisibilityProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class VisibilityProcessorValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YVisibilityProcessorValueBindingEndpoint>
		implements IVisibilityProcessorValueBindingEndpointEditpart {

	private static final Logger logger = LoggerFactory
			.getLogger(VisibilityProcessorValueBindingEndpointEditpart.class);
	private RefreshProvider refresh;
	private IVisibilityProcessor processor;

	@Override
	protected YVisibilityProcessorValueBindingEndpoint createModel() {
		checkDisposed();
		return BindingFactory.eINSTANCE
				.createYVisibilityProcessorValueBindingEndpoint();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		switch (featureId) {
		case BindingPackage.YBEAN_VALUE_BINDING_ENDPOINT__BEAN:
			refresh.refresh();
			break;
		default:
			break;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {

		if (processor == null) {
			logger.error("No instance of processor was set!");
		}

		String property = getModel().getProperty();
		if (property == null || property.equals("")) {
			logger.warn("Property {} not valid!", processor, property);
			return null;
		}

		IObservableValue observable = BeansObservables.observeValue(processor,
				property);

		return (A) observable;
	}

	@Override
	public void setVisibilityProcessor(IVisibilityProcessor processor) {
		this.processor = processor;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		this.refresh = refresh;
	}

	@Override
	protected void internalDispose() {
		refresh = null;

		super.internalDispose();
	}

}
