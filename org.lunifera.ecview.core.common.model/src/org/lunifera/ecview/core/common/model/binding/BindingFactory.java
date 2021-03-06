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
package org.lunifera.ecview.core.common.model.binding;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage
 * @generated
 */
public interface BindingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BindingFactory eINSTANCE = org.lunifera.ecview.core.common.model.binding.impl.BindingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YBinding Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBinding Set</em>'.
	 * @generated
	 */
	YBindingSet createYBindingSet();

	/**
	 * Returns a new object of class '<em>YBean Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBean Value Binding Endpoint</em>'.
	 * @generated
	 */
	YBeanValueBindingEndpoint createYBeanValueBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YValue Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YValue Binding</em>'.
	 * @generated
	 */
	YValueBinding createYValueBinding();

	/**
	 * Returns a new object of class '<em>YList Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YList Binding</em>'.
	 * @generated
	 */
	YListBinding createYListBinding();

	/**
	 * Returns a new object of class '<em>YEnum List Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEnum List Binding Endpoint</em>'.
	 * @generated
	 */
	YEnumListBindingEndpoint createYEnumListBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YEC View Model Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEC View Model Value Binding Endpoint</em>'.
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createYECViewModelValueBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YEC View Model List Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEC View Model List Binding Endpoint</em>'.
	 * @generated
	 */
	YECViewModelListBindingEndpoint createYECViewModelListBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YVisibility Processor Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YVisibility Processor Value Binding Endpoint</em>'.
	 * @generated
	 */
	YVisibilityProcessorValueBindingEndpoint createYVisibilityProcessorValueBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YDetail Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDetail Value Binding Endpoint</em>'.
	 * @generated
	 */
	YDetailValueBindingEndpoint createYDetailValueBindingEndpoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BindingPackage getBindingPackage();

} //BindingFactory
