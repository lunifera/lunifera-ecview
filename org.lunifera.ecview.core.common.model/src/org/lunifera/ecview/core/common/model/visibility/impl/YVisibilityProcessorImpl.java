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
package org.lunifera.ecview.core.common.model.visibility.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YVisibility Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getDataUsed <em>Data Used</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getTriggersOn <em>Triggers On</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityProcessorImpl#getDelegateQualifiedName <em>Delegate Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YVisibilityProcessorImpl extends MinimalEObjectImpl.Container implements YVisibilityProcessor {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> properties;

	/**
	 * The cached value of the '{@link #getDataUsed() <em>Data Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<YBinding> dataUsed;

	/**
	 * The cached value of the '{@link #getTriggersOn() <em>Triggers On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersOn()
	 * @generated
	 * @ordered
	 */
	protected EList<YBinding> triggersOn;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Class<?> delegate;

	/**
	 * The default value of the '{@link #getDelegateQualifiedName() <em>Delegate Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATE_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegateQualifiedName() <em>Delegate Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String delegateQualifiedName = DELEGATE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YVisibilityProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.YVISIBILITY_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, VisibilityPackage.YVISIBILITY_PROCESSOR__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,String>(CoreModelPackage.Literals.YSTRING_TO_STRING_MAP, YStringToStringMapImpl.class, this, VisibilityPackage.YVISIBILITY_PROCESSOR__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YBinding> getDataUsed() {
		if (dataUsed == null) {
			dataUsed = new EObjectContainmentEList.Resolving<YBinding>(YBinding.class, this, VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED);
		}
		return dataUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YBinding> getTriggersOn() {
		if (triggersOn == null) {
			triggersOn = new EObjectContainmentEList.Resolving<YBinding>(YBinding.class, this, VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON);
		}
		return triggersOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Class<?> newDelegate) {
		Class<?> oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelegateQualifiedName() {
		return delegateQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateQualifiedName(String newDelegateQualifiedName) {
		String oldDelegateQualifiedName = delegateQualifiedName;
		delegateQualifiedName = newDelegateQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME, oldDelegateQualifiedName, delegateQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED:
				return ((InternalEList<?>)getDataUsed()).basicRemove(otherEnd, msgs);
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON:
				return ((InternalEList<?>)getTriggersOn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				return getId();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				return getName();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TAGS:
				return getTags();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED:
				return getDataUsed();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON:
				return getTriggersOn();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE:
				return getDelegate();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME:
				return getDelegateQualifiedName();
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				setId((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED:
				getDataUsed().clear();
				getDataUsed().addAll((Collection<? extends YBinding>)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON:
				getTriggersOn().clear();
				getTriggersOn().addAll((Collection<? extends YBinding>)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE:
				setDelegate((Class<?>)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME:
				setDelegateQualifiedName((String)newValue);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				setId(ID_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TAGS:
				getTags().clear();
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PROPERTIES:
				getProperties().clear();
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED:
				getDataUsed().clear();
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON:
				getTriggersOn().clear();
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE:
				setDelegate((Class<?>)null);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME:
				setDelegateQualifiedName(DELEGATE_QUALIFIED_NAME_EDEFAULT);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TAGS:
				return tags != null && !tags.isEmpty();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DATA_USED:
				return dataUsed != null && !dataUsed.isEmpty();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__TRIGGERS_ON:
				return triggersOn != null && !triggersOn.isEmpty();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE:
				return delegate != null;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__DELEGATE_QUALIFIED_NAME:
				return DELEGATE_QUALIFIED_NAME_EDEFAULT == null ? delegateQualifiedName != null : !DELEGATE_QUALIFIED_NAME_EDEFAULT.equals(delegateQualifiedName);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", tags: ");
		result.append(tags);
		result.append(", delegate: ");
		result.append(delegate);
		result.append(", delegateQualifiedName: ");
		result.append(delegateQualifiedName);
		result.append(')');
		return result.toString();
	}

} //YVisibilityProcessorImpl
