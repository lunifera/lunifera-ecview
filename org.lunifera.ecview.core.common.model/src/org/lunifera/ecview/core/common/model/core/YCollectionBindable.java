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
 * A representation of the model object '<em><b>YCollection Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YCollectionBindable#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYCollectionBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YCollectionBindable extends YBindable {
	/**
	 * Returns the value of the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Binding Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Binding Endpoint</em>' reference.
	 * @see #setCollectionBindingEndpoint(YEmbeddableCollectionEndpoint)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYCollectionBindable_CollectionBindingEndpoint()
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint#getElement
	 * @model opposite="element"
	 * @generated
	 */
	YEmbeddableCollectionEndpoint getCollectionBindingEndpoint();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YCollectionBindable#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Binding Endpoint</em>' reference.
	 * @see #getCollectionBindingEndpoint()
	 * @generated
	 */
	void setCollectionBindingEndpoint(YEmbeddableCollectionEndpoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YEmbeddableCollectionEndpoint createCollectionEndpoint();

} // YCollectionBindable
