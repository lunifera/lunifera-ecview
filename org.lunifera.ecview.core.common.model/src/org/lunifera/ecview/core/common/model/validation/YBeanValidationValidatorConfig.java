/**
 */
package org.lunifera.ecview.core.common.model.validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBean Validation Validator Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig#getBvalClass <em>Bval Class</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig#getBvalClassFullyQualifiedName <em>Bval Class Fully Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig#getBvalProperty <em>Bval Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYBeanValidationValidatorConfig()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YBeanValidationValidatorConfig extends YValidationConfig {
	/**
	 * Returns the value of the '<em><b>Bval Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bval Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bval Class</em>' attribute.
	 * @see #setBvalClass(Class)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYBeanValidationValidatorConfig_BvalClass()
	 * @model
	 * @generated
	 */
	Class<?> getBvalClass();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig#getBvalClass <em>Bval Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bval Class</em>' attribute.
	 * @see #getBvalClass()
	 * @generated
	 */
	void setBvalClass(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Bval Class Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bval Class Fully Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bval Class Fully Qualified Name</em>' attribute.
	 * @see #setBvalClassFullyQualifiedName(String)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYBeanValidationValidatorConfig_BvalClassFullyQualifiedName()
	 * @model
	 * @generated
	 */
	String getBvalClassFullyQualifiedName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig#getBvalClassFullyQualifiedName <em>Bval Class Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bval Class Fully Qualified Name</em>' attribute.
	 * @see #getBvalClassFullyQualifiedName()
	 * @generated
	 */
	void setBvalClassFullyQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Bval Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bval Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bval Property</em>' attribute.
	 * @see #setBvalProperty(String)
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#getYBeanValidationValidatorConfig_BvalProperty()
	 * @model
	 * @generated
	 */
	String getBvalProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig#getBvalProperty <em>Bval Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bval Property</em>' attribute.
	 * @see #getBvalProperty()
	 * @generated
	 */
	void setBvalProperty(String value);

} // YBeanValidationValidatorConfig
