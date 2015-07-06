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
package org.lunifera.ecview.core.extension.model.extension;

import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YCommand;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YAdd To Table Command</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YAddToTableCommand#getTable <em>Table</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YAddToTableCommand#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYAddToTableCommand()
 * @model
 * @generated
 */
public interface YAddToTableCommand extends YCommand {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(YTable)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYAddToTableCommand_Table()
	 * @model
	 * @generated
	 */
	YTable getTable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YAddToTableCommand#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(YTable value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(Object)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYAddToTableCommand_Trigger()
	 * @model
	 * @generated
	 */
	Object getTrigger();

	/**
	 * Sets the value of the '
	 * {@link org.lunifera.ecview.core.extension.model.extension.YAddToTableCommand#getTrigger
	 * <em>Trigger</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Object value);
	
	public YECViewModelValueBindingEndpoint createTriggerEndpoint();

} // YAddToTableCommand
