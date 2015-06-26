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
package org.lunifera.ecview.core.common.model.core;

import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YContext Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint#getUrlString <em>Url String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYContextValueBindingEndpoint()
 * @model
 * @generated
 */
public interface YContextValueBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url String</em>' attribute.
	 * @see #setUrlString(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYContextValueBindingEndpoint_UrlString()
	 * @model required="true"
	 * @generated
	 */
	String getUrlString();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint#getUrlString <em>Url String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url String</em>' attribute.
	 * @see #getUrlString()
	 * @generated
	 */
	void setUrlString(String value);

} // YContextValueBindingEndpoint
