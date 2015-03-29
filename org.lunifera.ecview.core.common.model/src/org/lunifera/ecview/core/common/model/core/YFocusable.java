/**
 */
package org.lunifera.ecview.core.common.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YFocusable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.YFocusable#getTabIndex <em>Tab Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYFocusable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YFocusable extends EObject {
	/**
	 * Returns the value of the '<em><b>Tab Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Index</em>' attribute.
	 * @see #setTabIndex(int)
	 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getYFocusable_TabIndex()
	 * @model default="-1"
	 * @generated
	 */
	int getTabIndex();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.core.YFocusable#getTabIndex <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Index</em>' attribute.
	 * @see #getTabIndex()
	 * @generated
	 */
	void setTabIndex(int value);

} // YFocusable
