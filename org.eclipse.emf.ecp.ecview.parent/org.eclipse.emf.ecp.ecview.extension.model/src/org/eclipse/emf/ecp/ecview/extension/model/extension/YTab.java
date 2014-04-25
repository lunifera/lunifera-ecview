/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YTab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTab#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTab#getEmbeddable <em>Embeddable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTab()
 * @model
 * @generated
 */
public interface YTab extends YElement, YCssAble {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(YTabSheet)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTab_Parent()
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet#getTabs
	 * @model opposite="tabs" required="true" transient="false"
	 * @generated
	 */
	YTabSheet getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTab#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(YTabSheet value);

	/**
	 * Returns the value of the '<em><b>Embeddable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embeddable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embeddable</em>' containment reference.
	 * @see #setEmbeddable(YEmbeddable)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTab_Embeddable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	YEmbeddable getEmbeddable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTab#getEmbeddable <em>Embeddable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embeddable</em>' containment reference.
	 * @see #getEmbeddable()
	 * @generated
	 */
	void setEmbeddable(YEmbeddable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

} // YTab