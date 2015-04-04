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
package org.lunifera.ecview.core.extension.model.extension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.ecview.core.extension.model.extension.*;
import org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionModelFactoryImpl extends EFactoryImpl implements ExtensionModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtensionModelFactory init() {
		try {
			ExtensionModelFactory theExtensionModelFactory = (ExtensionModelFactory)EPackage.Registry.INSTANCE.getEFactory(ExtensionModelPackage.eNS_URI);
			if (theExtensionModelFactory != null) {
				return theExtensionModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtensionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelFactoryImpl() {
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
			case ExtensionModelPackage.YGRID_LAYOUT: return createYGridLayout();
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE: return createYGridLayoutCellStyle();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT: return createYHorizontalLayout();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT_CELL_STYLE: return createYHorizontalLayoutCellStyle();
			case ExtensionModelPackage.YVERTICAL_LAYOUT: return createYVerticalLayout();
			case ExtensionModelPackage.YVERTICAL_LAYOUT_CELL_STYLE: return createYVerticalLayoutCellStyle();
			case ExtensionModelPackage.YSPAN_INFO: return createYSpanInfo();
			case ExtensionModelPackage.YTABLE: return createYTable();
			case ExtensionModelPackage.YCOLUMN: return createYColumn();
			case ExtensionModelPackage.YTREE: return createYTree();
			case ExtensionModelPackage.YOPTIONS_GROUP: return createYOptionsGroup();
			case ExtensionModelPackage.YLIST: return createYList();
			case ExtensionModelPackage.YLABEL: return createYLabel();
			case ExtensionModelPackage.YIMAGE: return createYImage();
			case ExtensionModelPackage.YTEXT_FIELD: return createYTextField();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD: return createYBeanReferenceField();
			case ExtensionModelPackage.YTEXT_AREA: return createYTextArea();
			case ExtensionModelPackage.YCHECK_BOX: return createYCheckBox();
			case ExtensionModelPackage.YBROWSER: return createYBrowser();
			case ExtensionModelPackage.YDATE_TIME: return createYDateTime();
			case ExtensionModelPackage.YDECIMAL_FIELD: return createYDecimalField();
			case ExtensionModelPackage.YNUMERIC_FIELD: return createYNumericField();
			case ExtensionModelPackage.YCOMBO_BOX: return createYComboBox();
			case ExtensionModelPackage.YBUTTON: return createYButton();
			case ExtensionModelPackage.YTOGGLE_BUTTON: return createYToggleButton();
			case ExtensionModelPackage.YPROGRESS_BAR: return createYProgressBar();
			case ExtensionModelPackage.YTAB_SHEET: return createYTabSheet();
			case ExtensionModelPackage.YTAB: return createYTab();
			case ExtensionModelPackage.YMASTER_DETAIL: return createYMasterDetail();
			case ExtensionModelPackage.YFORM_LAYOUT: return createYFormLayout();
			case ExtensionModelPackage.YFORM_LAYOUT_CELL_STYLE: return createYFormLayoutCellStyle();
			case ExtensionModelPackage.YTEXT_SEARCH_FIELD: return createYTextSearchField();
			case ExtensionModelPackage.YBOOLEAN_SEARCH_FIELD: return createYBooleanSearchField();
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD: return createYNumericSearchField();
			case ExtensionModelPackage.YREFERENCE_SEARCH_FIELD: return createYReferenceSearchField();
			case ExtensionModelPackage.YPANEL: return createYPanel();
			case ExtensionModelPackage.YSPLIT_PANEL: return createYSplitPanel();
			case ExtensionModelPackage.YSEARCH_PANEL: return createYSearchPanel();
			case ExtensionModelPackage.YENUM_OPTIONS_GROUP: return createYEnumOptionsGroup();
			case ExtensionModelPackage.YENUM_LIST: return createYEnumList();
			case ExtensionModelPackage.YENUM_COMBO_BOX: return createYEnumComboBox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExtensionModelPackage.YSELECTION_TYPE:
				return createYSelectionTypeFromString(eDataType, initialValue);
			case ExtensionModelPackage.YBOOLEAN_SEARCH_OPTION:
				return createYBooleanSearchOptionFromString(eDataType, initialValue);
			case ExtensionModelPackage.YSEARCH_WILDCARDS:
				return createYSearchWildcardsFromString(eDataType, initialValue);
			case ExtensionModelPackage.YBUTTON_CLICK_LISTENER:
				return createYButtonClickListenerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExtensionModelPackage.YSELECTION_TYPE:
				return convertYSelectionTypeToString(eDataType, instanceValue);
			case ExtensionModelPackage.YBOOLEAN_SEARCH_OPTION:
				return convertYBooleanSearchOptionToString(eDataType, instanceValue);
			case ExtensionModelPackage.YSEARCH_WILDCARDS:
				return convertYSearchWildcardsToString(eDataType, instanceValue);
			case ExtensionModelPackage.YBUTTON_CLICK_LISTENER:
				return convertYButtonClickListenerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextField createYTextField() {
		YTextFieldImpl yTextField = new YTextFieldImpl();
		return yTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBeanReferenceField createYBeanReferenceField() {
		YBeanReferenceFieldImpl yBeanReferenceField = new YBeanReferenceFieldImpl();
		return yBeanReferenceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGridLayout createYGridLayout() {
		YGridLayoutImpl yGridLayout = new YGridLayoutImpl();
		return yGridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGridLayoutCellStyle createYGridLayoutCellStyle() {
		YGridLayoutCellStyleImpl yGridLayoutCellStyle = new YGridLayoutCellStyleImpl();
		return yGridLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayout createYHorizontalLayout() {
		YHorizontalLayoutImpl yHorizontalLayout = new YHorizontalLayoutImpl();
		return yHorizontalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayoutCellStyle createYHorizontalLayoutCellStyle() {
		YHorizontalLayoutCellStyleImpl yHorizontalLayoutCellStyle = new YHorizontalLayoutCellStyleImpl();
		return yHorizontalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVerticalLayout createYVerticalLayout() {
		YVerticalLayoutImpl yVerticalLayout = new YVerticalLayoutImpl();
		return yVerticalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVerticalLayoutCellStyle createYVerticalLayoutCellStyle() {
		YVerticalLayoutCellStyleImpl yVerticalLayoutCellStyle = new YVerticalLayoutCellStyleImpl();
		return yVerticalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSpanInfo createYSpanInfo() {
		YSpanInfoImpl ySpanInfo = new YSpanInfoImpl();
		return ySpanInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTable createYTable() {
		YTableImpl yTable = new YTableImpl();
		return yTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YColumn createYColumn() {
		YColumnImpl yColumn = new YColumnImpl();
		return yColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YLabel createYLabel() {
		YLabelImpl yLabel = new YLabelImpl();
		return yLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YImage createYImage() {
		YImageImpl yImage = new YImageImpl();
		return yImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextArea createYTextArea() {
		YTextAreaImpl yTextArea = new YTextAreaImpl();
		return yTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCheckBox createYCheckBox() {
		YCheckBoxImpl yCheckBox = new YCheckBoxImpl();
		return yCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBrowser createYBrowser() {
		YBrowserImpl yBrowser = new YBrowserImpl();
		return yBrowser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDateTime createYDateTime() {
		YDateTimeImpl yDateTime = new YDateTimeImpl();
		return yDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDecimalField createYDecimalField() {
		YDecimalFieldImpl yDecimalField = new YDecimalFieldImpl();
		return yDecimalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericField createYNumericField() {
		YNumericFieldImpl yNumericField = new YNumericFieldImpl();
		return yNumericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComboBox createYComboBox() {
		YComboBoxImpl yComboBox = new YComboBoxImpl();
		return yComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YList createYList() {
		YListImpl yList = new YListImpl();
		return yList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YButton createYButton() {
		YButtonImpl yButton = new YButtonImpl();
		return yButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YToggleButton createYToggleButton() {
		YToggleButtonImpl yToggleButton = new YToggleButtonImpl();
		return yToggleButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YProgressBar createYProgressBar() {
		YProgressBarImpl yProgressBar = new YProgressBarImpl();
		return yProgressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTabSheet createYTabSheet() {
		YTabSheetImpl yTabSheet = new YTabSheetImpl();
		return yTabSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTab createYTab() {
		YTabImpl yTab = new YTabImpl();
		return yTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMasterDetail createYMasterDetail() {
		YMasterDetailImpl yMasterDetail = new YMasterDetailImpl();
		return yMasterDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YFormLayout createYFormLayout() {
		YFormLayoutImpl yFormLayout = new YFormLayoutImpl();
		return yFormLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YFormLayoutCellStyle createYFormLayoutCellStyle() {
		YFormLayoutCellStyleImpl yFormLayoutCellStyle = new YFormLayoutCellStyleImpl();
		return yFormLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextSearchField createYTextSearchField() {
		YTextSearchFieldImpl yTextSearchField = new YTextSearchFieldImpl();
		return yTextSearchField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBooleanSearchField createYBooleanSearchField() {
		YBooleanSearchFieldImpl yBooleanSearchField = new YBooleanSearchFieldImpl();
		return yBooleanSearchField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericSearchField createYNumericSearchField() {
		YNumericSearchFieldImpl yNumericSearchField = new YNumericSearchFieldImpl();
		return yNumericSearchField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YReferenceSearchField createYReferenceSearchField() {
		YReferenceSearchFieldImpl yReferenceSearchField = new YReferenceSearchFieldImpl();
		return yReferenceSearchField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPanel createYPanel() {
		YPanelImpl yPanel = new YPanelImpl();
		return yPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSplitPanel createYSplitPanel() {
		YSplitPanelImpl ySplitPanel = new YSplitPanelImpl();
		return ySplitPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSearchPanel createYSearchPanel() {
		YSearchPanelImpl ySearchPanel = new YSearchPanelImpl();
		return ySearchPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEnumOptionsGroup createYEnumOptionsGroup() {
		YEnumOptionsGroupImpl yEnumOptionsGroup = new YEnumOptionsGroupImpl();
		return yEnumOptionsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEnumList createYEnumList() {
		YEnumListImpl yEnumList = new YEnumListImpl();
		return yEnumList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEnumComboBox createYEnumComboBox() {
		YEnumComboBoxImpl yEnumComboBox = new YEnumComboBoxImpl();
		return yEnumComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTree createYTree() {
		YTreeImpl yTree = new YTreeImpl();
		return yTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOptionsGroup createYOptionsGroup() {
		YOptionsGroupImpl yOptionsGroup = new YOptionsGroupImpl();
		return yOptionsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSelectionType createYSelectionTypeFromString(EDataType eDataType, String initialValue) {
		YSelectionType result = YSelectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYSelectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBooleanSearchOption createYBooleanSearchOptionFromString(EDataType eDataType, String initialValue) {
		YBooleanSearchOption result = YBooleanSearchOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYBooleanSearchOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSearchWildcards createYSearchWildcardsFromString(EDataType eDataType, String initialValue) {
		YSearchWildcards result = YSearchWildcards.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYSearchWildcardsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YButtonClickListener createYButtonClickListenerFromString(EDataType eDataType, String initialValue) {
		return (YButtonClickListener)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYButtonClickListenerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelPackage getExtensionModelPackage() {
		return (ExtensionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtensionModelPackage getPackage() {
		return ExtensionModelPackage.eINSTANCE;
	}

} //ExtensionModelFactoryImpl
