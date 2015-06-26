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

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IEmbeddableCollectionEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindableListEndpointEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;

/**
 * Responsible to create an observable.
 */
public class EmbeddableCollectionBindingEndpointEditpart extends
		BindableListEndpointEditpart<YEmbeddableCollectionEndpoint> implements
		IEmbeddableCollectionEndpointEditpart {

	@Override
	protected YEmbeddableCollectionEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYEmbeddableCollectionEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableList> A getObservable() {
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
