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
package org.lunifera.ecview.core.common.model.visibility;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibility Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDataUsed <em>Data Used</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getTriggersOn <em>Triggers On</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegateQualifiedName <em>Delegate Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProcessor()
 * @model
 * @generated
 */
public interface YVisibilityProcessor extends YElement {
	/**
	 * Returns the value of the '<em><b>Data Used</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.binding.YBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Used</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Used</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProcessor_DataUsed()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YBinding> getDataUsed();

	/**
	 * Returns the value of the '<em><b>Triggers On</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.binding.YBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers On</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProcessor_TriggersOn()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YBinding> getTriggersOn();

	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' attribute.
	 * @see #setDelegate(Class)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProcessor_Delegate()
	 * @model
	 * @generated
	 */
	Class<?> getDelegate();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegate <em>Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' attribute.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Delegate Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Qualified Name</em>' attribute.
	 * @see #setDelegateQualifiedName(String)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProcessor_DelegateQualifiedName()
	 * @model
	 * @generated
	 */
	String getDelegateQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegateQualifiedName <em>Delegate Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Qualified Name</em>' attribute.
	 * @see #getDelegateQualifiedName()
	 * @generated
	 */
	void setDelegateQualifiedName(String value);

} // YVisibilityProcessor
