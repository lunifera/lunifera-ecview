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

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class EmbeddableValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YEmbeddableValueEndpoint> implements
		IEmbeddableValueBindingEndpointEditpart {

	@Override
	protected YEmbeddableValueEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYEmbeddableValueEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		IEmbeddableEditpart embeddableEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(getModel().getElement());

		IWidgetPresentation<?> presentation = embeddableEditpart
				.getPresentation();
		return presentation != null ? (A) presentation
				.getObservableValue(getModel()) : null;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
