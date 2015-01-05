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
package org.lunifera.ecview.core.common.editpart.emf.visibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IVisibilityProcessorValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityProcessorEditpart;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.visibility.VisibilityFactory;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;
import org.lunifera.ecview.core.common.types.ITypeProviderService;
import org.lunifera.ecview.core.common.visibility.IVisibilityProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VisibilityProcessorEditpart<M extends YVisibilityProcessor>
		extends ElementEditpart<M> implements IVisibilityProcessorEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(VisibilityProcessorEditpart.class);

	private ArrayList<IBindingEditpart<?>> dataUsed;
	private ArrayList<IBindingEditpart<?>> triggersOn;

	private IVisibilityProcessor processor;

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) VisibilityFactory.eINSTANCE.createYVisibilityProcessor();
	}

	@Override
	public void activate() {
		processor = loadProcessor();
		if (processor == null) {
			LOGGER.error("Could not load class "
					+ getModel().getDelegateQualifiedName());
			return;
		}

		IViewContext context = getViewContext(getModel());
		// initializes the visibility processor
		processor.init(context.getVisibilityManager());
		for (IBindingEditpart<?> editpart : getDataUsed()) {
			bindEditpart(processor, editpart);
		}
		for (IBindingEditpart<?> editpart : getTriggersOn()) {
			bindEditpart(processor, editpart);
		}
	}

	/**
	 * Binds the editpart.
	 * 
	 * @param processor
	 * @param editpart
	 * @return
	 */
	protected void bindEditpart(IVisibilityProcessor processor,
			IBindingEditpart<?> editpart) {
		IBindingEditpart<?> bindingEditpart = (IBindingEditpart<?>) editpart;
		IBindableEndpointEditpart tempTargetEP = bindingEditpart
				.getTargetEndpoint();
		if (!(tempTargetEP instanceof IVisibilityProcessorValueBindingEndpointEditpart)) {
			LOGGER.error("Target endpoint MUST be of type IVisibilityProcessorValueBindingEndpointEditpart. Binding "
					+ bindingEditpart + " skipped");
			return;
		}

		// Set the visibility processor that should be bound
		IVisibilityProcessorValueBindingEndpointEditpart targetEP = (IVisibilityProcessorValueBindingEndpointEditpart) tempTargetEP;
		targetEP.setVisibilityProcessor(processor);

		bindingEditpart.bind();
	}

	/**
	 * Tries to load the processor.
	 * 
	 * @return
	 */
	protected IVisibilityProcessor loadProcessor() {
		if(processor != null){
			return processor;
		}
		
		Class<?> processorClass = getModel().getDelegate();
		IVisibilityProcessor processor = null;
		if (processorClass != null) {
			try {
				processor = (IVisibilityProcessor) processorClass.newInstance();
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}

		if (processor == null) {
			ITypeProviderService service = getViewContext(getModel())
					.getService(ITypeProviderService.class.getName());
			processorClass = service.forName(
					VisibilityPackage.Literals.YVISIBILITY_PROCESSOR,
					getModel().getDelegateQualifiedName());
			try {
				if (processorClass != null) {
					processor = (IVisibilityProcessor) processorClass
							.newInstance();
				}
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}

		return processor;
	}

	public List<IBindingEditpart<?>> getDataUsed() {
		checkDisposed();

		if (dataUsed == null) {
			internalLoadDataUsed();
		}
		return Collections.unmodifiableList(dataUsed);
	}

	/**
	 * Loads the rule.
	 */
	protected void internalLoadDataUsed() {
		checkDisposed();

		if (dataUsed == null) {
			dataUsed = new ArrayList<IBindingEditpart<?>>();

			for (YBinding yEp : getModel().getDataUsed()) {
				internalAddDataUsed((IBindingEditpart<?>) getEditpart(yEp));
			}
		}
	}

	protected void internalAddDataUsed(IBindingEditpart<?> editpart) {
		checkDisposed();

		if (dataUsed == null) {
			internalLoadDataUsed();
		}
		if (!dataUsed.contains(editpart)) {
			dataUsed.add(editpart);
			bindEditpart(loadProcessor(), editpart);
		}
	}

	protected void internalRemoveDataUsed(IBindingEditpart<?> editpart) {
		checkDisposed();

		if (dataUsed != null && editpart != null) {
			editpart.dispose();
			dataUsed.remove(editpart);
		}
	}

	public List<IBindingEditpart<?>> getTriggersOn() {
		checkDisposed();

		if (triggersOn == null) {
			internalLoadTriggersOn();
		}
		return Collections.unmodifiableList(triggersOn);
	}

	/**
	 * Loads the rule.
	 */
	protected void internalLoadTriggersOn() {
		checkDisposed();

		if (triggersOn == null) {
			triggersOn = new ArrayList<IBindingEditpart<?>>();

			for (YBinding yEp : getModel().getTriggersOn()) {
				internalAddTriggersOn((IBindingEditpart<?>) getEditpart(yEp));
			}
		}
	}

	protected void internalAddTriggersOn(IBindingEditpart<?> editpart) {
		checkDisposed();

		if (triggersOn == null) {
			internalLoadDataUsed();
		}
		if (!triggersOn.contains(editpart)) {
			triggersOn.add(editpart);
			bindEditpart(loadProcessor(), editpart);
		}
	}

	protected void internalRemoveTriggersOn(IBindingEditpart<?> editpart) {
		checkDisposed();

		if (triggersOn != null && editpart != null) {
			editpart.dispose();
			triggersOn.remove(editpart);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED:
			YBinding yElement = (YBinding) notification.getNewValue();

			IBindingEditpart<?> editPart = (IBindingEditpart<?>) getEditpart(yElement);
			internalAddDataUsed(editPart);
			break;
		case VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON:
			yElement = (YBinding) notification.getNewValue();

			editPart = (IBindingEditpart<?>) getEditpart(yElement);
			internalAddTriggersOn(editPart);
			break;
		default:
			break;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED:
			YBinding yElement = (YBinding) notification.getNewValue();

			IBindingEditpart<?> editPart = (IBindingEditpart<?>) getEditpart(yElement);
			internalRemoveDataUsed(editPart);
			break;
		case VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON:
			yElement = (YBinding) notification.getNewValue();

			editPart = (IBindingEditpart<?>) getEditpart(yElement);
			internalRemoveTriggersOn(editPart);
			break;
		default:
			break;
		}
	}

	protected void internalDispose() {
		try {
			if (dataUsed != null) {
				for (IBindingEditpart<?> editpart : dataUsed) {
					editpart.dispose();
				}
				dataUsed = null;
			}

			if (triggersOn != null) {
				for (IBindingEditpart<?> editpart : triggersOn) {
					editpart.dispose();
				}
				triggersOn = null;
			}
		} finally {
			super.internalDispose();
		}
	}

}
