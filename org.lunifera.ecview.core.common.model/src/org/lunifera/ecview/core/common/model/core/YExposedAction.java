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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YExposed Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getLabel <em>Label</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getLabelI18nKey <em>Label I1 8n Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYExposedAction()
 * @model
 * @generated
 */
public interface YExposedAction extends YElement {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYExposedAction_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYExposedAction_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label I1 8n Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label I1 8n Key</em>' attribute.
	 * @see #setLabelI18nKey(String)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYExposedAction_LabelI18nKey()
	 * @model
	 * @generated
	 */
	String getLabelI18nKey();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getLabelI18nKey <em>Label I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label I1 8n Key</em>' attribute.
	 * @see #getLabelI18nKey()
	 * @generated
	 */
	void setLabelI18nKey(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

} // YExposedAction
