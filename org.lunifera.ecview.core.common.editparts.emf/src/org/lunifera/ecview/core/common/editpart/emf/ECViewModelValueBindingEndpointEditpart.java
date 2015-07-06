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

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.lunifera.ecview.core.common.editpart.IECViewModelValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.databinding.emf.model.ECViewModelBindable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
@SuppressWarnings("restriction")
public class ECViewModelValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YECViewModelValueBindingEndpoint>
		implements IECViewModelValueBindingEndpointEditpart {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ECViewModelValueBindingEndpointEditpart.class);

	@Override
	protected YECViewModelValueBindingEndpoint createModel() {
		checkDisposed();
		return BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		YECViewModelValueBindingEndpoint model = getModel();
		if (model.getFeatures().size() > 0) {
			List<EStructuralFeature> features = model.getFeatures();
			return (A) ECViewModelBindable.observeValue(model.getElement(),
					FeaturePath.fromList(features
							.toArray(new EStructuralFeature[features.size()])));
		} else if (model.getPropertyPath() != null
				&& !model.getPropertyPath().equals("")) {
			return (A) ECViewModelBindable.observeValue(model.getElement(),
					model.getPropertyPath(), model.getType(),
					model.getEmfNsURI());
		}

		LOGGER.error("Not a valid binding model " + model);
		return null;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
