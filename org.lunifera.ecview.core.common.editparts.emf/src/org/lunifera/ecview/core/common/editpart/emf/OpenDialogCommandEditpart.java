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

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.IDialogEditpart;
import org.lunifera.ecview.core.common.editpart.IOpenDialogCommandEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YOpenDialogCommand;

/**
 * The implementation of the IOpenDialogCommandEditpart.
 */
public class OpenDialogCommandEditpart extends
		CommandEditpart<YOpenDialogCommand> implements
		IOpenDialogCommandEditpart {

	private Binding binding;
	private boolean activated;

	@Override
	protected YOpenDialogCommand createModel() {
		return (YOpenDialogCommand) CoreModelFactory.eINSTANCE
				.createYOpenDialogCommand();
	}

	@Override
	public void activate() {
		// bind the values
		IECViewBindingManager bindingManager = getView().getContext()
				.getService(IECViewBindingManager.class.getName());

		// Bind the trigger
		IBindableValueEndpointEditpart modelValueEditpart = (IBindableValueEndpointEditpart) getEditpart(getModel()
				.createTriggerDialogEndpoint());
		IObservableValue modelObservable = modelValueEditpart.getObservable();
		IObservableValue targetObservable = PojoObservables.observeValue(this,
				"trigger");
		binding = bindingManager.bindValue(targetObservable, modelObservable,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));
		activated = true;
	}

	/**
	 * Setting a value will trigger the command execution.
	 * 
	 * @param value
	 */
	public void setTrigger(Object value) {
		// execute the command
		if (activated && value != null) {
			execute();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			if (binding != null) {
				binding.dispose();
				binding = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void execute() {
		checkDisposed();

		YOpenDialogCommand model = getModel();
		IDialogEditpart dialogEditpart = getEditpart(model.getDialog());
		IBindableEndpointEditpart bindableEndpoint = getEditpart(model
				.createTriggerDialogEndpoint());
		getView().openDialog(dialogEditpart, bindableEndpoint);
	}
}
