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
package org.lunifera.ecview.core.extension.model.datatypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage
 * @generated
 */
public interface ExtDatatypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtDatatypesFactory eINSTANCE = org.lunifera.ecview.core.extension.model.datatypes.impl.ExtDatatypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YText Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Datatype</em>'.
	 * @generated
	 */
	YTextDatatype createYTextDatatype();

	/**
	 * Returns a new object of class '<em>YText Area Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Area Datatype</em>'.
	 * @generated
	 */
	YTextAreaDatatype createYTextAreaDatatype();

	/**
	 * Returns a new object of class '<em>YNumeric Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YNumeric Datatype</em>'.
	 * @generated
	 */
	YNumericDatatype createYNumericDatatype();

	/**
	 * Returns a new object of class '<em>YDecimal Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDecimal Datatype</em>'.
	 * @generated
	 */
	YDecimalDatatype createYDecimalDatatype();

	/**
	 * Returns a new object of class '<em>YTable Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTable Datatype</em>'.
	 * @generated
	 */
	YTableDatatype createYTableDatatype();

	/**
	 * Returns a new object of class '<em>YCheck Box Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCheck Box Datatype</em>'.
	 * @generated
	 */
	YCheckBoxDatatype createYCheckBoxDatatype();

	/**
	 * Returns a new object of class '<em>YCombo Box Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCombo Box Datatype</em>'.
	 * @generated
	 */
	YComboBoxDatatype createYComboBoxDatatype();

	/**
	 * Returns a new object of class '<em>YList Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YList Data Type</em>'.
	 * @generated
	 */
	YListDataType createYListDataType();

	/**
	 * Returns a new object of class '<em>YOptions Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YOptions Group Data Type</em>'.
	 * @generated
	 */
	YOptionsGroupDataType createYOptionsGroupDataType();

	/**
	 * Returns a new object of class '<em>YBrowser Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBrowser Datatype</em>'.
	 * @generated
	 */
	YBrowserDatatype createYBrowserDatatype();

	/**
	 * Returns a new object of class '<em>YDate Time Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDate Time Datatype</em>'.
	 * @generated
	 */
	YDateTimeDatatype createYDateTimeDatatype();

	/**
	 * Returns a new object of class '<em>YTree Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTree Datatype</em>'.
	 * @generated
	 */
	YTreeDatatype createYTreeDatatype();

	/**
	 * Returns a new object of class '<em>YProgress Bar Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YProgress Bar Datatype</em>'.
	 * @generated
	 */
	YProgressBarDatatype createYProgressBarDatatype();

	/**
	 * Returns a new object of class '<em>YTab Sheet Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTab Sheet Datatype</em>'.
	 * @generated
	 */
	YTabSheetDatatype createYTabSheetDatatype();

	/**
	 * Returns a new object of class '<em>YMaster Detail Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YMaster Detail Datatype</em>'.
	 * @generated
	 */
	YMasterDetailDatatype createYMasterDetailDatatype();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtDatatypesPackage getExtDatatypesPackage();

} //ExtDatatypesFactory
