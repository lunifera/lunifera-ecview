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
package org.lunifera.ecview.core.common.model.binding.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.YBeanValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.binding.YBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YBindingUpdateStrategy;
import org.lunifera.ecview.core.common.model.binding.YDetailValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YEnumListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YListBinding;
import org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBinding;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage;
import org.lunifera.ecview.core.common.model.datatypes.impl.DatatypesPackageImpl;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.impl.ValidationPackageImpl;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingPackageImpl extends EPackageImpl implements BindingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBindingSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValueBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanValueBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yListBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValueBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yListBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnumListBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yecViewModelValueBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yecViewModelListBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibilityProcessorValueBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yBindingUpdateStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDetailValueBindingEndpointEClass = null;

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
	 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BindingPackageImpl() {
		super(eNS_URI, BindingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BindingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BindingPackage init() {
		if (isInited) return (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);

		// Obtain or create and register package
		BindingPackageImpl theBindingPackage = (BindingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BindingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BindingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) : CoreModelPackage.eINSTANCE);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) : ValidationPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		VisibilityPackageImpl theVisibilityPackage = (VisibilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) instanceof VisibilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) : VisibilityPackage.eINSTANCE);

		// Create package meta-data objects
		theBindingPackage.createPackageContents();
		theCoreModelPackage.createPackageContents();
		theValidationPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theVisibilityPackage.createPackageContents();

		// Initialize created meta-data
		theBindingPackage.initializePackageContents();
		theCoreModelPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theVisibilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBindingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BindingPackage.eNS_URI, theBindingPackage);
		return theBindingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBindingSet() {
		return yBindingSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBindingSet_Bindings() {
		return (EReference)yBindingSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBindingEndpoint() {
		return yBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValueBindingEndpoint() {
		return yValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanValueBindingEndpoint() {
		return yBeanValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanValueBindingEndpoint_Bean() {
		return (EAttribute)yBeanValueBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanValueBindingEndpoint_PropertyPath() {
		return (EAttribute)yBeanValueBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYListBindingEndpoint() {
		return yListBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBinding() {
		return yBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBinding_ModelToTargetStrategy() {
		return (EAttribute)yBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBinding_TargetToModelStrategy() {
		return (EAttribute)yBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValueBinding() {
		return yValueBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYValueBinding_TargetEndpoint() {
		return (EReference)yValueBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYValueBinding_ModelEndpoint() {
		return (EReference)yValueBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYListBinding() {
		return yListBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYListBinding_TargetEndpoint() {
		return (EReference)yListBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYListBinding_ModelEndpoint() {
		return (EReference)yListBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumListBindingEndpoint() {
		return yEnumListBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumListBindingEndpoint_Enum() {
		return (EAttribute)yEnumListBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYECViewModelValueBindingEndpoint() {
		return yecViewModelValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYECViewModelValueBindingEndpoint_Element() {
		return (EReference)yecViewModelValueBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYECViewModelValueBindingEndpoint_Features() {
		return (EReference)yecViewModelValueBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelValueBindingEndpoint_PropertyPath() {
		return (EAttribute)yecViewModelValueBindingEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelValueBindingEndpoint_Type() {
		return (EAttribute)yecViewModelValueBindingEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelValueBindingEndpoint_TypeQualifiedName() {
		return (EAttribute)yecViewModelValueBindingEndpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelValueBindingEndpoint_EmfNsURI() {
		return (EAttribute)yecViewModelValueBindingEndpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYECViewModelListBindingEndpoint() {
		return yecViewModelListBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYECViewModelListBindingEndpoint_Element() {
		return (EReference)yecViewModelListBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYECViewModelListBindingEndpoint_Features() {
		return (EReference)yecViewModelListBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelListBindingEndpoint_PropertyPath() {
		return (EAttribute)yecViewModelListBindingEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelListBindingEndpoint_Type() {
		return (EAttribute)yecViewModelListBindingEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelListBindingEndpoint_TypeQualifiedName() {
		return (EAttribute)yecViewModelListBindingEndpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYECViewModelListBindingEndpoint_EmfNsURI() {
		return (EAttribute)yecViewModelListBindingEndpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibilityProcessorValueBindingEndpoint() {
		return yVisibilityProcessorValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProcessorValueBindingEndpoint_ProcessorInstance() {
		return (EAttribute)yVisibilityProcessorValueBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProcessorValueBindingEndpoint_Property() {
		return (EAttribute)yVisibilityProcessorValueBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYBindingUpdateStrategy() {
		return yBindingUpdateStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDetailValueBindingEndpoint() {
		return yDetailValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDetailValueBindingEndpoint_MasterObservable() {
		return (EReference)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDetailValueBindingEndpoint_Features() {
		return (EReference)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDetailValueBindingEndpoint_PropertyPath() {
		return (EAttribute)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDetailValueBindingEndpoint_Type() {
		return (EAttribute)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFactory getBindingFactory() {
		return (BindingFactory)getEFactoryInstance();
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
		yBindingSetEClass = createEClass(YBINDING_SET);
		createEReference(yBindingSetEClass, YBINDING_SET__BINDINGS);

		yBindingEndpointEClass = createEClass(YBINDING_ENDPOINT);

		yValueBindingEndpointEClass = createEClass(YVALUE_BINDING_ENDPOINT);

		yBeanValueBindingEndpointEClass = createEClass(YBEAN_VALUE_BINDING_ENDPOINT);
		createEAttribute(yBeanValueBindingEndpointEClass, YBEAN_VALUE_BINDING_ENDPOINT__BEAN);
		createEAttribute(yBeanValueBindingEndpointEClass, YBEAN_VALUE_BINDING_ENDPOINT__PROPERTY_PATH);

		yDetailValueBindingEndpointEClass = createEClass(YDETAIL_VALUE_BINDING_ENDPOINT);
		createEReference(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE);
		createEReference(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES);
		createEAttribute(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH);
		createEAttribute(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__TYPE);

		yListBindingEndpointEClass = createEClass(YLIST_BINDING_ENDPOINT);

		yBindingEClass = createEClass(YBINDING);
		createEAttribute(yBindingEClass, YBINDING__MODEL_TO_TARGET_STRATEGY);
		createEAttribute(yBindingEClass, YBINDING__TARGET_TO_MODEL_STRATEGY);

		yValueBindingEClass = createEClass(YVALUE_BINDING);
		createEReference(yValueBindingEClass, YVALUE_BINDING__TARGET_ENDPOINT);
		createEReference(yValueBindingEClass, YVALUE_BINDING__MODEL_ENDPOINT);

		yListBindingEClass = createEClass(YLIST_BINDING);
		createEReference(yListBindingEClass, YLIST_BINDING__TARGET_ENDPOINT);
		createEReference(yListBindingEClass, YLIST_BINDING__MODEL_ENDPOINT);

		yEnumListBindingEndpointEClass = createEClass(YENUM_LIST_BINDING_ENDPOINT);
		createEAttribute(yEnumListBindingEndpointEClass, YENUM_LIST_BINDING_ENDPOINT__ENUM);

		yecViewModelValueBindingEndpointEClass = createEClass(YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT);
		createEReference(yecViewModelValueBindingEndpointEClass, YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__ELEMENT);
		createEReference(yecViewModelValueBindingEndpointEClass, YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__FEATURES);
		createEAttribute(yecViewModelValueBindingEndpointEClass, YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH);
		createEAttribute(yecViewModelValueBindingEndpointEClass, YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__TYPE);
		createEAttribute(yecViewModelValueBindingEndpointEClass, YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__TYPE_QUALIFIED_NAME);
		createEAttribute(yecViewModelValueBindingEndpointEClass, YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__EMF_NS_URI);

		yecViewModelListBindingEndpointEClass = createEClass(YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT);
		createEReference(yecViewModelListBindingEndpointEClass, YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT);
		createEReference(yecViewModelListBindingEndpointEClass, YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES);
		createEAttribute(yecViewModelListBindingEndpointEClass, YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH);
		createEAttribute(yecViewModelListBindingEndpointEClass, YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE);
		createEAttribute(yecViewModelListBindingEndpointEClass, YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE_QUALIFIED_NAME);
		createEAttribute(yecViewModelListBindingEndpointEClass, YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__EMF_NS_URI);

		yVisibilityProcessorValueBindingEndpointEClass = createEClass(YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT);
		createEAttribute(yVisibilityProcessorValueBindingEndpointEClass, YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROCESSOR_INSTANCE);
		createEAttribute(yVisibilityProcessorValueBindingEndpointEClass, YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROPERTY);

		// Create enums
		yBindingUpdateStrategyEEnum = createEEnum(YBINDING_UPDATE_STRATEGY);
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
		yBindingSetEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yBindingEndpointEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yValueBindingEndpointEClass.getESuperTypes().add(this.getYBindingEndpoint());
		yBeanValueBindingEndpointEClass.getESuperTypes().add(this.getYValueBindingEndpoint());
		yDetailValueBindingEndpointEClass.getESuperTypes().add(this.getYValueBindingEndpoint());
		yListBindingEndpointEClass.getESuperTypes().add(this.getYBindingEndpoint());
		yBindingEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yValueBindingEClass.getESuperTypes().add(this.getYBinding());
		yListBindingEClass.getESuperTypes().add(this.getYBinding());
		yEnumListBindingEndpointEClass.getESuperTypes().add(this.getYListBindingEndpoint());
		yecViewModelValueBindingEndpointEClass.getESuperTypes().add(this.getYValueBindingEndpoint());
		yecViewModelListBindingEndpointEClass.getESuperTypes().add(this.getYListBindingEndpoint());
		yVisibilityProcessorValueBindingEndpointEClass.getESuperTypes().add(this.getYValueBindingEndpoint());

		// Initialize classes and features; add operations and parameters
		initEClass(yBindingSetEClass, YBindingSet.class, "YBindingSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYBindingSet_Bindings(), this.getYBinding(), null, "bindings", null, 0, -1, YBindingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(yBindingSetEClass, this.getYValueBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, this.getYListBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, this.getYValueBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "targetToModelStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "modelToTargetStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, this.getYListBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "targetToModelStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "modelToTargetStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yBindingSetEClass, theCoreModelPackage.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, null, "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBinding(), "binding", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, null, "removeBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBinding(), "binding", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yBindingEndpointEClass, YBindingEndpoint.class, "YBindingEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yBindingEndpointEClass, this.getYBinding(), "getBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingEndpointEClass, ecorePackage.getEBoolean(), "isBindsElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYElement(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yValueBindingEndpointEClass, YValueBindingEndpoint.class, "YValueBindingEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yValueBindingEndpointEClass, this.getYDetailValueBindingEndpoint(), "createDetailValueEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yBeanValueBindingEndpointEClass, YBeanValueBindingEndpoint.class, "YBeanValueBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBeanValueBindingEndpoint_Bean(), ecorePackage.getEJavaObject(), "bean", null, 0, 1, YBeanValueBindingEndpoint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanValueBindingEndpoint_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YBeanValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDetailValueBindingEndpointEClass, YDetailValueBindingEndpoint.class, "YDetailValueBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYDetailValueBindingEndpoint_MasterObservable(), this.getYValueBindingEndpoint(), null, "masterObservable", null, 1, 1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYDetailValueBindingEndpoint_Features(), ecorePackage.getEStructuralFeature(), null, "features", null, 0, -1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDetailValueBindingEndpoint_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYDetailValueBindingEndpoint_Type(), g1, "type", null, 0, 1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yListBindingEndpointEClass, YListBindingEndpoint.class, "YListBindingEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yBindingEClass, YBinding.class, "YBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBinding_ModelToTargetStrategy(), this.getYBindingUpdateStrategy(), "modelToTargetStrategy", "UPDATE", 0, 1, YBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBinding_TargetToModelStrategy(), this.getYBindingUpdateStrategy(), "targetToModelStrategy", "UPDATE", 0, 1, YBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yBindingEClass, this.getYBindingSet(), "getBindingSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingEClass, ecorePackage.getEBoolean(), "isBindsElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYElement(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yBindingEClass, this.getYBindingEndpoint(), "getTargetEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yBindingEClass, this.getYBindingEndpoint(), "getModelEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yValueBindingEClass, YValueBinding.class, "YValueBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYValueBinding_TargetEndpoint(), this.getYValueBindingEndpoint(), null, "targetEndpoint", null, 1, 1, YValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYValueBinding_ModelEndpoint(), this.getYValueBindingEndpoint(), null, "modelEndpoint", null, 1, 1, YValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yListBindingEClass, YListBinding.class, "YListBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYListBinding_TargetEndpoint(), this.getYListBindingEndpoint(), null, "targetEndpoint", null, 1, 1, YListBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYListBinding_ModelEndpoint(), this.getYListBindingEndpoint(), null, "modelEndpoint", null, 1, 1, YListBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEnumListBindingEndpointEClass, YEnumListBindingEndpoint.class, "YEnumListBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYEnumListBindingEndpoint_Enum(), g1, "enum", null, 1, 1, YEnumListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yecViewModelValueBindingEndpointEClass, YECViewModelValueBindingEndpoint.class, "YECViewModelValueBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYECViewModelValueBindingEndpoint_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, YECViewModelValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYECViewModelValueBindingEndpoint_Features(), ecorePackage.getEStructuralFeature(), null, "features", null, 0, -1, YECViewModelValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYECViewModelValueBindingEndpoint_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YECViewModelValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYECViewModelValueBindingEndpoint_Type(), g1, "type", null, 0, 1, YECViewModelValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYECViewModelValueBindingEndpoint_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YECViewModelValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYECViewModelValueBindingEndpoint_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YECViewModelValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yecViewModelListBindingEndpointEClass, YECViewModelListBindingEndpoint.class, "YECViewModelListBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYECViewModelListBindingEndpoint_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, YECViewModelListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYECViewModelListBindingEndpoint_Features(), ecorePackage.getEStructuralFeature(), null, "features", null, 0, -1, YECViewModelListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYECViewModelListBindingEndpoint_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YECViewModelListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYECViewModelListBindingEndpoint_Type(), g1, "type", null, 0, 1, YECViewModelListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYECViewModelListBindingEndpoint_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YECViewModelListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYECViewModelListBindingEndpoint_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YECViewModelListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVisibilityProcessorValueBindingEndpointEClass, YVisibilityProcessorValueBindingEndpoint.class, "YVisibilityProcessorValueBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYVisibilityProcessorValueBindingEndpoint_ProcessorInstance(), ecorePackage.getEJavaObject(), "processorInstance", null, 0, 1, YVisibilityProcessorValueBindingEndpoint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProcessorValueBindingEndpoint_Property(), ecorePackage.getEString(), "property", null, 0, 1, YVisibilityProcessorValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.class, "YBindingUpdateStrategy");
		addEEnumLiteral(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.UPDATE);
		addEEnumLiteral(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.ON_REQUEST);
		addEEnumLiteral(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.NEVER);

		// Create resource
		createResource(eNS_URI);
	}

} //BindingPackageImpl
