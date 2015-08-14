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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage
 * @generated
 */
public class CoreModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoreModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelSwitch() {
		if (modelPackage == null) {
			modelPackage = CoreModelPackage.eINSTANCE;
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
			case CoreModelPackage.YELEMENT: {
				YElement yElement = (YElement)theEObject;
				T result = caseYElement(yElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YSTRING_TO_STRING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> yStringToStringMap = (Map.Entry<String, String>)theEObject;
				T result = caseYStringToStringMap(yStringToStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YLAYOUT: {
				YLayout yLayout = (YLayout)theEObject;
				T result = caseYLayout(yLayout);
				if (result == null) result = caseYEmbeddable(yLayout);
				if (result == null) result = caseYEditable(yLayout);
				if (result == null) result = caseYEnable(yLayout);
				if (result == null) result = caseYElement(yLayout);
				if (result == null) result = caseYCssAble(yLayout);
				if (result == null) result = caseYVisibleable(yLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YFIELD: {
				YField yField = (YField)theEObject;
				T result = caseYField(yField);
				if (result == null) result = caseYEmbeddable(yField);
				if (result == null) result = caseYEditable(yField);
				if (result == null) result = caseYEnable(yField);
				if (result == null) result = caseYFocusable(yField);
				if (result == null) result = caseYElement(yField);
				if (result == null) result = caseYCssAble(yField);
				if (result == null) result = caseYVisibleable(yField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVIEW: {
				YView yView = (YView)theEObject;
				T result = caseYView(yView);
				if (result == null) result = caseYElement(yView);
				if (result == null) result = caseYCssAble(yView);
				if (result == null) result = caseYMarginable(yView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVIEW_SET: {
				YViewSet yViewSet = (YViewSet)theEObject;
				T result = caseYViewSet(yViewSet);
				if (result == null) result = caseYElement(yViewSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YBEAN_SLOT: {
				YBeanSlot yBeanSlot = (YBeanSlot)theEObject;
				T result = caseYBeanSlot(yBeanSlot);
				if (result == null) result = caseYBindable(yBeanSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE: {
				YEmbeddable yEmbeddable = (YEmbeddable)theEObject;
				T result = caseYEmbeddable(yEmbeddable);
				if (result == null) result = caseYElement(yEmbeddable);
				if (result == null) result = caseYCssAble(yEmbeddable);
				if (result == null) result = caseYVisibleable(yEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YDIALOG: {
				YDialog yDialog = (YDialog)theEObject;
				T result = caseYDialog(yDialog);
				if (result == null) result = caseYElement(yDialog);
				if (result == null) result = caseYValueBindable(yDialog);
				if (result == null) result = caseYCssAble(yDialog);
				if (result == null) result = caseYBindable(yDialog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCSS_ABLE: {
				YCssAble yCssAble = (YCssAble)theEObject;
				T result = caseYCssAble(yCssAble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YMARGINABLE: {
				YMarginable yMarginable = (YMarginable)theEObject;
				T result = caseYMarginable(yMarginable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YSPACINGABLE: {
				YSpacingable ySpacingable = (YSpacingable)theEObject;
				T result = caseYSpacingable(ySpacingable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YHEIGHTABLE: {
				YHeightable yHeightable = (YHeightable)theEObject;
				T result = caseYHeightable(yHeightable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YWIDTHABLE: {
				YWidthable yWidthable = (YWidthable)theEObject;
				T result = caseYWidthable(yWidthable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YACTIVATEABLE: {
				YActivateable yActivateable = (YActivateable)theEObject;
				T result = caseYActivateable(yActivateable);
				if (result == null) result = caseYBindable(yActivateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVISIBLEABLE: {
				YVisibleable yVisibleable = (YVisibleable)theEObject;
				T result = caseYVisibleable(yVisibleable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEDITABLE: {
				YEditable yEditable = (YEditable)theEObject;
				T result = caseYEditable(yEditable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YENABLE: {
				YEnable yEnable = (YEnable)theEObject;
				T result = caseYEnable(yEnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YFOCUSABLE: {
				YFocusable yFocusable = (YFocusable)theEObject;
				T result = caseYFocusable(yFocusable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YACTION: {
				YAction yAction = (YAction)theEObject;
				T result = caseYAction(yAction);
				if (result == null) result = caseYEmbeddable(yAction);
				if (result == null) result = caseYEnable(yAction);
				if (result == null) result = caseYElement(yAction);
				if (result == null) result = caseYCssAble(yAction);
				if (result == null) result = caseYVisibleable(yAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YBINDABLE: {
				YBindable yBindable = (YBindable)theEObject;
				T result = caseYBindable(yBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVALUE_BINDABLE: {
				YValueBindable yValueBindable = (YValueBindable)theEObject;
				T result = caseYValueBindable(yValueBindable);
				if (result == null) result = caseYBindable(yValueBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YSELECTION_BINDABLE: {
				YSelectionBindable ySelectionBindable = (YSelectionBindable)theEObject;
				T result = caseYSelectionBindable(ySelectionBindable);
				if (result == null) result = caseYBindable(ySelectionBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YMULTI_SELECTION_BINDABLE: {
				YMultiSelectionBindable yMultiSelectionBindable = (YMultiSelectionBindable)theEObject;
				T result = caseYMultiSelectionBindable(yMultiSelectionBindable);
				if (result == null) result = caseYBindable(yMultiSelectionBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCOLLECTION_BINDABLE: {
				YCollectionBindable yCollectionBindable = (YCollectionBindable)theEObject;
				T result = caseYCollectionBindable(yCollectionBindable);
				if (result == null) result = caseYBindable(yCollectionBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCONTEXT_VALUE_BINDING_ENDPOINT: {
				YContextValueBindingEndpoint yContextValueBindingEndpoint = (YContextValueBindingEndpoint)theEObject;
				T result = caseYContextValueBindingEndpoint(yContextValueBindingEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yContextValueBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yContextValueBindingEndpoint);
				if (result == null) result = caseYElement(yContextValueBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YBEAN_SLOT_VALUE_BINDING_ENDPOINT: {
				YBeanSlotValueBindingEndpoint yBeanSlotValueBindingEndpoint = (YBeanSlotValueBindingEndpoint)theEObject;
				T result = caseYBeanSlotValueBindingEndpoint(yBeanSlotValueBindingEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yBeanSlotValueBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yBeanSlotValueBindingEndpoint);
				if (result == null) result = caseYElement(yBeanSlotValueBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT: {
				YBeanSlotListBindingEndpoint yBeanSlotListBindingEndpoint = (YBeanSlotListBindingEndpoint)theEObject;
				T result = caseYBeanSlotListBindingEndpoint(yBeanSlotListBindingEndpoint);
				if (result == null) result = caseYListBindingEndpoint(yBeanSlotListBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yBeanSlotListBindingEndpoint);
				if (result == null) result = caseYElement(yBeanSlotListBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_BINDING_ENDPOINT: {
				YEmbeddableBindingEndpoint yEmbeddableBindingEndpoint = (YEmbeddableBindingEndpoint)theEObject;
				T result = caseYEmbeddableBindingEndpoint(yEmbeddableBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT: {
				YEmbeddableValueEndpoint yEmbeddableValueEndpoint = (YEmbeddableValueEndpoint)theEObject;
				T result = caseYEmbeddableValueEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYElement(yEmbeddableValueEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT: {
				YEmbeddableSelectionEndpoint yEmbeddableSelectionEndpoint = (YEmbeddableSelectionEndpoint)theEObject;
				T result = caseYEmbeddableSelectionEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYElement(yEmbeddableSelectionEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_MULTI_SELECTION_ENDPOINT: {
				YEmbeddableMultiSelectionEndpoint yEmbeddableMultiSelectionEndpoint = (YEmbeddableMultiSelectionEndpoint)theEObject;
				T result = caseYEmbeddableMultiSelectionEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYListBindingEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYElement(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_COLLECTION_ENDPOINT: {
				YEmbeddableCollectionEndpoint yEmbeddableCollectionEndpoint = (YEmbeddableCollectionEndpoint)theEObject;
				T result = caseYEmbeddableCollectionEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYListBindingEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYElement(yEmbeddableCollectionEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YACTIVATED_ENDPOINT: {
				YActivatedEndpoint yActivatedEndpoint = (YActivatedEndpoint)theEObject;
				T result = caseYActivatedEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYBindingEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYElement(yActivatedEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YDT_WRAPPER: {
				YDtWrapper yDtWrapper = (YDtWrapper)theEObject;
				T result = caseYDtWrapper(yDtWrapper);
				if (result == null) result = caseYDatatype(yDtWrapper);
				if (result == null) result = caseYDtBase(yDtWrapper);
				if (result == null) result = caseYElement(yDtWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCOMMAND: {
				YCommand yCommand = (YCommand)theEObject;
				T result = caseYCommand(yCommand);
				if (result == null) result = caseYElement(yCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCOMMAND_SET: {
				YCommandSet yCommandSet = (YCommandSet)theEObject;
				T result = caseYCommandSet(yCommandSet);
				if (result == null) result = caseYElement(yCommandSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YOPEN_DIALOG_COMMAND: {
				YOpenDialogCommand yOpenDialogCommand = (YOpenDialogCommand)theEObject;
				T result = caseYOpenDialogCommand(yOpenDialogCommand);
				if (result == null) result = caseYCommand(yOpenDialogCommand);
				if (result == null) result = caseYElement(yOpenDialogCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEXPOSED_ACTION: {
				YExposedAction yExposedAction = (YExposedAction)theEObject;
				T result = caseYExposedAction(yExposedAction);
				if (result == null) result = caseYElement(yExposedAction);
				if (result == null) result = caseYEnable(yExposedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YSEND_EVENT_COMMAND: {
				YSendEventCommand ySendEventCommand = (YSendEventCommand)theEObject;
				T result = caseYSendEventCommand(ySendEventCommand);
				if (result == null) result = caseYCommand(ySendEventCommand);
				if (result == null) result = caseYElement(ySendEventCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YKEY_STROKE_DEFINITION: {
				YKeyStrokeDefinition yKeyStrokeDefinition = (YKeyStrokeDefinition)theEObject;
				T result = caseYKeyStrokeDefinition(yKeyStrokeDefinition);
				if (result == null) result = caseYElement(yKeyStrokeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCONVERTER: {
				YConverter yConverter = (YConverter)theEObject;
				T result = caseYConverter(yConverter);
				if (result == null) result = caseYElement(yConverter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YDELEGATE_CONVERTER: {
				YDelegateConverter yDelegateConverter = (YDelegateConverter)theEObject;
				T result = caseYDelegateConverter(yDelegateConverter);
				if (result == null) result = caseYConverter(yDelegateConverter);
				if (result == null) result = caseYElement(yDelegateConverter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>YString To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YString To String Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYStringToStringMap(Map.Entry<String, String> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YView</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YView</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYView(YView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YView Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YView Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYViewSet(YViewSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBean Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBean Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBeanSlot(YBeanSlot object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YDialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDialog(YDialog object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YHeightable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YHeightable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYHeightable(YHeightable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YWidthable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YWidthable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYWidthable(YWidthable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YFocusable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YFocusable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYFocusable(YFocusable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YContext Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YContext Value Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYContextValueBindingEndpoint(YContextValueBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBean Slot Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBean Slot Value Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBeanSlotValueBindingEndpoint(YBeanSlotValueBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBean Slot List Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBean Slot List Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBeanSlotListBindingEndpoint(YBeanSlotListBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableBindingEndpoint(YEmbeddableBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Value Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Value Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableValueEndpoint(YEmbeddableValueEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Selection Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableSelectionEndpoint(YEmbeddableSelectionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableMultiSelectionEndpoint(YEmbeddableMultiSelectionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Collection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Collection Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableCollectionEndpoint(YEmbeddableCollectionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YActivated Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YActivated Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYActivatedEndpoint(YActivatedEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDt Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDt Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDtWrapper(YDtWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCommand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCommand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCommand(YCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCommand Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCommand Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCommandSet(YCommandSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YOpen Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YOpen Dialog Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYOpenDialogCommand(YOpenDialogCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YExposed Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YExposed Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYExposedAction(YExposedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSend Event Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSend Event Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSendEventCommand(YSendEventCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YKey Stroke Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YKey Stroke Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYKeyStrokeDefinition(YKeyStrokeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YConverter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YConverter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYConverter(YConverter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDelegate Converter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDelegate Converter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDelegateConverter(YDelegateConverter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBinding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBinding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindingEndpoint(YBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValue Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValue Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValueBindingEndpoint(YValueBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YList Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YList Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYListBindingEndpoint(YListBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDt Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDt Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDtBase(YDtBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDatatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDatatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDatatype(YDatatype object) {
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

} //UiModelSwitch
