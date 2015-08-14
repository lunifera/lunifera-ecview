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
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.listeners.YValueChangeListener;
import org.lunifera.ecview.core.common.model.validation.YValidator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YField#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YField#getInternalValidators <em>Internal Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YField#getConverter <em>Converter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYField()
 * @model
 * @generated
 */
public interface YField extends YEmbeddable, YEditable, YEnable, YFocusable {

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.validation.YValidator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validators</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYField_Validators()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YValidator> getValidators();

	/**
	 * Returns the value of the '<em><b>Internal Validators</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.validation.YValidator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Validators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Validators</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYField_InternalValidators()
	 * @model containment="true" resolveProxies="true" transient="true"
	 * @generated
	 */
	EList<YValidator> getInternalValidators();

	/**
	 * Returns the value of the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converter</em>' containment reference.
	 * @see #setConverter(YConverter)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYField_Converter()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YConverter getConverter();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YField#getConverter <em>Converter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converter</em>' containment reference.
	 * @see #getConverter()
	 * @generated
	 */
	void setConverter(YConverter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.lunifera.ecview.core.common.model.core.YValueChangeListener"
	 * @generated
	 */
	boolean addValueChangeListener(YValueChangeListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.lunifera.ecview.core.common.model.core.YValueChangeListener"
	 * @generated
	 */
	boolean removeValueChangeListener(YValueChangeListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAllValueChangListeners();
	
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
	
	
} // YUiField
