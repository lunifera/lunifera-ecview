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

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.binding.IBindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.CommandEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YAddToTableCommand;
import org.lunifera.ecview.core.extension.model.extension.YSelectionType;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.ui.core.editparts.extension.commands.IAddToTableCommandEditpart;
import org.lunifera.runtime.common.types.ITypeProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddToTableEditpart extends CommandEditpart<YAddToTableCommand>
		implements IAddToTableCommandEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(AddToTableEditpart.class);

	private boolean activated;
	private Binding triggerBinding;

	@Override
	public void activate() {
		// bind the values
		IECViewBindingManager bindingManager = getView().getContext()
				.getService(IECViewBindingManager.class.getName());

		// Bind the trigger
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
		Object newEntry = createNewBean(yTable);
		if (newEntry != null) {
			yTable.getCollection().add(newEntry);

			if (yTable.getSelectionType() == YSelectionType.SINGLE) {
				yTable.setSelection(newEntry);
			} else {
				yTable.getMultiSelection().add(newEntry);
			}
		}

	}

	/**
	 * Tries to create a new bean.
	 * 
	 * @return
	 */
	protected Object createNewBean(YTable yTable) {

		Class<?> beanClass = yTable.getType();
		Object result = null;
		if (beanClass != null) {
			try {
				result = beanClass.newInstance();
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}

		if (result == null) {
			ITypeProviderService service = getViewContext(getModel())
					.getService(ITypeProviderService.class.getName());
			beanClass = service.forName(null, yTable.getTypeQualifiedName());
			try {
				if (beanClass != null) {
					result = beanClass.newInstance();
				}
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}

		if (result == null) {
			LOGGER.error("Could not create new bean instance for table "
					+ yTable);
		}

		return result;
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
	protected YAddToTableCommand createModel() {
		return ExtensionModelFactory.eINSTANCE.createYAddToTableCommand();
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
