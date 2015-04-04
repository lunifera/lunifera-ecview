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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YMin Length Validation Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig#getMinLength <em>Min Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYMinLengthValidationConfig()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YMinLengthValidationConfig extends YValidationConfig {
	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYMinLengthValidationConfig_MinLength()
	 * @model required="true"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

} // YMinLengthValidationConfig
