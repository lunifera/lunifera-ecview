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
 * A representation of the model object '<em><b>YBean Slot Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getAttributePath <em>Attribute Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getBeanSlot <em>Bean Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYBeanSlotValueBindingEndpoint()
 * @model
 * @generated
 */
public interface YBeanSlotValueBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Path</em>' attribute.
	 * @see #setAttributePath(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYBeanSlotValueBindingEndpoint_AttributePath()
	 * @model required="true"
	 * @generated
	 */
	String getAttributePath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getAttributePath <em>Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Path</em>' attribute.
	 * @see #getAttributePath()
	 * @generated
	 */
	void setAttributePath(String value);

	/**
	 * Returns the value of the '<em><b>Bean Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Slot</em>' reference.
	 * @see #setBeanSlot(YBeanSlot)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYBeanSlotValueBindingEndpoint_BeanSlot()
	 * @model required="true"
	 * @generated
	 */
	YBeanSlot getBeanSlot();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getBeanSlot <em>Bean Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Slot</em>' reference.
	 * @see #getBeanSlot()
	 * @generated
	 */
	void setBeanSlot(YBeanSlot value);

} // YBeanSlotValueBindingEndpoint
