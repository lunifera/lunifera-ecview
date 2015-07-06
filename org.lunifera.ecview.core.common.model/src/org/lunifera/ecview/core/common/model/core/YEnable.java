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

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEnable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YEnable#isInitialEnabled <em>Initial Enabled</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YEnable#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEnable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YEnable extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Enabled</em>' attribute.
	 * @see #setInitialEnabled(boolean)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEnable_InitialEnabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isInitialEnabled();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YEnable#isInitialEnabled <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Enabled</em>' attribute.
	 * @see #isInitialEnabled()
	 * @generated
	 */
	void setInitialEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEnable_Enabled()
	 * @model default="true" transient="true" derived="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YEnable#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

} // YEnable
