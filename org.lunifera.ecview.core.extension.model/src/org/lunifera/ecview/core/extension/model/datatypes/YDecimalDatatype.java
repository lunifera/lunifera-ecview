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
package org.lunifera.ecview.core.extension.model.datatypes;

import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDecimal Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype#getPrecision <em>Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage#getYDecimalDatatype()
 * @model
 * @generated
 */
public interface YDecimalDatatype extends YNumericDatatype, YRegexpValidationConfig {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage#getYDecimalDatatype_Precision()
	 * @model default="2"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

} // YDecimalDatatype
