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
package org.lunifera.ecview.core.common.model.core.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.model.binding.YBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.*;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YAction;
import org.lunifera.ecview.core.common.model.core.YActivateable;
import org.lunifera.ecview.core.common.model.core.YActivatedEndpoint;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YBindable;
import org.lunifera.ecview.core.common.model.core.YCollectionBindable;
import org.lunifera.ecview.core.common.model.core.YCommand;
import org.lunifera.ecview.core.common.model.core.YCommandSet;
import org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YCssAble;
import org.lunifera.ecview.core.common.model.core.YDialog;
import org.lunifera.ecview.core.common.model.core.YDtWrapper;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.core.YFocusable;
import org.lunifera.ecview.core.common.model.core.YHeightable;
import org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YMultiSelectionBindable;
import org.lunifera.ecview.core.common.model.core.YOpenDialogCommand;
import org.lunifera.ecview.core.common.model.core.YSelectionBindable;
import org.lunifera.ecview.core.common.model.core.YSendEventCommand;
import org.lunifera.ecview.core.common.model.core.YSpacingable;
import org.lunifera.ecview.core.common.model.core.YValueBindable;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.core.YVisibleable;
import org.lunifera.ecview.core.common.model.core.YWidthable;
import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.model.datatypes.YDtBase;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage
 * @generated
 */
