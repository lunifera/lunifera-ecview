/**
 */
package org.lunifera.ecview.core.extension.model.extension.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YRemoveFromTableCommand;
import org.lunifera.ecview.core.extension.model.extension.YTable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YRemove From Table Command</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YRemoveFromTableCommandImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YRemoveFromTableCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YRemoveFromTableCommandImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YRemoveFromTableCommandImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YRemoveFromTableCommandImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YRemoveFromTableCommandImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YRemoveFromTableCommandImpl extends MinimalEObjectImpl.Container
		implements YRemoveFromTableCommand {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected YTable table;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Object trigger = TRIGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YRemoveFromTableCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YREMOVE_FROM_TABLE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TAGS);
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
			properties = new EcoreEMap<String,String>(CoreModelPackage.Literals.YSTRING_TO_STRING_MAP, YStringToStringMapImpl.class, this, ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YTable getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (YTable)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YTable basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(YTable newTable) {
		YTable oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Object newTrigger) {
		Object oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YView getViewGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public YView getView() {
		return findViewGeneric(eContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	protected YView findViewGeneric(EObject container) {
		if (container == null) {
			return null;
		}
		if (container instanceof YView) {
			return (YView) container;
		} else if (container instanceof YLayout) {
			return ((YLayout) container).getView();
		} else {
			EObject parent = container.eContainer();
			return findViewGeneric(parent);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__ID:
				return getId();
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__NAME:
				return getName();
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TAGS:
				return getTags();
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TRIGGER:
				return getTrigger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__ID:
				setId((String)newValue);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__NAME:
				setName((String)newValue);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TABLE:
				setTable((YTable)newValue);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TRIGGER:
				setTrigger(newValue);
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
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TAGS:
				getTags().clear();
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__PROPERTIES:
				getProperties().clear();
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TABLE:
				setTable((YTable)null);
				return;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
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
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TAGS:
				return tags != null && !tags.isEmpty();
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TABLE:
				return table != null;
			case ExtensionModelPackage.YREMOVE_FROM_TABLE_COMMAND__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", tags: ");
		result.append(tags);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(')');
		return result.toString();
	}

	public YECViewModelValueBindingEndpoint createTriggerEndpointGen() {
		throw new UnsupportedOperationException();
	}

	@Override
	public YECViewModelValueBindingEndpoint createTriggerEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) ExtensionModelPackage.Literals.YREMOVE_FROM_TABLE_COMMAND__TRIGGER);
		return endpoint;
	}

} // YRemoveFromTableCommandImpl
