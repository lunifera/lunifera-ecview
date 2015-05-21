package org.lunifera.ecview.core.extension.editpart.emf.commands;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.binding.IECViewBindingManager;
import org.lunifera.ecview.core.common.editpart.binding.IBindableValueEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.CommandEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YSetNewBeanInstanceCommand;
import org.lunifera.ecview.core.ui.core.editparts.extension.commands.ISetNewInstanceCommandEditpart;
import org.lunifera.runtime.common.state.ISharedStateContext;
import org.lunifera.runtime.common.types.ITypeProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetNewBeanInstanceEditpart extends
		CommandEditpart<YSetNewBeanInstanceCommand> implements
		ISetNewInstanceCommandEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(SetNewBeanInstanceEditpart.class);

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
		try {
			Object newEntry = createNewBean();
			if (newEntry != null) {

				// add the entry to the shared state, if available
				ISharedStateContext sharedState = getView().getContext()
						.getService(ISharedStateContext.class.getName());
				if (sharedState != null) {
					sharedState.addNewTransient(newEntry);
				}

				// now pass the value to the target
				IBindableValueEndpointEditpart valueEPEditpart = (IBindableValueEndpointEditpart) getEditpart(getModel()
						.getTarget());

				// TODO workaround for databinding -> New instance may be
				// polymorphic brother of the current instance. And if binding
				// the new instance, numeric field will not become unbound. So
				// lets set a new instance of current set instance before
				// setting the new entry.
				IObservableValue observableValue = valueEPEditpart
						.getObservable();
				Object value = observableValue.getValue();
				if (value != null) {
					Class<?> valueClass = value.getClass();
					try {
						// now all fields will become unbound from the current
						// instance
						observableValue.setValue(valueClass.newInstance());
					} catch (Exception e) {
						LOGGER.warn("Could not reset the value by {}",
								valueClass.getName());
					}
				}

				// and now set the new value
				observableValue.setValue(newEntry);
			}
		} catch (Exception e) {
			LOGGER.error("{}", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * Tries to create a new bean.
	 * 
	 * @return
	 */
	protected Object createNewBean() {

		Class<?> beanClass = getModel().getType();
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
			beanClass = service
					.forName(null, getModel().getTypeQualifiedName());
			try {
				if (beanClass != null) {
					result = beanClass.newInstance();
				}
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}

		if (result == null) {
			LOGGER.error("Could not create new bean instance for "
					+ getModel().getTypeQualifiedName());
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
	protected YSetNewBeanInstanceCommand createModel() {
		return ExtensionModelFactory.eINSTANCE
				.createYSetNewBeanInstanceCommand();
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