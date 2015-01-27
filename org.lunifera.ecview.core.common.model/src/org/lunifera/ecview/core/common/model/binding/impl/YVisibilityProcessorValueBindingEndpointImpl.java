/**
 */
package org.lunifera.ecview.core.common.model.binding.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.binding.BindingPackage;
import org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YVisibility Processor Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YVisibilityProcessorValueBindingEndpointImpl#getProcessorInstance <em>Processor Instance</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.binding.impl.YVisibilityProcessorValueBindingEndpointImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YVisibilityProcessorValueBindingEndpointImpl extends YValueBindingEndpointImpl implements YVisibilityProcessorValueBindingEndpoint {
	/**
	 * The default value of the '{@link #getProcessorInstance() <em>Processor Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorInstance()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROCESSOR_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorInstance() <em>Processor Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorInstance()
	 * @generated
	 * @ordered
	 */
	protected Object processorInstance = PROCESSOR_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YVisibilityProcessorValueBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BindingPackage.Literals.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProcessorInstance() {
		return processorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorInstance(Object newProcessorInstance) {
		Object oldProcessorInstance = processorInstance;
		processorInstance = newProcessorInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROCESSOR_INSTANCE, oldProcessorInstance, processorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROCESSOR_INSTANCE:
				return getProcessorInstance();
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROPERTY:
				return getProperty();
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
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROCESSOR_INSTANCE:
				setProcessorInstance(newValue);
				return;
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROPERTY:
				setProperty((String)newValue);
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
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROCESSOR_INSTANCE:
				setProcessorInstance(PROCESSOR_INSTANCE_EDEFAULT);
				return;
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
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
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROCESSOR_INSTANCE:
				return PROCESSOR_INSTANCE_EDEFAULT == null ? processorInstance != null : !PROCESSOR_INSTANCE_EDEFAULT.equals(processorInstance);
			case BindingPackage.YVISIBILITY_PROCESSOR_VALUE_BINDING_ENDPOINT__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
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
		result.append(" (processorInstance: ");
		result.append(processorInstance);
		result.append(", property: ");
		result.append(property);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public boolean isBindsElement(YElement element) {
		return false;
	}

} //YVisibilityProcessorValueBindingEndpointImpl