public class CoreModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoreModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CoreModelPackage.eINSTANCE;
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
	protected CoreModelSwitch<Adapter> modelSwitch =
		new CoreModelSwitch<Adapter>() {
			@Override
			public Adapter caseYElement(YElement object) {
				return createYElementAdapter();
			}
			@Override
			public Adapter caseYStringToStringMap(Map.Entry<String, String> object) {
				return createYStringToStringMapAdapter();
			}
			@Override
			public Adapter caseYLayout(YLayout object) {
				return createYLayoutAdapter();
			}
			@Override
			public Adapter caseYField(YField object) {
				return createYFieldAdapter();
			}
			@Override
			public Adapter caseYView(YView object) {
				return createYViewAdapter();
			}
			@Override
			public Adapter caseYViewSet(YViewSet object) {
				return createYViewSetAdapter();
			}
			@Override
			public Adapter caseYBeanSlot(YBeanSlot object) {
				return createYBeanSlotAdapter();
			}
			@Override
			public Adapter caseYEmbeddable(YEmbeddable object) {
				return createYEmbeddableAdapter();
			}
			@Override
			public Adapter caseYDialog(YDialog object) {
				return createYDialogAdapter();
			}
			@Override
			public Adapter caseYCssAble(YCssAble object) {
				return createYCssAbleAdapter();
			}
			@Override
			public Adapter caseYMarginable(YMarginable object) {
				return createYMarginableAdapter();
			}
			@Override
			public Adapter caseYSpacingable(YSpacingable object) {
				return createYSpacingableAdapter();
			}
			@Override
			public Adapter caseYHeightable(YHeightable object) {
				return createYHeightableAdapter();
			}
			@Override
			public Adapter caseYWidthable(YWidthable object) {
				return createYWidthableAdapter();
			}
			@Override
			public Adapter caseYActivateable(YActivateable object) {
				return createYActivateableAdapter();
			}
			@Override
			public Adapter caseYVisibleable(YVisibleable object) {
				return createYVisibleableAdapter();
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
			public Adapter caseYFocusable(YFocusable object) {
				return createYFocusableAdapter();
			}
			@Override
			public Adapter caseYAction(YAction object) {
				return createYActionAdapter();
			}
			@Override
			public Adapter caseYBindable(YBindable object) {
				return createYBindableAdapter();
			}
			@Override
			public Adapter caseYValueBindable(YValueBindable object) {
				return createYValueBindableAdapter();
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
			public Adapter caseYCollectionBindable(YCollectionBindable object) {
				return createYCollectionBindableAdapter();
			}
			@Override
			public Adapter caseYContextValueBindingEndpoint(YContextValueBindingEndpoint object) {
				return createYContextValueBindingEndpointAdapter();
			}
			@Override
			public Adapter caseYBeanSlotValueBindingEndpoint(YBeanSlotValueBindingEndpoint object) {
				return createYBeanSlotValueBindingEndpointAdapter();
			}
			@Override
			public Adapter caseYBeanSlotListBindingEndpoint(YBeanSlotListBindingEndpoint object) {
				return createYBeanSlotListBindingEndpointAdapter();
			}
			@Override
			public Adapter caseYEmbeddableBindingEndpoint(YEmbeddableBindingEndpoint object) {
				return createYEmbeddableBindingEndpointAdapter();
			}
			@Override
			public Adapter caseYEmbeddableValueEndpoint(YEmbeddableValueEndpoint object) {
				return createYEmbeddableValueEndpointAdapter();
			}
			@Override
			public Adapter caseYEmbeddableSelectionEndpoint(YEmbeddableSelectionEndpoint object) {
				return createYEmbeddableSelectionEndpointAdapter();
			}
			@Override
			public Adapter caseYEmbeddableMultiSelectionEndpoint(YEmbeddableMultiSelectionEndpoint object) {
				return createYEmbeddableMultiSelectionEndpointAdapter();
			}
			@Override
			public Adapter caseYEmbeddableCollectionEndpoint(YEmbeddableCollectionEndpoint object) {
				return createYEmbeddableCollectionEndpointAdapter();
			}
			@Override
			public Adapter caseYActivatedEndpoint(YActivatedEndpoint object) {
				return createYActivatedEndpointAdapter();
			}
			@Override
			public Adapter caseYDtWrapper(YDtWrapper object) {
				return createYDtWrapperAdapter();
			}
			@Override
			public Adapter caseYCommand(YCommand object) {
				return createYCommandAdapter();
			}
			@Override
			public Adapter caseYCommandSet(YCommandSet object) {
				return createYCommandSetAdapter();
			}
			@Override
			public Adapter caseYOpenDialogCommand(YOpenDialogCommand object) {
				return createYOpenDialogCommandAdapter();
			}
			@Override
			public Adapter caseYExposedAction(YExposedAction object) {
				return createYExposedActionAdapter();
			}
			@Override
			public Adapter caseYSendEventCommand(YSendEventCommand object) {
				return createYSendEventCommandAdapter();
			}
			@Override
			public Adapter caseYKeyStrokeDefinition(YKeyStrokeDefinition object) {
				return createYKeyStrokeDefinitionAdapter();
			}
			@Override
			public Adapter caseYConverter(YConverter object) {
				return createYConverterAdapter();
			}
			@Override
			public Adapter caseYDelegateConverter(YDelegateConverter object) {
				return createYDelegateConverterAdapter();
			}
			@Override
			public Adapter caseYBindingEndpoint(YBindingEndpoint object) {
				return createYBindingEndpointAdapter();
			}
			@Override
			public Adapter caseYValueBindingEndpoint(YValueBindingEndpoint object) {
				return createYValueBindingEndpointAdapter();
			}
			@Override
			public Adapter caseYListBindingEndpoint(YListBindingEndpoint object) {
				return createYListBindingEndpointAdapter();
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
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>YString To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createYStringToStringMapAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YView <em>YView</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YView
	 * @generated
	 */
	public Adapter createYViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YViewSet <em>YView Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YViewSet
	 * @generated
	 */
	public Adapter createYViewSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YBeanSlot <em>YBean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlot
	 * @generated
	 */
	public Adapter createYBeanSlotAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YDialog <em>YDialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YDialog
	 * @generated
	 */
	public Adapter createYDialogAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YHeightable <em>YHeightable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YHeightable
	 * @generated
	 */
	public Adapter createYHeightableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YWidthable <em>YWidthable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YWidthable
	 * @generated
	 */
	public Adapter createYWidthableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YFocusable <em>YFocusable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YFocusable
	 * @generated
	 */
	public Adapter createYFocusableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint <em>YContext Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint
	 * @generated
	 */
	public Adapter createYContextValueBindingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint <em>YBean Slot Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint
	 * @generated
	 */
	public Adapter createYBeanSlotValueBindingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint <em>YBean Slot List Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint
	 * @generated
	 */
	public Adapter createYBeanSlotListBindingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint <em>YEmbeddable Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint
	 * @generated
	 */
	public Adapter createYEmbeddableBindingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint <em>YEmbeddable Value Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint
	 * @generated
	 */
	public Adapter createYEmbeddableValueEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint <em>YEmbeddable Selection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableSelectionEndpoint
	 * @generated
	 */
	public Adapter createYEmbeddableSelectionEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint <em>YEmbeddable Multi Selection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableMultiSelectionEndpoint
	 * @generated
	 */
	public Adapter createYEmbeddableMultiSelectionEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint <em>YEmbeddable Collection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YEmbeddableCollectionEndpoint
	 * @generated
	 */
	public Adapter createYEmbeddableCollectionEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YActivatedEndpoint <em>YActivated Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YActivatedEndpoint
	 * @generated
	 */
	public Adapter createYActivatedEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YDtWrapper <em>YDt Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YDtWrapper
	 * @generated
	 */
	public Adapter createYDtWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YCommand <em>YCommand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YCommand
	 * @generated
	 */
	public Adapter createYCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YCommandSet <em>YCommand Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YCommandSet
	 * @generated
	 */
	public Adapter createYCommandSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YOpenDialogCommand <em>YOpen Dialog Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YOpenDialogCommand
	 * @generated
	 */
	public Adapter createYOpenDialogCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YExposedAction <em>YExposed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YExposedAction
	 * @generated
	 */
	public Adapter createYExposedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YSendEventCommand <em>YSend Event Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YSendEventCommand
	 * @generated
	 */
	public Adapter createYSendEventCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition <em>YKey Stroke Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition
	 * @generated
	 */
	public Adapter createYKeyStrokeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YConverter <em>YConverter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YConverter
	 * @generated
	 */
	public Adapter createYConverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.core.YDelegateConverter <em>YDelegate Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.core.YDelegateConverter
	 * @generated
	 */
	public Adapter createYDelegateConverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.binding.YBindingEndpoint <em>YBinding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.binding.YBindingEndpoint
	 * @generated
	 */
	public Adapter createYBindingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint <em>YValue Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint
	 * @generated
	 */
	public Adapter createYValueBindingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint <em>YList Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint
	 * @generated
	 */
	public Adapter createYListBindingEndpointAdapter() {
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

} //UiModelAdapterFactory
