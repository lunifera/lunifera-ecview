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
package org.lunifera.ecview.core.extension.model.datatypes.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.lunifera.ecview.core.common.model.validation.YValidator;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage;
import org.lunifera.ecview.core.extension.model.datatypes.YTableDatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YTable Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTableDatatypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTableDatatypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTableDatatypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.datatypes.impl.YTableDatatypeImpl#getValidators <em>Validators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YTableDatatypeImpl extends MinimalEObjectImpl.Container implements YTableDatatype {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<YValidator> validators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YTableDatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtDatatypesPackage.Literals.YTABLE_DATATYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTABLE_DATATYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTABLE_DATATYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YTABLE_DATATYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectResolvingEList<YValidator>(YValidator.class, this, ExtDatatypesPackage.YTABLE_DATATYPE__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtDatatypesPackage.YTABLE_DATATYPE__ID:
				return getId();
			case ExtDatatypesPackage.YTABLE_DATATYPE__NAME:
				return getName();
			case ExtDatatypesPackage.YTABLE_DATATYPE__DESCRIPTION:
				return getDescription();
			case ExtDatatypesPackage.YTABLE_DATATYPE__VALIDATORS:
				return getValidators();
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
			case ExtDatatypesPackage.YTABLE_DATATYPE__ID:
				setId((String)newValue);
				return;
			case ExtDatatypesPackage.YTABLE_DATATYPE__NAME:
				setName((String)newValue);
				return;
			case ExtDatatypesPackage.YTABLE_DATATYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExtDatatypesPackage.YTABLE_DATATYPE__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends YValidator>)newValue);
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
			case ExtDatatypesPackage.YTABLE_DATATYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTABLE_DATATYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTABLE_DATATYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExtDatatypesPackage.YTABLE_DATATYPE__VALIDATORS:
				getValidators().clear();
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
			case ExtDatatypesPackage.YTABLE_DATATYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExtDatatypesPackage.YTABLE_DATATYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtDatatypesPackage.YTABLE_DATATYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExtDatatypesPackage.YTABLE_DATATYPE__VALIDATORS:
				return validators != null && !validators.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //YTableDatatypeImpl
