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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YMulti Selection Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint <em>Multi Selection Binding Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYMultiSelectionBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YMultiSelectionBindable extends YBindable {
	/**
	 * Returns the value of the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Selection Binding Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Selection Binding Endpoint</em>' reference.
	 * @see #setMultiSelectionBindingEndpoint(YEmbeddableMultiSelectionEndpoint)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYMultiSelectionBindable_MultiSelectionBindingEndpoint()
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement
	 * @model opposite="element"
	 * @generated
	 */
	YEmbeddableMultiSelectionEndpoint getMultiSelectionBindingEndpoint();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint <em>Multi Selection Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Selection Binding Endpoint</em>' reference.
	 * @see #getMultiSelectionBindingEndpoint()
	 * @generated
	 */
	void setMultiSelectionBindingEndpoint(YEmbeddableMultiSelectionEndpoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YEmbeddableMultiSelectionEndpoint createMultiSelectionEndpoint();

} // YMultiSelectionBindable
