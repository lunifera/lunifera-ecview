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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage
 * @generated
 */
public class ExtensionModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtensionModelPackage.eINSTANCE;
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
	protected ExtensionModelSwitch<Adapter> modelSwitch =
		new ExtensionModelSwitch<Adapter>() {
			@Override
			public Adapter caseYInput(YInput object) {
				return createYInputAdapter();
			}
			@Override
			public Adapter caseYGridLayout(YGridLayout object) {
				return createYGridLayoutAdapter();
			}
			@Override
			public Adapter caseYGridLayoutCellStyle(YGridLayoutCellStyle object) {
				return createYGridLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYHorizontalLayout(YHorizontalLayout object) {
				return createYHorizontalLayoutAdapter();
			}
			@Override
			public Adapter caseYHorizontalLayoutCellStyle(YHorizontalLayoutCellStyle object) {
				return createYHorizontalLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYVerticalLayout(YVerticalLayout object) {
				return createYVerticalLayoutAdapter();
			}
			@Override
			public Adapter caseYVerticalLayoutCellStyle(YVerticalLayoutCellStyle object) {
				return createYVerticalLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYSpanInfo(YSpanInfo object) {
				return createYSpanInfoAdapter();
			}
			@Override
			public Adapter caseYTable(YTable object) {
				return createYTableAdapter();
			}
			@Override
			public Adapter caseYColumn(YColumn object) {
				return createYColumnAdapter();
			}
			@Override
			public Adapter caseYTree(YTree object) {
				return createYTreeAdapter();
			}
			@Override
			public Adapter caseYOptionsGroup(YOptionsGroup object) {
				return createYOptionsGroupAdapter();
			}
			@Override
			public Adapter caseYList(YList object) {
				return createYListAdapter();
			}
			@Override
			public Adapter caseYLabel(YLabel object) {
				return createYLabelAdapter();
			}
			@Override
			public Adapter caseYImage(YImage object) {
				return createYImageAdapter();
			}
			@Override
			public Adapter caseYTextField(YTextField object) {
				return createYTextFieldAdapter();
			}
			@Override
			public Adapter caseYBeanReferenceField(YBeanReferenceField object) {
				return createYBeanReferenceFieldAdapter();
			}
			@Override
			public Adapter caseYTextArea(YTextArea object) {
				return createYTextAreaAdapter();
			}
			@Override
			public Adapter caseYCheckBox(YCheckBox object) {
				return createYCheckBoxAdapter();
			}
			@Override
			public Adapter caseYBrowser(YBrowser object) {
				return createYBrowserAdapter();
			}
			@Override
			public Adapter caseYDateTime(YDateTime object) {
				return createYDateTimeAdapter();
			}
			@Override
			public Adapter caseYDecimalField(YDecimalField object) {
				return createYDecimalFieldAdapter();
			}
			@Override
			public Adapter caseYNumericField(YNumericField object) {
				return createYNumericFieldAdapter();
			}
			@Override
			public Adapter caseYComboBox(YComboBox object) {
				return createYComboBoxAdapter();
			}
			@Override
			public Adapter caseYButton(YButton object) {
				return createYButtonAdapter();
			}
			@Override
			public Adapter caseYToggleButton(YToggleButton object) {
				return createYToggleButtonAdapter();
			}
			@Override
			public Adapter caseYProgressBar(YProgressBar object) {
				return createYProgressBarAdapter();
			}
			@Override
			public Adapter caseYTabSheet(YTabSheet object) {
				return createYTabSheetAdapter();
			}
			@Override
			public Adapter caseYTab(YTab object) {
				return createYTabAdapter();
			}
			@Override
			public Adapter caseYMasterDetail(YMasterDetail object) {
				return createYMasterDetailAdapter();
			}
			@Override
			public Adapter caseYFormLayout(YFormLayout object) {
				return createYFormLayoutAdapter();
			}
			@Override
			public Adapter caseYFormLayoutCellStyle(YFormLayoutCellStyle object) {
				return createYFormLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYTextSearchField(YTextSearchField object) {
				return createYTextSearchFieldAdapter();
			}
			@Override
			public Adapter caseYBooleanSearchField(YBooleanSearchField object) {
				return createYBooleanSearchFieldAdapter();
			}
			@Override
			public Adapter caseYNumericSearchField(YNumericSearchField object) {
				return createYNumericSearchFieldAdapter();
			}
			@Override
			public Adapter caseYReferenceSearchField(YReferenceSearchField object) {
				return createYReferenceSearchFieldAdapter();
			}
			@Override
			public Adapter caseYPanel(YPanel object) {
				return createYPanelAdapter();
			}
			@Override
			public Adapter caseYSplitPanel(YSplitPanel object) {
				return createYSplitPanelAdapter();
			}
			@Override
			public Adapter caseYSearchPanel(YSearchPanel object) {
				return createYSearchPanelAdapter();
			}
			@Override
			public Adapter caseYEnumOptionsGroup(YEnumOptionsGroup object) {
				return createYEnumOptionsGroupAdapter();
			}
			@Override
			public Adapter caseYEnumList(YEnumList object) {
				return createYEnumListAdapter();
			}
			@Override
			public Adapter caseYEnumComboBox(YEnumComboBox object) {
				return createYEnumComboBoxAdapter();
			}
			@Override
			public Adapter caseYBeanServiceConsumer(YBeanServiceConsumer object) {
				return createYBeanServiceConsumerAdapter();
			}
			@Override
			public Adapter caseYElement(YElement object) {
				return createYElementAdapter();
			}
			@Override
			public Adapter caseYCssAble(YCssAble object) {
				return createYCssAbleAdapter();
			}
			@Override
			public Adapter caseYVisibleable(YVisibleable object) {
				return createYVisibleableAdapter();
			}
			@Override
			public Adapter caseYEmbeddable(YEmbeddable object) {
				return createYEmbeddableAdapter();
			}
			@Override
			public Adapter caseYEditable(YEditable object) {
				return createYEditableAdapter();
			}
			@Override
			public Adapter caseYEnable(YEnable object) {
				return createYEnableAdapter();
			}
			@Override
			public Adapter caseYField(YField object) {
				return createYFieldAdapter();
			}
			@Override
			public Adapter caseYLayout(YLayout object) {
				return createYLayoutAdapter();
			}
			@Override
			public Adapter caseYSpacingable(YSpacingable object) {
				return createYSpacingableAdapter();
			}
			@Override
			public Adapter caseYMarginable(YMarginable object) {
				return createYMarginableAdapter();
			}
			@Override
			public Adapter caseYBindable(YBindable object) {
				return createYBindableAdapter();
			}
			@Override
			public Adapter caseYCollectionBindable(YCollectionBindable object) {
				return createYCollectionBindableAdapter();
			}
			@Override
			public Adapter caseYSelectionBindable(YSelectionBindable object) {
				return createYSelectionBindableAdapter();
			}
			@Override
			public Adapter caseYMultiSelectionBindable(YMultiSelectionBindable object) {
				return createYMultiSelectionBindableAdapter();
			}
			@Override
			public Adapter caseYValueBindable(YValueBindable object) {
				return createYValueBindableAdapter();
			}
			@Override
			public Adapter caseYAction(YAction object) {
				return createYActionAdapter();
			}
			@Override
			public Adapter caseYActivateable(YActivateable object) {
				return createYActivateableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YTextField <em>YText Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextField
	 * @generated
	 */
	public Adapter createYTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField <em>YBean Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField
	 * @generated
	 */
	public Adapter createYBeanReferenceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout <em>YGrid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayout
	 * @generated
	 */
	public Adapter createYGridLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle <em>YGrid Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle
	 * @generated
	 */
	public Adapter createYGridLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout <em>YHorizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout
	 * @generated
	 */
	public Adapter createYHorizontalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle <em>YHorizontal Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle
	 * @generated
	 */
	public Adapter createYHorizontalLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayout <em>YVertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayout
	 * @generated
	 */
	public Adapter createYVerticalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle <em>YVertical Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle
	 * @generated
	 */
	public Adapter createYVerticalLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YSpanInfo <em>YSpan Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSpanInfo
	 * @generated
	 */
	public Adapter createYSpanInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YTable <em>YTable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable
	 * @generated
	 */
	public Adapter createYTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YColumn <em>YColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn
	 * @generated
	 */
	public Adapter createYColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YLabel <em>YLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YLabel
	 * @generated
	 */
	public Adapter createYLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YImage <em>YImage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YImage
	 * @generated
	 */
	public Adapter createYImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YTextArea <em>YText Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextArea
	 * @generated
	 */
	public Adapter createYTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YCheckBox <em>YCheck Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YCheckBox
	 * @generated
	 */
	public Adapter createYCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YBrowser <em>YBrowser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBrowser
	 * @generated
	 */
	public Adapter createYBrowserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YDateTime <em>YDate Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDateTime
	 * @generated
	 */
	public Adapter createYDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YInput <em>YInput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YInput
	 * @generated
	 */
	public Adapter createYInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YDecimalField <em>YDecimal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDecimalField
	 * @generated
	 */
	public Adapter createYDecimalFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YNumericField <em>YNumeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericField
	 * @generated
	 */
	public Adapter createYNumericFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox <em>YCombo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox
	 * @generated
	 */
	public Adapter createYComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YList <em>YList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList
	 * @generated
	 */
	public Adapter createYListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YButton <em>YButton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YButton
	 * @generated
	 */
	public Adapter createYButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YToggleButton <em>YToggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YToggleButton
	 * @generated
	 */
	public Adapter createYToggleButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YProgressBar <em>YProgress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YProgressBar
	 * @generated
	 */
	public Adapter createYProgressBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YTabSheet <em>YTab Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTabSheet
	 * @generated
	 */
	public Adapter createYTabSheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YTab <em>YTab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTab
	 * @generated
	 */
	public Adapter createYTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail <em>YMaster Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail
	 * @generated
	 */
	public Adapter createYMasterDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayout <em>YForm Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayout
	 * @generated
	 */
	public Adapter createYFormLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle <em>YForm Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle
	 * @generated
	 */
	public Adapter createYFormLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField <em>YText Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextSearchField
	 * @generated
	 */
	public Adapter createYTextSearchFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField <em>YBoolean Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField
	 * @generated
	 */
	public Adapter createYBooleanSearchFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YNumericSearchField <em>YNumeric Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericSearchField
	 * @generated
	 */
	public Adapter createYNumericSearchFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YReferenceSearchField <em>YReference Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YReferenceSearchField
	 * @generated
	 */
	public Adapter createYReferenceSearchFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YPanel <em>YPanel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YPanel
	 * @generated
	 */
	public Adapter createYPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YSplitPanel <em>YSplit Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSplitPanel
	 * @generated
	 */
	public Adapter createYSplitPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YSearchPanel <em>YSearch Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSearchPanel
	 * @generated
	 */
	public Adapter createYSearchPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YEnumOptionsGroup <em>YEnum Options Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YEnumOptionsGroup
	 * @generated
	 */
	public Adapter createYEnumOptionsGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YEnumList <em>YEnum List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YEnumList
	 * @generated
	 */
	public Adapter createYEnumListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YEnumComboBox <em>YEnum Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YEnumComboBox
	 * @generated
	 */
	public Adapter createYEnumComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YBeanServiceConsumer <em>YBean Service Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBeanServiceConsumer
	 * @generated
	 */
	public Adapter createYBeanServiceConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YTree <em>YTree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree
	 * @generated
	 */
	public Adapter createYTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup <em>YOptions Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup
	 * @generated
	 */
	public Adapter createYOptionsGroupAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YCssAble <em>YCss Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YCssAble
	 * @generated
	 */
	public Adapter createYCssAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YVisibleable <em>YVisibleable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YVisibleable
	 * @generated
	 */
	public Adapter createYVisibleableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddable <em>YEmbeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddable
	 * @generated
	 */
	public Adapter createYEmbeddableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEditable <em>YEditable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEditable
	 * @generated
	 */
	public Adapter createYEditableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEnable <em>YEnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEnable
	 * @generated
	 */
	public Adapter createYEnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YField <em>YField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YField
	 * @generated
	 */
	public Adapter createYFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YBindable <em>YBindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YBindable
	 * @generated
	 */
	public Adapter createYBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YValueBindable <em>YValue Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YValueBindable
	 * @generated
	 */
	public Adapter createYValueBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YLayout <em>YLayout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YLayout
	 * @generated
	 */
	public Adapter createYLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YSpacingable <em>YSpacingable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YSpacingable
	 * @generated
	 */
	public Adapter createYSpacingableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YMarginable <em>YMarginable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YMarginable
	 * @generated
	 */
	public Adapter createYMarginableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YCollectionBindable
	 * @generated
	 */
	public Adapter createYCollectionBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YSelectionBindable
	 * @generated
	 */
	public Adapter createYSelectionBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable
	 * @generated
	 */
	public Adapter createYMultiSelectionBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YAction <em>YAction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YAction
	 * @generated
	 */
	public Adapter createYActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YActivateable <em>YActivateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YActivateable
	 * @generated
	 */
	public Adapter createYActivateableAdapter() {
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

} //ExtensionModelAdapterFactory
