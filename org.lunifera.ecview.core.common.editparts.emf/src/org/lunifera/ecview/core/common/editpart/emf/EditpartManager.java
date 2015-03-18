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
package org.lunifera.ecview.core.common.editpart.emf;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.editpart.IActionEditpart;
import org.lunifera.ecview.core.common.editpart.IBeanSlotListBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IBeanSlotValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.ICommandSetEditpart;
import org.lunifera.ecview.core.common.editpart.IContextValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IDetailValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IDialogEditpart;
import org.lunifera.ecview.core.common.editpart.IECViewModelListBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IECViewModelValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableCollectionEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableMultiSelectionEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableSelectionEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IEmbeddableValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.IExposedActionEditpart;
import org.lunifera.ecview.core.common.editpart.IFieldEditpart;
import org.lunifera.ecview.core.common.editpart.ILayoutEditpart;
import org.lunifera.ecview.core.common.editpart.IOpenDialogCommandEditpart;
import org.lunifera.ecview.core.common.editpart.ISendEventCommandEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBeanValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IEnumListBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IListBindingEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IValueBindingEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IVisibilityProcessorValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BeanValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.BindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.EnumListBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.ListBindingEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.ValueBindingEditpart;
import org.lunifera.ecview.core.common.editpart.emf.binding.VisibilityProcessorValueBindingEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.emf.common.AbstractEditpartManager;
import org.lunifera.ecview.core.common.editpart.emf.validation.BeanValidationValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.emf.validation.ClassDelegateValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.emf.validation.MaxLengthValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.emf.validation.MinLengthValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.emf.validation.RegexpValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.emf.visibility.VisibilityProcessorEditpart;
import org.lunifera.ecview.core.common.editpart.emf.visibility.VisibilityPropertiesEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IBeanValidationValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IClassDelegateValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IMinLengthValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IRegexpValidatorEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityProcessorEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityPropertiesEditpart;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.YBeanValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YDetailValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YEnumListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YListBinding;
import org.lunifera.ecview.core.common.model.binding.YValueBinding;
import org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YAction;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YCommandSet;
import org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YDialog;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YOpenDialogCommand;
import org.lunifera.ecview.core.common.model.core.YSendEventCommand;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YBeanValidationValidator;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;

