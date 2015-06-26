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
 * A representation of the model object '<em><b>YVisibleable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YVisibleable#isInitialVisible <em>Initial Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YVisibleable#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYVisibleable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YVisibleable extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Visible</em>' attribute.
	 * @see #setInitialVisible(boolean)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYVisibleable_InitialVisible()
	 * @model default="true"
	 * @generated
	 */
	boolean isInitialVisible();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YVisibleable#isInitialVisible <em>Initial Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Visible</em>' attribute.
	 * @see #isInitialVisible()
	 * @generated
	 */
	void setInitialVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYVisibleable_Visible()
	 * @model default="true" transient="true" derived="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YVisibleable#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

} // YVisibleable
