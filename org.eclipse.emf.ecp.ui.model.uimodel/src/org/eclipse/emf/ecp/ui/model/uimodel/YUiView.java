/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.model.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiView#getViewName <em>View Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage#getYUiView()
 * @model
 * @generated
 */
public interface YUiView extends YUiElement, YUiLayout {
	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage#getYUiView_ViewName()
	 * @model
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiView#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

} // YUiView
