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
package org.lunifera.ecview.core.common.model.binding.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YEC View Model List Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YECViewModelListBindingEndpointImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YECViewModelListBindingEndpointImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YECViewModelListBindingEndpointImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YECViewModelListBindingEndpointImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YECViewModelListBindingEndpointImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YECViewModelListBindingEndpointImpl#getEmfNsURI <em>Emf Ns URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YECViewModelListBindingEndpointImpl extends YListBindingEndpointImpl implements YECViewModelListBindingEndpoint {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EObject element;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> features;

	/**
	 * The default value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String propertyPath = PROPERTY_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> type;

	/**
	 * The default value of the '{@link #getTypeQualifiedName() <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeQualifiedName() <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String typeQualifiedName = TYPE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmfNsURI() <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String EMF_NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmfNsURI() <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfNsURI()
	 * @generated
	 * @ordered
	 */
	protected String emfNsURI = EMF_NS_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YECViewModelListBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BindingPackage.Literals.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyPath() {
		return propertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPath(String newPropertyPath) {
		String oldPropertyPath = propertyPath;
		propertyPath = newPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH, oldPropertyPath, propertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class<?> newType) {
		Class<?> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeQualifiedName() {
		return typeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeQualifiedName(String newTypeQualifiedName) {
		String oldTypeQualifiedName = typeQualifiedName;
		typeQualifiedName = newTypeQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, typeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmfNsURI() {
		return emfNsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfNsURI(String newEmfNsURI) {
		String oldEmfNsURI = emfNsURI;
		emfNsURI = newEmfNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__EMF_NS_URI, oldEmfNsURI, emfNsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES:
				return getFeatures();
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH:
				return getPropertyPath();
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE:
				return getType();
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__EMF_NS_URI:
				return getEmfNsURI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT:
				setElement((EObject)newValue);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH:
				setPropertyPath((String)newValue);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE:
				setType((Class<?>)newValue);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((String)newValue);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__EMF_NS_URI:
				setEmfNsURI((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT:
				setElement((EObject)null);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES:
				getFeatures().clear();
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE:
				setType((Class<?>)null);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName(TYPE_QUALIFIED_NAME_EDEFAULT);
				return;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__EMF_NS_URI:
				setEmfNsURI(EMF_NS_URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT:
				return element != null;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES:
				return features != null && !features.isEmpty();
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE:
				return type != null;
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE_QUALIFIED_NAME:
				return TYPE_QUALIFIED_NAME_EDEFAULT == null ? typeQualifiedName != null : !TYPE_QUALIFIED_NAME_EDEFAULT.equals(typeQualifiedName);
			case BindingPackage.YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__EMF_NS_URI:
				return EMF_NS_URI_EDEFAULT == null ? emfNsURI != null : !EMF_NS_URI_EDEFAULT.equals(emfNsURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyPath: ");
		result.append(propertyPath);
		result.append(", type: ");
		result.append(type);
		result.append(", typeQualifiedName: ");
		result.append(typeQualifiedName);
		result.append(", emfNsURI: ");
		result.append(emfNsURI);
		result.append(')');
		return result.toString();
	}

} //YECViewModelListBindingEndpointImpl
