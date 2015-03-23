/**
 */
package org.lunifera.ecview.core.common.model.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YSendEventCommand;
import org.lunifera.ecview.core.common.model.core.YView;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YSend Event Command</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl#getEventTopic <em>Event Topic</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YSendEventCommandImpl#isAutoTrigger <em>Auto Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YSendEventCommandImpl extends MinimalEObjectImpl.Container
		implements YSendEventCommand {
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
	 * The default value of the '{@link #getEventTopic() <em>Event Topic</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEventTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventTopic() <em>Event Topic</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEventTopic()
	 * @generated
	 * @ordered
	 */
	protected String eventTopic = EVENT_TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final Object MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Object message = MESSAGE_EDEFAULT;

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
	 * The default value of the '{@link #isAutoTrigger() <em>Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAutoTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_TRIGGER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoTrigger() <em>Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAutoTrigger()
	 * @generated
	 * @ordered
	 */
	protected boolean autoTrigger = AUTO_TRIGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YSendEventCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YSEND_EVENT_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YSEND_EVENT_COMMAND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YSEND_EVENT_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CoreModelPackage.YSEND_EVENT_COMMAND__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventTopic() {
		return eventTopic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTopic(String newEventTopic) {
		String oldEventTopic = eventTopic;
		eventTopic = newEventTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YSEND_EVENT_COMMAND__EVENT_TOPIC, oldEventTopic, eventTopic));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Object newMessage) {
		Object oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YSEND_EVENT_COMMAND__MESSAGE, oldMessage, message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YSEND_EVENT_COMMAND__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoTrigger() {
		return autoTrigger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoTrigger(boolean newAutoTrigger) {
		boolean oldAutoTrigger = autoTrigger;
		autoTrigger = newAutoTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YSEND_EVENT_COMMAND__AUTO_TRIGGER, oldAutoTrigger, autoTrigger));
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
	public YECViewModelValueBindingEndpoint createTriggerEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YECViewModelValueBindingEndpoint createMessageEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YECViewModelValueBindingEndpoint createAutoTriggerEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YECViewModelValueBindingEndpoint createEventTopicEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@Override
	public YECViewModelValueBindingEndpoint createTriggerEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YSEND_EVENT_COMMAND__TRIGGER);
		return endpoint;

	}

	@Override
	public YECViewModelValueBindingEndpoint createMessageEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YSEND_EVENT_COMMAND__MESSAGE);
		return endpoint;

	}

	@Override
	public YECViewModelValueBindingEndpoint createAutoTriggerEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YSEND_EVENT_COMMAND__AUTO_TRIGGER);
		return endpoint;
	}

	@Override
	public YECViewModelValueBindingEndpoint createEventTopicEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YSEND_EVENT_COMMAND__EVENT_TOPIC);
		return endpoint;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YSEND_EVENT_COMMAND__ID:
				return getId();
			case CoreModelPackage.YSEND_EVENT_COMMAND__NAME:
				return getName();
			case CoreModelPackage.YSEND_EVENT_COMMAND__TAGS:
				return getTags();
			case CoreModelPackage.YSEND_EVENT_COMMAND__EVENT_TOPIC:
				return getEventTopic();
			case CoreModelPackage.YSEND_EVENT_COMMAND__MESSAGE:
				return getMessage();
			case CoreModelPackage.YSEND_EVENT_COMMAND__TRIGGER:
				return getTrigger();
			case CoreModelPackage.YSEND_EVENT_COMMAND__AUTO_TRIGGER:
				return isAutoTrigger();
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
			case CoreModelPackage.YSEND_EVENT_COMMAND__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__EVENT_TOPIC:
				setEventTopic((String)newValue);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__MESSAGE:
				setMessage(newValue);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__TRIGGER:
				setTrigger(newValue);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__AUTO_TRIGGER:
				setAutoTrigger((Boolean)newValue);
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
			case CoreModelPackage.YSEND_EVENT_COMMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__TAGS:
				getTags().clear();
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__EVENT_TOPIC:
				setEventTopic(EVENT_TOPIC_EDEFAULT);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case CoreModelPackage.YSEND_EVENT_COMMAND__AUTO_TRIGGER:
				setAutoTrigger(AUTO_TRIGGER_EDEFAULT);
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
			case CoreModelPackage.YSEND_EVENT_COMMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YSEND_EVENT_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YSEND_EVENT_COMMAND__TAGS:
				return tags != null && !tags.isEmpty();
			case CoreModelPackage.YSEND_EVENT_COMMAND__EVENT_TOPIC:
				return EVENT_TOPIC_EDEFAULT == null ? eventTopic != null : !EVENT_TOPIC_EDEFAULT.equals(eventTopic);
			case CoreModelPackage.YSEND_EVENT_COMMAND__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CoreModelPackage.YSEND_EVENT_COMMAND__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
			case CoreModelPackage.YSEND_EVENT_COMMAND__AUTO_TRIGGER:
				return autoTrigger != AUTO_TRIGGER_EDEFAULT;
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
		result.append(", eventTopic: ");
		result.append(eventTopic);
		result.append(", message: ");
		result.append(message);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", autoTrigger: ");
		result.append(autoTrigger);
		result.append(')');
		return result.toString();
	}

} // YSendEventCommandImpl
