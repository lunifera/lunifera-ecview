/**
 */
package org.lunifera.ecview.core.common.model.validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YClass Delegate Validation Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYClassDelegateValidationConfig()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YClassDelegateValidationConfig extends YValidationConfig {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYClassDelegateValidationConfig_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // YClassDelegateValidationConfig
