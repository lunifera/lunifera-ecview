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
 * A representation of the model object '<em><b>YSend Event Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getEventTopic <em>Event Topic</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getMessage <em>Message</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#isAutoTrigger <em>Auto Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYSendEventCommand()
 * @model
 * @generated
 */
public interface YSendEventCommand extends YCommand {
	/**
	 * Returns the value of the '<em><b>Event Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Topic</em>' attribute.
	 * @see #setEventTopic(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYSendEventCommand_EventTopic()
	 * @model
	 * @generated
	 */
	String getEventTopic();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getEventTopic <em>Event Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Topic</em>' attribute.
	 * @see #getEventTopic()
	 * @generated
	 */
	void setEventTopic(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(Object)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYSendEventCommand_Message()
	 * @model
	 * @generated
	 */
	Object getMessage();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Object value);

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
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYSendEventCommand_Trigger()
	 * @model
	 * @generated
	 */
	Object getTrigger();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Object value);

	/**
	 * Returns the value of the '<em><b>Auto Trigger</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Trigger</em>' attribute.
	 * @see #setAutoTrigger(boolean)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYSendEventCommand_AutoTrigger()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoTrigger();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#isAutoTrigger <em>Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Trigger</em>' attribute.
	 * @see #isAutoTrigger()
	 * @generated
	 */
	void setAutoTrigger(boolean value);

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
	YECViewModelValueBindingEndpoint createTriggerEndpoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createMessageEndpoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createAutoTriggerEndpoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createEventTopicEndpoint();

} // YSendEventCommand
