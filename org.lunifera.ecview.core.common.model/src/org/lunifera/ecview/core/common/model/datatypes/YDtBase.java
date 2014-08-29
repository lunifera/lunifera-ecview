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
package org.lunifera.ecview.core.common.model.datatypes;

import org.lunifera.ecview.core.common.model.core.YElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDt Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.datatypes.YDtBase#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage#getYDtBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YDtBase extends YElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage#getYDtBase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.datatypes.YDtBase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // YDtBase
