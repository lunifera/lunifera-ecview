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
package org.lunifera.ecview.core.databinding.tests.emf.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPerson</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.databinding.tests.emf.model.TPerson#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage#getTPerson()
 * @model
 * @generated
 */
public interface TPerson extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(TAddress)
	 * @see org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage#getTPerson_Address()
	 * @model
	 * @generated
	 */
	TAddress getAddress();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.databinding.tests.emf.model.TPerson#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(TAddress value);

} // TPerson
