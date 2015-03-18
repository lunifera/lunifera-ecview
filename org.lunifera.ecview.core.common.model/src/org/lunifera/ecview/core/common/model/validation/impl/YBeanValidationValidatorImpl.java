/**
 */
package org.lunifera.ecview.core.common.model.validation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YBeanValidationValidator;
import org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YBean Validation Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YBeanValidationValidatorImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YBeanValidationValidatorImpl#getDefaultErrorMessage <em>Default Error Message</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YBeanValidationValidatorImpl#getBvalClass <em>Bval Class</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YBeanValidationValidatorImpl#getBvalClassFullyQualifiedName <em>Bval Class Fully Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YBeanValidationValidatorImpl#getBvalProperty <em>Bval Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YBeanValidationValidatorImpl extends YValidatorImpl implements YBeanValidationValidator {
	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected String errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultErrorMessage() <em>Default Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultErrorMessage() <em>Default Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String defaultErrorMessage = DEFAULT_ERROR_MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBvalClass() <em>Bval Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvalClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> bvalClass;

	/**
	 * The default value of the '{@link #getBvalClassFullyQualifiedName() <em>Bval Class Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvalClassFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String BVAL_CLASS_FULLY_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBvalClassFullyQualifiedName() <em>Bval Class Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvalClassFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String bvalClassFullyQualifiedName = BVAL_CLASS_FULLY_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBvalProperty() <em>Bval Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String BVAL_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBvalProperty() <em>Bval Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvalProperty()
	 * @generated
	 * @ordered
	 */
	protected String bvalProperty = BVAL_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YBeanValidationValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(String newErrorCode) {
		String oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YBEAN_VALIDATION_VALIDATOR__ERROR_CODE, oldErrorCode, errorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultErrorMessage() {
		return defaultErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultErrorMessage(String newDefaultErrorMessage) {
		String oldDefaultErrorMessage = defaultErrorMessage;
		defaultErrorMessage = newDefaultErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YBEAN_VALIDATION_VALIDATOR__DEFAULT_ERROR_MESSAGE, oldDefaultErrorMessage, defaultErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getBvalClass() {
		return bvalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBvalClass(Class<?> newBvalClass) {
		Class<?> oldBvalClass = bvalClass;
		bvalClass = newBvalClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS, oldBvalClass, bvalClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBvalClassFullyQualifiedName() {
		return bvalClassFullyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBvalClassFullyQualifiedName(String newBvalClassFullyQualifiedName) {
		String oldBvalClassFullyQualifiedName = bvalClassFullyQualifiedName;
		bvalClassFullyQualifiedName = newBvalClassFullyQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS_FULLY_QUALIFIED_NAME, oldBvalClassFullyQualifiedName, bvalClassFullyQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBvalProperty() {
		return bvalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBvalProperty(String newBvalProperty) {
		String oldBvalProperty = bvalProperty;
		bvalProperty = newBvalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_PROPERTY, oldBvalProperty, bvalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__ERROR_CODE:
				return getErrorCode();
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return getDefaultErrorMessage();
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS:
				return getBvalClass();
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS_FULLY_QUALIFIED_NAME:
				return getBvalClassFullyQualifiedName();
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_PROPERTY:
				return getBvalProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__ERROR_CODE:
				setErrorCode((String)newValue);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage((String)newValue);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS:
				setBvalClass((Class<?>)newValue);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS_FULLY_QUALIFIED_NAME:
				setBvalClassFullyQualifiedName((String)newValue);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_PROPERTY:
				setBvalProperty((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage(DEFAULT_ERROR_MESSAGE_EDEFAULT);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS:
				setBvalClass((Class<?>)null);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS_FULLY_QUALIFIED_NAME:
				setBvalClassFullyQualifiedName(BVAL_CLASS_FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_PROPERTY:
				setBvalProperty(BVAL_PROPERTY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return DEFAULT_ERROR_MESSAGE_EDEFAULT == null ? defaultErrorMessage != null : !DEFAULT_ERROR_MESSAGE_EDEFAULT.equals(defaultErrorMessage);
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS:
				return bvalClass != null;
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS_FULLY_QUALIFIED_NAME:
				return BVAL_CLASS_FULLY_QUALIFIED_NAME_EDEFAULT == null ? bvalClassFullyQualifiedName != null : !BVAL_CLASS_FULLY_QUALIFIED_NAME_EDEFAULT.equals(bvalClassFullyQualifiedName);
			case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_PROPERTY:
				return BVAL_PROPERTY_EDEFAULT == null ? bvalProperty != null : !BVAL_PROPERTY_EDEFAULT.equals(bvalProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YValidationConfig.class) {
			switch (derivedFeatureID) {
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__ERROR_CODE: return ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE;
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YBeanValidationValidatorConfig.class) {
			switch (derivedFeatureID) {
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS;
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS_FULLY_QUALIFIED_NAME: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS_FULLY_QUALIFIED_NAME;
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_PROPERTY: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_PROPERTY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR__ERROR_CODE;
				case ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YBeanValidationValidatorConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS;
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS_FULLY_QUALIFIED_NAME: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_CLASS_FULLY_QUALIFIED_NAME;
				case ValidationPackage.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_PROPERTY: return ValidationPackage.YBEAN_VALIDATION_VALIDATOR__BVAL_PROPERTY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (errorCode: ");
		result.append(errorCode);
		result.append(", defaultErrorMessage: ");
		result.append(defaultErrorMessage);
		result.append(", bvalClass: ");
		result.append(bvalClass);
		result.append(", bvalClassFullyQualifiedName: ");
		result.append(bvalClassFullyQualifiedName);
		result.append(", bvalProperty: ");
		result.append(bvalProperty);
		result.append(')');
		return result.toString();
	}

} //YBeanValidationValidatorImpl
