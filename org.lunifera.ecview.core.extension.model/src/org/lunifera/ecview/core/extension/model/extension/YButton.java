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

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YAction;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YVisibleable;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YButton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YButton#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YButton#getClickListeners <em>Click Listeners</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YButton#getLastClickTime <em>Last Click Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYButton()
 * @model
 * @generated
 */
public interface YButton extends YAction, YVisibleable, YEditable, YEnable {
	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadescription</em>' reference.
	 * @see #setDatadescription(YDatadescription)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYButton_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YButton#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Click Listeners</b></em>' attribute list.
	 * The list contents are of type {@link org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Click Listeners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Click Listeners</em>' attribute list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYButton_ClickListeners()
	 * @model dataType="org.lunifera.ecview.core.extension.model.extension.YButtonClickListener" transient="true"
	 * @generated
	 */
	EList<YButtonClickListener> getClickListeners();

	/**
	 * Returns the value of the '<em><b>Last Click Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Click Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Click Time</em>' attribute.
	 * @see #setLastClickTime(long)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYButton_LastClickTime()
	 * @model
	 * @generated
	 */
	long getLastClickTime();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YButton#getLastClickTime <em>Last Click Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Click Time</em>' attribute.
	 * @see #getLastClickTime()
	 * @generated
	 */
	void setLastClickTime(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.lunifera.ecview.core.extension.model.extension.YButtonClickListener"
	 * @generated
	 */
	void addClickListener(YButtonClickListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.lunifera.ecview.core.extension.model.extension.YButtonClickListener"
	 * @generated
	 */
	void removeClickListener(YButtonClickListener listener);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createClickEndpoint();

	/**
	 * Creates a binding endpoint to observe the editable property.
	 * @return
	 */
	YValueBindingEndpoint createEditableEndpoint();
	
	
	/**
	 * Creates a binding endpoint to observe the enabled property.
	 * @return
	 */
	YValueBindingEndpoint createEnabledEndpoint();

} // YButton
