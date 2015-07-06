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
package org.lunifera.ecview.core.common.model.validation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YValidation Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig#getDefaultErrorMessage <em>Default Error Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYValidationConfig()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YValidationConfig extends EObject {

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see #setErrorCode(String)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYValidationConfig_ErrorCode()
	 * @model
	 * @generated
	 */
	String getErrorCode();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Error Message</em>' attribute.
	 * @see #setDefaultErrorMessage(String)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYValidationConfig_DefaultErrorMessage()
	 * @model
	 * @generated
	 */
	String getDefaultErrorMessage();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig#getDefaultErrorMessage <em>Default Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Error Message</em>' attribute.
	 * @see #getDefaultErrorMessage()
	 * @generated
	 */
	void setDefaultErrorMessage(String value);
} // YValidationConfig
