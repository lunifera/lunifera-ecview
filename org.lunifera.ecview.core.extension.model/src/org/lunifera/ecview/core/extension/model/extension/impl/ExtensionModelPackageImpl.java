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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage;
import org.lunifera.ecview.core.extension.model.datatypes.impl.ExtDatatypesPackageImpl;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField;
import org.lunifera.ecview.core.extension.model.extension.YBeanServiceConsumer;
import org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField;
import org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption;
import org.lunifera.ecview.core.extension.model.extension.YBrowser;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.extension.model.extension.YCheckBox;
import org.lunifera.ecview.core.extension.model.extension.YColumn;
import org.lunifera.ecview.core.extension.model.extension.YComboBox;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.extension.model.extension.YDecimalField;
import org.lunifera.ecview.core.extension.model.extension.YEnumComboBox;
import org.lunifera.ecview.core.extension.model.extension.YEnumList;
import org.lunifera.ecview.core.extension.model.extension.YEnumOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YFormLayout;
import org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YImage;
import org.lunifera.ecview.core.extension.model.extension.YInput;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
import org.lunifera.ecview.core.extension.model.extension.YList;
import org.lunifera.ecview.core.extension.model.extension.YMasterDetail;
import org.lunifera.ecview.core.extension.model.extension.YNumericField;
import org.lunifera.ecview.core.extension.model.extension.YNumericSearchField;
import org.lunifera.ecview.core.extension.model.extension.YOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YPanel;
import org.lunifera.ecview.core.extension.model.extension.YProgressBar;
import org.lunifera.ecview.core.extension.model.extension.YReferenceSearchField;
import org.lunifera.ecview.core.extension.model.extension.YSearchPanel;
import org.lunifera.ecview.core.extension.model.extension.YSearchWildcards;
import org.lunifera.ecview.core.extension.model.extension.YSelectionType;
import org.lunifera.ecview.core.extension.model.extension.YSpanInfo;
import org.lunifera.ecview.core.extension.model.extension.YSplitPanel;
import org.lunifera.ecview.core.extension.model.extension.YTab;
import org.lunifera.ecview.core.extension.model.extension.YTabSheet;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.extension.model.extension.YTextArea;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.core.extension.model.extension.YTextSearchField;
import org.lunifera.ecview.core.extension.model.extension.YToggleButton;
import org.lunifera.ecview.core.extension.model.extension.YTree;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayout;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ExtensionModelPackageImpl extends EPackageImpl implements
		ExtensionModelPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTextFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanReferenceFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGridLayoutCellStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yHorizontalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yHorizontalLayoutCellStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVerticalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVerticalLayoutCellStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySpanInfoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yColumnEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yImageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBrowserEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDateTimeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDecimalFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yNumericFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yToggleButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yProgressBarEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTabSheetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTabEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMasterDetailEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yFormLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yFormLayoutCellStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTextSearchFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBooleanSearchFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yNumericSearchFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yReferenceSearchFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySplitPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySearchPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnumOptionsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnumListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnumComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanServiceConsumerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yOptionsGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ySelectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yBooleanSearchOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ySearchWildcardsEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yButtonClickListenerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtensionModelPackageImpl() {
		super(eNS_URI, ExtensionModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ExtensionModelPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtensionModelPackage init() {
		if (isInited) return (ExtensionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionModelPackage.eNS_URI);

		// Obtain or create and register package
		ExtensionModelPackageImpl theExtensionModelPackage = (ExtensionModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtensionModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtensionModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BindingPackage.eINSTANCE.eClass();
		CoreModelPackage.eINSTANCE.eClass();
		DatatypesPackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		VisibilityPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExtDatatypesPackageImpl theExtDatatypesPackage = (ExtDatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtDatatypesPackage.eNS_URI) instanceof ExtDatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtDatatypesPackage.eNS_URI) : ExtDatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theExtensionModelPackage.createPackageContents();
		theExtDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theExtensionModelPackage.initializePackageContents();
		theExtDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtensionModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtensionModelPackage.eNS_URI, theExtensionModelPackage);
		return theExtensionModelPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTextField() {
		return yTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextField_Datatype() {
		return (EReference)yTextFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextField_Datadescription() {
		return (EReference)yTextFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextField_Value() {
		return (EAttribute)yTextFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanReferenceField() {
		return yBeanReferenceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBeanReferenceField_Datadescription() {
		return (EReference)yBeanReferenceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_Value() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_Type() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_EmfNsURI() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_TypeQualifiedName() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_InMemoryBeanProvider() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_InMemoryBeanProviderQualifiedName() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_CaptionPropertyPath() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_ImagePropertyPath() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_DescriptionProperty() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanReferenceField_Description() {
		return (EAttribute)yBeanReferenceFieldEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGridLayout() {
		return yGridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGridLayout_CellStyles() {
		return (EReference)yGridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGridLayout_Columns() {
		return (EAttribute)yGridLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGridLayoutCellStyle() {
		return yGridLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGridLayoutCellStyle_Target() {
		return (EReference)yGridLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGridLayoutCellStyle_Alignment() {
		return (EAttribute)yGridLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGridLayoutCellStyle_SpanInfo() {
		return (EReference)yGridLayoutCellStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYHorizontalLayout() {
		return yHorizontalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYHorizontalLayout_CellStyles() {
		return (EReference)yHorizontalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYHorizontalLayoutCellStyle() {
		return yHorizontalLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYHorizontalLayoutCellStyle_Target() {
		return (EReference)yHorizontalLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYHorizontalLayoutCellStyle_Alignment() {
		return (EAttribute)yHorizontalLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVerticalLayout() {
		return yVerticalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVerticalLayout_CellStyles() {
		return (EReference)yVerticalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVerticalLayoutCellStyle() {
		return yVerticalLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVerticalLayoutCellStyle_Target() {
		return (EReference)yVerticalLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVerticalLayoutCellStyle_Alignment() {
		return (EAttribute)yVerticalLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSpanInfo() {
		return ySpanInfoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_ColumnFrom() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_RowFrom() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_ColumnTo() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_RowTo() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTable() {
		return yTableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTable_Datatype() {
		return (EReference)yTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTable_Datadescription() {
		return (EReference)yTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_SelectionType() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_Selection() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_MultiSelection() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_Collection() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_Type() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_EmfNsURI() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_TypeQualifiedName() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTable_Columns() {
		return (EReference)yTableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_ItemImageProperty() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_Filter() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYColumn() {
		return yColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_Icon() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_Visible() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYColumn_Datadescription() {
		return (EReference)yColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYColumn_OrphanDatadescriptions() {
		return (EReference)yColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_Orderable() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_Collapsed() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_Collapsible() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_Alignment() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_ExpandRatio() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColumn_PropertyPath() {
		return (EAttribute)yColumnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYLabel() {
		return yLabelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLabel_Datadescription() {
		return (EReference)yLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYLabel_Value() {
		return (EAttribute)yLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYImage() {
		return yImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYImage_Datadescription() {
		return (EReference)yImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYImage_Value() {
		return (EAttribute)yImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTextArea() {
		return yTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextArea_Datadescription() {
		return (EReference)yTextAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextArea_Datatype() {
		return (EReference)yTextAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextArea_Value() {
		return (EAttribute)yTextAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCheckBox() {
		return yCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCheckBox_Datadescription() {
		return (EReference)yCheckBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCheckBox_Datatype() {
		return (EReference)yCheckBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCheckBox_Value() {
		return (EAttribute)yCheckBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBrowser() {
		return yBrowserEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBrowser_Datatype() {
		return (EReference)yBrowserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBrowser_Datadescription() {
		return (EReference)yBrowserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBrowser_Value() {
		return (EAttribute)yBrowserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDateTime() {
		return yDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDateTime_Datatype() {
		return (EReference)yDateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDateTime_Datadescription() {
		return (EReference)yDateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDateTime_Value() {
		return (EAttribute)yDateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYInput() {
		return yInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDecimalField() {
		return yDecimalFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDecimalField_Datatype() {
		return (EReference)yDecimalFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDecimalField_Datadescription() {
		return (EReference)yDecimalFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDecimalField_Value() {
		return (EAttribute)yDecimalFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNumericField() {
		return yNumericFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYNumericField_Datatype() {
		return (EReference)yNumericFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYNumericField_Datadescription() {
		return (EReference)yNumericFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericField_Value() {
		return (EAttribute)yNumericFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYComboBox() {
		return yComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComboBox_Datadescription() {
		return (EReference)yComboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComboBox_Datatype() {
		return (EReference)yComboBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_Selection() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_Collection() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_Type() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_EmfNsURI() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_TypeQualifiedName() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_CaptionProperty() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_ImageProperty() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_DescriptionProperty() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_Description() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYList() {
		return yListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYList_Datadescription() {
		return (EReference)yListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYList_Datatype() {
		return (EReference)yListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_SelectionType() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_Selection() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_MultiSelection() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_Collection() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_Type() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_EmfNsURI() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_TypeQualifiedName() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_CaptionProperty() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_ImageProperty() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_DescriptionProperty() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_Description() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYButton() {
		return yButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYButton_Datadescription() {
		return (EReference)yButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYButton_ClickListeners() {
		return (EAttribute)yButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYButton_LastClickTime() {
		return (EAttribute)yButtonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYToggleButton() {
		return yToggleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYToggleButton_Datadescription() {
		return (EReference)yToggleButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYProgressBar() {
		return yProgressBarEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProgressBar_Datatype() {
		return (EReference)yProgressBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProgressBar_Datadescription() {
		return (EReference)yProgressBarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProgressBar_Value() {
		return (EAttribute)yProgressBarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTabSheet() {
		return yTabSheetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTabSheet_Tabs() {
		return (EReference)yTabSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTab() {
		return yTabEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTab_Parent() {
		return (EReference)yTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTab_Embeddable() {
		return (EReference)yTabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTab_Datadescription() {
		return (EReference)yTabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMasterDetail() {
		return yMasterDetailEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYMasterDetail_Datatype() {
		return (EReference)yMasterDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYMasterDetail_Datadescription() {
		return (EReference)yMasterDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMasterDetail_Selection() {
		return (EAttribute)yMasterDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMasterDetail_Collection() {
		return (EAttribute)yMasterDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMasterDetail_Type() {
		return (EAttribute)yMasterDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMasterDetail_EmfNsURI() {
		return (EAttribute)yMasterDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYMasterDetail_MasterElement() {
		return (EReference)yMasterDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYMasterDetail_DetailElement() {
		return (EReference)yMasterDetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMasterDetail_TypeQualifiedName() {
		return (EAttribute)yMasterDetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFormLayout() {
		return yFormLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYFormLayout_CellStyles() {
		return (EReference)yFormLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFormLayoutCellStyle() {
		return yFormLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYFormLayoutCellStyle_Target() {
		return (EReference)yFormLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYFormLayoutCellStyle_Alignment() {
		return (EAttribute)yFormLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTextSearchField() {
		return yTextSearchFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextSearchField_Datadescription() {
		return (EReference)yTextSearchFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextSearchField_Value() {
		return (EAttribute)yTextSearchFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextSearchField_Wildcard() {
		return (EAttribute)yTextSearchFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextSearchField_PropertyPath() {
		return (EAttribute)yTextSearchFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBooleanSearchField() {
		return yBooleanSearchFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBooleanSearchField_Datadescription() {
		return (EReference)yBooleanSearchFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBooleanSearchField_Value() {
		return (EAttribute)yBooleanSearchFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBooleanSearchField_PropertyPath() {
		return (EAttribute)yBooleanSearchFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNumericSearchField() {
		return yNumericSearchFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYNumericSearchField_Datadescription() {
		return (EReference)yNumericSearchFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericSearchField_Value() {
		return (EAttribute)yNumericSearchFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericSearchField_Wildcard() {
		return (EAttribute)yNumericSearchFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericSearchField_PropertyPath() {
		return (EAttribute)yNumericSearchFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericSearchField_Type() {
		return (EAttribute)yNumericSearchFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericSearchField_TypeQualifiedName() {
		return (EAttribute)yNumericSearchFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYReferenceSearchField() {
		return yReferenceSearchFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYReferenceSearchField_Datadescription() {
		return (EReference)yReferenceSearchFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYReferenceSearchField_Value() {
		return (EAttribute)yReferenceSearchFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYReferenceSearchField_Wildcard() {
		return (EAttribute)yReferenceSearchFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYReferenceSearchField_PropertyPath() {
		return (EAttribute)yReferenceSearchFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYReferenceSearchField_Type() {
		return (EAttribute)yReferenceSearchFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYReferenceSearchField_EmfNsURI() {
		return (EAttribute)yReferenceSearchFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYReferenceSearchField_TypeQualifiedName() {
		return (EAttribute)yReferenceSearchFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPanel() {
		return yPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPanel_Datadescription() {
		return (EReference)yPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPanel_FirstContent() {
		return (EReference)yPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPanel_SecondContent() {
		return (EReference)yPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSplitPanel() {
		return ySplitPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSplitPanel_Datadescription() {
		return (EReference)ySplitPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSplitPanel_CellStyles() {
		return (EReference)ySplitPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSplitPanel_FillHorizontal() {
		return (EAttribute)ySplitPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSplitPanel_SplitPosition() {
		return (EAttribute)ySplitPanelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSplitPanel_Vertical() {
		return (EAttribute)ySplitPanelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSearchPanel() {
		return ySearchPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSearchPanel_Type() {
		return (EAttribute)ySearchPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSearchPanel_EmfNsURI() {
		return (EAttribute)ySearchPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSearchPanel_TypeQualifiedName() {
		return (EAttribute)ySearchPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSearchPanel_ApplyFilter() {
		return (EAttribute)ySearchPanelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSearchPanel_Filter() {
		return (EAttribute)ySearchPanelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumOptionsGroup() {
		return yEnumOptionsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumOptionsGroup_Datadescription() {
		return (EReference)yEnumOptionsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumOptionsGroup_Datatype() {
		return (EReference)yEnumOptionsGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumOptionsGroup_SelectionType() {
		return (EAttribute)yEnumOptionsGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumOptionsGroup_Selection() {
		return (EAttribute)yEnumOptionsGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumOptionsGroup_MultiSelection() {
		return (EAttribute)yEnumOptionsGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumOptionsGroup_Type() {
		return (EAttribute)yEnumOptionsGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumOptionsGroup_EmfNsURI() {
		return (EAttribute)yEnumOptionsGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumOptionsGroup_TypeQualifiedName() {
		return (EAttribute)yEnumOptionsGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumList() {
		return yEnumListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumList_Datadescription() {
		return (EReference)yEnumListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumList_Datatype() {
		return (EReference)yEnumListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumList_SelectionType() {
		return (EAttribute)yEnumListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumList_Selection() {
		return (EAttribute)yEnumListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumList_MultiSelection() {
		return (EAttribute)yEnumListEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumList_Type() {
		return (EAttribute)yEnumListEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumList_EmfNsURI() {
		return (EAttribute)yEnumListEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumList_TypeQualifiedName() {
		return (EAttribute)yEnumListEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumComboBox() {
		return yEnumComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumComboBox_Datadescription() {
		return (EReference)yEnumComboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumComboBox_Datatype() {
		return (EReference)yEnumComboBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumComboBox_Selection() {
		return (EAttribute)yEnumComboBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumComboBox_Type() {
		return (EAttribute)yEnumComboBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumComboBox_EmfNsURI() {
		return (EAttribute)yEnumComboBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumComboBox_TypeQualifiedName() {
		return (EAttribute)yEnumComboBoxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanServiceConsumer() {
		return yBeanServiceConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanServiceConsumer_UseBeanService() {
		return (EAttribute)yBeanServiceConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTree() {
		return yTreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTree_Datatype() {
		return (EReference)yTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTree_Datadescription() {
		return (EReference)yTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_SelectionType() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_Selection() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_MultiSelection() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_Collection() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_Type() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_EmfNsURI() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_TypeQualifiedName() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYOptionsGroup() {
		return yOptionsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOptionsGroup_Datadescription() {
		return (EReference)yOptionsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOptionsGroup_Datatype() {
		return (EReference)yOptionsGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_SelectionType() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_Selection() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_MultiSelection() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_Collection() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_Type() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_EmfNsURI() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_TypeQualifiedName() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_CaptionProperty() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_ImageProperty() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_DescriptionProperty() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_Description() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYButtonClickListener() {
		return yButtonClickListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYSelectionType() {
		return ySelectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYBooleanSearchOption() {
		return yBooleanSearchOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYSearchWildcards() {
		return ySearchWildcardsEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelFactory getExtensionModelFactory() {
		return (ExtensionModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yInputEClass = createEClass(YINPUT);

		yGridLayoutEClass = createEClass(YGRID_LAYOUT);
		createEReference(yGridLayoutEClass, YGRID_LAYOUT__CELL_STYLES);
		createEAttribute(yGridLayoutEClass, YGRID_LAYOUT__COLUMNS);

		yGridLayoutCellStyleEClass = createEClass(YGRID_LAYOUT_CELL_STYLE);
		createEReference(yGridLayoutCellStyleEClass, YGRID_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yGridLayoutCellStyleEClass, YGRID_LAYOUT_CELL_STYLE__ALIGNMENT);
		createEReference(yGridLayoutCellStyleEClass, YGRID_LAYOUT_CELL_STYLE__SPAN_INFO);

		yHorizontalLayoutEClass = createEClass(YHORIZONTAL_LAYOUT);
		createEReference(yHorizontalLayoutEClass, YHORIZONTAL_LAYOUT__CELL_STYLES);

		yHorizontalLayoutCellStyleEClass = createEClass(YHORIZONTAL_LAYOUT_CELL_STYLE);
		createEReference(yHorizontalLayoutCellStyleEClass, YHORIZONTAL_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yHorizontalLayoutCellStyleEClass, YHORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT);

		yVerticalLayoutEClass = createEClass(YVERTICAL_LAYOUT);
		createEReference(yVerticalLayoutEClass, YVERTICAL_LAYOUT__CELL_STYLES);

		yVerticalLayoutCellStyleEClass = createEClass(YVERTICAL_LAYOUT_CELL_STYLE);
		createEReference(yVerticalLayoutCellStyleEClass, YVERTICAL_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yVerticalLayoutCellStyleEClass, YVERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT);

		ySpanInfoEClass = createEClass(YSPAN_INFO);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__COLUMN_FROM);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__ROW_FROM);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__COLUMN_TO);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__ROW_TO);

		yTableEClass = createEClass(YTABLE);
		createEReference(yTableEClass, YTABLE__DATATYPE);
		createEReference(yTableEClass, YTABLE__DATADESCRIPTION);
		createEAttribute(yTableEClass, YTABLE__SELECTION_TYPE);
		createEAttribute(yTableEClass, YTABLE__SELECTION);
		createEAttribute(yTableEClass, YTABLE__MULTI_SELECTION);
		createEAttribute(yTableEClass, YTABLE__COLLECTION);
		createEAttribute(yTableEClass, YTABLE__TYPE);
		createEAttribute(yTableEClass, YTABLE__EMF_NS_URI);
		createEAttribute(yTableEClass, YTABLE__TYPE_QUALIFIED_NAME);
		createEReference(yTableEClass, YTABLE__COLUMNS);
		createEAttribute(yTableEClass, YTABLE__ITEM_IMAGE_PROPERTY);
		createEAttribute(yTableEClass, YTABLE__FILTER);

		yColumnEClass = createEClass(YCOLUMN);
		createEAttribute(yColumnEClass, YCOLUMN__ICON);
		createEAttribute(yColumnEClass, YCOLUMN__VISIBLE);
		createEReference(yColumnEClass, YCOLUMN__DATADESCRIPTION);
		createEReference(yColumnEClass, YCOLUMN__ORPHAN_DATADESCRIPTIONS);
		createEAttribute(yColumnEClass, YCOLUMN__ORDERABLE);
		createEAttribute(yColumnEClass, YCOLUMN__COLLAPSED);
		createEAttribute(yColumnEClass, YCOLUMN__COLLAPSIBLE);
		createEAttribute(yColumnEClass, YCOLUMN__ALIGNMENT);
		createEAttribute(yColumnEClass, YCOLUMN__EXPAND_RATIO);
		createEAttribute(yColumnEClass, YCOLUMN__PROPERTY_PATH);

		yTreeEClass = createEClass(YTREE);
		createEReference(yTreeEClass, YTREE__DATATYPE);
		createEReference(yTreeEClass, YTREE__DATADESCRIPTION);
		createEAttribute(yTreeEClass, YTREE__SELECTION_TYPE);
		createEAttribute(yTreeEClass, YTREE__SELECTION);
		createEAttribute(yTreeEClass, YTREE__MULTI_SELECTION);
		createEAttribute(yTreeEClass, YTREE__COLLECTION);
		createEAttribute(yTreeEClass, YTREE__TYPE);
		createEAttribute(yTreeEClass, YTREE__EMF_NS_URI);
		createEAttribute(yTreeEClass, YTREE__TYPE_QUALIFIED_NAME);

		yOptionsGroupEClass = createEClass(YOPTIONS_GROUP);
		createEReference(yOptionsGroupEClass, YOPTIONS_GROUP__DATADESCRIPTION);
		createEReference(yOptionsGroupEClass, YOPTIONS_GROUP__DATATYPE);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__SELECTION_TYPE);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__SELECTION);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__MULTI_SELECTION);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__COLLECTION);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__TYPE);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__EMF_NS_URI);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__TYPE_QUALIFIED_NAME);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__CAPTION_PROPERTY);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__IMAGE_PROPERTY);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__DESCRIPTION_PROPERTY);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__DESCRIPTION);

		yListEClass = createEClass(YLIST);
		createEReference(yListEClass, YLIST__DATADESCRIPTION);
		createEReference(yListEClass, YLIST__DATATYPE);
		createEAttribute(yListEClass, YLIST__SELECTION_TYPE);
		createEAttribute(yListEClass, YLIST__SELECTION);
		createEAttribute(yListEClass, YLIST__MULTI_SELECTION);
		createEAttribute(yListEClass, YLIST__COLLECTION);
		createEAttribute(yListEClass, YLIST__TYPE);
		createEAttribute(yListEClass, YLIST__EMF_NS_URI);
		createEAttribute(yListEClass, YLIST__TYPE_QUALIFIED_NAME);
		createEAttribute(yListEClass, YLIST__CAPTION_PROPERTY);
		createEAttribute(yListEClass, YLIST__IMAGE_PROPERTY);
		createEAttribute(yListEClass, YLIST__DESCRIPTION_PROPERTY);
		createEAttribute(yListEClass, YLIST__DESCRIPTION);

		yLabelEClass = createEClass(YLABEL);
		createEReference(yLabelEClass, YLABEL__DATADESCRIPTION);
		createEAttribute(yLabelEClass, YLABEL__VALUE);

		yImageEClass = createEClass(YIMAGE);
		createEReference(yImageEClass, YIMAGE__DATADESCRIPTION);
		createEAttribute(yImageEClass, YIMAGE__VALUE);

		yTextFieldEClass = createEClass(YTEXT_FIELD);
		createEReference(yTextFieldEClass, YTEXT_FIELD__DATATYPE);
		createEReference(yTextFieldEClass, YTEXT_FIELD__DATADESCRIPTION);
		createEAttribute(yTextFieldEClass, YTEXT_FIELD__VALUE);

		yBeanReferenceFieldEClass = createEClass(YBEAN_REFERENCE_FIELD);
		createEReference(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__DATADESCRIPTION);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__VALUE);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__TYPE);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__EMF_NS_URI);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__TYPE_QUALIFIED_NAME);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__CAPTION_PROPERTY_PATH);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__IMAGE_PROPERTY_PATH);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY);
		createEAttribute(yBeanReferenceFieldEClass, YBEAN_REFERENCE_FIELD__DESCRIPTION);

		yTextAreaEClass = createEClass(YTEXT_AREA);
		createEReference(yTextAreaEClass, YTEXT_AREA__DATADESCRIPTION);
		createEReference(yTextAreaEClass, YTEXT_AREA__DATATYPE);
		createEAttribute(yTextAreaEClass, YTEXT_AREA__VALUE);

		yCheckBoxEClass = createEClass(YCHECK_BOX);
		createEReference(yCheckBoxEClass, YCHECK_BOX__DATADESCRIPTION);
		createEReference(yCheckBoxEClass, YCHECK_BOX__DATATYPE);
		createEAttribute(yCheckBoxEClass, YCHECK_BOX__VALUE);

		yBrowserEClass = createEClass(YBROWSER);
		createEReference(yBrowserEClass, YBROWSER__DATATYPE);
		createEReference(yBrowserEClass, YBROWSER__DATADESCRIPTION);
		createEAttribute(yBrowserEClass, YBROWSER__VALUE);

		yDateTimeEClass = createEClass(YDATE_TIME);
		createEReference(yDateTimeEClass, YDATE_TIME__DATATYPE);
		createEReference(yDateTimeEClass, YDATE_TIME__DATADESCRIPTION);
		createEAttribute(yDateTimeEClass, YDATE_TIME__VALUE);

		yDecimalFieldEClass = createEClass(YDECIMAL_FIELD);
		createEReference(yDecimalFieldEClass, YDECIMAL_FIELD__DATATYPE);
		createEReference(yDecimalFieldEClass, YDECIMAL_FIELD__DATADESCRIPTION);
		createEAttribute(yDecimalFieldEClass, YDECIMAL_FIELD__VALUE);

		yNumericFieldEClass = createEClass(YNUMERIC_FIELD);
		createEReference(yNumericFieldEClass, YNUMERIC_FIELD__DATATYPE);
		createEReference(yNumericFieldEClass, YNUMERIC_FIELD__DATADESCRIPTION);
		createEAttribute(yNumericFieldEClass, YNUMERIC_FIELD__VALUE);

		yComboBoxEClass = createEClass(YCOMBO_BOX);
		createEReference(yComboBoxEClass, YCOMBO_BOX__DATADESCRIPTION);
		createEReference(yComboBoxEClass, YCOMBO_BOX__DATATYPE);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__SELECTION);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__COLLECTION);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__TYPE);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__EMF_NS_URI);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__TYPE_QUALIFIED_NAME);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__CAPTION_PROPERTY);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__IMAGE_PROPERTY);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__DESCRIPTION_PROPERTY);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__DESCRIPTION);

		yButtonEClass = createEClass(YBUTTON);
		createEReference(yButtonEClass, YBUTTON__DATADESCRIPTION);
		createEAttribute(yButtonEClass, YBUTTON__CLICK_LISTENERS);
		createEAttribute(yButtonEClass, YBUTTON__LAST_CLICK_TIME);

		yToggleButtonEClass = createEClass(YTOGGLE_BUTTON);
		createEReference(yToggleButtonEClass, YTOGGLE_BUTTON__DATADESCRIPTION);

		yProgressBarEClass = createEClass(YPROGRESS_BAR);
		createEReference(yProgressBarEClass, YPROGRESS_BAR__DATATYPE);
		createEReference(yProgressBarEClass, YPROGRESS_BAR__DATADESCRIPTION);
		createEAttribute(yProgressBarEClass, YPROGRESS_BAR__VALUE);

		yTabSheetEClass = createEClass(YTAB_SHEET);
		createEReference(yTabSheetEClass, YTAB_SHEET__TABS);

		yTabEClass = createEClass(YTAB);
		createEReference(yTabEClass, YTAB__PARENT);
		createEReference(yTabEClass, YTAB__EMBEDDABLE);
		createEReference(yTabEClass, YTAB__DATADESCRIPTION);

		yMasterDetailEClass = createEClass(YMASTER_DETAIL);
		createEReference(yMasterDetailEClass, YMASTER_DETAIL__DATATYPE);
		createEReference(yMasterDetailEClass, YMASTER_DETAIL__DATADESCRIPTION);
		createEAttribute(yMasterDetailEClass, YMASTER_DETAIL__SELECTION);
		createEAttribute(yMasterDetailEClass, YMASTER_DETAIL__COLLECTION);
		createEAttribute(yMasterDetailEClass, YMASTER_DETAIL__TYPE);
		createEAttribute(yMasterDetailEClass, YMASTER_DETAIL__EMF_NS_URI);
		createEReference(yMasterDetailEClass, YMASTER_DETAIL__MASTER_ELEMENT);
		createEReference(yMasterDetailEClass, YMASTER_DETAIL__DETAIL_ELEMENT);
		createEAttribute(yMasterDetailEClass, YMASTER_DETAIL__TYPE_QUALIFIED_NAME);

		yFormLayoutEClass = createEClass(YFORM_LAYOUT);
		createEReference(yFormLayoutEClass, YFORM_LAYOUT__CELL_STYLES);

		yFormLayoutCellStyleEClass = createEClass(YFORM_LAYOUT_CELL_STYLE);
		createEReference(yFormLayoutCellStyleEClass, YFORM_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yFormLayoutCellStyleEClass, YFORM_LAYOUT_CELL_STYLE__ALIGNMENT);

		yTextSearchFieldEClass = createEClass(YTEXT_SEARCH_FIELD);
		createEReference(yTextSearchFieldEClass, YTEXT_SEARCH_FIELD__DATADESCRIPTION);
		createEAttribute(yTextSearchFieldEClass, YTEXT_SEARCH_FIELD__VALUE);
		createEAttribute(yTextSearchFieldEClass, YTEXT_SEARCH_FIELD__WILDCARD);
		createEAttribute(yTextSearchFieldEClass, YTEXT_SEARCH_FIELD__PROPERTY_PATH);

		yBooleanSearchFieldEClass = createEClass(YBOOLEAN_SEARCH_FIELD);
		createEReference(yBooleanSearchFieldEClass, YBOOLEAN_SEARCH_FIELD__DATADESCRIPTION);
		createEAttribute(yBooleanSearchFieldEClass, YBOOLEAN_SEARCH_FIELD__VALUE);
		createEAttribute(yBooleanSearchFieldEClass, YBOOLEAN_SEARCH_FIELD__PROPERTY_PATH);

		yNumericSearchFieldEClass = createEClass(YNUMERIC_SEARCH_FIELD);
		createEReference(yNumericSearchFieldEClass, YNUMERIC_SEARCH_FIELD__DATADESCRIPTION);
		createEAttribute(yNumericSearchFieldEClass, YNUMERIC_SEARCH_FIELD__VALUE);
		createEAttribute(yNumericSearchFieldEClass, YNUMERIC_SEARCH_FIELD__WILDCARD);
		createEAttribute(yNumericSearchFieldEClass, YNUMERIC_SEARCH_FIELD__PROPERTY_PATH);
		createEAttribute(yNumericSearchFieldEClass, YNUMERIC_SEARCH_FIELD__TYPE);
		createEAttribute(yNumericSearchFieldEClass, YNUMERIC_SEARCH_FIELD__TYPE_QUALIFIED_NAME);

		yReferenceSearchFieldEClass = createEClass(YREFERENCE_SEARCH_FIELD);
		createEReference(yReferenceSearchFieldEClass, YREFERENCE_SEARCH_FIELD__DATADESCRIPTION);
		createEAttribute(yReferenceSearchFieldEClass, YREFERENCE_SEARCH_FIELD__VALUE);
		createEAttribute(yReferenceSearchFieldEClass, YREFERENCE_SEARCH_FIELD__WILDCARD);
		createEAttribute(yReferenceSearchFieldEClass, YREFERENCE_SEARCH_FIELD__PROPERTY_PATH);
		createEAttribute(yReferenceSearchFieldEClass, YREFERENCE_SEARCH_FIELD__TYPE);
		createEAttribute(yReferenceSearchFieldEClass, YREFERENCE_SEARCH_FIELD__EMF_NS_URI);
		createEAttribute(yReferenceSearchFieldEClass, YREFERENCE_SEARCH_FIELD__TYPE_QUALIFIED_NAME);

		yPanelEClass = createEClass(YPANEL);
		createEReference(yPanelEClass, YPANEL__DATADESCRIPTION);
		createEReference(yPanelEClass, YPANEL__FIRST_CONTENT);
		createEReference(yPanelEClass, YPANEL__SECOND_CONTENT);

		ySplitPanelEClass = createEClass(YSPLIT_PANEL);
		createEReference(ySplitPanelEClass, YSPLIT_PANEL__DATADESCRIPTION);
		createEReference(ySplitPanelEClass, YSPLIT_PANEL__CELL_STYLES);
		createEAttribute(ySplitPanelEClass, YSPLIT_PANEL__FILL_HORIZONTAL);
		createEAttribute(ySplitPanelEClass, YSPLIT_PANEL__SPLIT_POSITION);
		createEAttribute(ySplitPanelEClass, YSPLIT_PANEL__VERTICAL);

		ySearchPanelEClass = createEClass(YSEARCH_PANEL);
		createEAttribute(ySearchPanelEClass, YSEARCH_PANEL__TYPE);
		createEAttribute(ySearchPanelEClass, YSEARCH_PANEL__EMF_NS_URI);
		createEAttribute(ySearchPanelEClass, YSEARCH_PANEL__TYPE_QUALIFIED_NAME);
		createEAttribute(ySearchPanelEClass, YSEARCH_PANEL__APPLY_FILTER);
		createEAttribute(ySearchPanelEClass, YSEARCH_PANEL__FILTER);

		yEnumOptionsGroupEClass = createEClass(YENUM_OPTIONS_GROUP);
		createEReference(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__DATADESCRIPTION);
		createEReference(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__DATATYPE);
		createEAttribute(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__SELECTION_TYPE);
		createEAttribute(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__SELECTION);
		createEAttribute(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__MULTI_SELECTION);
		createEAttribute(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__TYPE);
		createEAttribute(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__EMF_NS_URI);
		createEAttribute(yEnumOptionsGroupEClass, YENUM_OPTIONS_GROUP__TYPE_QUALIFIED_NAME);

		yEnumListEClass = createEClass(YENUM_LIST);
		createEReference(yEnumListEClass, YENUM_LIST__DATADESCRIPTION);
		createEReference(yEnumListEClass, YENUM_LIST__DATATYPE);
		createEAttribute(yEnumListEClass, YENUM_LIST__SELECTION_TYPE);
		createEAttribute(yEnumListEClass, YENUM_LIST__SELECTION);
		createEAttribute(yEnumListEClass, YENUM_LIST__MULTI_SELECTION);
		createEAttribute(yEnumListEClass, YENUM_LIST__TYPE);
		createEAttribute(yEnumListEClass, YENUM_LIST__EMF_NS_URI);
		createEAttribute(yEnumListEClass, YENUM_LIST__TYPE_QUALIFIED_NAME);

		yEnumComboBoxEClass = createEClass(YENUM_COMBO_BOX);
		createEReference(yEnumComboBoxEClass, YENUM_COMBO_BOX__DATADESCRIPTION);
		createEReference(yEnumComboBoxEClass, YENUM_COMBO_BOX__DATATYPE);
		createEAttribute(yEnumComboBoxEClass, YENUM_COMBO_BOX__SELECTION);
		createEAttribute(yEnumComboBoxEClass, YENUM_COMBO_BOX__TYPE);
		createEAttribute(yEnumComboBoxEClass, YENUM_COMBO_BOX__EMF_NS_URI);
		createEAttribute(yEnumComboBoxEClass, YENUM_COMBO_BOX__TYPE_QUALIFIED_NAME);

		yBeanServiceConsumerEClass = createEClass(YBEAN_SERVICE_CONSUMER);
		createEAttribute(yBeanServiceConsumerEClass, YBEAN_SERVICE_CONSUMER__USE_BEAN_SERVICE);

		// Create enums
		ySelectionTypeEEnum = createEEnum(YSELECTION_TYPE);
		yBooleanSearchOptionEEnum = createEEnum(YBOOLEAN_SEARCH_OPTION);
		ySearchWildcardsEEnum = createEEnum(YSEARCH_WILDCARDS);

		// Create data types
		yButtonClickListenerEDataType = createEDataType(YBUTTON_CLICK_LISTENER);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);
		ExtDatatypesPackage theExtDatatypesPackage = (ExtDatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(ExtDatatypesPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		BindingPackage theBindingPackage = (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yInputEClass.getESuperTypes().add(theCoreModelPackage.getYField());
		yGridLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		yGridLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		yGridLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yHorizontalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		yHorizontalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		yHorizontalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yVerticalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		yVerticalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		yVerticalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yTableEClass.getESuperTypes().add(this.getYInput());
		yTableEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yTableEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yTableEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yTableEClass.getESuperTypes().add(this.getYBeanServiceConsumer());
		yColumnEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yTreeEClass.getESuperTypes().add(this.getYInput());
		yTreeEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yTreeEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yTreeEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yTreeEClass.getESuperTypes().add(this.getYBeanServiceConsumer());
		yOptionsGroupEClass.getESuperTypes().add(this.getYInput());
		yOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yOptionsGroupEClass.getESuperTypes().add(this.getYBeanServiceConsumer());
		yListEClass.getESuperTypes().add(this.getYInput());
		yListEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yListEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yListEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yListEClass.getESuperTypes().add(this.getYBeanServiceConsumer());
		yLabelEClass.getESuperTypes().add(theCoreModelPackage.getYField());
		yLabelEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yImageEClass.getESuperTypes().add(theCoreModelPackage.getYField());
		yImageEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yTextFieldEClass.getESuperTypes().add(this.getYInput());
		yTextFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yBeanReferenceFieldEClass.getESuperTypes().add(this.getYInput());
		yBeanReferenceFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yBeanReferenceFieldEClass.getESuperTypes().add(this.getYBeanServiceConsumer());
		yTextAreaEClass.getESuperTypes().add(this.getYInput());
		yTextAreaEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yCheckBoxEClass.getESuperTypes().add(this.getYInput());
		yCheckBoxEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yBrowserEClass.getESuperTypes().add(this.getYInput());
		yBrowserEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yDateTimeEClass.getESuperTypes().add(this.getYInput());
		yDateTimeEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yDecimalFieldEClass.getESuperTypes().add(this.getYInput());
		yDecimalFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yNumericFieldEClass.getESuperTypes().add(this.getYInput());
		yNumericFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yComboBoxEClass.getESuperTypes().add(this.getYInput());
		yComboBoxEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yComboBoxEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yComboBoxEClass.getESuperTypes().add(this.getYBeanServiceConsumer());
		yButtonEClass.getESuperTypes().add(theCoreModelPackage.getYAction());
		yButtonEClass.getESuperTypes().add(theCoreModelPackage.getYVisibleable());
		yButtonEClass.getESuperTypes().add(theCoreModelPackage.getYEditable());
		yButtonEClass.getESuperTypes().add(theCoreModelPackage.getYEnable());
		yToggleButtonEClass.getESuperTypes().add(theCoreModelPackage.getYAction());
		yToggleButtonEClass.getESuperTypes().add(theCoreModelPackage.getYActivateable());
		yProgressBarEClass.getESuperTypes().add(this.getYInput());
		yProgressBarEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yTabSheetEClass.getESuperTypes().add(theCoreModelPackage.getYEmbeddable());
		yTabEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yTabEClass.getESuperTypes().add(theCoreModelPackage.getYCssAble());
		yMasterDetailEClass.getESuperTypes().add(this.getYInput());
		yMasterDetailEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yMasterDetailEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yFormLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		yFormLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		yFormLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yTextSearchFieldEClass.getESuperTypes().add(this.getYInput());
		yTextSearchFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yBooleanSearchFieldEClass.getESuperTypes().add(this.getYInput());
		yBooleanSearchFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yNumericSearchFieldEClass.getESuperTypes().add(this.getYInput());
		yNumericSearchFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yReferenceSearchFieldEClass.getESuperTypes().add(this.getYInput());
		yReferenceSearchFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yPanelEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		ySplitPanelEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		ySearchPanelEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		ySearchPanelEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		ySearchPanelEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yEnumOptionsGroupEClass.getESuperTypes().add(this.getYInput());
		yEnumOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yEnumOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yEnumOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yEnumListEClass.getESuperTypes().add(this.getYInput());
		yEnumListEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yEnumListEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yEnumListEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yEnumComboBoxEClass.getESuperTypes().add(this.getYInput());
		yEnumComboBoxEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yEnumComboBoxEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());

		// Initialize classes and features; add operations and parameters
		initEClass(yInputEClass, YInput.class, "YInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yGridLayoutEClass, YGridLayout.class, "YGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGridLayout_CellStyles(), this.getYGridLayoutCellStyle(), null, "cellStyles", null, 0, -1, YGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGridLayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, YGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(yGridLayoutEClass, this.getYGridLayoutCellStyle(), "addGridLayoutCellStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYEmbeddable(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yGridLayoutCellStyleEClass, YGridLayoutCellStyle.class, "YGridLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGridLayoutCellStyle_Target(), theCoreModelPackage.getYEmbeddable(), null, "target", null, 1, 1, YGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGridLayoutCellStyle_Alignment(), theCoreModelPackage.getYAlignment(), "alignment", "UNDEFINED", 0, 1, YGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYGridLayoutCellStyle_SpanInfo(), this.getYSpanInfo(), null, "spanInfo", null, 0, 1, YGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(yGridLayoutCellStyleEClass, this.getYSpanInfo(), "addSpanInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "col1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "row1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "col2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "row2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yHorizontalLayoutEClass, YHorizontalLayout.class, "YHorizontalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYHorizontalLayout_CellStyles(), this.getYHorizontalLayoutCellStyle(), null, "cellStyles", null, 0, -1, YHorizontalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(yHorizontalLayoutEClass, this.getYHorizontalLayoutCellStyle(), "getCellStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYEmbeddable(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yHorizontalLayoutCellStyleEClass, YHorizontalLayoutCellStyle.class, "YHorizontalLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYHorizontalLayoutCellStyle_Target(), theCoreModelPackage.getYEmbeddable(), null, "target", null, 1, 1, YHorizontalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYHorizontalLayoutCellStyle_Alignment(), theCoreModelPackage.getYAlignment(), "alignment", "UNDEFINED", 0, 1, YHorizontalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVerticalLayoutEClass, YVerticalLayout.class, "YVerticalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVerticalLayout_CellStyles(), this.getYVerticalLayoutCellStyle(), null, "cellStyles", null, 0, -1, YVerticalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVerticalLayoutCellStyleEClass, YVerticalLayoutCellStyle.class, "YVerticalLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVerticalLayoutCellStyle_Target(), theCoreModelPackage.getYEmbeddable(), null, "target", null, 1, 1, YVerticalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVerticalLayoutCellStyle_Alignment(), theCoreModelPackage.getYAlignment(), "alignment", "UNDEFINED", 0, 1, YVerticalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySpanInfoEClass, YSpanInfo.class, "YSpanInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYSpanInfo_ColumnFrom(), ecorePackage.getEInt(), "columnFrom", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSpanInfo_RowFrom(), ecorePackage.getEInt(), "rowFrom", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSpanInfo_ColumnTo(), ecorePackage.getEInt(), "columnTo", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSpanInfo_RowTo(), ecorePackage.getEInt(), "rowTo", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTableEClass, YTable.class, "YTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTable_Datatype(), theExtDatatypesPackage.getYTableDatatype(), null, "datatype", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTable_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YTable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YTable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YTable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYTable_Type(), g1, "type", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTable_Columns(), this.getYColumn(), null, "columns", null, 0, -1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_ItemImageProperty(), ecorePackage.getEString(), "itemImageProperty", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_Filter(), ecorePackage.getEJavaObject(), "filter", null, 0, 1, YTable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yColumnEClass, YColumn.class, "YColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYColumn_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColumn_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYColumn_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYColumn_OrphanDatadescriptions(), theDatatypesPackage.getYDatadescription(), null, "orphanDatadescriptions", null, 0, -1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColumn_Orderable(), ecorePackage.getEBoolean(), "orderable", "true", 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColumn_Collapsed(), ecorePackage.getEBoolean(), "collapsed", "false", 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColumn_Collapsible(), ecorePackage.getEBoolean(), "collapsible", "true", 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColumn_Alignment(), theCoreModelPackage.getYFlatAlignment(), "alignment", "LEFT", 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColumn_ExpandRatio(), ecorePackage.getEFloat(), "expandRatio", "-1.0f", 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColumn_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTreeEClass, YTree.class, "YTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTree_Datatype(), theExtDatatypesPackage.getYTreeDatatype(), null, "datatype", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTree_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YTree.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YTree.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YTree.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYTree_Type(), g1, "type", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yOptionsGroupEClass, YOptionsGroup.class, "YOptionsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYOptionsGroup_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOptionsGroup_Datatype(), theExtDatatypesPackage.getYOptionsGroupDataType(), null, "datatype", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYOptionsGroup_Type(), g1, "type", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_CaptionProperty(), ecorePackage.getEString(), "captionProperty", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_ImageProperty(), ecorePackage.getEString(), "imageProperty", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_DescriptionProperty(), ecorePackage.getEString(), "descriptionProperty", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yListEClass, YList.class, "YList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYList_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYList_Datatype(), theExtDatatypesPackage.getYListDataType(), null, "datatype", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYList_Type(), g1, "type", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_CaptionProperty(), ecorePackage.getEString(), "captionProperty", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_ImageProperty(), ecorePackage.getEString(), "imageProperty", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_DescriptionProperty(), ecorePackage.getEString(), "descriptionProperty", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_Description(), ecorePackage.getEString(), "description", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yLabelEClass, YLabel.class, "YLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYLabel_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYLabel_Value(), ecorePackage.getEString(), "value", null, 0, 1, YLabel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yImageEClass, YImage.class, "YImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYImage_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYImage_Value(), ecorePackage.getEString(), "value", null, 0, 1, YImage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTextFieldEClass, YTextField.class, "YTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTextField_Datatype(), theExtDatatypesPackage.getYTextDatatype(), null, "datatype", null, 0, 1, YTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTextField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextField_Value(), ecorePackage.getEString(), "value", null, 0, 1, YTextField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBeanReferenceFieldEClass, YBeanReferenceField.class, "YBeanReferenceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYBeanReferenceField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, YBeanReferenceField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYBeanReferenceField_Type(), g1, "type", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYBeanReferenceField_InMemoryBeanProvider(), g1, "inMemoryBeanProvider", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_InMemoryBeanProviderQualifiedName(), ecorePackage.getEString(), "inMemoryBeanProviderQualifiedName", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_CaptionPropertyPath(), ecorePackage.getEString(), "captionPropertyPath", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_ImagePropertyPath(), ecorePackage.getEString(), "imagePropertyPath", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_DescriptionProperty(), ecorePackage.getEString(), "descriptionProperty", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanReferenceField_Description(), ecorePackage.getEString(), "description", null, 0, 1, YBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTextAreaEClass, YTextArea.class, "YTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTextArea_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTextArea_Datatype(), theExtDatatypesPackage.getYTextAreaDatatype(), null, "datatype", null, 0, 1, YTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextArea_Value(), ecorePackage.getEString(), "value", null, 0, 1, YTextArea.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCheckBoxEClass, YCheckBox.class, "YCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCheckBox_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYCheckBox_Datatype(), theExtDatatypesPackage.getYCheckBoxDatatype(), null, "datatype", null, 0, 1, YCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYCheckBox_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, YCheckBox.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBrowserEClass, YBrowser.class, "YBrowser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYBrowser_Datatype(), theExtDatatypesPackage.getYBrowserDatatype(), null, "datatype", null, 0, 1, YBrowser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYBrowser_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YBrowser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBrowser_Value(), ecorePackage.getEString(), "value", null, 0, 1, YBrowser.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDateTimeEClass, YDateTime.class, "YDateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYDateTime_Datatype(), theExtDatatypesPackage.getYDateTimeDatatype(), null, "datatype", null, 0, 1, YDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYDateTime_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDateTime_Value(), ecorePackage.getEDate(), "value", null, 0, 1, YDateTime.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDecimalFieldEClass, YDecimalField.class, "YDecimalField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYDecimalField_Datatype(), theExtDatatypesPackage.getYDecimalDatatype(), null, "datatype", null, 0, 1, YDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYDecimalField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDecimalField_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, YDecimalField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yNumericFieldEClass, YNumericField.class, "YNumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYNumericField_Datatype(), theExtDatatypesPackage.getYNumericDatatype(), null, "datatype", null, 0, 1, YNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYNumericField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericField_Value(), ecorePackage.getELong(), "value", null, 0, 1, YNumericField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yComboBoxEClass, YComboBox.class, "YComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYComboBox_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYComboBox_Datatype(), theExtDatatypesPackage.getYComboBoxDatatype(), null, "datatype", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YComboBox.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YComboBox.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYComboBox_Type(), g1, "type", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_CaptionProperty(), ecorePackage.getEString(), "captionProperty", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_ImageProperty(), ecorePackage.getEString(), "imageProperty", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_DescriptionProperty(), ecorePackage.getEString(), "descriptionProperty", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_Description(), ecorePackage.getEString(), "description", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yButtonEClass, YButton.class, "YButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYButton_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYButton_ClickListeners(), this.getYButtonClickListener(), "clickListeners", null, 0, -1, YButton.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYButton_LastClickTime(), ecorePackage.getELong(), "lastClickTime", null, 0, 1, YButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(yButtonEClass, null, "addClickListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYButtonClickListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yButtonEClass, null, "removeClickListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYButtonClickListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yButtonEClass, theBindingPackage.getYECViewModelValueBindingEndpoint(), "createClickEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yToggleButtonEClass, YToggleButton.class, "YToggleButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYToggleButton_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YToggleButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yProgressBarEClass, YProgressBar.class, "YProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYProgressBar_Datatype(), theExtDatatypesPackage.getYProgressBarDatatype(), null, "datatype", null, 0, 1, YProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProgressBar_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProgressBar_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, YProgressBar.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTabSheetEClass, YTabSheet.class, "YTabSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTabSheet_Tabs(), this.getYTab(), this.getYTab_Parent(), "tabs", null, 0, -1, YTabSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTabEClass, YTab.class, "YTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTab_Parent(), this.getYTabSheet(), this.getYTabSheet_Tabs(), "parent", null, 1, 1, YTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTab_Embeddable(), theCoreModelPackage.getYEmbeddable(), null, "embeddable", null, 1, 1, YTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTab_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yTabEClass, theCoreModelPackage.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yMasterDetailEClass, YMasterDetail.class, "YMasterDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYMasterDetail_Datatype(), theExtDatatypesPackage.getYMasterDetailDatatype(), null, "datatype", null, 0, 1, YMasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYMasterDetail_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YMasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYMasterDetail_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YMasterDetail.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYMasterDetail_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YMasterDetail.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYMasterDetail_Type(), g1, "type", null, 0, 1, YMasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYMasterDetail_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YMasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYMasterDetail_MasterElement(), theCoreModelPackage.getYEmbeddable(), null, "masterElement", null, 0, 1, YMasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYMasterDetail_DetailElement(), theCoreModelPackage.getYEmbeddable(), null, "detailElement", null, 0, 1, YMasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYMasterDetail_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YMasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yFormLayoutEClass, YFormLayout.class, "YFormLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYFormLayout_CellStyles(), this.getYFormLayoutCellStyle(), null, "cellStyles", null, 0, -1, YFormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yFormLayoutCellStyleEClass, YFormLayoutCellStyle.class, "YFormLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYFormLayoutCellStyle_Target(), theCoreModelPackage.getYEmbeddable(), null, "target", null, 1, 1, YFormLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYFormLayoutCellStyle_Alignment(), theCoreModelPackage.getYAlignment(), "alignment", "UNDEFINED", 0, 1, YFormLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTextSearchFieldEClass, YTextSearchField.class, "YTextSearchField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTextSearchField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTextSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextSearchField_Value(), ecorePackage.getEString(), "value", null, 0, 1, YTextSearchField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextSearchField_Wildcard(), this.getYSearchWildcards(), "wildcard", null, 0, 1, YTextSearchField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextSearchField_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YTextSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBooleanSearchFieldEClass, YBooleanSearchField.class, "YBooleanSearchField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYBooleanSearchField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YBooleanSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBooleanSearchField_Value(), this.getYBooleanSearchOption(), "value", null, 0, 1, YBooleanSearchField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBooleanSearchField_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YBooleanSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yNumericSearchFieldEClass, YNumericSearchField.class, "YNumericSearchField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYNumericSearchField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YNumericSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericSearchField_Value(), ecorePackage.getEString(), "value", null, 0, 1, YNumericSearchField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericSearchField_Wildcard(), this.getYSearchWildcards(), "wildcard", null, 0, 1, YNumericSearchField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericSearchField_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YNumericSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericSearchField_Type(), ecorePackage.getEJavaClass(), "type", null, 0, 1, YNumericSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericSearchField_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YNumericSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yReferenceSearchFieldEClass, YReferenceSearchField.class, "YReferenceSearchField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYReferenceSearchField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YReferenceSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYReferenceSearchField_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, YReferenceSearchField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYReferenceSearchField_Wildcard(), this.getYSearchWildcards(), "wildcard", null, 0, 1, YReferenceSearchField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYReferenceSearchField_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YReferenceSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYReferenceSearchField_Type(), g1, "type", null, 0, 1, YReferenceSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYReferenceSearchField_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YReferenceSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYReferenceSearchField_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YReferenceSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPanelEClass, YPanel.class, "YPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYPanel_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPanel_FirstContent(), theCoreModelPackage.getYEmbeddable(), null, "firstContent", null, 0, 1, YPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPanel_SecondContent(), theCoreModelPackage.getYEmbeddable(), null, "secondContent", null, 0, 1, YPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(yPanelEClass, this.getYHorizontalLayoutCellStyle(), "getCellStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYEmbeddable(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ySplitPanelEClass, YSplitPanel.class, "YSplitPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYSplitPanel_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YSplitPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYSplitPanel_CellStyles(), this.getYHorizontalLayoutCellStyle(), null, "cellStyles", null, 0, -1, YSplitPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSplitPanel_FillHorizontal(), ecorePackage.getEBoolean(), "fillHorizontal", "true", 0, 1, YSplitPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSplitPanel_SplitPosition(), ecorePackage.getEInt(), "splitPosition", "50", 0, 1, YSplitPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSplitPanel_Vertical(), ecorePackage.getEBoolean(), "vertical", "true", 0, 1, YSplitPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ySplitPanelEClass, this.getYHorizontalLayoutCellStyle(), "getCellStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYEmbeddable(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ySearchPanelEClass, YSearchPanel.class, "YSearchPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYSearchPanel_Type(), g1, "type", null, 0, 1, YSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSearchPanel_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSearchPanel_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSearchPanel_ApplyFilter(), ecorePackage.getEJavaObject(), "applyFilter", null, 0, 1, YSearchPanel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSearchPanel_Filter(), ecorePackage.getEJavaObject(), "filter", null, 0, 1, YSearchPanel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEnumOptionsGroupEClass, YEnumOptionsGroup.class, "YEnumOptionsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEnumOptionsGroup_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YEnumOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumOptionsGroup_Datatype(), theExtDatatypesPackage.getYOptionsGroupDataType(), null, "datatype", null, 0, 1, YEnumOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumOptionsGroup_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YEnumOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumOptionsGroup_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YEnumOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumOptionsGroup_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YEnumOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYEnumOptionsGroup_Type(), g1, "type", null, 0, 1, YEnumOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumOptionsGroup_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YEnumOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumOptionsGroup_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YEnumOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEnumListEClass, YEnumList.class, "YEnumList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEnumList_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YEnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumList_Datatype(), theExtDatatypesPackage.getYListDataType(), null, "datatype", null, 0, 1, YEnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumList_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YEnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumList_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YEnumList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumList_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YEnumList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYEnumList_Type(), g1, "type", null, 0, 1, YEnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumList_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YEnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumList_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YEnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEnumComboBoxEClass, YEnumComboBox.class, "YEnumComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEnumComboBox_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YEnumComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumComboBox_Datatype(), theExtDatatypesPackage.getYComboBoxDatatype(), null, "datatype", null, 0, 1, YEnumComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumComboBox_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YEnumComboBox.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYEnumComboBox_Type(), g1, "type", null, 0, 1, YEnumComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumComboBox_EmfNsURI(), ecorePackage.getEString(), "emfNsURI", null, 0, 1, YEnumComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumComboBox_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, YEnumComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBeanServiceConsumerEClass, YBeanServiceConsumer.class, "YBeanServiceConsumer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBeanServiceConsumer_UseBeanService(), ecorePackage.getEBoolean(), "useBeanService", null, 0, 1, YBeanServiceConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ySelectionTypeEEnum, YSelectionType.class, "YSelectionType");
		addEEnumLiteral(ySelectionTypeEEnum, YSelectionType.SINGLE);
		addEEnumLiteral(ySelectionTypeEEnum, YSelectionType.MULTI);

		initEEnum(yBooleanSearchOptionEEnum, YBooleanSearchOption.class, "YBooleanSearchOption");
		addEEnumLiteral(yBooleanSearchOptionEEnum, YBooleanSearchOption.TRUE);
		addEEnumLiteral(yBooleanSearchOptionEEnum, YBooleanSearchOption.FALSE);
		addEEnumLiteral(yBooleanSearchOptionEEnum, YBooleanSearchOption.IGNORE);

		initEEnum(ySearchWildcardsEEnum, YSearchWildcards.class, "YSearchWildcards");
		addEEnumLiteral(ySearchWildcardsEEnum, YSearchWildcards.GT);
		addEEnumLiteral(ySearchWildcardsEEnum, YSearchWildcards.GE);
		addEEnumLiteral(ySearchWildcardsEEnum, YSearchWildcards.LT);
		addEEnumLiteral(ySearchWildcardsEEnum, YSearchWildcards.LE);
		addEEnumLiteral(ySearchWildcardsEEnum, YSearchWildcards.EQ);
		addEEnumLiteral(ySearchWildcardsEEnum, YSearchWildcards.NE);
		addEEnumLiteral(ySearchWildcardsEEnum, YSearchWildcards.ANY);

		// Initialize data types
		initEDataType(yButtonClickListenerEDataType, YButtonClickListener.class, "YButtonClickListener", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ExtensionModelPackageImpl
