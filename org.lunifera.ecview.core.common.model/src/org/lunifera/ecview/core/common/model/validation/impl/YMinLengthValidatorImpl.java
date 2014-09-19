/**
 */
package org.lunifera.ecview.core.common.model.validation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YMin Length Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YMinLengthValidatorImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YMinLengthValidatorImpl#getDefaultErrorMessage <em>Default Error Message</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YMinLengthValidatorImpl#getMinLength <em>Min Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YMinLengthValidatorImpl extends YValidatorImpl implements YMinLengthValidator {
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
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected int minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YMinLengthValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationPackage.Literals.YMIN_LENGTH_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(int newMinLength) {
		int oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YMIN_LENGTH_VALIDATOR__MIN_LENGTH, oldMinLength, minLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YMIN_LENGTH_VALIDATOR__ERROR_CODE, oldErrorCode, errorCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE, oldDefaultErrorMessage, defaultErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__ERROR_CODE:
				return getErrorCode();
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return getDefaultErrorMessage();
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__MIN_LENGTH:
				return getMinLength();
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
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__ERROR_CODE:
				setErrorCode((String)newValue);
				return;
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage((String)newValue);
				return;
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__MIN_LENGTH:
				setMinLength((Integer)newValue);
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
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage(DEFAULT_ERROR_MESSAGE_EDEFAULT);
				return;
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
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
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return DEFAULT_ERROR_MESSAGE_EDEFAULT == null ? defaultErrorMessage != null : !DEFAULT_ERROR_MESSAGE_EDEFAULT.equals(defaultErrorMessage);
			case ValidationPackage.YMIN_LENGTH_VALIDATOR__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
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
				case ValidationPackage.YMIN_LENGTH_VALIDATOR__ERROR_CODE: return ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE;
				case ValidationPackage.YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YMinLengthValidationConfig.class) {
			switch (derivedFeatureID) {
				case ValidationPackage.YMIN_LENGTH_VALIDATOR__MIN_LENGTH: return ValidationPackage.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH;
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
				case ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE: return ValidationPackage.YMIN_LENGTH_VALIDATOR__ERROR_CODE;
				case ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YMinLengthValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH: return ValidationPackage.YMIN_LENGTH_VALIDATOR__MIN_LENGTH;
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
		result.append(", minLength: ");
		result.append(minLength);
		result.append(')');
		return result.toString();
	}

} //YMinLengthValidatorImpl
