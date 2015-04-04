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
 * A representation of the model object '<em><b>YMax Length Validation Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYMaxLengthValidationConfig()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YMaxLengthValidationConfig extends YValidationConfig {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYMaxLengthValidationConfig_MaxLength()
	 * @model required="true"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

} // YMaxLengthValidationConfig
