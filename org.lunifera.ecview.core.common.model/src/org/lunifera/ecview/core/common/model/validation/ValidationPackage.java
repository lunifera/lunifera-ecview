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
package org.lunifera.ecview.core.common.model.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.validation.ValidationFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "validation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/ecview/v1/core/validation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "validation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationPackage eINSTANCE = org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YValidatorImpl <em>YValidator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.impl.YValidatorImpl
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYValidator()
	 * @generated
	 */
	int YVALIDATOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATOR__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATOR__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATOR__TYPE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YValidator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATOR_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YMinLengthValidatorImpl <em>YMin Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.impl.YMinLengthValidatorImpl
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidator()
	 * @generated
	 */
	int YMIN_LENGTH_VALIDATOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__ID = YVALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__NAME = YVALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__TYPE = YVALIDATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__ERROR_CODE = YVALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE = YVALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__MIN_LENGTH = YVALIDATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YMin Length Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR_FEATURE_COUNT = YVALIDATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YMaxLengthValidatorImpl <em>YMax Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.impl.YMaxLengthValidatorImpl
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidator()
	 * @generated
	 */
	int YMAX_LENGTH_VALIDATOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__ID = YVALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__NAME = YVALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__TYPE = YVALIDATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__ERROR_CODE = YVALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__DEFAULT_ERROR_MESSAGE = YVALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__MAX_LENGTH = YVALIDATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YMax Length Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR_FEATURE_COUNT = YVALIDATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YRegexpValidatorImpl <em>YRegexp Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.impl.YRegexpValidatorImpl
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidator()
	 * @generated
	 */
	int YREGEXP_VALIDATOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__ID = YVALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__NAME = YVALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__TYPE = YVALIDATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__ERROR_CODE = YVALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__DEFAULT_ERROR_MESSAGE = YVALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__REG_EXPRESSION = YVALIDATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YRegexp Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR_FEATURE_COUNT = YVALIDATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YClassDelegateValidatorImpl <em>YClass Delegate Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.impl.YClassDelegateValidatorImpl
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYClassDelegateValidator()
	 * @generated
	 */
	int YCLASS_DELEGATE_VALIDATOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATOR__ID = YVALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATOR__NAME = YVALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATOR__TYPE = YVALIDATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATOR__ERROR_CODE = YVALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATOR__DEFAULT_ERROR_MESSAGE = YVALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATOR__CLASS_NAME = YVALIDATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YClass Delegate Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATOR_FEATURE_COUNT = YVALIDATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig <em>YValidation Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.YValidationConfig
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYValidationConfig()
	 * @generated
	 */
	int YVALIDATION_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATION_CONFIG__ERROR_CODE = 0;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>YValidation Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATION_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig <em>YMin Length Validation Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidationConfig()
	 * @generated
	 */
	int YMIN_LENGTH_VALIDATION_CONFIG = 6;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATION_CONFIG__ERROR_CODE = YVALIDATION_CONFIG__ERROR_CODE;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE = YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH = YVALIDATION_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMin Length Validation Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATION_CONFIG_FEATURE_COUNT = YVALIDATION_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig <em>YMax Length Validation Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidationConfig()
	 * @generated
	 */
	int YMAX_LENGTH_VALIDATION_CONFIG = 7;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATION_CONFIG__ERROR_CODE = YVALIDATION_CONFIG__ERROR_CODE;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE = YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH = YVALIDATION_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMax Length Validation Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATION_CONFIG_FEATURE_COUNT = YVALIDATION_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig <em>YRegexp Validation Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidationConfig()
	 * @generated
	 */
	int YREGEXP_VALIDATION_CONFIG = 8;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATION_CONFIG__ERROR_CODE = YVALIDATION_CONFIG__ERROR_CODE;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE = YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION = YVALIDATION_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YRegexp Validation Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATION_CONFIG_FEATURE_COUNT = YVALIDATION_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig <em>YClass Delegate Validation Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig
	 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYClassDelegateValidationConfig()
	 * @generated
	 */
	int YCLASS_DELEGATE_VALIDATION_CONFIG = 9;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATION_CONFIG__ERROR_CODE = YVALIDATION_CONFIG__ERROR_CODE;

	/**
	 * The feature id for the '<em><b>Default Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE = YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME = YVALIDATION_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YClass Delegate Validation Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_DELEGATE_VALIDATION_CONFIG_FEATURE_COUNT = YVALIDATION_CONFIG_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YValidator <em>YValidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValidator</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YValidator
	 * @generated
	 */
	EClass getYValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.validation.YValidator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YValidator#getType()
	 * @see #getYValidator()
	 * @generated
	 */
	EAttribute getYValidator_Type();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidator <em>YMin Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMin Length Validator</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YMinLengthValidator
	 * @generated
	 */
	EClass getYMinLengthValidator();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator <em>YMax Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMax Length Validator</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator
	 * @generated
	 */
	EClass getYMaxLengthValidator();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YRegexpValidator <em>YRegexp Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YRegexp Validator</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YRegexpValidator
	 * @generated
	 */
	EClass getYRegexpValidator();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator <em>YClass Delegate Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YClass Delegate Validator</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator
	 * @generated
	 */
	EClass getYClassDelegateValidator();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig <em>YValidation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValidation Config</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YValidationConfig
	 * @generated
	 */
	EClass getYValidationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YValidationConfig#getErrorCode()
	 * @see #getYValidationConfig()
	 * @generated
	 */
	EAttribute getYValidationConfig_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig#getDefaultErrorMessage <em>Default Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Error Message</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YValidationConfig#getDefaultErrorMessage()
	 * @see #getYValidationConfig()
	 * @generated
	 */
	EAttribute getYValidationConfig_DefaultErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig <em>YMin Length Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMin Length Validation Config</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig
	 * @generated
	 */
	EClass getYMinLengthValidationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig#getMinLength()
	 * @see #getYMinLengthValidationConfig()
	 * @generated
	 */
	EAttribute getYMinLengthValidationConfig_MinLength();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig <em>YMax Length Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMax Length Validation Config</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig
	 * @generated
	 */
	EClass getYMaxLengthValidationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig#getMaxLength()
	 * @see #getYMaxLengthValidationConfig()
	 * @generated
	 */
	EAttribute getYMaxLengthValidationConfig_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig <em>YRegexp Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YRegexp Validation Config</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig
	 * @generated
	 */
	EClass getYRegexpValidationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig#getRegExpression <em>Reg Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Expression</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig#getRegExpression()
	 * @see #getYRegexpValidationConfig()
	 * @generated
	 */
	EAttribute getYRegexpValidationConfig_RegExpression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig <em>YClass Delegate Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YClass Delegate Validation Config</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig
	 * @generated
	 */
	EClass getYClassDelegateValidationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig#getClassName()
	 * @see #getYClassDelegateValidationConfig()
	 * @generated
	 */
	EAttribute getYClassDelegateValidationConfig_ClassName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationFactory getValidationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YValidatorImpl <em>YValidator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.impl.YValidatorImpl
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYValidator()
		 * @generated
		 */
		EClass YVALIDATOR = eINSTANCE.getYValidator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVALIDATOR__TYPE = eINSTANCE.getYValidator_Type();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YMinLengthValidatorImpl <em>YMin Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.impl.YMinLengthValidatorImpl
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidator()
		 * @generated
		 */
		EClass YMIN_LENGTH_VALIDATOR = eINSTANCE.getYMinLengthValidator();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YMaxLengthValidatorImpl <em>YMax Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.impl.YMaxLengthValidatorImpl
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidator()
		 * @generated
		 */
		EClass YMAX_LENGTH_VALIDATOR = eINSTANCE.getYMaxLengthValidator();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YRegexpValidatorImpl <em>YRegexp Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.impl.YRegexpValidatorImpl
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidator()
		 * @generated
		 */
		EClass YREGEXP_VALIDATOR = eINSTANCE.getYRegexpValidator();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.impl.YClassDelegateValidatorImpl <em>YClass Delegate Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.impl.YClassDelegateValidatorImpl
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYClassDelegateValidator()
		 * @generated
		 */
		EClass YCLASS_DELEGATE_VALIDATOR = eINSTANCE.getYClassDelegateValidator();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig <em>YValidation Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.YValidationConfig
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYValidationConfig()
		 * @generated
		 */
		EClass YVALIDATION_CONFIG = eINSTANCE.getYValidationConfig();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVALIDATION_CONFIG__ERROR_CODE = eINSTANCE.getYValidationConfig_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Default Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE = eINSTANCE.getYValidationConfig_DefaultErrorMessage();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig <em>YMin Length Validation Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidationConfig()
		 * @generated
		 */
		EClass YMIN_LENGTH_VALIDATION_CONFIG = eINSTANCE.getYMinLengthValidationConfig();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH = eINSTANCE.getYMinLengthValidationConfig_MinLength();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig <em>YMax Length Validation Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidationConfig()
		 * @generated
		 */
		EClass YMAX_LENGTH_VALIDATION_CONFIG = eINSTANCE.getYMaxLengthValidationConfig();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH = eINSTANCE.getYMaxLengthValidationConfig_MaxLength();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig <em>YRegexp Validation Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidationConfig()
		 * @generated
		 */
		EClass YREGEXP_VALIDATION_CONFIG = eINSTANCE.getYRegexpValidationConfig();

		/**
		 * The meta object literal for the '<em><b>Reg Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION = eINSTANCE.getYRegexpValidationConfig_RegExpression();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig <em>YClass Delegate Validation Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig
		 * @see org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl#getYClassDelegateValidationConfig()
		 * @generated
		 */
		EClass YCLASS_DELEGATE_VALIDATION_CONFIG = eINSTANCE.getYClassDelegateValidationConfig();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME = eINSTANCE.getYClassDelegateValidationConfig_ClassName();

	}

} //ValidationPackage
