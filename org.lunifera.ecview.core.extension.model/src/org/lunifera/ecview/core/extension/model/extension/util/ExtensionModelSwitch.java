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
package org.lunifera.ecview.core.extension.model.extension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.lunifera.ecview.core.common.model.core.YAction;
import org.lunifera.ecview.core.common.model.core.YActivateable;
import org.lunifera.ecview.core.common.model.core.YBindable;
import org.lunifera.ecview.core.common.model.core.YCollectionBindable;
import org.lunifera.ecview.core.common.model.core.YCssAble;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable;
import org.lunifera.ecview.core.common.model.core.YSelectionBindable;
import org.lunifera.ecview.core.common.model.core.YSpacingable;
import org.lunifera.ecview.core.common.model.core.YValueBindable;
import org.lunifera.ecview.core.common.model.core.YVisibleable;
import org.lunifera.ecview.core.extension.model.extension.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage
 * @generated
 */
public class ExtensionModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtensionModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExtensionModelPackage.YINPUT: {
				YInput yInput = (YInput)theEObject;
				T result = caseYInput(yInput);
				if (result == null) result = caseYField(yInput);
				if (result == null) result = caseYEmbeddable(yInput);
				if (result == null) result = caseYEditable(yInput);
				if (result == null) result = caseYEnable(yInput);
				if (result == null) result = caseYElement(yInput);
				if (result == null) result = caseYCssAble(yInput);
				if (result == null) result = caseYVisibleable(yInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YGRID_LAYOUT: {
				YGridLayout yGridLayout = (YGridLayout)theEObject;
				T result = caseYGridLayout(yGridLayout);
				if (result == null) result = caseYLayout(yGridLayout);
				if (result == null) result = caseYSpacingable(yGridLayout);
				if (result == null) result = caseYMarginable(yGridLayout);
				if (result == null) result = caseYEmbeddable(yGridLayout);
				if (result == null) result = caseYEditable(yGridLayout);
				if (result == null) result = caseYEnable(yGridLayout);
				if (result == null) result = caseYElement(yGridLayout);
				if (result == null) result = caseYCssAble(yGridLayout);
				if (result == null) result = caseYVisibleable(yGridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE: {
				YGridLayoutCellStyle yGridLayoutCellStyle = (YGridLayoutCellStyle)theEObject;
				T result = caseYGridLayoutCellStyle(yGridLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT: {
				YHorizontalLayout yHorizontalLayout = (YHorizontalLayout)theEObject;
				T result = caseYHorizontalLayout(yHorizontalLayout);
				if (result == null) result = caseYLayout(yHorizontalLayout);
				if (result == null) result = caseYSpacingable(yHorizontalLayout);
				if (result == null) result = caseYMarginable(yHorizontalLayout);
				if (result == null) result = caseYEmbeddable(yHorizontalLayout);
				if (result == null) result = caseYEditable(yHorizontalLayout);
				if (result == null) result = caseYEnable(yHorizontalLayout);
				if (result == null) result = caseYElement(yHorizontalLayout);
				if (result == null) result = caseYCssAble(yHorizontalLayout);
				if (result == null) result = caseYVisibleable(yHorizontalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT_CELL_STYLE: {
				YHorizontalLayoutCellStyle yHorizontalLayoutCellStyle = (YHorizontalLayoutCellStyle)theEObject;
				T result = caseYHorizontalLayoutCellStyle(yHorizontalLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YVERTICAL_LAYOUT: {
				YVerticalLayout yVerticalLayout = (YVerticalLayout)theEObject;
				T result = caseYVerticalLayout(yVerticalLayout);
				if (result == null) result = caseYLayout(yVerticalLayout);
				if (result == null) result = caseYSpacingable(yVerticalLayout);
				if (result == null) result = caseYMarginable(yVerticalLayout);
				if (result == null) result = caseYEmbeddable(yVerticalLayout);
				if (result == null) result = caseYEditable(yVerticalLayout);
				if (result == null) result = caseYEnable(yVerticalLayout);
				if (result == null) result = caseYElement(yVerticalLayout);
				if (result == null) result = caseYCssAble(yVerticalLayout);
				if (result == null) result = caseYVisibleable(yVerticalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YVERTICAL_LAYOUT_CELL_STYLE: {
				YVerticalLayoutCellStyle yVerticalLayoutCellStyle = (YVerticalLayoutCellStyle)theEObject;
				T result = caseYVerticalLayoutCellStyle(yVerticalLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YSPAN_INFO: {
				YSpanInfo ySpanInfo = (YSpanInfo)theEObject;
				T result = caseYSpanInfo(ySpanInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTABLE: {
				YTable yTable = (YTable)theEObject;
				T result = caseYTable(yTable);
				if (result == null) result = caseYInput(yTable);
				if (result == null) result = caseYCollectionBindable(yTable);
				if (result == null) result = caseYSelectionBindable(yTable);
				if (result == null) result = caseYMultiSelectionBindable(yTable);
				if (result == null) result = caseYBeanServiceConsumer(yTable);
				if (result == null) result = caseYField(yTable);
				if (result == null) result = caseYBindable(yTable);
				if (result == null) result = caseYEmbeddable(yTable);
				if (result == null) result = caseYEditable(yTable);
				if (result == null) result = caseYEnable(yTable);
				if (result == null) result = caseYElement(yTable);
				if (result == null) result = caseYCssAble(yTable);
				if (result == null) result = caseYVisibleable(yTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YCOLUMN: {
				YColumn yColumn = (YColumn)theEObject;
				T result = caseYColumn(yColumn);
				if (result == null) result = caseYElement(yColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTREE: {
				YTree yTree = (YTree)theEObject;
				T result = caseYTree(yTree);
				if (result == null) result = caseYInput(yTree);
				if (result == null) result = caseYCollectionBindable(yTree);
				if (result == null) result = caseYSelectionBindable(yTree);
				if (result == null) result = caseYMultiSelectionBindable(yTree);
				if (result == null) result = caseYBeanServiceConsumer(yTree);
				if (result == null) result = caseYField(yTree);
				if (result == null) result = caseYBindable(yTree);
				if (result == null) result = caseYEmbeddable(yTree);
				if (result == null) result = caseYEditable(yTree);
				if (result == null) result = caseYEnable(yTree);
				if (result == null) result = caseYElement(yTree);
				if (result == null) result = caseYCssAble(yTree);
				if (result == null) result = caseYVisibleable(yTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YOPTIONS_GROUP: {
				YOptionsGroup yOptionsGroup = (YOptionsGroup)theEObject;
				T result = caseYOptionsGroup(yOptionsGroup);
				if (result == null) result = caseYInput(yOptionsGroup);
				if (result == null) result = caseYCollectionBindable(yOptionsGroup);
				if (result == null) result = caseYSelectionBindable(yOptionsGroup);
				if (result == null) result = caseYMultiSelectionBindable(yOptionsGroup);
				if (result == null) result = caseYBeanServiceConsumer(yOptionsGroup);
				if (result == null) result = caseYField(yOptionsGroup);
				if (result == null) result = caseYBindable(yOptionsGroup);
				if (result == null) result = caseYEmbeddable(yOptionsGroup);
				if (result == null) result = caseYEditable(yOptionsGroup);
				if (result == null) result = caseYEnable(yOptionsGroup);
				if (result == null) result = caseYElement(yOptionsGroup);
				if (result == null) result = caseYCssAble(yOptionsGroup);
				if (result == null) result = caseYVisibleable(yOptionsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YLIST: {
				YList yList = (YList)theEObject;
				T result = caseYList(yList);
				if (result == null) result = caseYInput(yList);
				if (result == null) result = caseYCollectionBindable(yList);
				if (result == null) result = caseYSelectionBindable(yList);
				if (result == null) result = caseYMultiSelectionBindable(yList);
				if (result == null) result = caseYBeanServiceConsumer(yList);
				if (result == null) result = caseYField(yList);
				if (result == null) result = caseYBindable(yList);
				if (result == null) result = caseYEmbeddable(yList);
				if (result == null) result = caseYEditable(yList);
				if (result == null) result = caseYEnable(yList);
				if (result == null) result = caseYElement(yList);
				if (result == null) result = caseYCssAble(yList);
				if (result == null) result = caseYVisibleable(yList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YLABEL: {
				YLabel yLabel = (YLabel)theEObject;
				T result = caseYLabel(yLabel);
				if (result == null) result = caseYField(yLabel);
				if (result == null) result = caseYValueBindable(yLabel);
				if (result == null) result = caseYEmbeddable(yLabel);
				if (result == null) result = caseYEditable(yLabel);
				if (result == null) result = caseYEnable(yLabel);
				if (result == null) result = caseYBindable(yLabel);
				if (result == null) result = caseYElement(yLabel);
				if (result == null) result = caseYCssAble(yLabel);
				if (result == null) result = caseYVisibleable(yLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YIMAGE: {
				YImage yImage = (YImage)theEObject;
				T result = caseYImage(yImage);
				if (result == null) result = caseYField(yImage);
				if (result == null) result = caseYValueBindable(yImage);
				if (result == null) result = caseYEmbeddable(yImage);
				if (result == null) result = caseYEditable(yImage);
				if (result == null) result = caseYEnable(yImage);
				if (result == null) result = caseYBindable(yImage);
				if (result == null) result = caseYElement(yImage);
				if (result == null) result = caseYCssAble(yImage);
				if (result == null) result = caseYVisibleable(yImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTEXT_FIELD: {
				YTextField yTextField = (YTextField)theEObject;
				T result = caseYTextField(yTextField);
				if (result == null) result = caseYInput(yTextField);
				if (result == null) result = caseYValueBindable(yTextField);
				if (result == null) result = caseYField(yTextField);
				if (result == null) result = caseYBindable(yTextField);
				if (result == null) result = caseYEmbeddable(yTextField);
				if (result == null) result = caseYEditable(yTextField);
				if (result == null) result = caseYEnable(yTextField);
				if (result == null) result = caseYElement(yTextField);
				if (result == null) result = caseYCssAble(yTextField);
				if (result == null) result = caseYVisibleable(yTextField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD: {
				YBeanReferenceField yBeanReferenceField = (YBeanReferenceField)theEObject;
				T result = caseYBeanReferenceField(yBeanReferenceField);
				if (result == null) result = caseYInput(yBeanReferenceField);
				if (result == null) result = caseYValueBindable(yBeanReferenceField);
				if (result == null) result = caseYBeanServiceConsumer(yBeanReferenceField);
				if (result == null) result = caseYField(yBeanReferenceField);
				if (result == null) result = caseYBindable(yBeanReferenceField);
				if (result == null) result = caseYEmbeddable(yBeanReferenceField);
				if (result == null) result = caseYEditable(yBeanReferenceField);
				if (result == null) result = caseYEnable(yBeanReferenceField);
				if (result == null) result = caseYElement(yBeanReferenceField);
				if (result == null) result = caseYCssAble(yBeanReferenceField);
				if (result == null) result = caseYVisibleable(yBeanReferenceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTEXT_AREA: {
				YTextArea yTextArea = (YTextArea)theEObject;
				T result = caseYTextArea(yTextArea);
				if (result == null) result = caseYInput(yTextArea);
				if (result == null) result = caseYValueBindable(yTextArea);
				if (result == null) result = caseYField(yTextArea);
				if (result == null) result = caseYBindable(yTextArea);
				if (result == null) result = caseYEmbeddable(yTextArea);
				if (result == null) result = caseYEditable(yTextArea);
				if (result == null) result = caseYEnable(yTextArea);
				if (result == null) result = caseYElement(yTextArea);
				if (result == null) result = caseYCssAble(yTextArea);
				if (result == null) result = caseYVisibleable(yTextArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YCHECK_BOX: {
				YCheckBox yCheckBox = (YCheckBox)theEObject;
				T result = caseYCheckBox(yCheckBox);
				if (result == null) result = caseYInput(yCheckBox);
				if (result == null) result = caseYValueBindable(yCheckBox);
				if (result == null) result = caseYField(yCheckBox);
				if (result == null) result = caseYBindable(yCheckBox);
				if (result == null) result = caseYEmbeddable(yCheckBox);
				if (result == null) result = caseYEditable(yCheckBox);
				if (result == null) result = caseYEnable(yCheckBox);
				if (result == null) result = caseYElement(yCheckBox);
				if (result == null) result = caseYCssAble(yCheckBox);
				if (result == null) result = caseYVisibleable(yCheckBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YBROWSER: {
				YBrowser yBrowser = (YBrowser)theEObject;
				T result = caseYBrowser(yBrowser);
				if (result == null) result = caseYInput(yBrowser);
				if (result == null) result = caseYValueBindable(yBrowser);
				if (result == null) result = caseYField(yBrowser);
				if (result == null) result = caseYBindable(yBrowser);
				if (result == null) result = caseYEmbeddable(yBrowser);
				if (result == null) result = caseYEditable(yBrowser);
				if (result == null) result = caseYEnable(yBrowser);
				if (result == null) result = caseYElement(yBrowser);
				if (result == null) result = caseYCssAble(yBrowser);
				if (result == null) result = caseYVisibleable(yBrowser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YDATE_TIME: {
				YDateTime yDateTime = (YDateTime)theEObject;
				T result = caseYDateTime(yDateTime);
				if (result == null) result = caseYInput(yDateTime);
				if (result == null) result = caseYValueBindable(yDateTime);
				if (result == null) result = caseYField(yDateTime);
				if (result == null) result = caseYBindable(yDateTime);
				if (result == null) result = caseYEmbeddable(yDateTime);
				if (result == null) result = caseYEditable(yDateTime);
				if (result == null) result = caseYEnable(yDateTime);
				if (result == null) result = caseYElement(yDateTime);
				if (result == null) result = caseYCssAble(yDateTime);
				if (result == null) result = caseYVisibleable(yDateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YDECIMAL_FIELD: {
				YDecimalField yDecimalField = (YDecimalField)theEObject;
				T result = caseYDecimalField(yDecimalField);
				if (result == null) result = caseYInput(yDecimalField);
				if (result == null) result = caseYValueBindable(yDecimalField);
				if (result == null) result = caseYField(yDecimalField);
				if (result == null) result = caseYBindable(yDecimalField);
				if (result == null) result = caseYEmbeddable(yDecimalField);
				if (result == null) result = caseYEditable(yDecimalField);
				if (result == null) result = caseYEnable(yDecimalField);
				if (result == null) result = caseYElement(yDecimalField);
				if (result == null) result = caseYCssAble(yDecimalField);
				if (result == null) result = caseYVisibleable(yDecimalField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YNUMERIC_FIELD: {
				YNumericField yNumericField = (YNumericField)theEObject;
				T result = caseYNumericField(yNumericField);
				if (result == null) result = caseYInput(yNumericField);
				if (result == null) result = caseYValueBindable(yNumericField);
				if (result == null) result = caseYField(yNumericField);
				if (result == null) result = caseYBindable(yNumericField);
				if (result == null) result = caseYEmbeddable(yNumericField);
				if (result == null) result = caseYEditable(yNumericField);
				if (result == null) result = caseYEnable(yNumericField);
				if (result == null) result = caseYElement(yNumericField);
				if (result == null) result = caseYCssAble(yNumericField);
				if (result == null) result = caseYVisibleable(yNumericField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YCOMBO_BOX: {
				YComboBox yComboBox = (YComboBox)theEObject;
				T result = caseYComboBox(yComboBox);
				if (result == null) result = caseYInput(yComboBox);
				if (result == null) result = caseYCollectionBindable(yComboBox);
				if (result == null) result = caseYSelectionBindable(yComboBox);
				if (result == null) result = caseYBeanServiceConsumer(yComboBox);
				if (result == null) result = caseYField(yComboBox);
				if (result == null) result = caseYBindable(yComboBox);
				if (result == null) result = caseYEmbeddable(yComboBox);
				if (result == null) result = caseYEditable(yComboBox);
				if (result == null) result = caseYEnable(yComboBox);
				if (result == null) result = caseYElement(yComboBox);
				if (result == null) result = caseYCssAble(yComboBox);
				if (result == null) result = caseYVisibleable(yComboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YBUTTON: {
				YButton yButton = (YButton)theEObject;
				T result = caseYButton(yButton);
				if (result == null) result = caseYAction(yButton);
				if (result == null) result = caseYEditable(yButton);
				if (result == null) result = caseYEmbeddable(yButton);
				if (result == null) result = caseYEnable(yButton);
				if (result == null) result = caseYElement(yButton);
				if (result == null) result = caseYCssAble(yButton);
				if (result == null) result = caseYVisibleable(yButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTOGGLE_BUTTON: {
				YToggleButton yToggleButton = (YToggleButton)theEObject;
				T result = caseYToggleButton(yToggleButton);
				if (result == null) result = caseYAction(yToggleButton);
				if (result == null) result = caseYActivateable(yToggleButton);
				if (result == null) result = caseYEmbeddable(yToggleButton);
				if (result == null) result = caseYEnable(yToggleButton);
				if (result == null) result = caseYBindable(yToggleButton);
				if (result == null) result = caseYElement(yToggleButton);
				if (result == null) result = caseYCssAble(yToggleButton);
				if (result == null) result = caseYVisibleable(yToggleButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YPROGRESS_BAR: {
				YProgressBar yProgressBar = (YProgressBar)theEObject;
				T result = caseYProgressBar(yProgressBar);
				if (result == null) result = caseYInput(yProgressBar);
				if (result == null) result = caseYValueBindable(yProgressBar);
				if (result == null) result = caseYField(yProgressBar);
				if (result == null) result = caseYBindable(yProgressBar);
				if (result == null) result = caseYEmbeddable(yProgressBar);
				if (result == null) result = caseYEditable(yProgressBar);
				if (result == null) result = caseYEnable(yProgressBar);
				if (result == null) result = caseYElement(yProgressBar);
				if (result == null) result = caseYCssAble(yProgressBar);
				if (result == null) result = caseYVisibleable(yProgressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTAB_SHEET: {
				YTabSheet yTabSheet = (YTabSheet)theEObject;
				T result = caseYTabSheet(yTabSheet);
				if (result == null) result = caseYEmbeddable(yTabSheet);
				if (result == null) result = caseYElement(yTabSheet);
				if (result == null) result = caseYCssAble(yTabSheet);
				if (result == null) result = caseYVisibleable(yTabSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTAB: {
				YTab yTab = (YTab)theEObject;
				T result = caseYTab(yTab);
				if (result == null) result = caseYElement(yTab);
				if (result == null) result = caseYCssAble(yTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YMASTER_DETAIL: {
				YMasterDetail yMasterDetail = (YMasterDetail)theEObject;
				T result = caseYMasterDetail(yMasterDetail);
				if (result == null) result = caseYInput(yMasterDetail);
				if (result == null) result = caseYCollectionBindable(yMasterDetail);
				if (result == null) result = caseYSelectionBindable(yMasterDetail);
				if (result == null) result = caseYField(yMasterDetail);
				if (result == null) result = caseYBindable(yMasterDetail);
				if (result == null) result = caseYEmbeddable(yMasterDetail);
				if (result == null) result = caseYEditable(yMasterDetail);
				if (result == null) result = caseYEnable(yMasterDetail);
				if (result == null) result = caseYElement(yMasterDetail);
				if (result == null) result = caseYCssAble(yMasterDetail);
				if (result == null) result = caseYVisibleable(yMasterDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YFORM_LAYOUT: {
				YFormLayout yFormLayout = (YFormLayout)theEObject;
				T result = caseYFormLayout(yFormLayout);
				if (result == null) result = caseYLayout(yFormLayout);
				if (result == null) result = caseYSpacingable(yFormLayout);
				if (result == null) result = caseYMarginable(yFormLayout);
				if (result == null) result = caseYEmbeddable(yFormLayout);
				if (result == null) result = caseYEditable(yFormLayout);
				if (result == null) result = caseYEnable(yFormLayout);
				if (result == null) result = caseYElement(yFormLayout);
				if (result == null) result = caseYCssAble(yFormLayout);
				if (result == null) result = caseYVisibleable(yFormLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YFORM_LAYOUT_CELL_STYLE: {
				YFormLayoutCellStyle yFormLayoutCellStyle = (YFormLayoutCellStyle)theEObject;
				T result = caseYFormLayoutCellStyle(yFormLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTEXT_SEARCH_FIELD: {
				YTextSearchField yTextSearchField = (YTextSearchField)theEObject;
				T result = caseYTextSearchField(yTextSearchField);
				if (result == null) result = caseYInput(yTextSearchField);
				if (result == null) result = caseYValueBindable(yTextSearchField);
				if (result == null) result = caseYField(yTextSearchField);
				if (result == null) result = caseYBindable(yTextSearchField);
				if (result == null) result = caseYEmbeddable(yTextSearchField);
				if (result == null) result = caseYEditable(yTextSearchField);
				if (result == null) result = caseYEnable(yTextSearchField);
				if (result == null) result = caseYElement(yTextSearchField);
				if (result == null) result = caseYCssAble(yTextSearchField);
				if (result == null) result = caseYVisibleable(yTextSearchField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YBOOLEAN_SEARCH_FIELD: {
				YBooleanSearchField yBooleanSearchField = (YBooleanSearchField)theEObject;
				T result = caseYBooleanSearchField(yBooleanSearchField);
				if (result == null) result = caseYInput(yBooleanSearchField);
				if (result == null) result = caseYValueBindable(yBooleanSearchField);
				if (result == null) result = caseYField(yBooleanSearchField);
				if (result == null) result = caseYBindable(yBooleanSearchField);
				if (result == null) result = caseYEmbeddable(yBooleanSearchField);
				if (result == null) result = caseYEditable(yBooleanSearchField);
				if (result == null) result = caseYEnable(yBooleanSearchField);
				if (result == null) result = caseYElement(yBooleanSearchField);
				if (result == null) result = caseYCssAble(yBooleanSearchField);
				if (result == null) result = caseYVisibleable(yBooleanSearchField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD: {
				YNumericSearchField yNumericSearchField = (YNumericSearchField)theEObject;
				T result = caseYNumericSearchField(yNumericSearchField);
				if (result == null) result = caseYInput(yNumericSearchField);
				if (result == null) result = caseYValueBindable(yNumericSearchField);
				if (result == null) result = caseYField(yNumericSearchField);
				if (result == null) result = caseYBindable(yNumericSearchField);
				if (result == null) result = caseYEmbeddable(yNumericSearchField);
				if (result == null) result = caseYEditable(yNumericSearchField);
				if (result == null) result = caseYEnable(yNumericSearchField);
				if (result == null) result = caseYElement(yNumericSearchField);
				if (result == null) result = caseYCssAble(yNumericSearchField);
				if (result == null) result = caseYVisibleable(yNumericSearchField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YREFERENCE_SEARCH_FIELD: {
				YReferenceSearchField yReferenceSearchField = (YReferenceSearchField)theEObject;
				T result = caseYReferenceSearchField(yReferenceSearchField);
				if (result == null) result = caseYInput(yReferenceSearchField);
				if (result == null) result = caseYValueBindable(yReferenceSearchField);
				if (result == null) result = caseYField(yReferenceSearchField);
				if (result == null) result = caseYBindable(yReferenceSearchField);
				if (result == null) result = caseYEmbeddable(yReferenceSearchField);
				if (result == null) result = caseYEditable(yReferenceSearchField);
				if (result == null) result = caseYEnable(yReferenceSearchField);
				if (result == null) result = caseYElement(yReferenceSearchField);
				if (result == null) result = caseYCssAble(yReferenceSearchField);
				if (result == null) result = caseYVisibleable(yReferenceSearchField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YPANEL: {
				YPanel yPanel = (YPanel)theEObject;
				T result = caseYPanel(yPanel);
				if (result == null) result = caseYLayout(yPanel);
				if (result == null) result = caseYEmbeddable(yPanel);
				if (result == null) result = caseYEditable(yPanel);
				if (result == null) result = caseYEnable(yPanel);
				if (result == null) result = caseYElement(yPanel);
				if (result == null) result = caseYCssAble(yPanel);
				if (result == null) result = caseYVisibleable(yPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YSPLIT_PANEL: {
				YSplitPanel ySplitPanel = (YSplitPanel)theEObject;
				T result = caseYSplitPanel(ySplitPanel);
				if (result == null) result = caseYLayout(ySplitPanel);
				if (result == null) result = caseYEmbeddable(ySplitPanel);
				if (result == null) result = caseYEditable(ySplitPanel);
				if (result == null) result = caseYEnable(ySplitPanel);
				if (result == null) result = caseYElement(ySplitPanel);
				if (result == null) result = caseYCssAble(ySplitPanel);
				if (result == null) result = caseYVisibleable(ySplitPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YSEARCH_PANEL: {
				YSearchPanel ySearchPanel = (YSearchPanel)theEObject;
				T result = caseYSearchPanel(ySearchPanel);
				if (result == null) result = caseYLayout(ySearchPanel);
				if (result == null) result = caseYSpacingable(ySearchPanel);
				if (result == null) result = caseYMarginable(ySearchPanel);
				if (result == null) result = caseYEmbeddable(ySearchPanel);
				if (result == null) result = caseYEditable(ySearchPanel);
				if (result == null) result = caseYEnable(ySearchPanel);
				if (result == null) result = caseYElement(ySearchPanel);
				if (result == null) result = caseYCssAble(ySearchPanel);
				if (result == null) result = caseYVisibleable(ySearchPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YENUM_OPTIONS_GROUP: {
				YEnumOptionsGroup yEnumOptionsGroup = (YEnumOptionsGroup)theEObject;
				T result = caseYEnumOptionsGroup(yEnumOptionsGroup);
				if (result == null) result = caseYInput(yEnumOptionsGroup);
				if (result == null) result = caseYCollectionBindable(yEnumOptionsGroup);
				if (result == null) result = caseYSelectionBindable(yEnumOptionsGroup);
				if (result == null) result = caseYMultiSelectionBindable(yEnumOptionsGroup);
				if (result == null) result = caseYField(yEnumOptionsGroup);
				if (result == null) result = caseYBindable(yEnumOptionsGroup);
				if (result == null) result = caseYEmbeddable(yEnumOptionsGroup);
				if (result == null) result = caseYEditable(yEnumOptionsGroup);
				if (result == null) result = caseYEnable(yEnumOptionsGroup);
				if (result == null) result = caseYElement(yEnumOptionsGroup);
				if (result == null) result = caseYCssAble(yEnumOptionsGroup);
				if (result == null) result = caseYVisibleable(yEnumOptionsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YENUM_LIST: {
				YEnumList yEnumList = (YEnumList)theEObject;
				T result = caseYEnumList(yEnumList);
				if (result == null) result = caseYInput(yEnumList);
				if (result == null) result = caseYCollectionBindable(yEnumList);
				if (result == null) result = caseYSelectionBindable(yEnumList);
				if (result == null) result = caseYMultiSelectionBindable(yEnumList);
				if (result == null) result = caseYField(yEnumList);
				if (result == null) result = caseYBindable(yEnumList);
				if (result == null) result = caseYEmbeddable(yEnumList);
				if (result == null) result = caseYEditable(yEnumList);
				if (result == null) result = caseYEnable(yEnumList);
				if (result == null) result = caseYElement(yEnumList);
				if (result == null) result = caseYCssAble(yEnumList);
				if (result == null) result = caseYVisibleable(yEnumList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YENUM_COMBO_BOX: {
				YEnumComboBox yEnumComboBox = (YEnumComboBox)theEObject;
				T result = caseYEnumComboBox(yEnumComboBox);
				if (result == null) result = caseYInput(yEnumComboBox);
				if (result == null) result = caseYCollectionBindable(yEnumComboBox);
				if (result == null) result = caseYSelectionBindable(yEnumComboBox);
				if (result == null) result = caseYField(yEnumComboBox);
				if (result == null) result = caseYBindable(yEnumComboBox);
				if (result == null) result = caseYEmbeddable(yEnumComboBox);
				if (result == null) result = caseYEditable(yEnumComboBox);
				if (result == null) result = caseYEnable(yEnumComboBox);
				if (result == null) result = caseYElement(yEnumComboBox);
				if (result == null) result = caseYCssAble(yEnumComboBox);
				if (result == null) result = caseYVisibleable(yEnumComboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YBEAN_SERVICE_CONSUMER: {
				YBeanServiceConsumer yBeanServiceConsumer = (YBeanServiceConsumer)theEObject;
				T result = caseYBeanServiceConsumer(yBeanServiceConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextField(YTextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBean Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBean Reference Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBeanReferenceField(YBeanReferenceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGrid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGrid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGridLayout(YGridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGrid Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGrid Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGridLayoutCellStyle(YGridLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YHorizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YHorizontal Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYHorizontalLayout(YHorizontalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YHorizontal Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YHorizontal Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYHorizontalLayoutCellStyle(YHorizontalLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVertical Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVerticalLayout(YVerticalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVertical Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVertical Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVerticalLayoutCellStyle(YVerticalLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSpan Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSpan Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSpanInfo(YSpanInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTable(YTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YColumn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YColumn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYColumn(YColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YLabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLabel(YLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YImage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YImage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYImage(YImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextArea(YTextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCheck Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCheck Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCheckBox(YCheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBrowser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBrowser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBrowser(YBrowser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDate Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDate Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDateTime(YDateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YInput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YInput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYInput(YInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDecimal Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDecimal Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDecimalField(YDecimalField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YNumeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YNumeric Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYNumericField(YNumericField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCombo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCombo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYComboBox(YComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YList</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYList(YList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YButton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YButton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYButton(YButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YToggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YToggle Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYToggleButton(YToggleButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YProgress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YProgress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYProgressBar(YProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTab Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTabSheet(YTabSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTab(YTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMaster Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMaster Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMasterDetail(YMasterDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YForm Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YForm Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYFormLayout(YFormLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YForm Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YForm Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYFormLayoutCellStyle(YFormLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Search Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextSearchField(YTextSearchField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBoolean Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBoolean Search Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBooleanSearchField(YBooleanSearchField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YNumeric Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YNumeric Search Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYNumericSearchField(YNumericSearchField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YReference Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YReference Search Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYReferenceSearchField(YReferenceSearchField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPanel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPanel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPanel(YPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSplit Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSplit Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSplitPanel(YSplitPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSearch Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSearch Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSearchPanel(YSearchPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnum Options Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnum Options Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnumOptionsGroup(YEnumOptionsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnum List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnum List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnumList(YEnumList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnum Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnum Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnumComboBox(YEnumComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBean Service Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBean Service Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBeanServiceConsumer(YBeanServiceConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTree(YTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YOptions Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YOptions Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYOptionsGroup(YOptionsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYElement(YElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCssAble(YCssAble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibleable(YVisibleable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddable(YEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEditable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEditable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEditable(YEditable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnable(YEnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYField(YField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindable(YBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValue Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValue Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValueBindable(YValueBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YLayout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLayout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLayout(YLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSpacingable(YSpacingable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMarginable(YMarginable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCollection Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCollection Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCollectionBindable(YCollectionBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSelection Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSelection Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSelectionBindable(YSelectionBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMulti Selection Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMulti Selection Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMultiSelectionBindable(YMultiSelectionBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYAction(YAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YActivateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YActivateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYActivateable(YActivateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExtensionModelSwitch
