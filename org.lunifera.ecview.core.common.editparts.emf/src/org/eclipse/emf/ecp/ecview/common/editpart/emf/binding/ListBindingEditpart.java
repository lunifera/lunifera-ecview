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

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.binding.IBindableListEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IListBindingEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.YBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YBindingUpdateStrategy;
import org.lunifera.ecview.core.common.model.binding.YListBinding;
import org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint;
import org.lunifera.ecview.core.databinding.emf.common.ECViewUpdateListStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IBindingSetEditpart}.
 * 
 * @param <M>
 */
public class ListBindingEditpart extends ElementEditpart<YListBinding>
		implements IListBindingEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ListBindingEditpart.class);
	private IBindableListEndpointEditpart targetValue;
	private IBindableListEndpointEditpart modelValue;
	private boolean bound;
	private Binding binding;

	/**
	 * A default constructor.
	 */
	public ListBindingEditpart() {
	}

	@Override
	protected YListBinding createModel() {
		checkDisposed();

		return BindingFactory.eINSTANCE.createYListBinding();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case BindingPackage.YLIST_BINDING__TARGET_ENDPOINT:
			YBindingEndpoint YBindingEndpoint = (YBindingEndpoint) notification
					.getNewValue();

			IBindableListEndpointEditpart editPart = (IBindableListEndpointEditpart) getEditpart(YBindingEndpoint);
			internalSetTargetValue(editPart);
			break;
		case BindingPackage.YLIST_BINDING__MODEL_ENDPOINT:
			YBindingEndpoint = (YBindingEndpoint) notification.getNewValue();

			editPart = (IBindableListEndpointEditpart) getEditpart(YBindingEndpoint);
			internalSetModelValue(editPart);
			break;
		default:
			break;
		}
	}

	public void setTargetEndpoint(IBindableListEndpointEditpart target) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YListBinding yBinding = getModel();
			YListBindingEndpoint yElement = target != null ? (YListBindingEndpoint) target
					.getModel() : null;
			yBinding.setTargetEndpoint(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableListEndpointEditpart getTargetEndpoint() {
		checkDisposed();

		if (targetValue == null) {
			loadTargetValue();
		}
		return targetValue;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadTargetValue() {
		if (targetValue == null) {
			YBindingEndpoint yValue = getModel().getTargetEndpoint();
			internalSetTargetValue((IBindableListEndpointEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param targetValue
	 *            The content to be set
	 */
	protected void internalSetTargetValue(
			IBindableListEndpointEditpart targetValue) {
		this.targetValue = targetValue;
	}

	public void setModelEndpoint(IBindableListEndpointEditpart model) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YListBinding yBinding = getModel();
			YListBindingEndpoint yElement = model != null ? (YListBindingEndpoint) model
					.getModel() : null;
			yBinding.setModelEndpoint(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableListEndpointEditpart getModelEndpoint() {
		checkDisposed();

		if (modelValue == null) {
			loadModelValue();
		}
		return modelValue;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadModelValue() {
		if (modelValue == null) {
			YBindingEndpoint yValue = getModel().getModelEndpoint();
			internalSetModelValue((IBindableListEndpointEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param modelValue
	 *            The content to be set
	 */
	protected void internalSetModelValue(
			IBindableListEndpointEditpart modelValue) {
		this.modelValue = modelValue;
	}

	@Override
	public boolean isBound() {
		checkDisposed();

		return bound;
	}

	@Override
	public void bind() {
		checkDisposed();

		if (bound) {
			return;
		}

		try {
			IECViewBindingManager bindingManager = getBindindSet()
					.getBindingManager();
			if (bindingManager != null) {
				IObservableList target = getTargetEndpoint().getObservable();
				IObservableList model = getModelEndpoint().getObservable();
				if (target == null) {
					LOGGER.error("TargetValue must never be null! {}",
							getTargetEndpoint());
					return;
				}

				if (model == null) {
					LOGGER.error("ModelValue must never be null! {}",
							getModelEndpoint());
					return;
				}

				ECViewUpdateListStrategy modelToTargetStrategy = getValueUpdateStrategy(getModel()
						.getModelToTargetStrategy());
				ECViewUpdateListStrategy targetToModelStrategy = getValueUpdateStrategy(getModel()
						.getTargetToModelStrategy());
				binding = bindingManager.bindList(target, model,
						targetToModelStrategy, modelToTargetStrategy);
				binding.updateTargetToModel();

				// getTargetEndpoint().setRefreshProvider(
				// new IBindableEndpointEditpart.RefreshProvider() {
				// @Override
				// public void refresh() {
				// binding.updateTargetToModel();
				// }
				// });
				//
				// getModelEndpoint().setRefreshProvider(
				// new IBindableEndpointEditpart.RefreshProvider() {
				// @Override
				// public void refresh() {
				// binding.updateModelToTarget();
				// }
				// });

			} else {
				LOGGER.error("BindingManager is null!. No bindings processed!");
			}
		} finally {
			bound = true;
		}
	}

	private ECViewUpdateListStrategy getValueUpdateStrategy(
			YBindingUpdateStrategy strategy) {
		ECViewUpdateListStrategy result = null;
		switch (strategy) {
		case UPDATE:
			result = new ECViewUpdateListStrategy(
					ECViewUpdateListStrategy.POLICY_UPDATE);
			break;
		case NEVER:
			result = new ECViewUpdateListStrategy(
					ECViewUpdateListStrategy.POLICY_NEVER);
			break;
		case ON_REQUEST:
			result = new ECViewUpdateListStrategy(
					ECViewUpdateListStrategy.POLICY_ON_REQUEST);
			break;
		default:
			result = new ECViewUpdateListStrategy(
					ECViewUpdateListStrategy.POLICY_UPDATE);
		}
		return result;
	}

	/**
	 * Returns the binding set this binding belongs to.
	 * 
	 * @return
	 */
	protected IBindingSetEditpart getBindindSet() {
		if (getModel().getBindingSet() == null) {
			throw new RuntimeException("bindingSet must not be null!");
		}
		return DelegatingEditPartManager.getInstance().findEditpart(
				getModel().getBindingSet());
	}

	@Override
	public void unbind() {
		checkDisposed();

		if (!bound) {
			return;
		}

		try {
			if (binding != null) {
				binding.dispose();
				binding = null;
			}
			if (modelValue != null) {
				modelValue.dispose();
				modelValue = null;
			}
			if (targetValue != null) {
				targetValue.dispose();
				targetValue = null;
			}
		} finally {
			bound = false;
		}
	}

	@Override
	protected void internalDispose() {
		try {
			if (binding != null) {
				binding.dispose();
				binding = null;
			}
			if (modelValue != null) {
				modelValue.dispose();
				modelValue = null;
			}
			if (targetValue != null) {
				targetValue.dispose();
				targetValue = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public Binding getBinding() {
		return binding;
	}
}
