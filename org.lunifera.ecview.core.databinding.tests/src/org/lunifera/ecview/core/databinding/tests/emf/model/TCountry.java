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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCountry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.databinding.tests.emf.model.TCountry#getIsoCode <em>Iso Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.databinding.tests.emf.model.TCountry#getCities <em>Cities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage#getTCountry()
 * @model
 * @generated
 */
public interface TCountry extends EObject {
	/**
	 * Returns the value of the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso Code</em>' attribute.
	 * @see #setIsoCode(String)
	 * @see org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage#getTCountry_IsoCode()
	 * @model
	 * @generated
	 */
	String getIsoCode();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.databinding.tests.emf.model.TCountry#getIsoCode <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Code</em>' attribute.
	 * @see #getIsoCode()
	 * @generated
	 */
	void setIsoCode(String value);

	/**
	 * Returns the value of the '<em><b>Cities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' attribute list.
	 * @see org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage#getTCountry_Cities()
	 * @model
	 * @generated
	 */
	EList<String> getCities();

} // TCountry
