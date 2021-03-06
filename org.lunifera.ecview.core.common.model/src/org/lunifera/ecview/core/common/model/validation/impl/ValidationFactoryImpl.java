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
package org.lunifera.ecview.core.common.model.validation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.ecview.core.common.model.validation.*;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationFactoryImpl extends EFactoryImpl implements ValidationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValidationFactory init() {
		try {
			ValidationFactory theValidationFactory = (ValidationFactory)EPackage.Registry.INSTANCE.getEFactory(ValidationPackage.eNS_URI);
			if (theValidationFactory != null) {
				return theValidationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValidationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ValidationPackage.YMIN_LENGTH_VALIDATOR: return createYMinLengthValidator();
			case ValidationPackage.YMAX_LENGTH_VALIDATOR: return createYMaxLengthValidator();
			case ValidationPackage.YREGEXP_VALIDATOR: return createYRegexpValidator();
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR: return createYClassDelegateValidator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMinLengthValidator createYMinLengthValidator() {
		YMinLengthValidatorImpl yMinLengthValidator = new YMinLengthValidatorImpl();
		return yMinLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMaxLengthValidator createYMaxLengthValidator() {
		YMaxLengthValidatorImpl yMaxLengthValidator = new YMaxLengthValidatorImpl();
		return yMaxLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YRegexpValidator createYRegexpValidator() {
		YRegexpValidatorImpl yRegexpValidator = new YRegexpValidatorImpl();
		return yRegexpValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClassDelegateValidator createYClassDelegateValidator() {
		YClassDelegateValidatorImpl yClassDelegateValidator = new YClassDelegateValidatorImpl();
		return yClassDelegateValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationPackage getValidationPackage() {
		return (ValidationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValidationPackage getPackage() {
		return ValidationPackage.eINSTANCE;
	}

} //ValidationFactoryImpl
