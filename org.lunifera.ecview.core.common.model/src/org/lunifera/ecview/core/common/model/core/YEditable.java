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
 * A representation of the model object '<em><b>YEditable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YEditable#isInitialEditable <em>Initial Editable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YEditable#isEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEditable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YEditable extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Editable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Editable</em>' attribute.
	 * @see #setInitialEditable(boolean)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEditable_InitialEditable()
	 * @model default="true"
	 * @generated
	 */
	boolean isInitialEditable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YEditable#isInitialEditable <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Editable</em>' attribute.
	 * @see #isInitialEditable()
	 * @generated
	 */
	void setInitialEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYEditable_Editable()
	 * @model default="true" transient="true" derived="true"
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YEditable#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

} // YEditable
