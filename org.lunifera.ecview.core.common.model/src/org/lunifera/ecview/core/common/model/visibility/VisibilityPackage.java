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
package org.lunifera.ecview.core.common.model.visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityFactory
 * @model kind="package"
 * @generated
 */
public interface VisibilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visibility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/ecview/v1/core/visibility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visibility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisibilityPackage eINSTANCE = org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl <em>YVisibility Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl
	 * @see org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProcessor()
	 * @generated
	 */
	int YVISIBILITY_PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__TAGS = CoreModelPackage.YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__PROPERTIES = CoreModelPackage.YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__DATA_USED = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggers On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__TRIGGERS_ON = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__DELEGATE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delegate Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME = CoreModelPackage.YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YVisibility Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl <em>YVisibility Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl
	 * @see org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProperties()
	 * @generated
	 */
	int YVISIBILITY_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__TAGS = CoreModelPackage.YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__PROPERTIES = CoreModelPackage.YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__VISIBLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__EDITABLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__ENABLED = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__BORDER = CoreModelPackage.YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__BOLD = CoreModelPackage.YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__ITALIC = CoreModelPackage.YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strikethrough</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__STRIKETHROUGH = CoreModelPackage.YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__UNDERLINE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__BACKGROUND_COLOR = CoreModelPackage.YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__FOREGROUND_COLOR = CoreModelPackage.YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Background Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Foreground Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>YVisibility Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.visibility.YColor <em>YColor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.visibility.YColor
	 * @see org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl#getYColor()
	 * @generated
	 */
	int YCOLOR = 2;

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor <em>YVisibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibility Processor</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor
	 * @generated
	 */
	EClass getYVisibilityProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDataUsed <em>Data Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Used</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDataUsed()
	 * @see #getYVisibilityProcessor()
	 * @generated
	 */
	EReference getYVisibilityProcessor_DataUsed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getTriggersOn <em>Triggers On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers On</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getTriggersOn()
	 * @see #getYVisibilityProcessor()
	 * @generated
	 */
	EReference getYVisibilityProcessor_TriggersOn();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegate()
	 * @see #getYVisibilityProcessor()
	 * @generated
	 */
	EAttribute getYVisibilityProcessor_Delegate();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegateQualifiedName <em>Delegate Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor#getDelegateQualifiedName()
	 * @see #getYVisibilityProcessor()
	 * @generated
	 */
	EAttribute getYVisibilityProcessor_DelegateQualifiedName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties <em>YVisibility Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibility Properties</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties
	 * @generated
	 */
	EClass getYVisibilityProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isVisible()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEditable()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEnabled()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBorder()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBold()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isItalic()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isStrikethrough <em>Strikethrough</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikethrough</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isStrikethrough()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Strikethrough();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isUnderline()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Underline();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColor()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColor()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_ForegroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColorCode <em>Background Color Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Code</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColorCode()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_BackgroundColorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColorCode <em>Foreground Color Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Code</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColorCode()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_ForegroundColorCode();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.common.model.visibility.YColor <em>YColor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YColor</em>'.
	 * @see org.lunifera.ecview.core.common.model.visibility.YColor
	 * @generated
	 */
	EEnum getYColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisibilityFactory getVisibilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl <em>YVisibility Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl
		 * @see org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProcessor()
		 * @generated
		 */
		EClass YVISIBILITY_PROCESSOR = eINSTANCE.getYVisibilityProcessor();

		/**
		 * The meta object literal for the '<em><b>Data Used</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_PROCESSOR__DATA_USED = eINSTANCE.getYVisibilityProcessor_DataUsed();

		/**
		 * The meta object literal for the '<em><b>Triggers On</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_PROCESSOR__TRIGGERS_ON = eINSTANCE.getYVisibilityProcessor_TriggersOn();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROCESSOR__DELEGATE = eINSTANCE.getYVisibilityProcessor_Delegate();

		/**
		 * The meta object literal for the '<em><b>Delegate Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME = eINSTANCE.getYVisibilityProcessor_DelegateQualifiedName();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl <em>YVisibility Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl
		 * @see org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProperties()
		 * @generated
		 */
		EClass YVISIBILITY_PROPERTIES = eINSTANCE.getYVisibilityProperties();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__VISIBLE = eINSTANCE.getYVisibilityProperties_Visible();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__EDITABLE = eINSTANCE.getYVisibilityProperties_Editable();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__ENABLED = eINSTANCE.getYVisibilityProperties_Enabled();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__BORDER = eINSTANCE.getYVisibilityProperties_Border();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__BOLD = eINSTANCE.getYVisibilityProperties_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__ITALIC = eINSTANCE.getYVisibilityProperties_Italic();

		/**
		 * The meta object literal for the '<em><b>Strikethrough</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__STRIKETHROUGH = eINSTANCE.getYVisibilityProperties_Strikethrough();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__UNDERLINE = eINSTANCE.getYVisibilityProperties_Underline();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__BACKGROUND_COLOR = eINSTANCE.getYVisibilityProperties_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Foreground Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__FOREGROUND_COLOR = eINSTANCE.getYVisibilityProperties_ForegroundColor();

		/**
		 * The meta object literal for the '<em><b>Background Color Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE = eINSTANCE.getYVisibilityProperties_BackgroundColorCode();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE = eINSTANCE.getYVisibilityProperties_ForegroundColorCode();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.visibility.YColor <em>YColor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.visibility.YColor
		 * @see org.lunifera.ecview.core.common.model.visibility.impl.VisibilityPackageImpl#getYColor()
		 * @generated
		 */
		EEnum YCOLOR = eINSTANCE.getYColor();

	}

} //VisibilityPackage
