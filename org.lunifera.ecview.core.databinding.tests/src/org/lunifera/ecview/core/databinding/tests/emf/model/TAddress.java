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
 * A representation of the model object '<em><b>TAddress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.databinding.tests.emf.model.TAddress#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage#getTAddress()
 * @model
 * @generated
 */
public interface TAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(TCountry)
	 * @see org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage#getTAddress_Country()
	 * @model
	 * @generated
	 */
	TCountry getCountry();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.databinding.tests.emf.model.TAddress#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(TCountry value);

} // TAddress
