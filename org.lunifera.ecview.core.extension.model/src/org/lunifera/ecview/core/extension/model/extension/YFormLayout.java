/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YSpacingable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YForm Layout</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YFormLayout#getCellStyles <em>Cell Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYFormLayout()
 * @model
 * @generated
 */
public interface YFormLayout extends YLayout, YSpacingable, YMarginable {
	/**
	 * Returns the value of the '<em><b>Cell Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Styles</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Styles</em>' containment reference list.
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYFormLayout_CellStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YFormLayoutCellStyle> getCellStyles();

	/**
	 * Returns the cell style for the given element.
	 * 
	 * @param element
	 * @return
	 */
	YFormLayoutCellStyle getCellStyle(YEmbeddable element);

} // YFormLayout
