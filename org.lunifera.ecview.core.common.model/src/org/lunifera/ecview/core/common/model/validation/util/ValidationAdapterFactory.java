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
package org.lunifera.ecview.core.common.model.validation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.model.core.YBindable;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.validation.*;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.validation.ValidationPackage
 * @generated
 */
public class ValidationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValidationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValidationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationSwitch<Adapter> modelSwitch =
		new ValidationSwitch<Adapter>() {
			@Override
			public Adapter caseYValidator(YValidator object) {
				return createYValidatorAdapter();
			}
			@Override
			public Adapter caseYMinLengthValidator(YMinLengthValidator object) {
				return createYMinLengthValidatorAdapter();
			}
			@Override
			public Adapter caseYMaxLengthValidator(YMaxLengthValidator object) {
				return createYMaxLengthValidatorAdapter();
			}
			@Override
			public Adapter caseYRegexpValidator(YRegexpValidator object) {
				return createYRegexpValidatorAdapter();
			}
			@Override
			public Adapter caseYClassDelegateValidator(YClassDelegateValidator object) {
				return createYClassDelegateValidatorAdapter();
			}
			@Override
			public Adapter caseYValidationConfig(YValidationConfig object) {
				return createYValidationConfigAdapter();
			}
			@Override
			public Adapter caseYMinLengthValidationConfig(YMinLengthValidationConfig object) {
				return createYMinLengthValidationConfigAdapter();
			}
			@Override
			public Adapter caseYMaxLengthValidationConfig(YMaxLengthValidationConfig object) {
				return createYMaxLengthValidationConfigAdapter();
			}
			@Override
			public Adapter caseYRegexpValidationConfig(YRegexpValidationConfig object) {
				return createYRegexpValidationConfigAdapter();
			}
			@Override
			public Adapter caseYClassDelegateValidationConfig(YClassDelegateValidationConfig object) {
				return createYClassDelegateValidationConfigAdapter();
			}
			@Override
			public Adapter caseYElement(YElement object) {
				return createYElementAdapter();
			}
			@Override
			public Adapter caseYBindable(YBindable object) {
				return createYBindableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YValidator <em>YValidator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YValidator
	 * @generated
	 */
	public Adapter createYValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidator <em>YMin Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YMinLengthValidator
	 * @generated
	 */
	public Adapter createYMinLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator <em>YMax Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator
	 * @generated
	 */
	public Adapter createYMaxLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YRegexpValidator <em>YRegexp Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YRegexpValidator
	 * @generated
	 */
	public Adapter createYRegexpValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator <em>YClass Delegate Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator
	 * @generated
	 */
	public Adapter createYClassDelegateValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YValidationConfig <em>YValidation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YValidationConfig
	 * @generated
	 */
	public Adapter createYValidationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig <em>YMin Length Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig
	 * @generated
	 */
	public Adapter createYMinLengthValidationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig <em>YMax Length Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig
	 * @generated
	 */
	public Adapter createYMaxLengthValidationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig <em>YRegexp Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig
	 * @generated
	 */
	public Adapter createYRegexpValidationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig <em>YClass Delegate Validation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig
	 * @generated
	 */
	public Adapter createYClassDelegateValidationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YElement
	 * @generated
	 */
	public Adapter createYElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YBindable <em>YBindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YBindable
	 * @generated
	 */
	public Adapter createYBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ValidationAdapterFactory
