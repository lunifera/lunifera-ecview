/**
 */
package org.lunifera.ecview.core.common.model.validation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YClass Delegate Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YClassDelegateValidatorImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YClassDelegateValidatorImpl#getDefaultErrorMessage <em>Default Error Message</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YClassDelegateValidatorImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YClassDelegateValidatorImpl extends YValidatorImpl implements YClassDelegateValidator {
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
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YClassDelegateValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YCLASS_DELEGATE_VALIDATOR__ERROR_CODE, oldErrorCode, errorCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE, oldDefaultErrorMessage, defaultErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YCLASS_DELEGATE_VALIDATOR__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__ERROR_CODE:
				return getErrorCode();
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return getDefaultErrorMessage();
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__CLASS_NAME:
				return getClassName();
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
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__ERROR_CODE:
				setErrorCode((String)newValue);
				return;
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage((String)newValue);
				return;
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__CLASS_NAME:
				setClassName((String)newValue);
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
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage(DEFAULT_ERROR_MESSAGE_EDEFAULT);
				return;
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
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
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return DEFAULT_ERROR_MESSAGE_EDEFAULT == null ? defaultErrorMessage != null : !DEFAULT_ERROR_MESSAGE_EDEFAULT.equals(defaultErrorMessage);
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
				case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__ERROR_CODE: return ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE;
				case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YClassDelegateValidationConfig.class) {
			switch (derivedFeatureID) {
				case ValidationPackage.YCLASS_DELEGATE_VALIDATOR__CLASS_NAME: return ValidationPackage.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME;
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
				case ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE: return ValidationPackage.YCLASS_DELEGATE_VALIDATOR__ERROR_CODE;
				case ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YClassDelegateValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME: return ValidationPackage.YCLASS_DELEGATE_VALIDATOR__CLASS_NAME;
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
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //YClassDelegateValidatorImpl
