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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibility Processor Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint#getProcessorInstance <em>Processor Instance</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#getYVisibilityProcessorValueBindingEndpoint()
 * @model
 * @generated
 */
public interface YVisibilityProcessorValueBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Processor Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Instance</em>' attribute.
	 * @see #setProcessorInstance(Object)
	 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#getYVisibilityProcessorValueBindingEndpoint_ProcessorInstance()
	 * @model transient="true"
	 * @generated
	 */
	Object getProcessorInstance();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint#getProcessorInstance <em>Processor Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Instance</em>' attribute.
	 * @see #getProcessorInstance()
	 * @generated
	 */
	void setProcessorInstance(Object value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#getYVisibilityProcessorValueBindingEndpoint_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

} // YVisibilityProcessorValueBindingEndpoint
