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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YBean Slot</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueTypeQualifiedName <em>Value Type Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYBeanSlot()
 * @model
 * @generated
 */
public interface YBeanSlot extends YBindable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYBeanSlot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(Class)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYBeanSlot_ValueType()
	 * @model required="true"
	 * @generated
	 */
	Class<?> getValueType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Value Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Qualified Name</em>' attribute.
	 * @see #setValueTypeQualifiedName(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYBeanSlot_ValueTypeQualifiedName()
	 * @model
	 * @generated
	 */
	String getValueTypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueTypeQualifiedName <em>Value Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type Qualified Name</em>' attribute.
	 * @see #getValueTypeQualifiedName()
	 * @generated
	 */
	void setValueTypeQualifiedName(String value);

	/**
	 * Creates a binding endpoint that may be used to bind values against this
	 * element.
	 * 
	 * @param path the attribute or a nested path "person.address.street"
	 * @return
	 */
	YBeanSlotValueBindingEndpoint createBindingEndpoint(String path);

	/**
	 * Creates a binding endpoint that may be used to bind lists against this
	 * element.
	 * 
	 * @param path the attribute or a nested path "person.address.street"
	 * @param collectionType the type contained in the collection
	 * @return
	 */
	YBeanSlotListBindingEndpoint createListBindingEndpoint(String path, Class<?> collectionType);

} // YBeanSlot
