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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.editpart.IActionEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IContextBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IDetailValueBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableCollectionEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableMultiSelectionEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableSelectionEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableValueBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBeanBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IListBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IValueBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BeanBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.ListBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.ValueBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.common.AbstractEditpartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.MaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.MinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.RegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IRegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;

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
					|| uriString.equals(BindingPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(CoreModelPackage.eNS_URI)
					|| element.equals(BindingPackage.eNS_URI);
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
				.isAssignableFrom(IContextBindingEndpointEditpart.class)) {
			result = createNewInstance(ContextBindingEndpointEditpart.class);
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
				.isAssignableFrom(IBeanBindingEndpointEditpart.class)) {
			result = createNewInstance(BeanBindingEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IMinLengthValidatorEditpart.class)) {
			result = createNewInstance(MinLengthValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IMaxLengthValidatorEditpart.class)) {
			result = createNewInstance(MaxLengthValidatorEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IRegexpValidatorEditpart.class)) {
			result = createNewInstance(RegexpValidatorEditpart.class);
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
		} else if (yElement instanceof YContextBindingEndpoint) {
			result = createNewInstance(ContextBindingEndpointEditpart.class);
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
		} else if (yElement instanceof YBeanBindingEndpoint) {
			result = createNewInstance(BeanBindingEndpointEditpart.class);
		} else if (yElement instanceof YMinLengthValidator) {
			result = createNewInstance(MinLengthValidatorEditpart.class);
		} else if (yElement instanceof YMaxLengthValidator) {
			result = createNewInstance(MaxLengthValidatorEditpart.class);
		} else if (yElement instanceof YRegexpValidator) {
			result = createNewInstance(RegexpValidatorEditpart.class);
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
