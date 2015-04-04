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

import org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEmbeddable Multi Selection Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEmbeddableMultiSelectionEndpoint()
 * @model
 * @generated
 */
public interface YEmbeddableMultiSelectionEndpoint extends YListBindingEndpoint, YEmbeddableBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint <em>Multi Selection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(YMultiSelectionBindable)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEmbeddableMultiSelectionEndpoint_Element()
	 * @see org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint
	 * @model opposite="multiSelectionBindingEndpoint" required="true"
	 * @generated
	 */
	YMultiSelectionBindable getElement();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(YMultiSelectionBindable value);

} // YEmbeddableMultiSelectionEndpoint
