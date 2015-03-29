/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YFocusable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YPanel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YPanel#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YPanel#getFirstContent <em>First Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YPanel#getSecondContent <em>Second Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYPanel()
 * @model
 * @generated
 */
public interface YPanel extends YLayout, YFocusable {
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
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYPanel_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YPanel#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>First Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Content</em>' reference.
	 * @see #setFirstContent(YEmbeddable)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYPanel_FirstContent()
	 * @model
	 * @generated
	 */
	YEmbeddable getFirstContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YPanel#getFirstContent <em>First Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Content</em>' reference.
	 * @see #getFirstContent()
	 * @generated
	 */
	void setFirstContent(YEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Second Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Content</em>' reference.
	 * @see #setSecondContent(YEmbeddable)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYPanel_SecondContent()
	 * @model
	 * @generated
	 */
	YEmbeddable getSecondContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YPanel#getSecondContent <em>Second Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Content</em>' reference.
	 * @see #getSecondContent()
	 * @generated
	 */
	void setSecondContent(YEmbeddable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YHorizontalLayoutCellStyle getCellStyle(YEmbeddable element);

} // YPanel
