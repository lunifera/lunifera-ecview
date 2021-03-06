/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.core.extension.model.datatypes.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YValidator;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage;
import org.lunifera.ecview.core.extension.model.datatypes.YTextAreaDatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YText Area Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getDefaultErrorMessage <em>Default Error Message</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTextAreaDatatypeImpl#getRegExpression <em>Reg Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YTextAreaDatatypeImpl extends MinimalEObjectImpl.Container implements YTextAreaDatatype {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<YValidator> validators;

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
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

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
	protected YTextAreaDatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtDatatypesPackage.Literals.YTEXT_AREA_DATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectResolvingEList<YValidator>(YValidator.class, this, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__VALIDATORS);
		}
		return validators;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ERROR_CODE, oldErrorCode, errorCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DEFAULT_ERROR_MESSAGE, oldDefaultErrorMessage, defaultErrorMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTEXT_AREA_DATATYPE__REG_EXPRESSION, oldRegExpression, regExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ID:
				return getId();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__NAME:
				return getName();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DESCRIPTION:
				return getDescription();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__VALIDATORS:
				return getValidators();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ERROR_CODE:
				return getErrorCode();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DEFAULT_ERROR_MESSAGE:
				return getDefaultErrorMessage();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MIN_LENGTH:
				return getMinLength();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MAX_LENGTH:
				return getMaxLength();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__REG_EXPRESSION:
				return getRegExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ID:
				setId((String)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__NAME:
				setName((String)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends YValidator>)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ERROR_CODE:
				setErrorCode((String)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage((String)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__REG_EXPRESSION:
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
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__VALIDATORS:
				getValidators().clear();
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DEFAULT_ERROR_MESSAGE:
				setDefaultErrorMessage(DEFAULT_ERROR_MESSAGE_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__REG_EXPRESSION:
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
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DEFAULT_ERROR_MESSAGE:
				return DEFAULT_ERROR_MESSAGE_EDEFAULT == null ? defaultErrorMessage != null : !DEFAULT_ERROR_MESSAGE_EDEFAULT.equals(defaultErrorMessage);
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__REG_EXPRESSION:
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
				case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ERROR_CODE: return ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE;
				case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DEFAULT_ERROR_MESSAGE: return ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YMinLengthValidationConfig.class) {
			switch (derivedFeatureID) {
				case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MIN_LENGTH: return ValidationPackage.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == YMaxLengthValidationConfig.class) {
			switch (derivedFeatureID) {
				case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MAX_LENGTH: return ValidationPackage.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == YRegexpValidationConfig.class) {
			switch (derivedFeatureID) {
				case ExtDatatypesPackage.YTEXT_AREA_DATATYPE__REG_EXPRESSION: return ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION;
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
				case ValidationPackage.YVALIDATION_CONFIG__ERROR_CODE: return ExtDatatypesPackage.YTEXT_AREA_DATATYPE__ERROR_CODE;
				case ValidationPackage.YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE: return ExtDatatypesPackage.YTEXT_AREA_DATATYPE__DEFAULT_ERROR_MESSAGE;
				default: return -1;
			}
		}
		if (baseClass == YMinLengthValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH: return ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MIN_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == YMaxLengthValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH: return ExtDatatypesPackage.YTEXT_AREA_DATATYPE__MAX_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == YRegexpValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION: return ExtDatatypesPackage.YTEXT_AREA_DATATYPE__REG_EXPRESSION;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", errorCode: ");
		result.append(errorCode);
		result.append(", defaultErrorMessage: ");
		result.append(defaultErrorMessage);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", regExpression: ");
		result.append(regExpression);
		result.append(')');
		return result.toString();
	}

} //YTextAreaDatatypeImpl
