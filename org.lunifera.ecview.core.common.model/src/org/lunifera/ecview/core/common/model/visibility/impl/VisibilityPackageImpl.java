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
package org.lunifera.ecview.core.common.model.visibility.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.impl.BindingPackageImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage;
import org.lunifera.ecview.core.common.model.datatypes.impl.DatatypesPackageImpl;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl;
import org.lunifera.ecview.core.common.model.visibility.VisibilityFactory;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.model.visibility.YColor;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisibilityPackageImpl extends EPackageImpl implements VisibilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibilityProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibilityPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yColorEEnum = null;

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
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisibilityPackageImpl() {
		super(eNS_URI, VisibilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VisibilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisibilityPackage init() {
		if (isInited) return (VisibilityPackage)EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI);

		// Obtain or create and register package
		VisibilityPackageImpl theVisibilityPackage = (VisibilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisibilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisibilityPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BindingPackageImpl theBindingPackage = (BindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) instanceof BindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) : BindingPackage.eINSTANCE);
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) : CoreModelPackage.eINSTANCE);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) : ValidationPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theVisibilityPackage.createPackageContents();
		theBindingPackage.createPackageContents();
		theCoreModelPackage.createPackageContents();
		theValidationPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theVisibilityPackage.initializePackageContents();
		theBindingPackage.initializePackageContents();
		theCoreModelPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisibilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisibilityPackage.eNS_URI, theVisibilityPackage);
		return theVisibilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibilityProcessor() {
		return yVisibilityProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVisibilityProcessor_DataUsed() {
		return (EReference)yVisibilityProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVisibilityProcessor_TriggersOn() {
		return (EReference)yVisibilityProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProcessor_Delegate() {
		return (EAttribute)yVisibilityProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProcessor_DelegateQualifiedName() {
		return (EAttribute)yVisibilityProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibilityProperties() {
		return yVisibilityPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Visible() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Editable() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Enabled() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Border() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Bold() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Italic() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Strikethrough() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Underline() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_BackgroundColor() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_ForegroundColor() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_BackgroundColorCode() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_ForegroundColorCode() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_CssClass() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_CssId() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYColor() {
		return yColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityFactory getVisibilityFactory() {
		return (VisibilityFactory)getEFactoryInstance();
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
		yVisibilityProcessorEClass = createEClass(YVISIBILITY_PROCESSOR);
		createEReference(yVisibilityProcessorEClass, YVISIBILITY_PROCESSOR__DATA_USED);
		createEReference(yVisibilityProcessorEClass, YVISIBILITY_PROCESSOR__TRIGGERS_ON);
		createEAttribute(yVisibilityProcessorEClass, YVISIBILITY_PROCESSOR__DELEGATE);
		createEAttribute(yVisibilityProcessorEClass, YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME);

		yVisibilityPropertiesEClass = createEClass(YVISIBILITY_PROPERTIES);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__VISIBLE);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__EDITABLE);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__ENABLED);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__BORDER);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__BOLD);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__ITALIC);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__STRIKETHROUGH);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__UNDERLINE);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__BACKGROUND_COLOR);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__FOREGROUND_COLOR);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__CSS_CLASS);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__CSS_ID);

		// Create enums
		yColorEEnum = createEEnum(YCOLOR);
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
		BindingPackage theBindingPackage = (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yVisibilityProcessorEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yVisibilityPropertiesEClass.getESuperTypes().add(theCoreModelPackage.getYElement());

		// Initialize classes and features; add operations and parameters
		initEClass(yVisibilityProcessorEClass, YVisibilityProcessor.class, "YVisibilityProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVisibilityProcessor_DataUsed(), theBindingPackage.getYBinding(), null, "dataUsed", null, 0, -1, YVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYVisibilityProcessor_TriggersOn(), theBindingPackage.getYBinding(), null, "triggersOn", null, 0, -1, YVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYVisibilityProcessor_Delegate(), g1, "delegate", null, 0, 1, YVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProcessor_DelegateQualifiedName(), ecorePackage.getEString(), "delegateQualifiedName", null, 0, 1, YVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVisibilityPropertiesEClass, YVisibilityProperties.class, "YVisibilityProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYVisibilityProperties_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Border(), ecorePackage.getEBoolean(), "border", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Bold(), ecorePackage.getEBoolean(), "bold", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Italic(), ecorePackage.getEBoolean(), "italic", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Strikethrough(), ecorePackage.getEBoolean(), "strikethrough", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Underline(), ecorePackage.getEBoolean(), "underline", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_BackgroundColor(), this.getYColor(), "backgroundColor", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_ForegroundColor(), this.getYColor(), "foregroundColor", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_BackgroundColorCode(), ecorePackage.getEString(), "backgroundColorCode", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_ForegroundColorCode(), ecorePackage.getEString(), "foregroundColorCode", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_CssId(), ecorePackage.getEString(), "cssId", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yColorEEnum, YColor.class, "YColor");
		addEEnumLiteral(yColorEEnum, YColor.UNDEFINED);
		addEEnumLiteral(yColorEEnum, YColor.GREEN);
		addEEnumLiteral(yColorEEnum, YColor.BLUE);
		addEEnumLiteral(yColorEEnum, YColor.YELLOW);
		addEEnumLiteral(yColorEEnum, YColor.RED);
		addEEnumLiteral(yColorEEnum, YColor.BLACK);
		addEEnumLiteral(yColorEEnum, YColor.WHITE);
		addEEnumLiteral(yColorEEnum, YColor.GRAY);
		addEEnumLiteral(yColorEEnum, YColor.LIGHT_GRAY);
		addEEnumLiteral(yColorEEnum, YColor.DARK_GRAY);

		// Create resource
		createResource(eNS_URI);
	}

} //VisibilityPackageImpl
