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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YBean Slot</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YBeanSlotImpl#getValueTypeQualifiedName <em>Value Type Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YBeanSlotImpl extends MinimalEObjectImpl.Container implements
		YBeanSlot {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> valueType;

	/**
	 * The default value of the '{@link #getValueTypeQualifiedName() <em>Value Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueTypeQualifiedName() <em>Value Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String valueTypeQualifiedName = VALUE_TYPE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YBeanSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YBEAN_SLOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(Class<?> newValueType) {
		Class<?> oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueTypeQualifiedName() {
		return valueTypeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTypeQualifiedName(String newValueTypeQualifiedName) {
		String oldValueTypeQualifiedName = valueTypeQualifiedName;
		valueTypeQualifiedName = newValueTypeQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME, oldValueTypeQualifiedName, valueTypeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT__NAME:
				return getName();
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE:
				return getValueType();
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME:
				return getValueTypeQualifiedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE:
				setValueType((Class<?>)newValue);
				return;
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME:
				setValueTypeQualifiedName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE:
				setValueType((Class<?>)null);
				return;
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME:
				setValueTypeQualifiedName(VALUE_TYPE_QUALIFIED_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE:
				return valueType != null;
			case CoreModelPackage.YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME:
				return VALUE_TYPE_QUALIFIED_NAME_EDEFAULT == null ? valueTypeQualifiedName != null : !VALUE_TYPE_QUALIFIED_NAME_EDEFAULT.equals(valueTypeQualifiedName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", valueTypeQualifiedName: ");
		result.append(valueTypeQualifiedName);
		result.append(')');
		return result.toString();
	}

	@Override
	public YBeanSlotValueBindingEndpoint createBindingEndpoint(String path) {
		YBeanSlotValueBindingEndpoint yEndpoint = CoreModelFactory.eINSTANCE
				.createYBeanSlotValueBindingEndpoint();
		yEndpoint.setBeanSlot(this);
		yEndpoint.setAttributePath(path);
		return yEndpoint;
	}

	@Override
	public YBeanSlotListBindingEndpoint createListBindingEndpoint(String path,
			Class<?> collectionType) {
		YBeanSlotListBindingEndpoint yEndpoint = CoreModelFactory.eINSTANCE
				.createYBeanSlotListBindingEndpoint();
		yEndpoint.setBeanSlot(this);
		yEndpoint.setCollectionType(collectionType);
		yEndpoint.setAttributePath(path);
		return yEndpoint;
	}

} // YBeanSlotImpl
