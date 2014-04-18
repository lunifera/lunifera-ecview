/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory
 * @model kind="package"
 * @generated
 */
public interface BindingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "binding";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/common/binding";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "binding";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BindingPackage eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl <em>YBinding Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingSet()
	 * @generated
	 */
	int YBINDING_SET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_SET__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_SET__BINDINGS = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YBinding Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_SET_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl <em>YBinding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingEndpoint()
	 * @generated
	 */
	int YBINDING_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_ENDPOINT__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The number of structural features of the '<em>YBinding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_ENDPOINT_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl <em>YValue Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBindingEndpoint()
	 * @generated
	 */
	int YVALUE_BINDING_ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING_ENDPOINT__ID = YBINDING_ENDPOINT__ID;

	/**
	 * The number of structural features of the '<em>YValue Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING_ENDPOINT_FEATURE_COUNT = YBINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl <em>YList Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBindingEndpoint()
	 * @generated
	 */
	int YLIST_BINDING_ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING_ENDPOINT__ID = YBINDING_ENDPOINT__ID;

	/**
	 * The number of structural features of the '<em>YList Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING_ENDPOINT_FEATURE_COUNT = YBINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl <em>YBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBinding()
	 * @generated
	 */
	int YBINDING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The number of structural features of the '<em>YBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl <em>YValue Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBinding()
	 * @generated
	 */
	int YVALUE_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__ID = YBINDING__ID;

	/**
	 * The feature id for the '<em><b>Target Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__TARGET_ENDPOINT = YBINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__MODEL_ENDPOINT = YBINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YValue Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING_FEATURE_COUNT = YBINDING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl <em>YList Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBinding()
	 * @generated
	 */
	int YLIST_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__ID = YBINDING__ID;

	/**
	 * The feature id for the '<em><b>Target Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__TARGET_ENDPOINT = YBINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__MODEL_ENDPOINT = YBINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YList Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING_FEATURE_COUNT = YBINDING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanBindingEndpointImpl <em>YBean Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBeanBindingEndpoint()
	 * @generated
	 */
	int YBEAN_BINDING_ENDPOINT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_BINDING_ENDPOINT__ID = YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_BINDING_ENDPOINT__BEAN = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_BINDING_ENDPOINT__PROPERTY_PATH = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YBean Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_BINDING_ENDPOINT_FEATURE_COUNT = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet <em>YBinding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBinding Set</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet
	 * @generated
	 */
	EClass getYBindingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet#getBindings()
	 * @see #getYBindingSet()
	 * @generated
	 */
	EReference getYBindingSet_Bindings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint <em>YBinding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBinding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint
	 * @generated
	 */
	EClass getYBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint <em>YValue Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValue Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint
	 * @generated
	 */
	EClass getYValueBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint <em>YList Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint
	 * @generated
	 */
	EClass getYListBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding <em>YBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBinding</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBinding
	 * @generated
	 */
	EClass getYBinding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding <em>YValue Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValue Binding</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding
	 * @generated
	 */
	EClass getYValueBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getTargetEndpoint <em>Target Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getTargetEndpoint()
	 * @see #getYValueBinding()
	 * @generated
	 */
	EReference getYValueBinding_TargetEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getModelEndpoint <em>Model Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getModelEndpoint()
	 * @see #getYValueBinding()
	 * @generated
	 */
	EReference getYValueBinding_ModelEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding <em>YList Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList Binding</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding
	 * @generated
	 */
	EClass getYListBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getTargetEndpoint <em>Target Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getTargetEndpoint()
	 * @see #getYListBinding()
	 * @generated
	 */
	EReference getYListBinding_TargetEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getModelEndpoint <em>Model Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getModelEndpoint()
	 * @see #getYListBinding()
	 * @generated
	 */
	EReference getYListBinding_ModelEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint <em>YBean Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBean Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint
	 * @generated
	 */
	EClass getYBeanBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getBean()
	 * @see #getYBeanBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanBindingEndpoint_Bean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getPropertyPath()
	 * @see #getYBeanBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanBindingEndpoint_PropertyPath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BindingFactory getBindingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl <em>YBinding Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingSet()
		 * @generated
		 */
		EClass YBINDING_SET = eINSTANCE.getYBindingSet();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBINDING_SET__BINDINGS = eINSTANCE.getYBindingSet_Bindings();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl <em>YBinding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingEndpoint()
		 * @generated
		 */
		EClass YBINDING_ENDPOINT = eINSTANCE.getYBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl <em>YValue Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBindingEndpoint()
		 * @generated
		 */
		EClass YVALUE_BINDING_ENDPOINT = eINSTANCE.getYValueBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl <em>YList Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBindingEndpoint()
		 * @generated
		 */
		EClass YLIST_BINDING_ENDPOINT = eINSTANCE.getYListBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl <em>YBinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBinding()
		 * @generated
		 */
		EClass YBINDING = eINSTANCE.getYBinding();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl <em>YValue Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBinding()
		 * @generated
		 */
		EClass YVALUE_BINDING = eINSTANCE.getYValueBinding();

		/**
		 * The meta object literal for the '<em><b>Target Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVALUE_BINDING__TARGET_ENDPOINT = eINSTANCE.getYValueBinding_TargetEndpoint();

		/**
		 * The meta object literal for the '<em><b>Model Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVALUE_BINDING__MODEL_ENDPOINT = eINSTANCE.getYValueBinding_ModelEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl <em>YList Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBinding()
		 * @generated
		 */
		EClass YLIST_BINDING = eINSTANCE.getYListBinding();

		/**
		 * The meta object literal for the '<em><b>Target Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST_BINDING__TARGET_ENDPOINT = eINSTANCE.getYListBinding_TargetEndpoint();

		/**
		 * The meta object literal for the '<em><b>Model Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST_BINDING__MODEL_ENDPOINT = eINSTANCE.getYListBinding_ModelEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanBindingEndpointImpl <em>YBean Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBeanBindingEndpoint()
		 * @generated
		 */
		EClass YBEAN_BINDING_ENDPOINT = eINSTANCE.getYBeanBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_BINDING_ENDPOINT__BEAN = eINSTANCE.getYBeanBindingEndpoint_Bean();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_BINDING_ENDPOINT__PROPERTY_PATH = eINSTANCE.getYBeanBindingEndpoint_PropertyPath();

	}

} //BindingPackage
