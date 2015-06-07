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
package org.lunifera.ecview.core.extension.editpart.emf.commands;

import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.binding.IBindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.CommandEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YRemoveFromTableCommand;
import org.lunifera.ecview.core.extension.model.extension.YSelectionType;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.ui.core.editparts.extension.commands.IRemoveFromTableCommandEditpart;

public class RemoveFromTableEditpart extends
		CommandEditpart<YRemoveFromTableCommand> implements
		IRemoveFromTableCommandEditpart {

	private boolean activated;
	private Binding triggerBinding;

	@Override
	public void activate() {
		// bind the values
		IECViewBindingManager bindingManager = getView().getContext()
				.getService(IECViewBindingManager.class.getName());

		// Bind the trigger from Y-Element to this instance
		IBindableValueEndpointEditpart triggerEPEditpart = (IBindableValueEndpointEditpart) getEditpart(getModel()
				.createTriggerEndpoint());
		IObservableValue modelObservable = triggerEPEditpart.getObservable();
		IObservableValue targetObservable = PojoObservables.observeValue(this,
				"trigger");
		triggerBinding = bindingManager.bindValue(targetObservable,
				modelObservable, new UpdateValueStrategy(
						UpdateValueStrategy.POLICY_NEVER),
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));
		activated = true;
	}

	@Override
	public void execute() {
		YTable yTable = getModel().getTable();
		if (yTable.getSelectionType() == YSelectionType.SINGLE) {
			Object selection = yTable.getSelection();
			if (selection != null) {
				if (yTable.getSelection() == selection) {
					yTable.setSelection(null);
				}
				yTable.getCollection().remove(selection);
			}
		} else {
			List<Object> selection = yTable.getMultiSelection();
			if (selection != null) {
				yTable.getMultiSelection().removeAll(selection);
				yTable.getCollection().removeAll(selection);
			}
		}
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

	@Override
	protected YRemoveFromTableCommand createModel() {
		return ExtensionModelFactory.eINSTANCE.createYRemoveFromTableCommand();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			if (triggerBinding != null) {
				triggerBinding.dispose();
				triggerBinding = null;
			}
		} finally {
			super.internalDispose();
		}
	}
}
