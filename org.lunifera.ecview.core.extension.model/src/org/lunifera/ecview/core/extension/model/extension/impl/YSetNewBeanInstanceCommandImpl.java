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
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.impl.YStringToStringMapImpl;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YSetNewBeanInstanceCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YSet New Bean Instance Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSetNewBeanInstanceCommandImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YSetNewBeanInstanceCommandImpl extends MinimalEObjectImpl.Container implements YSetNewBeanInstanceCommand {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected YValueBindingEndpoint target;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Object trigger = TRIGGER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YSetNewBeanInstanceCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YSET_NEW_BEAN_INSTANCE_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TAGS);
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
			properties = new EcoreEMap<String,String>(CoreModelPackage.Literals.YSTRING_TO_STRING_MAP, YStringToStringMapImpl.class, this, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (YValueBindingEndpoint)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject)target;
				NotificationChain msgs = oldTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(YValueBindingEndpoint newTarget, NotificationChain msgs) {
		YValueBindingEndpoint oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(YValueBindingEndpoint newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Object newTrigger) {
		Object oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TRIGGER, oldTrigger, trigger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__EMF_NS_URI, oldEmfNsURI, emfNsURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, typeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__ID:
				return getId();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__NAME:
				return getName();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TAGS:
				return getTags();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TRIGGER:
				return getTrigger();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE:
				return getType();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__EMF_NS_URI:
				return getEmfNsURI();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
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
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__ID:
				setId((String)newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__NAME:
				setName((String)newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET:
				setTarget((YValueBindingEndpoint)newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TRIGGER:
				setTrigger(newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE:
				setType((Class<?>)newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__EMF_NS_URI:
				setEmfNsURI((String)newValue);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((String)newValue);
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
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TAGS:
				getTags().clear();
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__PROPERTIES:
				getProperties().clear();
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET:
				setTarget((YValueBindingEndpoint)null);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE:
				setType((Class<?>)null);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__EMF_NS_URI:
				setEmfNsURI(EMF_NS_URI_EDEFAULT);
				return;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName(TYPE_QUALIFIED_NAME_EDEFAULT);
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
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TAGS:
				return tags != null && !tags.isEmpty();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET:
				return target != null;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE:
				return type != null;
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__EMF_NS_URI:
				return EMF_NS_URI_EDEFAULT == null ? emfNsURI != null : !EMF_NS_URI_EDEFAULT.equals(emfNsURI);
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TYPE_QUALIFIED_NAME:
				return TYPE_QUALIFIED_NAME_EDEFAULT == null ? typeQualifiedName != null : !TYPE_QUALIFIED_NAME_EDEFAULT.equals(typeQualifiedName);
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
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", type: ");
		result.append(type);
		result.append(", emfNsURI: ");
		result.append(emfNsURI);
		result.append(", typeQualifiedName: ");
		result.append(typeQualifiedName);
		result.append(')');
		return result.toString();
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
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ExtensionModelPackage.YSET_NEW_BEAN_INSTANCE_COMMAND__TARGET:
				return basicSetTarget(null, msgs);
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
	
	public YECViewModelValueBindingEndpoint createTriggerEndpointGen() {
		throw new UnsupportedOperationException();
	}

	@Override
	public YECViewModelValueBindingEndpoint createTriggerEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) ExtensionModelPackage.Literals.YSET_NEW_BEAN_INSTANCE_COMMAND__TRIGGER);
		return endpoint;
	}

} //YSetNewBeanInstanceCommandImpl
