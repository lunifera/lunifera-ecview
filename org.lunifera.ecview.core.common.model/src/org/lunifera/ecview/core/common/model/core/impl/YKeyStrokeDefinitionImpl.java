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
import org.lunifera.ecview.core.common.model.core.YKeyCode;
import org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition;
import org.lunifera.ecview.core.common.model.core.YModifierKey;
import org.lunifera.ecview.core.common.model.core.YView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YKey Stroke Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl#getKeyCode <em>Key Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YKeyStrokeDefinitionImpl#getModifierKeys <em>Modifier Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YKeyStrokeDefinitionImpl extends MinimalEObjectImpl.Container implements YKeyStrokeDefinition {
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
	 * The default value of the '{@link #getKeyCode() <em>Key Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCode()
	 * @generated
	 * @ordered
	 */
	protected static final YKeyCode KEY_CODE_EDEFAULT = YKeyCode.ENTER;

	/**
	 * The cached value of the '{@link #getKeyCode() <em>Key Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCode()
	 * @generated
	 * @ordered
	 */
	protected YKeyCode keyCode = KEY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModifierKeys() <em>Modifier Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifierKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<YModifierKey> modifierKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YKeyStrokeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YKEY_STROKE_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YKEY_STROKE_DEFINITION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YKEY_STROKE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CoreModelPackage.YKEY_STROKE_DEFINITION__TAGS);
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
			properties = new EcoreEMap<String,String>(CoreModelPackage.Literals.YSTRING_TO_STRING_MAP, YStringToStringMapImpl.class, this, CoreModelPackage.YKEY_STROKE_DEFINITION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YKeyCode getKeyCode() {
		return keyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyCode(YKeyCode newKeyCode) {
		YKeyCode oldKeyCode = keyCode;
		keyCode = newKeyCode == null ? KEY_CODE_EDEFAULT : newKeyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YKEY_STROKE_DEFINITION__KEY_CODE, oldKeyCode, keyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YModifierKey> getModifierKeys() {
		if (modifierKeys == null) {
			modifierKeys = new EDataTypeUniqueEList<YModifierKey>(YModifierKey.class, this, CoreModelPackage.YKEY_STROKE_DEFINITION__MODIFIER_KEYS);
		}
		return modifierKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YView getView() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YKEY_STROKE_DEFINITION__PROPERTIES:
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
			case CoreModelPackage.YKEY_STROKE_DEFINITION__ID:
				return getId();
			case CoreModelPackage.YKEY_STROKE_DEFINITION__NAME:
				return getName();
			case CoreModelPackage.YKEY_STROKE_DEFINITION__TAGS:
				return getTags();
			case CoreModelPackage.YKEY_STROKE_DEFINITION__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case CoreModelPackage.YKEY_STROKE_DEFINITION__KEY_CODE:
				return getKeyCode();
			case CoreModelPackage.YKEY_STROKE_DEFINITION__MODIFIER_KEYS:
				return getModifierKeys();
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
			case CoreModelPackage.YKEY_STROKE_DEFINITION__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__KEY_CODE:
				setKeyCode((YKeyCode)newValue);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__MODIFIER_KEYS:
				getModifierKeys().clear();
				getModifierKeys().addAll((Collection<? extends YModifierKey>)newValue);
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
			case CoreModelPackage.YKEY_STROKE_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__TAGS:
				getTags().clear();
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__PROPERTIES:
				getProperties().clear();
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__KEY_CODE:
				setKeyCode(KEY_CODE_EDEFAULT);
				return;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__MODIFIER_KEYS:
				getModifierKeys().clear();
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
			case CoreModelPackage.YKEY_STROKE_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YKEY_STROKE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YKEY_STROKE_DEFINITION__TAGS:
				return tags != null && !tags.isEmpty();
			case CoreModelPackage.YKEY_STROKE_DEFINITION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CoreModelPackage.YKEY_STROKE_DEFINITION__KEY_CODE:
				return keyCode != KEY_CODE_EDEFAULT;
			case CoreModelPackage.YKEY_STROKE_DEFINITION__MODIFIER_KEYS:
				return modifierKeys != null && !modifierKeys.isEmpty();
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
		result.append(", keyCode: ");
		result.append(keyCode);
		result.append(", modifierKeys: ");
		result.append(modifierKeys);
		result.append(')');
		return result.toString();
	}

} //YKeyStrokeDefinitionImpl