/**
 * An implementation of IEditPartManager for eObjects with
 * nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
public class EditpartManager extends AbstractEditpartManager {

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(CoreModelPackage.eNS_URI)
					|| uriString.equals(BindingPackage.eNS_URI)
					|| uriString.equals(ValidationPackage.eNS_URI)
					|| uriString.equals(VisibilityPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(CoreModelPackage.eNS_URI)
					|| element.equals(BindingPackage.eNS_URI)
					|| element.equals(ValidationPackage.eNS_URI)
					|| element.equals(VisibilityPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		ElementEditpart<YElement> result = null;
		if (editPartClazz.isAssignableFrom(IViewEditpart.class)) {
			result = createNewInstance(ViewEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ILayoutEditpart.class)) {
			result = createNewInstance(LayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IFieldEditpart.class)) {
			result = createNewInstance(FieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IActionEditpart.class)) {
			result = createNewInstance(ActionEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IViewSetEditpart.class)) {
			result = createNewInstance(ViewSetEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IBindingSetEditpart.class)) {
			result = createNewInstance(BindingSetEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IDetailValueBindingEndpointEditpart.class)) {
			result = createNewInstance(DetailValueBindingEndpointEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IValueBindingEditpart.class)) {
			result = createNewInstance(ValueBindingEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IListBindingEditpart.class)) {
			result = createNewInstance(ListBindingEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IContextValueBindingEndpointEditpart.class)) {
			result = createNewInstance(ContextValueBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IBeanSlotValueBindingEndpointEditpart.class)) {
			result = createNewInstance(BeanSlotValueBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IBeanSlotListBindingEndpointEditpart.class)) {
			result = createNewInstance(BeanSlotListBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IEmbeddableValueBindingEndpointEditpart.class)) {
			result = createNewInstance(EmbeddableValueBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IEmbeddableSelectionEndpointEditpart.class)) {
			result = createNewInstance(EmbeddableSelectionBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IEmbeddableMultiSelectionEndpointEditpart.class)) {
			result = createNewInstance(EmbeddableMultiSelectionBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IEmbeddableCollectionEndpointEditpart.class)) {
			result = createNewInstance(EmbeddableCollectionBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IBeanValueBindingEndpointEditpart.class)) {
			result = createNewInstance(BeanValueBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IECViewModelValueBindingEndpointEditpart.class)) {
			result = createNewInstance(ECViewModelValueBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IECViewModelListBindingEndpointEditpart.class)) {
			result = createNewInstance(ECViewModelListBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IEnumListBindingEndpointEditpart.class)) {
			result = createNewInstance(EnumListBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IMinLengthValidatorEditpart.class)) {
			result = createNewInstance(MinLengthValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IMaxLengthValidatorEditpart.class)) {
			result = createNewInstance(MaxLengthValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IRegexpValidatorEditpart.class)) {
			result = createNewInstance(RegexpValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IClassDelegateValidatorEditpart.class)) {
			result = createNewInstance(ClassDelegateValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IClassDelegateValidatorEditpart.class)) {
			result = createNewInstance(ClassDelegateValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IBeanValidationValidatorEditpart.class)) {
			result = createNewInstance(BeanValidationValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IVisibilityProcessorEditpart.class)) {
			result = createNewInstance(VisibilityProcessorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IVisibilityPropertiesEditpart.class)) {
			result = createNewInstance(VisibilityPropertiesEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ICommandSetEditpart.class)) {
			result = createNewInstance(CommandSetEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IDialogEditpart.class)) {
			result = createNewInstance(DialogEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IOpenDialogCommandEditpart.class)) {
			result = createNewInstance(OpenDialogCommandEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IVisibilityProcessorValueBindingEndpointEditpart.class)) {
			result = createNewInstance(VisibilityProcessorValueBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IVisibilityProcessorEditpart.class)) {
			result = createNewInstance(VisibilityProcessorEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IExposedActionEditpart.class)) {
			result = createNewInstance(ExposedActionEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ISendEventCommandEditpart.class)) {
			result = createNewInstance(SendEventCommandEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A>
	 *            an instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		ElementEditpart<YElement> result = null;
		if (yElement instanceof YView) {
			result = createNewInstance(ViewEditpart.class);
		} else if (yElement instanceof YLayout) {
			result = createNewInstance(LayoutEditpart.class);
		} else if (yElement instanceof YField) {
			result = createNewInstance(FieldEditpart.class);
		} else if (yElement instanceof YAction) {
			result = createNewInstance(ActionEditpart.class);
		} else if (yElement instanceof YViewSet) {
			result = createNewInstance(ViewSetEditpart.class);
		} else if (yElement instanceof YBindingSet) {
			result = createNewInstance(BindingSetEditpart.class);
		} else if (yElement instanceof YValueBinding) {
			result = createNewInstance(ValueBindingEditpart.class);
		} else if (yElement instanceof YListBinding) {
			result = createNewInstance(ListBindingEditpart.class);
		} else if (yElement instanceof YContextValueBindingEndpoint) {
			result = createNewInstance(ContextValueBindingEndpointEditpart.class);
		} else if (yElement instanceof YBeanSlotValueBindingEndpoint) {
			result = createNewInstance(BeanSlotValueBindingEndpointEditpart.class);
		} else if (yElement instanceof YBeanSlotListBindingEndpoint) {
			result = createNewInstance(BeanSlotListBindingEndpointEditpart.class);
		} else if (yElement instanceof YDetailValueBindingEndpoint) {
			result = createNewInstance(DetailValueBindingEndpointEditpart.class);
		} else if (yElement instanceof YEmbeddableValueEndpoint) {
			result = createNewInstance(EmbeddableValueBindingEndpointEditpart.class);
		} else if (yElement instanceof YEmbeddableSelectionEndpoint) {
			result = createNewInstance(EmbeddableSelectionBindingEndpointEditpart.class);
		} else if (yElement instanceof YEmbeddableMultiSelectionEndpoint) {
			result = createNewInstance(EmbeddableMultiSelectionBindingEndpointEditpart.class);
		} else if (yElement instanceof YEmbeddableCollectionEndpoint) {
			result = createNewInstance(EmbeddableCollectionBindingEndpointEditpart.class);
		} else if (yElement instanceof YBeanValueBindingEndpoint) {
			result = createNewInstance(BeanValueBindingEndpointEditpart.class);
		} else if (yElement instanceof YEnumListBindingEndpoint) {
			result = createNewInstance(EnumListBindingEndpointEditpart.class);
		} else if (yElement instanceof YECViewModelValueBindingEndpoint) {
			result = createNewInstance(ECViewModelValueBindingEndpointEditpart.class);
		} else if (yElement instanceof YECViewModelListBindingEndpoint) {
			result = createNewInstance(ECViewModelListBindingEndpointEditpart.class);
		} else if (yElement instanceof YMinLengthValidator) {
			result = createNewInstance(MinLengthValidatorEditpart.class);
		} else if (yElement instanceof YMaxLengthValidator) {
			result = createNewInstance(MaxLengthValidatorEditpart.class);
		} else if (yElement instanceof YRegexpValidator) {
			result = createNewInstance(RegexpValidatorEditpart.class);
		} else if (yElement instanceof YClassDelegateValidator) {
			result = createNewInstance(ClassDelegateValidatorEditpart.class);
		} else if (yElement instanceof YBeanValidationValidator) {
			result = createNewInstance(BeanValidationValidatorEditpart.class);
		} else if (yElement instanceof YCommandSet) {
			result = createNewInstance(CommandSetEditpart.class);
		} else if (yElement instanceof YDialog) {
			result = createNewInstance(DialogEditpart.class);
		} else if (yElement instanceof YOpenDialogCommand) {
			result = createNewInstance(OpenDialogCommandEditpart.class);
		} else if (yElement instanceof YVisibilityProcessorValueBindingEndpoint) {
			result = createNewInstance(VisibilityProcessorValueBindingEndpointEditpart.class);
		} else if (yElement instanceof YVisibilityProcessor) {
			result = createNewInstance(VisibilityProcessorEditpart.class);
		} else if (yElement instanceof YExposedAction) {
			result = createNewInstance(ExposedActionEditpart.class);
		} else if (yElement instanceof YSendEventCommand) {
			result = createNewInstance(SendEventCommandEditpart.class);
		}

		if (result != null) {
			result.initialize((YElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            The type of the edit part to be created
	 * @return editpart
	 * @throws InstantiationException
	 *             e
	 * @throws IllegalAccessException
	 *             e
	 */
	protected IElementEditpart newInstance(
			Class<? extends IElementEditpart> type)
			throws InstantiationException, IllegalAccessException {
		return type.newInstance();
	}

}
