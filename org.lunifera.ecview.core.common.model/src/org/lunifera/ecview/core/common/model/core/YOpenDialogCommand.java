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

import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YOpen Dialog Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getDialog <em>Dialog</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYOpenDialogCommand()
 * @model
 * @generated
 */
public interface YOpenDialogCommand extends YCommand {
	/**
	 * Returns the value of the '<em><b>Dialog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialog</em>' reference.
	 * @see #setDialog(YDialog)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYOpenDialogCommand_Dialog()
	 * @model
	 * @generated
	 */
	YDialog getDialog();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getDialog <em>Dialog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog</em>' reference.
	 * @see #getDialog()
	 * @generated
	 */
	void setDialog(YDialog value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(Object)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYOpenDialogCommand_Trigger()
	 * @model
	 * @generated
	 */
	Object getTrigger();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Object value);

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
	 * @model
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createTriggerDialogEndpoint();

} // YOpenDialogCommand
