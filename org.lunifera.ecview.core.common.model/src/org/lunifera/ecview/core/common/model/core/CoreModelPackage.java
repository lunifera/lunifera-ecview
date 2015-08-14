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
package org.lunifera.ecview.core.common.model.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesPackage;

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
 * @see org.lunifera.ecview.core.common.model.core.CoreModelFactory
 * @model kind="package"
 * @generated
 */
public interface CoreModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/ecview/v1/core/view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreModelPackage eINSTANCE = org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YElement <em>YElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YElement
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYElement()
	 * @generated
	 */
	int YELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>YElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl <em>YString To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYStringToStringMap()
	 * @generated
	 */
	int YSTRING_TO_STRING_MAP = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>YString To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl <em>YEmbeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddable()
	 * @generated
	 */
	int YEMBEDDABLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__CSS_CLASS = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__CSS_ID = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__INITIAL_VISIBLE = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__VISIBLE = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__ORPHAN_DATATYPES = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>YEmbeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl <em>YLayout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYLayout()
	 * @generated
	 */
	int YLAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__ID = YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__NAME = YEMBEDDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__TAGS = YEMBEDDABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__PROPERTIES = YEMBEDDABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__CSS_CLASS = YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__CSS_ID = YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__INITIAL_VISIBLE = YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__VISIBLE = YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__ORPHAN_DATATYPES = YEMBEDDABLE__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__ORPHAN_DATADESCRIPTIONS = YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__INITIAL_EDITABLE = YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__EDITABLE = YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__INITIAL_ENABLED = YEMBEDDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__ENABLED = YEMBEDDABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__ELEMENTS = YEMBEDDABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YLayout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT_FEATURE_COUNT = YEMBEDDABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YFieldImpl <em>YField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YFieldImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYField()
	 * @generated
	 */
	int YFIELD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__ID = YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__NAME = YEMBEDDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__TAGS = YEMBEDDABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__PROPERTIES = YEMBEDDABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__CSS_CLASS = YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__CSS_ID = YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__INITIAL_VISIBLE = YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__VISIBLE = YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__ORPHAN_DATATYPES = YEMBEDDABLE__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__ORPHAN_DATADESCRIPTIONS = YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__INITIAL_EDITABLE = YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__EDITABLE = YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__INITIAL_ENABLED = YEMBEDDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__ENABLED = YEMBEDDABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__TAB_INDEX = YEMBEDDABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__VALIDATORS = YEMBEDDABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__INTERNAL_VALIDATORS = YEMBEDDABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__CONVERTER = YEMBEDDABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>YField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD_FEATURE_COUNT = YEMBEDDABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl <em>YView</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YViewImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYView()
	 * @generated
	 */
	int YVIEW = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CSS_CLASS = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CSS_ID = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__MARGIN = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__ROOT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__VIEW_NAME = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CONTENT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__BINDING_SET = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__BEAN_SLOTS = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Command Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__COMMAND_SET = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dialogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__DIALOGS = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__DEVICE_TYPE = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Content Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CONTENT_ALIGNMENT = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Visibility Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__VISIBILITY_PROCESSORS = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Transient Visibility Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__TRANSIENT_VISIBILITY_PROCESSORS = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Exposed Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__EXPOSED_ACTIONS = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Shared State Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__SHARED_STATE_GROUP = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CATEGORY = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Initial Focus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__INITIAL_FOCUS = YELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Current Focus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CURRENT_FOCUS = YELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>YView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YViewSetImpl <em>YView Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YViewSetImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYViewSet()
	 * @generated
	 */
	int YVIEW_SET = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__VIEWS = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__BEAN_SLOTS = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YView Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotImpl <em>YBean Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YBeanSlotImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBeanSlot()
	 * @generated
	 */
	int YBEAN_SLOT = 6;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YCssAble <em>YCss Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YCssAble
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCssAble()
	 * @generated
	 */
	int YCSS_ABLE = 9;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YMarginable <em>YMarginable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YMarginable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYMarginable()
	 * @generated
	 */
	int YMARGINABLE = 10;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YSpacingable <em>YSpacingable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YSpacingable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYSpacingable()
	 * @generated
	 */
	int YSPACINGABLE = 11;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YHeightable <em>YHeightable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YHeightable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYHeightable()
	 * @generated
	 */
	int YHEIGHTABLE = 12;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YWidthable <em>YWidthable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YWidthable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYWidthable()
	 * @generated
	 */
	int YWIDTHABLE = 13;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YActivateable <em>YActivateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YActivateable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYActivateable()
	 * @generated
	 */
	int YACTIVATEABLE = 14;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YVisibleable <em>YVisibleable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YVisibleable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYVisibleable()
	 * @generated
	 */
	int YVISIBLEABLE = 15;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YEditable <em>YEditable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YEditable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEditable()
	 * @generated
	 */
	int YEDITABLE = 16;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YEnable <em>YEnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YEnable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEnable()
	 * @generated
	 */
	int YENABLE = 17;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YActionImpl <em>YAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YActionImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYAction()
	 * @generated
	 */
	int YACTION = 19;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YBindable <em>YBindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YBindable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBindable()
	 * @generated
	 */
	int YBINDABLE = 20;

	/**
	 * The number of structural features of the '<em>YBindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT__NAME = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT__VALUE_TYPE = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME = YBINDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT__EVENT_TOPIC = YBINDABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Redirect Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT__REDIRECT_EVENTS = YBINDABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YBean Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YDialogImpl <em>YDialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YDialogImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDialog()
	 * @generated
	 */
	int YDIALOG = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__VALUE_BINDING_ENDPOINT = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__CSS_CLASS = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__CSS_ID = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__CONTENT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__MODAL = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resizeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__RESIZEABLE = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__DRAGGABLE = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Closable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__CLOSABLE = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__VALUE = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__TYPE = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__EMF_NS_URI = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__TYPE_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG__DATADESCRIPTION = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>YDialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDIALOG_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCSS_ABLE__CSS_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCSS_ABLE__CSS_ID = 1;

	/**
	 * The number of structural features of the '<em>YCss Able</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCSS_ABLE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMARGINABLE__MARGIN = 0;

	/**
	 * The number of structural features of the '<em>YMarginable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMARGINABLE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPACINGABLE__SPACING = 0;

	/**
	 * The number of structural features of the '<em>YSpacingable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPACINGABLE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHEIGHTABLE__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Height Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHEIGHTABLE__HEIGHT_UNIT = 1;

	/**
	 * The number of structural features of the '<em>YHeightable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHEIGHTABLE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWIDTHABLE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWIDTHABLE__WIDTH_UNIT = 1;

	/**
	 * The number of structural features of the '<em>YWidthable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWIDTHABLE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Initial Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATEABLE__INITIAL_ACTIVATED = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATEABLE__ACTIVATED = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YActivateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATEABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBLEABLE__INITIAL_VISIBLE = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBLEABLE__VISIBLE = 1;

	/**
	 * The number of structural features of the '<em>YVisibleable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBLEABLE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDITABLE__INITIAL_EDITABLE = 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDITABLE__EDITABLE = 1;

	/**
	 * The number of structural features of the '<em>YEditable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDITABLE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENABLE__INITIAL_ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENABLE__ENABLED = 1;

	/**
	 * The number of structural features of the '<em>YEnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YFocusable <em>YFocusable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YFocusable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYFocusable()
	 * @generated
	 */
	int YFOCUSABLE = 18;

	/**
	 * The feature id for the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFOCUSABLE__TAB_INDEX = 0;

	/**
	 * The number of structural features of the '<em>YFocusable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFOCUSABLE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__ID = YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__NAME = YEMBEDDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__TAGS = YEMBEDDABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__PROPERTIES = YEMBEDDABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__CSS_CLASS = YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__CSS_ID = YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__INITIAL_VISIBLE = YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__VISIBLE = YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__ORPHAN_DATATYPES = YEMBEDDABLE__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__ORPHAN_DATADESCRIPTIONS = YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__INITIAL_ENABLED = YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__ENABLED = YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION_FEATURE_COUNT = YEMBEDDABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YValueBindable <em>YValue Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YValueBindable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYValueBindable()
	 * @generated
	 */
	int YVALUE_BINDABLE = 21;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YValue Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YSelectionBindable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYSelectionBindable()
	 * @generated
	 */
	int YSELECTION_BINDABLE = 22;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YSelection Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSELECTION_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYMultiSelectionBindable()
	 * @generated
	 */
	int YMULTI_SELECTION_BINDABLE = 23;

	/**
	 * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMULTI_SELECTION_BINDABLE__MULTI_SELECTION_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMulti Selection Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMULTI_SELECTION_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YCollectionBindable
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCollectionBindable()
	 * @generated
	 */
	int YCOLLECTION_BINDABLE = 24;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YCollection Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLLECTION_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YContextValueBindingEndpointImpl <em>YContext Value Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YContextValueBindingEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYContextValueBindingEndpoint()
	 * @generated
	 */
	int YCONTEXT_VALUE_BINDING_ENDPOINT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_VALUE_BINDING_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_VALUE_BINDING_ENDPOINT__NAME = BindingPackage.YVALUE_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_VALUE_BINDING_ENDPOINT__TAGS = BindingPackage.YVALUE_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_VALUE_BINDING_ENDPOINT__PROPERTIES = BindingPackage.YVALUE_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YContext Value Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_VALUE_BINDING_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotValueBindingEndpointImpl <em>YBean Slot Value Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YBeanSlotValueBindingEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBeanSlotValueBindingEndpoint()
	 * @generated
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT__NAME = BindingPackage.YVALUE_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT__TAGS = BindingPackage.YVALUE_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT__PROPERTIES = BindingPackage.YVALUE_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT__ATTRIBUTE_PATH = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bean Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT__BEAN_SLOT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YBean Slot Value Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_VALUE_BINDING_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl <em>YBean Slot List Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBeanSlotListBindingEndpoint()
	 * @generated
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__ID = BindingPackage.YLIST_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__NAME = BindingPackage.YLIST_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__TAGS = BindingPackage.YLIST_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__PROPERTIES = BindingPackage.YLIST_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bean Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YBean Slot List Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_LIST_BINDING_ENDPOINT_FEATURE_COUNT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint <em>YEmbeddable Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableBindingEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_BINDING_ENDPOINT = 28;

	/**
	 * The number of structural features of the '<em>YEmbeddable Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_BINDING_ENDPOINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableValueEndpointImpl <em>YEmbeddable Value Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableValueEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableValueEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT__NAME = BindingPackage.YVALUE_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT__TAGS = BindingPackage.YVALUE_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT__PROPERTIES = BindingPackage.YVALUE_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Value Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableSelectionEndpointImpl <em>YEmbeddable Selection Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableSelectionEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableSelectionEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__NAME = BindingPackage.YVALUE_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__TAGS = BindingPackage.YVALUE_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__PROPERTIES = BindingPackage.YVALUE_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YEmbeddable Selection Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl <em>YEmbeddable Multi Selection Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableMultiSelectionEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ID = BindingPackage.YLIST_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__NAME = BindingPackage.YLIST_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__TAGS = BindingPackage.YLIST_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__PROPERTIES = BindingPackage.YLIST_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Multi Selection Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT_FEATURE_COUNT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableCollectionEndpointImpl <em>YEmbeddable Collection Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableCollectionEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableCollectionEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT__ID = BindingPackage.YLIST_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT__NAME = BindingPackage.YLIST_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT__TAGS = BindingPackage.YLIST_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT__PROPERTIES = BindingPackage.YLIST_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Collection Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT_FEATURE_COUNT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YActivatedEndpointImpl <em>YActivated Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YActivatedEndpointImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYActivatedEndpoint()
	 * @generated
	 */
	int YACTIVATED_ENDPOINT = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT__NAME = BindingPackage.YVALUE_BINDING_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT__TAGS = BindingPackage.YVALUE_BINDING_ENDPOINT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT__PROPERTIES = BindingPackage.YVALUE_BINDING_ENDPOINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT__ELEMENT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YActivated Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YDtWrapperImpl <em>YDt Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YDtWrapperImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDtWrapper()
	 * @generated
	 */
	int YDT_WRAPPER = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__TAGS = DatatypesPackage.YDATATYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__PROPERTIES = DatatypesPackage.YDATATYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YDt Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YCommand <em>YCommand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YCommand
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCommand()
	 * @generated
	 */
	int YCOMMAND = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>YCommand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YCommandSetImpl <em>YCommand Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YCommandSetImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCommandSet()
	 * @generated
	 */
	int YCOMMAND_SET = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_SET__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_SET__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_SET__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_SET__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_SET__COMMANDS = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transient Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_SET__TRANSIENT_COMMANDS = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YCommand Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMAND_SET_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YOpenDialogCommandImpl <em>YOpen Dialog Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YOpenDialogCommandImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYOpenDialogCommand()
	 * @generated
	 */
	int YOPEN_DIALOG_COMMAND = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPEN_DIALOG_COMMAND__ID = YCOMMAND__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPEN_DIALOG_COMMAND__NAME = YCOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPEN_DIALOG_COMMAND__TAGS = YCOMMAND__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPEN_DIALOG_COMMAND__PROPERTIES = YCOMMAND__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Dialog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPEN_DIALOG_COMMAND__DIALOG = YCOMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPEN_DIALOG_COMMAND__TRIGGER = YCOMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YOpen Dialog Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPEN_DIALOG_COMMAND_FEATURE_COUNT = YCOMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl <em>YExposed Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYExposedAction()
	 * @generated
	 */
	int YEXPOSED_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__INITIAL_ENABLED = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__ENABLED = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__ICON = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__LABEL = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__LABEL_I1_8N_KEY = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Click Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__EXTERNAL_CLICK_TIME = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Internal Click Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__INTERNAL_CLICK_TIME = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Executed Notification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__EXECUTED_NOTIFICATION_TIME = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Canceled Notification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__CANCELED_NOTIFICATION_TIME = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Check Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__CHECK_DIRTY = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>External Command Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION__EXTERNAL_COMMAND_ID = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>YExposed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEXPOSED_ACTION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl <em>YSend Event Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYSendEventCommand()
	 * @generated
	 */
	int YSEND_EVENT_COMMAND = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__ID = YCOMMAND__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__NAME = YCOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__TAGS = YCOMMAND__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__PROPERTIES = YCOMMAND__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__EVENT_TOPIC = YCOMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__MESSAGE = YCOMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__TRIGGER = YCOMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND__AUTO_TRIGGER = YCOMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YSend Event Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSEND_EVENT_COMMAND_FEATURE_COUNT = YCOMMAND_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl <em>YKey Stroke Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYKeyStrokeDefinition()
	 * @generated
	 */
	int YKEY_STROKE_DEFINITION = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YKEY_STROKE_DEFINITION__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YKEY_STROKE_DEFINITION__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YKEY_STROKE_DEFINITION__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YKEY_STROKE_DEFINITION__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Key Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YKEY_STROKE_DEFINITION__KEY_CODE = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifier Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YKEY_STROKE_DEFINITION__MODIFIER_KEYS = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YKey Stroke Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YKEY_STROKE_DEFINITION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YConverter <em>YConverter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YConverter
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYConverter()
	 * @generated
	 */
	int YCONVERTER = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONVERTER__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONVERTER__NAME = YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONVERTER__TAGS = YELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONVERTER__PROPERTIES = YELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>YConverter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONVERTER_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl <em>YDelegate Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDelegateConverter()
	 * @generated
	 */
	int YDELEGATE_CONVERTER = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDELEGATE_CONVERTER__ID = YCONVERTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDELEGATE_CONVERTER__NAME = YCONVERTER__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDELEGATE_CONVERTER__TAGS = YCONVERTER__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDELEGATE_CONVERTER__PROPERTIES = YCONVERTER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Converter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDELEGATE_CONVERTER__CONVERTER_ID = YCONVERTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YDelegate Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDELEGATE_CONVERTER_FEATURE_COUNT = YCONVERTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YDeviceType <em>YDevice Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YDeviceType
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDeviceType()
	 * @generated
	 */
	int YDEVICE_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YAlignment <em>YAlignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YAlignment
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYAlignment()
	 * @generated
	 */
	int YALIGNMENT = 44;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YFlatAlignment <em>YFlat Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YFlatAlignment
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYFlatAlignment()
	 * @generated
	 */
	int YFLAT_ALIGNMENT = 45;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YUnit <em>YUnit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YUnit
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYUnit()
	 * @generated
	 */
	int YUNIT = 46;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YKeyCode <em>YKey Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YKeyCode
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYKeyCode()
	 * @generated
	 */
	int YKEY_CODE = 47;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.common.model.core.YModifierKey <em>YModifier Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.YModifierKey
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYModifierKey()
	 * @generated
	 */
	int YMODIFIER_KEY = 48;

	/**
	 * The meta object id for the '<em>YURI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYURI()
	 * @generated
	 */
	int YURI = 49;


	/**
	 * The meta object id for the '<em>YValue Change Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.common.model.core.listeners.YValueChangeListener
	 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYValueChangeListener()
	 * @generated
	 */
	int YVALUE_CHANGE_LISTENER = 50;


	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YElement</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YElement
	 * @generated
	 */
	EClass getYElement();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YElement#getId()
	 * @see #getYElement()
	 * @generated
	 */
	EAttribute getYElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YElement#getName()
	 * @see #getYElement()
	 * @generated
	 */
	EAttribute getYElement_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.common.model.core.YElement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YElement#getTags()
	 * @see #getYElement()
	 * @generated
	 */
	EAttribute getYElement_Tags();

	/**
	 * Returns the meta object for the map '{@link org.lunifera.ecview.core.common.model.core.YElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YElement#getProperties()
	 * @see #getYElement()
	 * @generated
	 */
	EReference getYElement_Properties();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>YString To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YString To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyId="true" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getYStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getYStringToStringMap()
	 * @generated
	 */
	EAttribute getYStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getYStringToStringMap()
	 * @generated
	 */
	EAttribute getYStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YLayout <em>YLayout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLayout</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YLayout
	 * @generated
	 */
	EClass getYLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YLayout#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YLayout#getElements()
	 * @see #getYLayout()
	 * @generated
	 */
	EReference getYLayout_Elements();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YField <em>YField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YField</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YField
	 * @generated
	 */
	EClass getYField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YField#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validators</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YField#getValidators()
	 * @see #getYField()
	 * @generated
	 */
	EReference getYField_Validators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YField#getInternalValidators <em>Internal Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Validators</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YField#getInternalValidators()
	 * @see #getYField()
	 * @generated
	 */
	EReference getYField_InternalValidators();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.common.model.core.YField#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Converter</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YField#getConverter()
	 * @see #getYField()
	 * @generated
	 */
	EReference getYField_Converter();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YView <em>YView</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YView</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView
	 * @generated
	 */
	EClass getYView();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YView#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getRoot()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_Root();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YView#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getViewName()
	 * @see #getYView()
	 * @generated
	 */
	EAttribute getYView_ViewName();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.common.model.core.YView#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getContent()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_Content();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.common.model.core.YView#getBindingSet <em>Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Set</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getBindingSet()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_BindingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YView#getBeanSlots <em>Bean Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Slots</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getBeanSlots()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_BeanSlots();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.common.model.core.YView#getCommandSet <em>Command Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command Set</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getCommandSet()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_CommandSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YView#getDialogs <em>Dialogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dialogs</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getDialogs()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_Dialogs();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YView#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getDeviceType()
	 * @see #getYView()
	 * @generated
	 */
	EAttribute getYView_DeviceType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YView#getContentAlignment <em>Content Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Alignment</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getContentAlignment()
	 * @see #getYView()
	 * @generated
	 */
	EAttribute getYView_ContentAlignment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YView#getVisibilityProcessors <em>Visibility Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visibility Processors</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getVisibilityProcessors()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_VisibilityProcessors();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.ecview.core.common.model.core.YView#getTransientVisibilityProcessors <em>Transient Visibility Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transient Visibility Processors</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getTransientVisibilityProcessors()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_TransientVisibilityProcessors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YView#getExposedActions <em>Exposed Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exposed Actions</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getExposedActions()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_ExposedActions();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YView#getSharedStateGroup <em>Shared State Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared State Group</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getSharedStateGroup()
	 * @see #getYView()
	 * @generated
	 */
	EAttribute getYView_SharedStateGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YView#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getCategory()
	 * @see #getYView()
	 * @generated
	 */
	EAttribute getYView_Category();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YView#getInitialFocus <em>Initial Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Focus</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getInitialFocus()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_InitialFocus();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YView#getCurrentFocus <em>Current Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Focus</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YView#getCurrentFocus()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_CurrentFocus();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YViewSet <em>YView Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YView Set</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YViewSet
	 * @generated
	 */
	EClass getYViewSet();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.ecview.core.common.model.core.YViewSet#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YViewSet#getViews()
	 * @see #getYViewSet()
	 * @generated
	 */
	EReference getYViewSet_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YViewSet#getBeanSlots <em>Bean Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Slots</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YViewSet#getBeanSlots()
	 * @see #getYViewSet()
	 * @generated
	 */
	EReference getYViewSet_BeanSlots();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot <em>YBean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBean Slot</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlot
	 * @generated
	 */
	EClass getYBeanSlot();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlot#getName()
	 * @see #getYBeanSlot()
	 * @generated
	 */
	EAttribute getYBeanSlot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueType()
	 * @see #getYBeanSlot()
	 * @generated
	 */
	EAttribute getYBeanSlot_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueTypeQualifiedName <em>Value Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlot#getValueTypeQualifiedName()
	 * @see #getYBeanSlot()
	 * @generated
	 */
	EAttribute getYBeanSlot_ValueTypeQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#getEventTopic <em>Event Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Topic</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlot#getEventTopic()
	 * @see #getYBeanSlot()
	 * @generated
	 */
	EAttribute getYBeanSlot_EventTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot#isRedirectEvents <em>Redirect Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirect Events</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlot#isRedirectEvents()
	 * @see #getYBeanSlot()
	 * @generated
	 */
	EAttribute getYBeanSlot_RedirectEvents();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddable <em>YEmbeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddable
	 * @generated
	 */
	EClass getYEmbeddable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YEmbeddable#getOrphanDatatypes <em>Orphan Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orphan Datatypes</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddable#getOrphanDatatypes()
	 * @see #getYEmbeddable()
	 * @generated
	 */
	EReference getYEmbeddable_OrphanDatatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YEmbeddable#getOrphanDatadescriptions <em>Orphan Datadescriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orphan Datadescriptions</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddable#getOrphanDatadescriptions()
	 * @see #getYEmbeddable()
	 * @generated
	 */
	EReference getYEmbeddable_OrphanDatadescriptions();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YDialog <em>YDialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDialog</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog
	 * @generated
	 */
	EClass getYDialog();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.common.model.core.YDialog#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#getContent()
	 * @see #getYDialog()
	 * @generated
	 */
	EReference getYDialog_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#isModal <em>Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modal</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#isModal()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_Modal();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#isResizeable <em>Resizeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resizeable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#isResizeable()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_Resizeable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#isDraggable <em>Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draggable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#isDraggable()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_Draggable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#isClosable <em>Closable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#isClosable()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_Closable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#getValue()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#getType()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#getEmfNsURI()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_EmfNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDialog#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#getTypeQualifiedName()
	 * @see #getYDialog()
	 * @generated
	 */
	EAttribute getYDialog_TypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.common.model.core.YDialog#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog#getDatadescription()
	 * @see #getYDialog()
	 * @generated
	 */
	EReference getYDialog_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YCssAble <em>YCss Able</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCss Able</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCssAble
	 * @generated
	 */
	EClass getYCssAble();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YCssAble#getCssClass <em>Css Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css Class</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCssAble#getCssClass()
	 * @see #getYCssAble()
	 * @generated
	 */
	EAttribute getYCssAble_CssClass();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YCssAble#getCssID <em>Css ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css ID</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCssAble#getCssID()
	 * @see #getYCssAble()
	 * @generated
	 */
	EAttribute getYCssAble_CssID();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YMarginable <em>YMarginable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMarginable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YMarginable
	 * @generated
	 */
	EClass getYMarginable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YMarginable#isMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YMarginable#isMargin()
	 * @see #getYMarginable()
	 * @generated
	 */
	EAttribute getYMarginable_Margin();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YSpacingable <em>YSpacingable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSpacingable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSpacingable
	 * @generated
	 */
	EClass getYSpacingable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YSpacingable#isSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSpacingable#isSpacing()
	 * @see #getYSpacingable()
	 * @generated
	 */
	EAttribute getYSpacingable_Spacing();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YHeightable <em>YHeightable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YHeightable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YHeightable
	 * @generated
	 */
	EClass getYHeightable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YHeightable#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YHeightable#getHeight()
	 * @see #getYHeightable()
	 * @generated
	 */
	EAttribute getYHeightable_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YHeightable#getHeightUnit <em>Height Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Unit</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YHeightable#getHeightUnit()
	 * @see #getYHeightable()
	 * @generated
	 */
	EAttribute getYHeightable_HeightUnit();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YWidthable <em>YWidthable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YWidthable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YWidthable
	 * @generated
	 */
	EClass getYWidthable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YWidthable#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YWidthable#getWidth()
	 * @see #getYWidthable()
	 * @generated
	 */
	EAttribute getYWidthable_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YWidthable#getWidthUnit <em>Width Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Unit</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YWidthable#getWidthUnit()
	 * @see #getYWidthable()
	 * @generated
	 */
	EAttribute getYWidthable_WidthUnit();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YActivateable <em>YActivateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YActivateable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YActivateable
	 * @generated
	 */
	EClass getYActivateable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YActivateable#isInitialActivated <em>Initial Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Activated</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YActivateable#isInitialActivated()
	 * @see #getYActivateable()
	 * @generated
	 */
	EAttribute getYActivateable_InitialActivated();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YActivateable#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YActivateable#isActivated()
	 * @see #getYActivateable()
	 * @generated
	 */
	EAttribute getYActivateable_Activated();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YVisibleable <em>YVisibleable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibleable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YVisibleable
	 * @generated
	 */
	EClass getYVisibleable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YVisibleable#isInitialVisible <em>Initial Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Visible</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YVisibleable#isInitialVisible()
	 * @see #getYVisibleable()
	 * @generated
	 */
	EAttribute getYVisibleable_InitialVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YVisibleable#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YVisibleable#isVisible()
	 * @see #getYVisibleable()
	 * @generated
	 */
	EAttribute getYVisibleable_Visible();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEditable <em>YEditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEditable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEditable
	 * @generated
	 */
	EClass getYEditable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YEditable#isInitialEditable <em>Initial Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Editable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEditable#isInitialEditable()
	 * @see #getYEditable()
	 * @generated
	 */
	EAttribute getYEditable_InitialEditable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YEditable#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEditable#isEditable()
	 * @see #getYEditable()
	 * @generated
	 */
	EAttribute getYEditable_Editable();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEnable <em>YEnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEnable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEnable
	 * @generated
	 */
	EClass getYEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YEnable#isInitialEnabled <em>Initial Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Enabled</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEnable#isInitialEnabled()
	 * @see #getYEnable()
	 * @generated
	 */
	EAttribute getYEnable_InitialEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YEnable#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEnable#isEnabled()
	 * @see #getYEnable()
	 * @generated
	 */
	EAttribute getYEnable_Enabled();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YFocusable <em>YFocusable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YFocusable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YFocusable
	 * @generated
	 */
	EClass getYFocusable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YFocusable#getTabIndex <em>Tab Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Index</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YFocusable#getTabIndex()
	 * @see #getYFocusable()
	 * @generated
	 */
	EAttribute getYFocusable_TabIndex();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YAction <em>YAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YAction</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YAction
	 * @generated
	 */
	EClass getYAction();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YBindable <em>YBindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBindable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBindable
	 * @generated
	 */
	EClass getYBindable();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YValueBindable <em>YValue Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValue Bindable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YValueBindable
	 * @generated
	 */
	EClass getYValueBindable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YValueBindable#getValueBindingEndpoint <em>Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YValueBindable#getValueBindingEndpoint()
	 * @see #getYValueBindable()
	 * @generated
	 */
	EReference getYValueBindable_ValueBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSelection Bindable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSelectionBindable
	 * @generated
	 */
	EClass getYSelectionBindable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YSelectionBindable#getSelectionBindingEndpoint <em>Selection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSelectionBindable#getSelectionBindingEndpoint()
	 * @see #getYSelectionBindable()
	 * @generated
	 */
	EReference getYSelectionBindable_SelectionBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMulti Selection Bindable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable
	 * @generated
	 */
	EClass getYMultiSelectionBindable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint <em>Multi Selection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Selection Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint()
	 * @see #getYMultiSelectionBindable()
	 * @generated
	 */
	EReference getYMultiSelectionBindable_MultiSelectionBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCollection Bindable</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCollectionBindable
	 * @generated
	 */
	EClass getYCollectionBindable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YCollectionBindable#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCollectionBindable#getCollectionBindingEndpoint()
	 * @see #getYCollectionBindable()
	 * @generated
	 */
	EReference getYCollectionBindable_CollectionBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint <em>YContext Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YContext Value Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint
	 * @generated
	 */
	EClass getYContextValueBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint#getUrlString <em>Url String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url String</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint#getUrlString()
	 * @see #getYContextValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYContextValueBindingEndpoint_UrlString();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint <em>YBean Slot Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBean Slot Value Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint
	 * @generated
	 */
	EClass getYBeanSlotValueBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getAttributePath <em>Attribute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Path</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getAttributePath()
	 * @see #getYBeanSlotValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanSlotValueBindingEndpoint_AttributePath();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getBeanSlot <em>Bean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bean Slot</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint#getBeanSlot()
	 * @see #getYBeanSlotValueBindingEndpoint()
	 * @generated
	 */
	EReference getYBeanSlotValueBindingEndpoint_BeanSlot();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint <em>YBean Slot List Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBean Slot List Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint
	 * @generated
	 */
	EClass getYBeanSlotListBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getAttributePath <em>Attribute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Path</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getAttributePath()
	 * @see #getYBeanSlotListBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanSlotListBindingEndpoint_AttributePath();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getBeanSlot <em>Bean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bean Slot</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getBeanSlot()
	 * @see #getYBeanSlotListBindingEndpoint()
	 * @generated
	 */
	EReference getYBeanSlotListBindingEndpoint_BeanSlot();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getCollectionType()
	 * @see #getYBeanSlotListBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanSlotListBindingEndpoint_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getCollectionTypeQualifiedName <em>Collection Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint#getCollectionTypeQualifiedName()
	 * @see #getYBeanSlotListBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanSlotListBindingEndpoint_CollectionTypeQualifiedName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint <em>YEmbeddable Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint
	 * @generated
	 */
	EClass getYEmbeddableBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint <em>YEmbeddable Value Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Value Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint
	 * @generated
	 */
	EClass getYEmbeddableValueEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint#getElement()
	 * @see #getYEmbeddableValueEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableValueEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint <em>YEmbeddable Selection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Selection Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint
	 * @generated
	 */
	EClass getYEmbeddableSelectionEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint#getElement()
	 * @see #getYEmbeddableSelectionEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableSelectionEndpoint_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint#getAttributePath <em>Attribute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Path</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint#getAttributePath()
	 * @see #getYEmbeddableSelectionEndpoint()
	 * @generated
	 */
	EAttribute getYEmbeddableSelectionEndpoint_AttributePath();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint <em>YEmbeddable Multi Selection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint
	 * @generated
	 */
	EClass getYEmbeddableMultiSelectionEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement()
	 * @see #getYEmbeddableMultiSelectionEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableMultiSelectionEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint <em>YEmbeddable Collection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Collection Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint
	 * @generated
	 */
	EClass getYEmbeddableCollectionEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint#getElement()
	 * @see #getYEmbeddableCollectionEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableCollectionEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YActivatedEndpoint <em>YActivated Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YActivated Endpoint</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YActivatedEndpoint
	 * @generated
	 */
	EClass getYActivatedEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YActivatedEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YActivatedEndpoint#getElement()
	 * @see #getYActivatedEndpoint()
	 * @generated
	 */
	EReference getYActivatedEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YDtWrapper <em>YDt Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDt Wrapper</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDtWrapper
	 * @generated
	 */
	EClass getYDtWrapper();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YCommand <em>YCommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCommand</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCommand
	 * @generated
	 */
	EClass getYCommand();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YCommandSet <em>YCommand Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCommand Set</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCommandSet
	 * @generated
	 */
	EClass getYCommandSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.common.model.core.YCommandSet#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCommandSet#getCommands()
	 * @see #getYCommandSet()
	 * @generated
	 */
	EReference getYCommandSet_Commands();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.ecview.core.common.model.core.YCommandSet#getTransientCommands <em>Transient Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transient Commands</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YCommandSet#getTransientCommands()
	 * @see #getYCommandSet()
	 * @generated
	 */
	EReference getYCommandSet_TransientCommands();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand <em>YOpen Dialog Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YOpen Dialog Command</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YOpenDialogCommand
	 * @generated
	 */
	EClass getYOpenDialogCommand();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getDialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dialog</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getDialog()
	 * @see #getYOpenDialogCommand()
	 * @generated
	 */
	EReference getYOpenDialogCommand_Dialog();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YOpenDialogCommand#getTrigger()
	 * @see #getYOpenDialogCommand()
	 * @generated
	 */
	EAttribute getYOpenDialogCommand_Trigger();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YExposedAction <em>YExposed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YExposed Action</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction
	 * @generated
	 */
	EClass getYExposedAction();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getIcon()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getLabel()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getLabelI18nKey <em>Label I1 8n Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label I1 8n Key</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getLabelI18nKey()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_LabelI18nKey();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getExternalClickTime <em>External Click Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Click Time</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getExternalClickTime()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_ExternalClickTime();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getInternalClickTime <em>Internal Click Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Click Time</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getInternalClickTime()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_InternalClickTime();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getExecutedNotificationTime <em>Executed Notification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed Notification Time</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getExecutedNotificationTime()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_ExecutedNotificationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getCanceledNotificationTime <em>Canceled Notification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canceled Notification Time</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getCanceledNotificationTime()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_CanceledNotificationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#isCheckDirty <em>Check Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Dirty</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#isCheckDirty()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_CheckDirty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YExposedAction#getExternalCommandId <em>External Command Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Command Id</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction#getExternalCommandId()
	 * @see #getYExposedAction()
	 * @generated
	 */
	EAttribute getYExposedAction_ExternalCommandId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand <em>YSend Event Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSend Event Command</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSendEventCommand
	 * @generated
	 */
	EClass getYSendEventCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getEventTopic <em>Event Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Topic</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSendEventCommand#getEventTopic()
	 * @see #getYSendEventCommand()
	 * @generated
	 */
	EAttribute getYSendEventCommand_EventTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSendEventCommand#getMessage()
	 * @see #getYSendEventCommand()
	 * @generated
	 */
	EAttribute getYSendEventCommand_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSendEventCommand#getTrigger()
	 * @see #getYSendEventCommand()
	 * @generated
	 */
	EAttribute getYSendEventCommand_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand#isAutoTrigger <em>Auto Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Trigger</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YSendEventCommand#isAutoTrigger()
	 * @see #getYSendEventCommand()
	 * @generated
	 */
	EAttribute getYSendEventCommand_AutoTrigger();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition <em>YKey Stroke Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YKey Stroke Definition</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition
	 * @generated
	 */
	EClass getYKeyStrokeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition#getKeyCode <em>Key Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Code</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition#getKeyCode()
	 * @see #getYKeyStrokeDefinition()
	 * @generated
	 */
	EAttribute getYKeyStrokeDefinition_KeyCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition#getModifierKeys <em>Modifier Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifier Keys</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition#getModifierKeys()
	 * @see #getYKeyStrokeDefinition()
	 * @generated
	 */
	EAttribute getYKeyStrokeDefinition_ModifierKeys();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YConverter <em>YConverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YConverter</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YConverter
	 * @generated
	 */
	EClass getYConverter();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.common.model.core.YDelegateConverter <em>YDelegate Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDelegate Converter</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDelegateConverter
	 * @generated
	 */
	EClass getYDelegateConverter();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.common.model.core.YDelegateConverter#getConverterId <em>Converter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter Id</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDelegateConverter#getConverterId()
	 * @see #getYDelegateConverter()
	 * @generated
	 */
	EAttribute getYDelegateConverter_ConverterId();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.common.model.core.YDeviceType <em>YDevice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YDevice Type</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YDeviceType
	 * @generated
	 */
	EEnum getYDeviceType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.common.model.core.YAlignment <em>YAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YAlignment</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YAlignment
	 * @generated
	 */
	EEnum getYAlignment();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.common.model.core.YFlatAlignment <em>YFlat Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YFlat Alignment</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YFlatAlignment
	 * @generated
	 */
	EEnum getYFlatAlignment();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.common.model.core.YUnit <em>YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YUnit</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YUnit
	 * @generated
	 */
	EEnum getYUnit();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.common.model.core.YKeyCode <em>YKey Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YKey Code</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YKeyCode
	 * @generated
	 */
	EEnum getYKeyCode();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.common.model.core.YModifierKey <em>YModifier Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YModifier Key</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.YModifierKey
	 * @generated
	 */
	EEnum getYModifierKey();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>YURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YURI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getYURI();

	/**
	 * Returns the meta object for data type '{@link org.lunifera.ecview.core.common.model.core.listeners.YValueChangeListener <em>YValue Change Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YValue Change Listener</em>'.
	 * @see org.lunifera.ecview.core.common.model.core.listeners.YValueChangeListener
	 * @model instanceClass="org.lunifera.ecview.core.common.model.core.listeners.YValueChangeListener"
	 * @generated
	 */
	EDataType getYValueChangeListener();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreModelFactory getCoreModelFactory();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YElement <em>YElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YElement
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYElement()
		 * @generated
		 */
		EClass YELEMENT = eINSTANCE.getYElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YELEMENT__ID = eINSTANCE.getYElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YELEMENT__NAME = eINSTANCE.getYElement_Name();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YELEMENT__TAGS = eINSTANCE.getYElement_Tags();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YELEMENT__PROPERTIES = eINSTANCE.getYElement_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl <em>YString To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYStringToStringMap()
		 * @generated
		 */
		EClass YSTRING_TO_STRING_MAP = eINSTANCE.getYStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTRING_TO_STRING_MAP__KEY = eINSTANCE.getYStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTRING_TO_STRING_MAP__VALUE = eINSTANCE.getYStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl <em>YLayout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYLayout()
		 * @generated
		 */
		EClass YLAYOUT = eINSTANCE.getYLayout();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLAYOUT__ELEMENTS = eINSTANCE.getYLayout_Elements();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YFieldImpl <em>YField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YFieldImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYField()
		 * @generated
		 */
		EClass YFIELD = eINSTANCE.getYField();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFIELD__VALIDATORS = eINSTANCE.getYField_Validators();

		/**
		 * The meta object literal for the '<em><b>Internal Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFIELD__INTERNAL_VALIDATORS = eINSTANCE.getYField_InternalValidators();

		/**
		 * The meta object literal for the '<em><b>Converter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFIELD__CONVERTER = eINSTANCE.getYField_Converter();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YViewImpl <em>YView</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YViewImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYView()
		 * @generated
		 */
		EClass YVIEW = eINSTANCE.getYView();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__ROOT = eINSTANCE.getYView_Root();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVIEW__VIEW_NAME = eINSTANCE.getYView_ViewName();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__CONTENT = eINSTANCE.getYView_Content();

		/**
		 * The meta object literal for the '<em><b>Binding Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__BINDING_SET = eINSTANCE.getYView_BindingSet();

		/**
		 * The meta object literal for the '<em><b>Bean Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__BEAN_SLOTS = eINSTANCE.getYView_BeanSlots();

		/**
		 * The meta object literal for the '<em><b>Command Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__COMMAND_SET = eINSTANCE.getYView_CommandSet();

		/**
		 * The meta object literal for the '<em><b>Dialogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__DIALOGS = eINSTANCE.getYView_Dialogs();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVIEW__DEVICE_TYPE = eINSTANCE.getYView_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Content Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVIEW__CONTENT_ALIGNMENT = eINSTANCE.getYView_ContentAlignment();

		/**
		 * The meta object literal for the '<em><b>Visibility Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__VISIBILITY_PROCESSORS = eINSTANCE.getYView_VisibilityProcessors();

		/**
		 * The meta object literal for the '<em><b>Transient Visibility Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__TRANSIENT_VISIBILITY_PROCESSORS = eINSTANCE.getYView_TransientVisibilityProcessors();

		/**
		 * The meta object literal for the '<em><b>Exposed Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__EXPOSED_ACTIONS = eINSTANCE.getYView_ExposedActions();

		/**
		 * The meta object literal for the '<em><b>Shared State Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVIEW__SHARED_STATE_GROUP = eINSTANCE.getYView_SharedStateGroup();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVIEW__CATEGORY = eINSTANCE.getYView_Category();

		/**
		 * The meta object literal for the '<em><b>Initial Focus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__INITIAL_FOCUS = eINSTANCE.getYView_InitialFocus();

		/**
		 * The meta object literal for the '<em><b>Current Focus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__CURRENT_FOCUS = eINSTANCE.getYView_CurrentFocus();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YViewSetImpl <em>YView Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YViewSetImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYViewSet()
		 * @generated
		 */
		EClass YVIEW_SET = eINSTANCE.getYViewSet();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW_SET__VIEWS = eINSTANCE.getYViewSet_Views();

		/**
		 * The meta object literal for the '<em><b>Bean Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW_SET__BEAN_SLOTS = eINSTANCE.getYViewSet_BeanSlots();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotImpl <em>YBean Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YBeanSlotImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBeanSlot()
		 * @generated
		 */
		EClass YBEAN_SLOT = eINSTANCE.getYBeanSlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT__NAME = eINSTANCE.getYBeanSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT__VALUE_TYPE = eINSTANCE.getYBeanSlot_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME = eINSTANCE.getYBeanSlot_ValueTypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Event Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT__EVENT_TOPIC = eINSTANCE.getYBeanSlot_EventTopic();

		/**
		 * The meta object literal for the '<em><b>Redirect Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT__REDIRECT_EVENTS = eINSTANCE.getYBeanSlot_RedirectEvents();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl <em>YEmbeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddable()
		 * @generated
		 */
		EClass YEMBEDDABLE = eINSTANCE.getYEmbeddable();

		/**
		 * The meta object literal for the '<em><b>Orphan Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE__ORPHAN_DATATYPES = eINSTANCE.getYEmbeddable_OrphanDatatypes();

		/**
		 * The meta object literal for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS = eINSTANCE.getYEmbeddable_OrphanDatadescriptions();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YDialogImpl <em>YDialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YDialogImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDialog()
		 * @generated
		 */
		EClass YDIALOG = eINSTANCE.getYDialog();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDIALOG__CONTENT = eINSTANCE.getYDialog_Content();

		/**
		 * The meta object literal for the '<em><b>Modal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__MODAL = eINSTANCE.getYDialog_Modal();

		/**
		 * The meta object literal for the '<em><b>Resizeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__RESIZEABLE = eINSTANCE.getYDialog_Resizeable();

		/**
		 * The meta object literal for the '<em><b>Draggable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__DRAGGABLE = eINSTANCE.getYDialog_Draggable();

		/**
		 * The meta object literal for the '<em><b>Closable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__CLOSABLE = eINSTANCE.getYDialog_Closable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__VALUE = eINSTANCE.getYDialog_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__TYPE = eINSTANCE.getYDialog_Type();

		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__EMF_NS_URI = eINSTANCE.getYDialog_EmfNsURI();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDIALOG__TYPE_QUALIFIED_NAME = eINSTANCE.getYDialog_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDIALOG__DATADESCRIPTION = eINSTANCE.getYDialog_Datadescription();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YCssAble <em>YCss Able</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YCssAble
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCssAble()
		 * @generated
		 */
		EClass YCSS_ABLE = eINSTANCE.getYCssAble();

		/**
		 * The meta object literal for the '<em><b>Css Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCSS_ABLE__CSS_CLASS = eINSTANCE.getYCssAble_CssClass();

		/**
		 * The meta object literal for the '<em><b>Css ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCSS_ABLE__CSS_ID = eINSTANCE.getYCssAble_CssID();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YMarginable <em>YMarginable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YMarginable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYMarginable()
		 * @generated
		 */
		EClass YMARGINABLE = eINSTANCE.getYMarginable();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMARGINABLE__MARGIN = eINSTANCE.getYMarginable_Margin();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YSpacingable <em>YSpacingable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YSpacingable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYSpacingable()
		 * @generated
		 */
		EClass YSPACINGABLE = eINSTANCE.getYSpacingable();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPACINGABLE__SPACING = eINSTANCE.getYSpacingable_Spacing();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YHeightable <em>YHeightable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YHeightable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYHeightable()
		 * @generated
		 */
		EClass YHEIGHTABLE = eINSTANCE.getYHeightable();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHEIGHTABLE__HEIGHT = eINSTANCE.getYHeightable_Height();

		/**
		 * The meta object literal for the '<em><b>Height Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHEIGHTABLE__HEIGHT_UNIT = eINSTANCE.getYHeightable_HeightUnit();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YWidthable <em>YWidthable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YWidthable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYWidthable()
		 * @generated
		 */
		EClass YWIDTHABLE = eINSTANCE.getYWidthable();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YWIDTHABLE__WIDTH = eINSTANCE.getYWidthable_Width();

		/**
		 * The meta object literal for the '<em><b>Width Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YWIDTHABLE__WIDTH_UNIT = eINSTANCE.getYWidthable_WidthUnit();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YActivateable <em>YActivateable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YActivateable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYActivateable()
		 * @generated
		 */
		EClass YACTIVATEABLE = eINSTANCE.getYActivateable();

		/**
		 * The meta object literal for the '<em><b>Initial Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YACTIVATEABLE__INITIAL_ACTIVATED = eINSTANCE.getYActivateable_InitialActivated();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YACTIVATEABLE__ACTIVATED = eINSTANCE.getYActivateable_Activated();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YVisibleable <em>YVisibleable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YVisibleable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYVisibleable()
		 * @generated
		 */
		EClass YVISIBLEABLE = eINSTANCE.getYVisibleable();

		/**
		 * The meta object literal for the '<em><b>Initial Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBLEABLE__INITIAL_VISIBLE = eINSTANCE.getYVisibleable_InitialVisible();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBLEABLE__VISIBLE = eINSTANCE.getYVisibleable_Visible();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YEditable <em>YEditable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YEditable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEditable()
		 * @generated
		 */
		EClass YEDITABLE = eINSTANCE.getYEditable();

		/**
		 * The meta object literal for the '<em><b>Initial Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEDITABLE__INITIAL_EDITABLE = eINSTANCE.getYEditable_InitialEditable();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEDITABLE__EDITABLE = eINSTANCE.getYEditable_Editable();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YEnable <em>YEnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YEnable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEnable()
		 * @generated
		 */
		EClass YENABLE = eINSTANCE.getYEnable();

		/**
		 * The meta object literal for the '<em><b>Initial Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENABLE__INITIAL_ENABLED = eINSTANCE.getYEnable_InitialEnabled();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENABLE__ENABLED = eINSTANCE.getYEnable_Enabled();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YFocusable <em>YFocusable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YFocusable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYFocusable()
		 * @generated
		 */
		EClass YFOCUSABLE = eINSTANCE.getYFocusable();

		/**
		 * The meta object literal for the '<em><b>Tab Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YFOCUSABLE__TAB_INDEX = eINSTANCE.getYFocusable_TabIndex();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YActionImpl <em>YAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YActionImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYAction()
		 * @generated
		 */
		EClass YACTION = eINSTANCE.getYAction();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YBindable <em>YBindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YBindable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBindable()
		 * @generated
		 */
		EClass YBINDABLE = eINSTANCE.getYBindable();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YValueBindable <em>YValue Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YValueBindable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYValueBindable()
		 * @generated
		 */
		EClass YVALUE_BINDABLE = eINSTANCE.getYValueBindable();

		/**
		 * The meta object literal for the '<em><b>Value Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT = eINSTANCE.getYValueBindable_ValueBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YSelectionBindable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYSelectionBindable()
		 * @generated
		 */
		EClass YSELECTION_BINDABLE = eINSTANCE.getYSelectionBindable();

		/**
		 * The meta object literal for the '<em><b>Selection Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT = eINSTANCE.getYSelectionBindable_SelectionBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYMultiSelectionBindable()
		 * @generated
		 */
		EClass YMULTI_SELECTION_BINDABLE = eINSTANCE.getYMultiSelectionBindable();

		/**
		 * The meta object literal for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMULTI_SELECTION_BINDABLE__MULTI_SELECTION_BINDING_ENDPOINT = eINSTANCE.getYMultiSelectionBindable_MultiSelectionBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YCollectionBindable
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCollectionBindable()
		 * @generated
		 */
		EClass YCOLLECTION_BINDABLE = eINSTANCE.getYCollectionBindable();

		/**
		 * The meta object literal for the '<em><b>Collection Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT = eINSTANCE.getYCollectionBindable_CollectionBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YContextValueBindingEndpointImpl <em>YContext Value Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YContextValueBindingEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYContextValueBindingEndpoint()
		 * @generated
		 */
		EClass YCONTEXT_VALUE_BINDING_ENDPOINT = eINSTANCE.getYContextValueBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Url String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING = eINSTANCE.getYContextValueBindingEndpoint_UrlString();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotValueBindingEndpointImpl <em>YBean Slot Value Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YBeanSlotValueBindingEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBeanSlotValueBindingEndpoint()
		 * @generated
		 */
		EClass YBEAN_SLOT_VALUE_BINDING_ENDPOINT = eINSTANCE.getYBeanSlotValueBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Attribute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT_VALUE_BINDING_ENDPOINT__ATTRIBUTE_PATH = eINSTANCE.getYBeanSlotValueBindingEndpoint_AttributePath();

		/**
		 * The meta object literal for the '<em><b>Bean Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBEAN_SLOT_VALUE_BINDING_ENDPOINT__BEAN_SLOT = eINSTANCE.getYBeanSlotValueBindingEndpoint_BeanSlot();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl <em>YBean Slot List Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYBeanSlotListBindingEndpoint()
		 * @generated
		 */
		EClass YBEAN_SLOT_LIST_BINDING_ENDPOINT = eINSTANCE.getYBeanSlotListBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Attribute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH = eINSTANCE.getYBeanSlotListBindingEndpoint_AttributePath();

		/**
		 * The meta object literal for the '<em><b>Bean Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT = eINSTANCE.getYBeanSlotListBindingEndpoint_BeanSlot();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE = eINSTANCE.getYBeanSlotListBindingEndpoint_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Collection Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME = eINSTANCE.getYBeanSlotListBindingEndpoint_CollectionTypeQualifiedName();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint <em>YEmbeddable Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableBindingEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_BINDING_ENDPOINT = eINSTANCE.getYEmbeddableBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableValueEndpointImpl <em>YEmbeddable Value Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableValueEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableValueEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_VALUE_ENDPOINT = eINSTANCE.getYEmbeddableValueEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableValueEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableSelectionEndpointImpl <em>YEmbeddable Selection Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableSelectionEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableSelectionEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_SELECTION_ENDPOINT = eINSTANCE.getYEmbeddableSelectionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableSelectionEndpoint_Element();

		/**
		 * The meta object literal for the '<em><b>Attribute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH = eINSTANCE.getYEmbeddableSelectionEndpoint_AttributePath();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl <em>YEmbeddable Multi Selection Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableMultiSelectionEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_MULTI_SELECTION_ENDPOINT = eINSTANCE.getYEmbeddableMultiSelectionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableMultiSelectionEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableCollectionEndpointImpl <em>YEmbeddable Collection Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YEmbeddableCollectionEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableCollectionEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_COLLECTION_ENDPOINT = eINSTANCE.getYEmbeddableCollectionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableCollectionEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YActivatedEndpointImpl <em>YActivated Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YActivatedEndpointImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYActivatedEndpoint()
		 * @generated
		 */
		EClass YACTIVATED_ENDPOINT = eINSTANCE.getYActivatedEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YACTIVATED_ENDPOINT__ELEMENT = eINSTANCE.getYActivatedEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YDtWrapperImpl <em>YDt Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YDtWrapperImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDtWrapper()
		 * @generated
		 */
		EClass YDT_WRAPPER = eINSTANCE.getYDtWrapper();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YCommand <em>YCommand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YCommand
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCommand()
		 * @generated
		 */
		EClass YCOMMAND = eINSTANCE.getYCommand();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YCommandSetImpl <em>YCommand Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YCommandSetImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYCommandSet()
		 * @generated
		 */
		EClass YCOMMAND_SET = eINSTANCE.getYCommandSet();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMMAND_SET__COMMANDS = eINSTANCE.getYCommandSet_Commands();

		/**
		 * The meta object literal for the '<em><b>Transient Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMMAND_SET__TRANSIENT_COMMANDS = eINSTANCE.getYCommandSet_TransientCommands();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YOpenDialogCommandImpl <em>YOpen Dialog Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YOpenDialogCommandImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYOpenDialogCommand()
		 * @generated
		 */
		EClass YOPEN_DIALOG_COMMAND = eINSTANCE.getYOpenDialogCommand();

		/**
		 * The meta object literal for the '<em><b>Dialog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPEN_DIALOG_COMMAND__DIALOG = eINSTANCE.getYOpenDialogCommand_Dialog();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPEN_DIALOG_COMMAND__TRIGGER = eINSTANCE.getYOpenDialogCommand_Trigger();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl <em>YExposed Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYExposedAction()
		 * @generated
		 */
		EClass YEXPOSED_ACTION = eINSTANCE.getYExposedAction();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__ICON = eINSTANCE.getYExposedAction_Icon();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__LABEL = eINSTANCE.getYExposedAction_Label();

		/**
		 * The meta object literal for the '<em><b>Label I1 8n Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__LABEL_I1_8N_KEY = eINSTANCE.getYExposedAction_LabelI18nKey();

		/**
		 * The meta object literal for the '<em><b>External Click Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__EXTERNAL_CLICK_TIME = eINSTANCE.getYExposedAction_ExternalClickTime();

		/**
		 * The meta object literal for the '<em><b>Internal Click Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__INTERNAL_CLICK_TIME = eINSTANCE.getYExposedAction_InternalClickTime();

		/**
		 * The meta object literal for the '<em><b>Executed Notification Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__EXECUTED_NOTIFICATION_TIME = eINSTANCE.getYExposedAction_ExecutedNotificationTime();

		/**
		 * The meta object literal for the '<em><b>Canceled Notification Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__CANCELED_NOTIFICATION_TIME = eINSTANCE.getYExposedAction_CanceledNotificationTime();

		/**
		 * The meta object literal for the '<em><b>Check Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__CHECK_DIRTY = eINSTANCE.getYExposedAction_CheckDirty();

		/**
		 * The meta object literal for the '<em><b>External Command Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEXPOSED_ACTION__EXTERNAL_COMMAND_ID = eINSTANCE.getYExposedAction_ExternalCommandId();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl <em>YSend Event Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYSendEventCommand()
		 * @generated
		 */
		EClass YSEND_EVENT_COMMAND = eINSTANCE.getYSendEventCommand();

		/**
		 * The meta object literal for the '<em><b>Event Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSEND_EVENT_COMMAND__EVENT_TOPIC = eINSTANCE.getYSendEventCommand_EventTopic();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSEND_EVENT_COMMAND__MESSAGE = eINSTANCE.getYSendEventCommand_Message();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSEND_EVENT_COMMAND__TRIGGER = eINSTANCE.getYSendEventCommand_Trigger();

		/**
		 * The meta object literal for the '<em><b>Auto Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSEND_EVENT_COMMAND__AUTO_TRIGGER = eINSTANCE.getYSendEventCommand_AutoTrigger();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl <em>YKey Stroke Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYKeyStrokeDefinition()
		 * @generated
		 */
		EClass YKEY_STROKE_DEFINITION = eINSTANCE.getYKeyStrokeDefinition();

		/**
		 * The meta object literal for the '<em><b>Key Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YKEY_STROKE_DEFINITION__KEY_CODE = eINSTANCE.getYKeyStrokeDefinition_KeyCode();

		/**
		 * The meta object literal for the '<em><b>Modifier Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YKEY_STROKE_DEFINITION__MODIFIER_KEYS = eINSTANCE.getYKeyStrokeDefinition_ModifierKeys();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YConverter <em>YConverter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YConverter
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYConverter()
		 * @generated
		 */
		EClass YCONVERTER = eINSTANCE.getYConverter();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl <em>YDelegate Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDelegateConverter()
		 * @generated
		 */
		EClass YDELEGATE_CONVERTER = eINSTANCE.getYDelegateConverter();

		/**
		 * The meta object literal for the '<em><b>Converter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDELEGATE_CONVERTER__CONVERTER_ID = eINSTANCE.getYDelegateConverter_ConverterId();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YDeviceType <em>YDevice Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YDeviceType
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYDeviceType()
		 * @generated
		 */
		EEnum YDEVICE_TYPE = eINSTANCE.getYDeviceType();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YAlignment <em>YAlignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YAlignment
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYAlignment()
		 * @generated
		 */
		EEnum YALIGNMENT = eINSTANCE.getYAlignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YFlatAlignment <em>YFlat Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YFlatAlignment
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYFlatAlignment()
		 * @generated
		 */
		EEnum YFLAT_ALIGNMENT = eINSTANCE.getYFlatAlignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YUnit <em>YUnit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YUnit
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYUnit()
		 * @generated
		 */
		EEnum YUNIT = eINSTANCE.getYUnit();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YKeyCode <em>YKey Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YKeyCode
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYKeyCode()
		 * @generated
		 */
		EEnum YKEY_CODE = eINSTANCE.getYKeyCode();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.common.model.core.YModifierKey <em>YModifier Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.YModifierKey
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYModifierKey()
		 * @generated
		 */
		EEnum YMODIFIER_KEY = eINSTANCE.getYModifierKey();

		/**
		 * The meta object literal for the '<em>YURI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYURI()
		 * @generated
		 */
		EDataType YURI = eINSTANCE.getYURI();

		/**
		 * The meta object literal for the '<em>YValue Change Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.common.model.core.listeners.YValueChangeListener
		 * @see org.lunifera.ecview.core.common.model.core.impl.CoreModelPackageImpl#getYValueChangeListener()
		 * @generated
		 */
		EDataType YVALUE_CHANGE_LISTENER = eINSTANCE.getYValueChangeListener();

	}

} //UiModelPackage
