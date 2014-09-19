/**
 */
package org.lunifera.ecview.core.common.model.validation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YRegexp Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YRegexpValidatorImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YRegexpValidatorImpl#getDefaultErrorMessage <em>Default Error Message</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.validation.impl.YRegexpValidatorImpl#getRegExpression <em>Reg Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YRegexpValidatorImpl extends YValidatorImpl implements YRegexpValidator {
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
	 * The default value of the '{@link #getRegExpression() <em>Reg Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegExpression() <em>Reg Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegExpression()
	 * @generated
	 * @ordered
	 */
	protected String regExpression = REG_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YRegexpValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationPackage.Literals.YREGEXP_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegExpression() {
		return regExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegExpression(String newRegExpression) {
		String oldRegExpression = regExpression;
		regExpression = newRegExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION, oldRegExpression, regExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YREGEXP_VALIDATOR__ERROR_CODE, oldErrorCode, errorCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE, oldDefaultErrorMessage, defaultErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationPackage.YREGEXP_VALIDATOR__ERROR_CODE:
				return getErrorCode();
			case ValidationPackage.YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return getDefaultErrorMessage();
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				return getRegExpression();
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
			case ValidationPackage.YREGEXP_VALIDATOR__ERROR_CODE:
				setErrorCode((String)newValue);
				return;
			case ValidationPackage.YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage((String)newValue);
				return;
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				setRegExpression((String)newValue);
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
			case ValidationPackage.YREGEXP_VALIDATOR__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case ValidationPackage.YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage(DEFAULT_ERROR_MESSAGE_EDEFAULT);
				return;
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				setRegExpression(REG_EXPRESSION_EDEFAULT);
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
			case ValidationPackage.YREGEXP_VALIDATOR__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case ValidationPackage.YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE:
				return DEFAULT_ERROR_MESSAGE_EDEFAULT == null ? defaultErrorMessage != null : !DEFAULT_ERROR_MESSAGE_EDEFAULT.equals(defaultErrorMessage);
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				return REG_EXPRESSION_EDEFAULT == null ? regExpression != null : !REG_EXPRESSION_EDEFAULT.equals(regExpression);
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
				case ValidationPackage.YREGEXP_VALIDATOR__ERROR_CODE: return ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE;
				case ValidationPackage.YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YRegexpValidationConfig.class) {
			switch (derivedFeatureID) {
				case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION: return ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION;
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
				case ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE: return ValidationPackage.YREGEXP_VALIDATOR__ERROR_CODE;
				case ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YRegexpValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION: return ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION;
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
		result.append(", regExpression: ");
		result.append(regExpression);
		result.append(')');
		return result.toString();
	}

} //YRegexpValidatorImpl
