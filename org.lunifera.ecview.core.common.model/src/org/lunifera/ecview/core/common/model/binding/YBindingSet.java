/**
 */
package org.lunifera.ecview.core.common.model.binding;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBinding Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.YBindingSet#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.YBindingSet#getTransientBindings <em>Transient Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#getYBindingSet()
 * @model
 * @generated
 */
public interface YBindingSet extends YElement {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.binding.YBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#getYBindingSet_Bindings()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Transient Bindings</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.ecview.core.common.model.binding.YBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Bindings</em>' reference list.
	 * @see org.lunifera.ecview.core.common.model.binding.BindingPackage#getYBindingSet_TransientBindings()
	 * @model transient="true"
	 * @generated
	 */
	EList<YBinding> getTransientBindings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetValueRequired="true" modelValueRequired="true"
	 * @generated
	 */
	YValueBinding addBinding(YValueBindingEndpoint targetValue, YValueBindingEndpoint modelValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetValueRequired="true" modelValueRequired="true"
	 * @generated
	 */
	YListBinding addBinding(YListBindingEndpoint targetValue, YListBindingEndpoint modelValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetValueRequired="true" modelValueRequired="true" targetToModelStrategyRequired="true" modelToTargetStrategyRequired="true"
	 * @generated
	 */
	YValueBinding addBinding(YValueBindingEndpoint targetValue, YValueBindingEndpoint modelValue, YBindingUpdateStrategy targetToModelStrategy, YBindingUpdateStrategy modelToTargetStrategy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetValueRequired="true" modelValueRequired="true" targetToModelStrategyRequired="true" modelToTargetStrategyRequired="true"
	 * @generated
	 */
	YListBinding addBinding(YListBindingEndpoint targetValue, YListBindingEndpoint modelValue, YBindingUpdateStrategy targetToModelStrategy, YBindingUpdateStrategy modelToTargetStrategy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bindingRequired="true"
	 * @generated
	 */
	void addBinding(YBinding binding);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bindingRequired="true"
	 * @generated
	 */
	void removeBinding(YBinding binding);

} // YBindingSet
