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
package org.lunifera.ecview.core.extension.model.extension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage
 * @generated
 */
public interface ExtensionModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionModelFactory eINSTANCE = org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YText Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Field</em>'.
	 * @generated
	 */
	YTextField createYTextField();

	/**
	 * Returns a new object of class '<em>YBean Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBean Reference Field</em>'.
	 * @generated
	 */
	YBeanReferenceField createYBeanReferenceField();

	/**
	 * Returns a new object of class '<em>YGrid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGrid Layout</em>'.
	 * @generated
	 */
	YGridLayout createYGridLayout();

	/**
	 * Returns a new object of class '<em>YGrid Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGrid Layout Cell Style</em>'.
	 * @generated
	 */
	YGridLayoutCellStyle createYGridLayoutCellStyle();

	/**
	 * Returns a new object of class '<em>YHorizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YHorizontal Layout</em>'.
	 * @generated
	 */
	YHorizontalLayout createYHorizontalLayout();

	/**
	 * Returns a new object of class '<em>YHorizontal Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YHorizontal Layout Cell Style</em>'.
	 * @generated
	 */
	YHorizontalLayoutCellStyle createYHorizontalLayoutCellStyle();

	/**
	 * Returns a new object of class '<em>YVertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YVertical Layout</em>'.
	 * @generated
	 */
	YVerticalLayout createYVerticalLayout();

	/**
	 * Returns a new object of class '<em>YVertical Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YVertical Layout Cell Style</em>'.
	 * @generated
	 */
	YVerticalLayoutCellStyle createYVerticalLayoutCellStyle();

	/**
	 * Returns a new object of class '<em>YSpan Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YSpan Info</em>'.
	 * @generated
	 */
	YSpanInfo createYSpanInfo();

	/**
	 * Returns a new object of class '<em>YTable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTable</em>'.
	 * @generated
	 */
	YTable createYTable();

	/**
	 * Returns a new object of class '<em>YColumn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YColumn</em>'.
	 * @generated
	 */
	YColumn createYColumn();

	/**
	 * Returns a new object of class '<em>YLabel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YLabel</em>'.
	 * @generated
	 */
	YLabel createYLabel();

	/**
	 * Returns a new object of class '<em>YImage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YImage</em>'.
	 * @generated
	 */
	YImage createYImage();

	/**
	 * Returns a new object of class '<em>YText Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Area</em>'.
	 * @generated
	 */
	YTextArea createYTextArea();

	/**
	 * Returns a new object of class '<em>YCheck Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCheck Box</em>'.
	 * @generated
	 */
	YCheckBox createYCheckBox();

	/**
	 * Returns a new object of class '<em>YBrowser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBrowser</em>'.
	 * @generated
	 */
	YBrowser createYBrowser();

	/**
	 * Returns a new object of class '<em>YDate Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDate Time</em>'.
	 * @generated
	 */
	YDateTime createYDateTime();

	/**
	 * Returns a new object of class '<em>YDecimal Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDecimal Field</em>'.
	 * @generated
	 */
	YDecimalField createYDecimalField();

	/**
	 * Returns a new object of class '<em>YNumeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YNumeric Field</em>'.
	 * @generated
	 */
	YNumericField createYNumericField();

	/**
	 * Returns a new object of class '<em>YCombo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCombo Box</em>'.
	 * @generated
	 */
	YComboBox createYComboBox();

	/**
	 * Returns a new object of class '<em>YList</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YList</em>'.
	 * @generated
	 */
	YList createYList();

	/**
	 * Returns a new object of class '<em>YButton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YButton</em>'.
	 * @generated
	 */
	YButton createYButton();

	/**
	 * Returns a new object of class '<em>YToggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YToggle Button</em>'.
	 * @generated
	 */
	YToggleButton createYToggleButton();

	/**
	 * Returns a new object of class '<em>YProgress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YProgress Bar</em>'.
	 * @generated
	 */
	YProgressBar createYProgressBar();

	/**
	 * Returns a new object of class '<em>YTab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTab Sheet</em>'.
	 * @generated
	 */
	YTabSheet createYTabSheet();

	/**
	 * Returns a new object of class '<em>YTab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTab</em>'.
	 * @generated
	 */
	YTab createYTab();

	/**
	 * Returns a new object of class '<em>YMaster Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YMaster Detail</em>'.
	 * @generated
	 */
	YMasterDetail createYMasterDetail();

	/**
	 * Returns a new object of class '<em>YForm Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YForm Layout</em>'.
	 * @generated
	 */
	YFormLayout createYFormLayout();

	/**
	 * Returns a new object of class '<em>YForm Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YForm Layout Cell Style</em>'.
	 * @generated
	 */
	YFormLayoutCellStyle createYFormLayoutCellStyle();

	/**
	 * Returns a new object of class '<em>YText Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Search Field</em>'.
	 * @generated
	 */
	YTextSearchField createYTextSearchField();

	/**
	 * Returns a new object of class '<em>YBoolean Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBoolean Search Field</em>'.
	 * @generated
	 */
	YBooleanSearchField createYBooleanSearchField();

	/**
	 * Returns a new object of class '<em>YNumeric Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YNumeric Search Field</em>'.
	 * @generated
	 */
	YNumericSearchField createYNumericSearchField();

	/**
	 * Returns a new object of class '<em>YReference Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YReference Search Field</em>'.
	 * @generated
	 */
	YReferenceSearchField createYReferenceSearchField();

	/**
	 * Returns a new object of class '<em>YPanel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YPanel</em>'.
	 * @generated
	 */
	YPanel createYPanel();

	/**
	 * Returns a new object of class '<em>YSplit Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YSplit Panel</em>'.
	 * @generated
	 */
	YSplitPanel createYSplitPanel();

	/**
	 * Returns a new object of class '<em>YSearch Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YSearch Panel</em>'.
	 * @generated
	 */
	YSearchPanel createYSearchPanel();

	/**
	 * Returns a new object of class '<em>YEnum Options Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEnum Options Group</em>'.
	 * @generated
	 */
	YEnumOptionsGroup createYEnumOptionsGroup();

	/**
	 * Returns a new object of class '<em>YEnum List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEnum List</em>'.
	 * @generated
	 */
	YEnumList createYEnumList();

	/**
	 * Returns a new object of class '<em>YEnum Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEnum Combo Box</em>'.
	 * @generated
	 */
	YEnumComboBox createYEnumComboBox();

	/**
	 * Returns a new object of class '<em>YTree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTree</em>'.
	 * @generated
	 */
	YTree createYTree();

	/**
	 * Returns a new object of class '<em>YOptions Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YOptions Group</em>'.
	 * @generated
	 */
	YOptionsGroup createYOptionsGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtensionModelPackage getExtensionModelPackage();

} //ExtensionModelFactory
