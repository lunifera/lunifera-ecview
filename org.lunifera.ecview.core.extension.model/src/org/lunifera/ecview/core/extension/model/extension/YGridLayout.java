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
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YSpacingable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi Grid Layout</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYGridLayout()
 * @model
 * @generated
 */
public interface YGridLayout extends YLayout, YSpacingable, YMarginable {
	/**
	 * Returns the value of the '<em><b>Cell Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Styles</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Styles</em>' containment reference list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYGridLayout_CellStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YGridLayoutCellStyle> getCellStyles();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
	 * number of columns the GridLayout should contain. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYGridLayout_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '
	 * {@link org.lunifera.ecview.core.extension.model.extension.YGridLayout#getColumns
	 * <em>Columns</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YGridLayoutCellStyle addGridLayoutCellStyle(YEmbeddable element);

} // YUiGridLayout
