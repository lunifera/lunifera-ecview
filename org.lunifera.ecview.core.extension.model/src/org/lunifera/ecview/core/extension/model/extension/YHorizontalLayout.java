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
 * <em><b>YUi Horizontal Layout</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout#getCellStyles <em>Cell Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYHorizontalLayout()
 * @model
 * @generated
 */
public interface YHorizontalLayout extends YLayout, YSpacingable, YMarginable {
	/**
	 * Returns the value of the '<em><b>Cell Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Styles</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Styles</em>' containment reference list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYHorizontalLayout_CellStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YHorizontalLayoutCellStyle> getCellStyles();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YHorizontalLayoutCellStyle getCellStyle(YEmbeddable element);

	/**
	 * Adds a new cell style to the internal list of cell styles.
	 * 
	 * @param element
	 * @return
	 */
	YHorizontalLayoutCellStyle addCellStyle(YEmbeddable element);

} // YUiHorizontalLayout
