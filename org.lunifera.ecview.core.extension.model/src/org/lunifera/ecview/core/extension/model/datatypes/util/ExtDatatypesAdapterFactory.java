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
package org.lunifera.ecview.core.extension.model.datatypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.model.datatypes.YDtBase;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YValidationConfig;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage;
import org.lunifera.ecview.core.extension.model.datatypes.YBrowserDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YCheckBoxDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YComboBoxDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YListDataType;
import org.lunifera.ecview.core.extension.model.datatypes.YMasterDetailDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YNumericDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YOptionsGroupDataType;
import org.lunifera.ecview.core.extension.model.datatypes.YProgressBarDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTabSheetDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTableDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextAreaDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTreeDatatype;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage
 * @generated
 */
public class ExtDatatypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtDatatypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtDatatypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtDatatypesPackage.eINSTANCE;
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
	protected ExtDatatypesSwitch<Adapter> modelSwitch =
		new ExtDatatypesSwitch<Adapter>() {
			@Override
			public Adapter caseYTextDatatype(YTextDatatype object) {
				return createYTextDatatypeAdapter();
			}
			@Override
			public Adapter caseYTextAreaDatatype(YTextAreaDatatype object) {
				return createYTextAreaDatatypeAdapter();
			}
			@Override
			public Adapter caseYNumericDatatype(YNumericDatatype object) {
				return createYNumericDatatypeAdapter();
			}
			@Override
			public Adapter caseYDecimalDatatype(YDecimalDatatype object) {
				return createYDecimalDatatypeAdapter();
			}
			@Override
			public Adapter caseYTableDatatype(YTableDatatype object) {
				return createYTableDatatypeAdapter();
			}
			@Override
			public Adapter caseYCheckBoxDatatype(YCheckBoxDatatype object) {
				return createYCheckBoxDatatypeAdapter();
			}
			@Override
			public Adapter caseYComboBoxDatatype(YComboBoxDatatype object) {
				return createYComboBoxDatatypeAdapter();
			}
			@Override
			public Adapter caseYListDataType(YListDataType object) {
				return createYListDataTypeAdapter();
			}
			@Override
			public Adapter caseYOptionsGroupDataType(YOptionsGroupDataType object) {
				return createYOptionsGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseYBrowserDatatype(YBrowserDatatype object) {
				return createYBrowserDatatypeAdapter();
			}
			@Override
			public Adapter caseYDateTimeDatatype(YDateTimeDatatype object) {
				return createYDateTimeDatatypeAdapter();
			}
			@Override
			public Adapter caseYTreeDatatype(YTreeDatatype object) {
				return createYTreeDatatypeAdapter();
			}
			@Override
			public Adapter caseYProgressBarDatatype(YProgressBarDatatype object) {
				return createYProgressBarDatatypeAdapter();
			}
			@Override
			public Adapter caseYTabSheetDatatype(YTabSheetDatatype object) {
				return createYTabSheetDatatypeAdapter();
			}
			@Override
			public Adapter caseYMasterDetailDatatype(YMasterDetailDatatype object) {
				return createYMasterDetailDatatypeAdapter();
			}
			@Override
			public Adapter caseYElement(YElement object) {
				return createYElementAdapter();
			}
			@Override
			public Adapter caseYDtBase(YDtBase object) {
				return createYDtBaseAdapter();
			}
			@Override
			public Adapter caseYDatatype(YDatatype object) {
				return createYDatatypeAdapter();
			}
			@Override
			public Adapter caseYValidationConfig(YValidationConfig object) {
				return createYValidationConfigAdapter();
			}
			@Override
			public Adapter caseYMaxLengthValidationConfig(YMaxLengthValidationConfig object) {
				return createYMaxLengthValidationConfigAdapter();
			}
			@Override
			public Adapter caseYMinLengthValidationConfig(YMinLengthValidationConfig object) {
				return createYMinLengthValidationConfigAdapter();
			}
			@Override
			public Adapter caseYRegexpValidationConfig(YRegexpValidationConfig object) {
				return createYRegexpValidationConfigAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YTextDatatype <em>YText Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YTextDatatype
	 * @generated
	 */
	public Adapter createYTextDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YTextAreaDatatype <em>YText Area Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YTextAreaDatatype
	 * @generated
	 */
	public Adapter createYTextAreaDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YNumericDatatype <em>YNumeric Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YNumericDatatype
	 * @generated
	 */
	public Adapter createYNumericDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype <em>YDecimal Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype
	 * @generated
	 */
	public Adapter createYDecimalDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YTableDatatype <em>YTable Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YTableDatatype
	 * @generated
	 */
	public Adapter createYTableDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YCheckBoxDatatype <em>YCheck Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YCheckBoxDatatype
	 * @generated
	 */
	public Adapter createYCheckBoxDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YComboBoxDatatype <em>YCombo Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YComboBoxDatatype
	 * @generated
	 */
	public Adapter createYComboBoxDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YListDataType <em>YList Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YListDataType
	 * @generated
	 */
	public Adapter createYListDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YOptionsGroupDataType <em>YOptions Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YOptionsGroupDataType
	 * @generated
	 */
	public Adapter createYOptionsGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YBrowserDatatype <em>YBrowser Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YBrowserDatatype
	 * @generated
	 */
	public Adapter createYBrowserDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype <em>YDate Time Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype
	 * @generated
	 */
	public Adapter createYDateTimeDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YTreeDatatype <em>YTree Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YTreeDatatype
	 * @generated
	 */
	public Adapter createYTreeDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YProgressBarDatatype <em>YProgress Bar Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YProgressBarDatatype
	 * @generated
	 */
	public Adapter createYProgressBarDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YTabSheetDatatype <em>YTab Sheet Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YTabSheetDatatype
	 * @generated
	 */
	public Adapter createYTabSheetDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.datatypes.YMasterDetailDatatype <em>YMaster Detail Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.datatypes.YMasterDetailDatatype
	 * @generated
	 */
	public Adapter createYMasterDetailDatatypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.datatypes.YDtBase <em>YDt Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.datatypes.YDtBase
	 * @generated
	 */
	public Adapter createYDtBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.datatypes.YDatatype <em>YDatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.datatypes.YDatatype
	 * @generated
	 */
	public Adapter createYDatatypeAdapter() {
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

} //ExtDatatypesAdapterFactory
