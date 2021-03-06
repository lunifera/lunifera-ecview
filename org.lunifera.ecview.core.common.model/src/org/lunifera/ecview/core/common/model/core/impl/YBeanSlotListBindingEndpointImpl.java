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
package org.lunifera.ecview.core.common.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.binding.impl.YListBindingEndpointImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YBean Slot List Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl#getAttributePath <em>Attribute Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl#getBeanSlot <em>Bean Slot</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotListBindingEndpointImpl#getCollectionTypeQualifiedName <em>Collection Type Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YBeanSlotListBindingEndpointImpl extends YListBindingEndpointImpl implements YBeanSlotListBindingEndpoint {
	/**
	 * The default value of the '{@link #getAttributePath() <em>Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributePath() <em>Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePath()
	 * @generated
	 * @ordered
	 */
	protected String attributePath = ATTRIBUTE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBeanSlot() <em>Bean Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanSlot()
	 * @generated
	 * @ordered
	 */
	protected YBeanSlot beanSlot;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> collectionType;

	/**
	 * The default value of the '{@link #getCollectionTypeQualifiedName() <em>Collection Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_TYPE_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionTypeQualifiedName() <em>Collection Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String collectionTypeQualifiedName = COLLECTION_TYPE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YBeanSlotListBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YBEAN_SLOT_LIST_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributePath() {
		return attributePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributePath(String newAttributePath) {
		String oldAttributePath = attributePath;
		attributePath = newAttributePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH, oldAttributePath, attributePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBeanSlot getBeanSlot() {
		if (beanSlot != null && beanSlot.eIsProxy()) {
			InternalEObject oldBeanSlot = (InternalEObject)beanSlot;
			beanSlot = (YBeanSlot)eResolveProxy(oldBeanSlot);
			if (beanSlot != oldBeanSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT, oldBeanSlot, beanSlot));
			}
		}
		return beanSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBeanSlot basicGetBeanSlot() {
		return beanSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanSlot(YBeanSlot newBeanSlot) {
		YBeanSlot oldBeanSlot = beanSlot;
		beanSlot = newBeanSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT, oldBeanSlot, beanSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionType(Class<?> newCollectionType) {
		Class<?> oldCollectionType = collectionType;
		collectionType = newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionTypeQualifiedName() {
		return collectionTypeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionTypeQualifiedName(String newCollectionTypeQualifiedName) {
		String oldCollectionTypeQualifiedName = collectionTypeQualifiedName;
		collectionTypeQualifiedName = newCollectionTypeQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME, oldCollectionTypeQualifiedName, collectionTypeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				return getAttributePath();
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT:
				if (resolve) return getBeanSlot();
				return basicGetBeanSlot();
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE:
				return getCollectionType();
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME:
				return getCollectionTypeQualifiedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				setAttributePath((String)newValue);
				return;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT:
				setBeanSlot((YBeanSlot)newValue);
				return;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE:
				setCollectionType((Class<?>)newValue);
				return;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME:
				setCollectionTypeQualifiedName((String)newValue);
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
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				setAttributePath(ATTRIBUTE_PATH_EDEFAULT);
				return;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT:
				setBeanSlot((YBeanSlot)null);
				return;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE:
				setCollectionType((Class<?>)null);
				return;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME:
				setCollectionTypeQualifiedName(COLLECTION_TYPE_QUALIFIED_NAME_EDEFAULT);
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
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				return ATTRIBUTE_PATH_EDEFAULT == null ? attributePath != null : !ATTRIBUTE_PATH_EDEFAULT.equals(attributePath);
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT:
				return beanSlot != null;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE:
				return collectionType != null;
			case CoreModelPackage.YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME:
				return COLLECTION_TYPE_QUALIFIED_NAME_EDEFAULT == null ? collectionTypeQualifiedName != null : !COLLECTION_TYPE_QUALIFIED_NAME_EDEFAULT.equals(collectionTypeQualifiedName);
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
		result.append(" (attributePath: ");
		result.append(attributePath);
		result.append(", collectionType: ");
		result.append(collectionType);
		result.append(", collectionTypeQualifiedName: ");
		result.append(collectionTypeQualifiedName);
		result.append(')');
		return result.toString();
	}

} //YBeanSlotListBindingEndpointImpl
