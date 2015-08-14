/**
 */
package org.lunifera.ecview.core.common.model.core.impl;

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
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YDelegateConverter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YDelegate Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YDelegateConverterImpl#getConverterId <em>Converter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YDelegateConverterImpl extends MinimalEObjectImpl.Container implements YDelegateConverter {
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
	 * The default value of the '{@link #getConverterId() <em>Converter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConverterId() <em>Converter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterId()
	 * @generated
	 * @ordered
	 */
	protected String converterId = CONVERTER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YDelegateConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YDELEGATE_CONVERTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDELEGATE_CONVERTER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDELEGATE_CONVERTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CoreModelPackage.YDELEGATE_CONVERTER__TAGS);
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
			properties = new EcoreEMap<String,String>(CoreModelPackage.Literals.YSTRING_TO_STRING_MAP, YStringToStringMapImpl.class, this, CoreModelPackage.YDELEGATE_CONVERTER__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConverterId() {
		return converterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverterId(String newConverterId) {
		String oldConverterId = converterId;
		converterId = newConverterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDELEGATE_CONVERTER__CONVERTER_ID, oldConverterId, converterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YDELEGATE_CONVERTER__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case CoreModelPackage.YDELEGATE_CONVERTER__ID:
				return getId();
			case CoreModelPackage.YDELEGATE_CONVERTER__NAME:
				return getName();
			case CoreModelPackage.YDELEGATE_CONVERTER__TAGS:
				return getTags();
			case CoreModelPackage.YDELEGATE_CONVERTER__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case CoreModelPackage.YDELEGATE_CONVERTER__CONVERTER_ID:
				return getConverterId();
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
			case CoreModelPackage.YDELEGATE_CONVERTER__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__CONVERTER_ID:
				setConverterId((String)newValue);
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
			case CoreModelPackage.YDELEGATE_CONVERTER__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__TAGS:
				getTags().clear();
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__PROPERTIES:
				getProperties().clear();
				return;
			case CoreModelPackage.YDELEGATE_CONVERTER__CONVERTER_ID:
				setConverterId(CONVERTER_ID_EDEFAULT);
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
			case CoreModelPackage.YDELEGATE_CONVERTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YDELEGATE_CONVERTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YDELEGATE_CONVERTER__TAGS:
				return tags != null && !tags.isEmpty();
			case CoreModelPackage.YDELEGATE_CONVERTER__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CoreModelPackage.YDELEGATE_CONVERTER__CONVERTER_ID:
				return CONVERTER_ID_EDEFAULT == null ? converterId != null : !CONVERTER_ID_EDEFAULT.equals(converterId);
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
		result.append(", converterId: ");
		result.append(converterId);
		result.append(')');
		return result.toString();
	}

} //YDelegateConverterImpl
