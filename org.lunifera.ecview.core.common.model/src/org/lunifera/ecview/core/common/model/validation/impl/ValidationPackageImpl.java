/**
 */
package org.lunifera.ecview.core.common.model.validation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.impl.BindingPackageImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage;
import org.lunifera.ecview.core.common.model.datatypes.impl.DatatypesPackageImpl;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YBeanValidationValidator;
import org.lunifera.ecview.core.common.model.validation.YBeanValidationValidatorConfig;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YValidator;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationPackageImpl extends EPackageImpl implements ValidationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMinLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMaxLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yRegexpValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yClassDelegateValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanValidationValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValidationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMinLengthValidationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMaxLengthValidationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yRegexpValidationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yClassDelegateValidationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanValidationValidatorConfigEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidationPackageImpl() {
		super(eNS_URI, ValidationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ValidationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidationPackage init() {
		if (isInited) return (ValidationPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);

		// Obtain or create and register package
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValidationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BindingPackageImpl theBindingPackage = (BindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) instanceof BindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) : BindingPackage.eINSTANCE);
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) : CoreModelPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		VisibilityPackageImpl theVisibilityPackage = (VisibilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) instanceof VisibilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) : VisibilityPackage.eINSTANCE);

		// Create package meta-data objects
		theValidationPackage.createPackageContents();
		theBindingPackage.createPackageContents();
		theCoreModelPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theVisibilityPackage.createPackageContents();

		// Initialize created meta-data
		theValidationPackage.initializePackageContents();
		theBindingPackage.initializePackageContents();
		theCoreModelPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theVisibilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidationPackage.eNS_URI, theValidationPackage);
		return theValidationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValidator() {
		return yValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYValidator_Type() {
		return (EAttribute)yValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMinLengthValidator() {
		return yMinLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMaxLengthValidator() {
		return yMaxLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYRegexpValidator() {
		return yRegexpValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYClassDelegateValidator() {
		return yClassDelegateValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanValidationValidator() {
		return yBeanValidationValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValidationConfig() {
		return yValidationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYValidationConfig_ErrorCode() {
		return (EAttribute)yValidationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYValidationConfig_DefaultErrorMessage() {
		return (EAttribute)yValidationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMinLengthValidationConfig() {
		return yMinLengthValidationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMinLengthValidationConfig_MinLength() {
		return (EAttribute)yMinLengthValidationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMaxLengthValidationConfig() {
		return yMaxLengthValidationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMaxLengthValidationConfig_MaxLength() {
		return (EAttribute)yMaxLengthValidationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYRegexpValidationConfig() {
		return yRegexpValidationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYRegexpValidationConfig_RegExpression() {
		return (EAttribute)yRegexpValidationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYClassDelegateValidationConfig() {
		return yClassDelegateValidationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClassDelegateValidationConfig_ClassName() {
		return (EAttribute)yClassDelegateValidationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanValidationValidatorConfig() {
		return yBeanValidationValidatorConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanValidationValidatorConfig_BvalClass() {
		return (EAttribute)yBeanValidationValidatorConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanValidationValidatorConfig_BvalClassFullyQualifiedName() {
		return (EAttribute)yBeanValidationValidatorConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanValidationValidatorConfig_BvalProperty() {
		return (EAttribute)yBeanValidationValidatorConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationFactory getValidationFactory() {
		return (ValidationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yValidatorEClass = createEClass(YVALIDATOR);
		createEAttribute(yValidatorEClass, YVALIDATOR__TYPE);

		yMinLengthValidatorEClass = createEClass(YMIN_LENGTH_VALIDATOR);

		yMaxLengthValidatorEClass = createEClass(YMAX_LENGTH_VALIDATOR);

		yRegexpValidatorEClass = createEClass(YREGEXP_VALIDATOR);

		yClassDelegateValidatorEClass = createEClass(YCLASS_DELEGATE_VALIDATOR);

		yBeanValidationValidatorEClass = createEClass(YBEAN_VALIDATION_VALIDATOR);

		yValidationConfigEClass = createEClass(YVALIDATION_CONFIG);
		createEAttribute(yValidationConfigEClass, YVALIDATION_CONFIG__ERROR_CODE);
		createEAttribute(yValidationConfigEClass, YVALIDATION_CONFIG__DEFAULT_ERROR_MESSAGE);

		yMinLengthValidationConfigEClass = createEClass(YMIN_LENGTH_VALIDATION_CONFIG);
		createEAttribute(yMinLengthValidationConfigEClass, YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH);

		yMaxLengthValidationConfigEClass = createEClass(YMAX_LENGTH_VALIDATION_CONFIG);
		createEAttribute(yMaxLengthValidationConfigEClass, YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH);

		yRegexpValidationConfigEClass = createEClass(YREGEXP_VALIDATION_CONFIG);
		createEAttribute(yRegexpValidationConfigEClass, YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION);

		yClassDelegateValidationConfigEClass = createEClass(YCLASS_DELEGATE_VALIDATION_CONFIG);
		createEAttribute(yClassDelegateValidationConfigEClass, YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME);

		yBeanValidationValidatorConfigEClass = createEClass(YBEAN_VALIDATION_VALIDATOR_CONFIG);
		createEAttribute(yBeanValidationValidatorConfigEClass, YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS);
		createEAttribute(yBeanValidationValidatorConfigEClass, YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS_FULLY_QUALIFIED_NAME);
		createEAttribute(yBeanValidationValidatorConfigEClass, YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yValidatorEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yValidatorEClass.getESuperTypes().add(theCoreModelPackage.getYBindable());
		yMinLengthValidatorEClass.getESuperTypes().add(this.getYValidator());
		yMinLengthValidatorEClass.getESuperTypes().add(this.getYMinLengthValidationConfig());
		yMaxLengthValidatorEClass.getESuperTypes().add(this.getYValidator());
		yMaxLengthValidatorEClass.getESuperTypes().add(this.getYMaxLengthValidationConfig());
		yRegexpValidatorEClass.getESuperTypes().add(this.getYValidator());
		yRegexpValidatorEClass.getESuperTypes().add(this.getYRegexpValidationConfig());
		yClassDelegateValidatorEClass.getESuperTypes().add(this.getYValidator());
		yClassDelegateValidatorEClass.getESuperTypes().add(this.getYClassDelegateValidationConfig());
		yBeanValidationValidatorEClass.getESuperTypes().add(this.getYValidator());
		yBeanValidationValidatorEClass.getESuperTypes().add(this.getYBeanValidationValidatorConfig());
		yMinLengthValidationConfigEClass.getESuperTypes().add(this.getYValidationConfig());
		yMaxLengthValidationConfigEClass.getESuperTypes().add(this.getYValidationConfig());
		yRegexpValidationConfigEClass.getESuperTypes().add(this.getYValidationConfig());
		yClassDelegateValidationConfigEClass.getESuperTypes().add(this.getYValidationConfig());
		yBeanValidationValidatorConfigEClass.getESuperTypes().add(this.getYValidationConfig());

		// Initialize classes and features; add operations and parameters
		initEClass(yValidatorEClass, YValidator.class, "YValidator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYValidator_Type(), g1, "type", null, 0, 1, YValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yMinLengthValidatorEClass, YMinLengthValidator.class, "YMinLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yMaxLengthValidatorEClass, YMaxLengthValidator.class, "YMaxLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yRegexpValidatorEClass, YRegexpValidator.class, "YRegexpValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yClassDelegateValidatorEClass, YClassDelegateValidator.class, "YClassDelegateValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yBeanValidationValidatorEClass, YBeanValidationValidator.class, "YBeanValidationValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yValidationConfigEClass, YValidationConfig.class, "YValidationConfig", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYValidationConfig_ErrorCode(), ecorePackage.getEString(), "errorCode", null, 0, 1, YValidationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYValidationConfig_DefaultErrorMessage(), ecorePackage.getEString(), "defaultErrorMessage", null, 0, 1, YValidationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yMinLengthValidationConfigEClass, YMinLengthValidationConfig.class, "YMinLengthValidationConfig", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYMinLengthValidationConfig_MinLength(), ecorePackage.getEInt(), "minLength", null, 1, 1, YMinLengthValidationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yMaxLengthValidationConfigEClass, YMaxLengthValidationConfig.class, "YMaxLengthValidationConfig", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYMaxLengthValidationConfig_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 1, 1, YMaxLengthValidationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yRegexpValidationConfigEClass, YRegexpValidationConfig.class, "YRegexpValidationConfig", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYRegexpValidationConfig_RegExpression(), ecorePackage.getEString(), "regExpression", null, 1, 1, YRegexpValidationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yClassDelegateValidationConfigEClass, YClassDelegateValidationConfig.class, "YClassDelegateValidationConfig", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYClassDelegateValidationConfig_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, YClassDelegateValidationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBeanValidationValidatorConfigEClass, YBeanValidationValidatorConfig.class, "YBeanValidationValidatorConfig", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYBeanValidationValidatorConfig_BvalClass(), g1, "bvalClass", null, 0, 1, YBeanValidationValidatorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanValidationValidatorConfig_BvalClassFullyQualifiedName(), ecorePackage.getEString(), "bvalClassFullyQualifiedName", null, 0, 1, YBeanValidationValidatorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanValidationValidatorConfig_BvalProperty(), ecorePackage.getEString(), "bvalProperty", null, 0, 1, YBeanValidationValidatorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ValidationPackageImpl
