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
package org.lunifera.ecview.core.databinding.tests.emf.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.ecview.core.databinding.tests.emf.model.*;
import org.lunifera.ecview.core.databinding.tests.emf.model.TAddress;
import org.lunifera.ecview.core.databinding.tests.emf.model.TCountry;
import org.lunifera.ecview.core.databinding.tests.emf.model.TPerson;
import org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelFactory;
import org.lunifera.ecview.core.databinding.tests.emf.model.TestmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestmodelFactoryImpl extends EFactoryImpl implements TestmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestmodelFactory init() {
		try {
			TestmodelFactory theTestmodelFactory = (TestmodelFactory)EPackage.Registry.INSTANCE.getEFactory(TestmodelPackage.eNS_URI);
			if (theTestmodelFactory != null) {
				return theTestmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestmodelFactoryImpl() {
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
			case TestmodelPackage.TPERSON: return createTPerson();
			case TestmodelPackage.TADDRESS: return createTAddress();
			case TestmodelPackage.TCOUNTRY: return createTCountry();
			case TestmodelPackage.TLIST: return createTList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPerson createTPerson() {
		TPersonImpl tPerson = new TPersonImpl();
		return tPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAddress createTAddress() {
		TAddressImpl tAddress = new TAddressImpl();
		return tAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCountry createTCountry() {
		TCountryImpl tCountry = new TCountryImpl();
		return tCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TList createTList() {
		TListImpl tList = new TListImpl();
		return tList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestmodelPackage getTestmodelPackage() {
		return (TestmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestmodelPackage getPackage() {
		return TestmodelPackage.eINSTANCE;
	}

} //TestmodelFactoryImpl
