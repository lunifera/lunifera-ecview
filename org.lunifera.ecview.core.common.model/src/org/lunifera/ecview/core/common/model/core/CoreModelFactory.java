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
package org.lunifera.ecview.core.common.model.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage
 * @generated
 */
public interface CoreModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreModelFactory eINSTANCE = org.lunifera.ecview.core.common.model.core.impl.CoreModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YLayout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YLayout</em>'.
	 * @generated
	 */
	YLayout createYLayout();

	/**
	 * Returns a new object of class '<em>YField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YField</em>'.
	 * @generated
	 */
	YField createYField();

	/**
	 * Returns a new object of class '<em>YView</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YView</em>'.
	 * @generated
	 */
	YView createYView();

	/**
	 * Returns a new object of class '<em>YView Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YView Set</em>'.
	 * @generated
	 */
	YViewSet createYViewSet();

	/**
	 * Returns a new object of class '<em>YBean Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBean Slot</em>'.
	 * @generated
	 */
	YBeanSlot createYBeanSlot();

	/**
	 * Returns a new object of class '<em>YDialog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDialog</em>'.
	 * @generated
	 */
	YDialog createYDialog();

	/**
	 * Returns a new object of class '<em>YAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YAction</em>'.
	 * @generated
	 */
	YAction createYAction();

	/**
	 * Returns a new object of class '<em>YContext Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YContext Value Binding Endpoint</em>'.
	 * @generated
	 */
	YContextValueBindingEndpoint createYContextValueBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YBean Slot Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBean Slot Value Binding Endpoint</em>'.
	 * @generated
	 */
	YBeanSlotValueBindingEndpoint createYBeanSlotValueBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YBean Slot List Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBean Slot List Binding Endpoint</em>'.
	 * @generated
	 */
	YBeanSlotListBindingEndpoint createYBeanSlotListBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Value Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Value Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableValueEndpoint createYEmbeddableValueEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Selection Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableSelectionEndpoint createYEmbeddableSelectionEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableMultiSelectionEndpoint createYEmbeddableMultiSelectionEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Collection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Collection Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableCollectionEndpoint createYEmbeddableCollectionEndpoint();

	/**
	 * Returns a new object of class '<em>YActivated Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YActivated Endpoint</em>'.
	 * @generated
	 */
	YActivatedEndpoint createYActivatedEndpoint();

	/**
	 * Returns a new object of class '<em>YDt Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDt Wrapper</em>'.
	 * @generated
	 */
	YDtWrapper createYDtWrapper();

	/**
	 * Returns a new object of class '<em>YCommand Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCommand Set</em>'.
	 * @generated
	 */
	YCommandSet createYCommandSet();

	/**
	 * Returns a new object of class '<em>YOpen Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YOpen Dialog Command</em>'.
	 * @generated
	 */
	YOpenDialogCommand createYOpenDialogCommand();

	/**
	 * Returns a new object of class '<em>YExposed Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YExposed Action</em>'.
	 * @generated
	 */
	YExposedAction createYExposedAction();

	/**
	 * Returns a new object of class '<em>YSend Event Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YSend Event Command</em>'.
	 * @generated
	 */
	YSendEventCommand createYSendEventCommand();

	/**
	 * Returns a new object of class '<em>YKey Stroke Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YKey Stroke Definition</em>'.
	 * @generated
	 */
	YKeyStrokeDefinition createYKeyStrokeDefinition();

	/**
	 * Returns a new object of class '<em>YDelegate Converter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDelegate Converter</em>'.
	 * @generated
	 */
	YDelegateConverter createYDelegateConverter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoreModelPackage getCoreModelPackage();

} //UiModelFactory
