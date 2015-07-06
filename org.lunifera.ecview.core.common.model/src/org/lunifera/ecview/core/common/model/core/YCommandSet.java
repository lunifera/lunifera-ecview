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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YCommand Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YCommandSet#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YCommandSet#getTransientCommands <em>Transient Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYCommandSet()
 * @model
 * @generated
 */
public interface YCommandSet extends YElement {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.core.YCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYCommandSet_Commands()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YCommand> getCommands();

	/**
	 * Returns the value of the '<em><b>Transient Commands</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.core.YCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Commands</em>' reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYCommandSet_TransientCommands()
	 * @model transient="true"
	 * @generated
	 */
	EList<YCommand> getTransientCommands();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model commandRequired="true"
	 * @generated
	 */
	void addCommand(YCommand command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model commandRequired="true"
	 * @generated
	 */
	void removeCommand(YCommand command);

} // YCommandSet
