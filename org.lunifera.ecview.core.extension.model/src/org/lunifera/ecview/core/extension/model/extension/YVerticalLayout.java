/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YSpacingable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi Vertical Layout</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayout#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayout#isFillVertical <em>Fill Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYVerticalLayout()
 * @model
 * @generated
 */
public interface YVerticalLayout extends YLayout, YSpacingable, YMarginable {
	/**
	 * Returns the value of the '<em><b>Cell Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Styles</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Styles</em>' containment reference list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYVerticalLayout_CellStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YVerticalLayoutCellStyle> getCellStyles();

	/**
	 * Returns the value of the '<em><b>Fill Vertical</b></em>' attribute. The
	 * default value is <code>"true"</code>. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> If false, then the width of all
	 * elements contained in the grid layout will be decreased to their
	 * preferred height or their miminum height. If no alignment is defined for
	 * a child, this setting will become its default. Eg if child has not a
	 * alignment, the vertical alignment will become FILL if fillVertical is
	 * true. Otherwise the ui-kit default will be used as the vertical
	 * alignment. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Fill Vertical</em>' attribute.
	 * @see #setFillVertical(boolean)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYVerticalLayout_FillVertical()
	 * @model default="true"
	 * @generated
	 */
	boolean isFillVertical();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayout#isFillVertical <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Fill Vertical</em>' attribute.
	 * @see #isFillVertical()
	 * @generated
	 */
	void setFillVertical(boolean value);

	/**
	 * Returns the cell style for the given element.
	 * 
	 * @param element
	 * @return
	 */
	YVerticalLayoutCellStyle getCellStyle(YEmbeddable element);

	/**
	 * Adds a new cell style to the internal list of cell styles.
	 * 
	 * @param element
	 * @return
	 */
	YVerticalLayoutCellStyle addCellStyle(YEmbeddable element);

} // YUiVerticalLayout
