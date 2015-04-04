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
 * A representation of the model object '<em><b>YValue Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#getYValueBindingEndpoint()
 * @model abstract="true"
 * @generated
 */
public interface YValueBindingEndpoint extends YBindingEndpoint {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YDetailValueBindingEndpoint createDetailValueEndpoint();
} // YValueBindingEndpoint
