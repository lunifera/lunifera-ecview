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

import java.util.List;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.lunifera.ecview.core.common.editpart.IECViewModelListBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindableListEndpointEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint;
import org.lunifera.ecview.core.databinding.emf.model.ECViewModelBindable;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class ECViewModelListBindingEndpointEditpart extends
		BindableListEndpointEditpart<YECViewModelListBindingEndpoint> implements
		IECViewModelListBindingEndpointEditpart {

	@Override
	protected YECViewModelListBindingEndpoint createModel() {
		checkDisposed();
		return BindingFactory.eINSTANCE.createYECViewModelListBindingEndpoint();
	}

	@SuppressWarnings({ "unchecked", "restriction" })
	@Override
	public <A extends IObservableList> A getObservable() {
		YECViewModelListBindingEndpoint model = getModel();
		if (model.getFeatures().size() > 0) {
			List<EStructuralFeature> features = model.getFeatures();
			return (A) ECViewModelBindable.observeList(model.getElement(),
					FeaturePath.fromList(features
							.toArray(new EStructuralFeature[features.size()])));
		} else if (model.getPropertyPath() != null
				&& !model.getPropertyPath().equals("")) {
			return (A) ECViewModelBindable.observeList(model.getElement(),
					model.getPropertyPath(), model.getType());
		}

		throw new IllegalArgumentException("Not a valid binding model " + model);
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
