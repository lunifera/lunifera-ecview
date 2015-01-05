/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBean Service Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.YBeanServiceConsumer#isUseBeanService <em>Use Bean Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanServiceConsumer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YBeanServiceConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Use Bean Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Bean Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Bean Service</em>' attribute.
	 * @see #setUseBeanService(boolean)
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#getYBeanServiceConsumer_UseBeanService()
	 * @model
	 * @generated
	 */
	boolean isUseBeanService();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.extension.model.extension.YBeanServiceConsumer#isUseBeanService <em>Use Bean Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Bean Service</em>' attribute.
	 * @see #isUseBeanService()
	 * @generated
	 */
	void setUseBeanService(boolean value);

} // YBeanServiceConsumer
