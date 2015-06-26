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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi View Set</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YViewSet#getViews <em>Views</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YViewSet#getBeanSlots <em>Bean Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYViewSet()
 * @model
 * @generated
 */
public interface YViewSet extends YElement {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.core.YView}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.ecview.core.common.model.core.YView#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYViewSet_Views()
	 * @see org.lunifera.ecview.core.common.model.core.YView#getRoot
	 * @model opposite="root"
	 * @generated
	 */
	EList<YView> getViews();

	/**
	 * Returns the value of the '<em><b>Bean Slots</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.lunifera.ecview.core.common.model.core.YBeanSlot}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Slots</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bean Slots</em>' containment reference
	 *         list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYViewSet_BeanSlots()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YBeanSlot> getBeanSlots();

	/**
	 * Adds a new bean slot for the given name and type.
	 * 
	 * @param name
	 * @param type
	 * @return
	 */
	YBeanSlot addBeanSlot(String name, Class<?> type);

} // YUiViewSet
