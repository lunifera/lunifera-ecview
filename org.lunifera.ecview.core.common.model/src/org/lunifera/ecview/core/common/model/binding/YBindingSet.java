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
