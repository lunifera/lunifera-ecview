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
 * A representation of the model object '<em><b>YUi Widthable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YWidthable#getWidth <em>Width</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YWidthable#getWidthUnit <em>Width Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYWidthable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YWidthable extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYWidthable_Width()
	 * @model default="100"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YWidthable#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Width Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.common.model.core.YUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Unit</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YUnit
	 * @see #setWidthUnit(YUnit)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYWidthable_WidthUnit()
	 * @model
	 * @generated
	 */
	YUnit getWidthUnit();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YWidthable#getWidthUnit <em>Width Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Unit</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.core.YUnit
	 * @see #getWidthUnit()
	 * @generated
	 */
	void setWidthUnit(YUnit value);

} // YUiWidthable
