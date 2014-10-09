/**
 */
package org.lunifera.ecview.core.extension.model.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YBindable;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.common.model.core.YValueBindable;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YBean Reference Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getValueBindingEndpoint <em>Value Binding Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getInMemoryBeanProvider <em>In Memory Bean Provider</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getInMemoryBeanProviderQualifiedName <em>In Memory Bean Provider Qualified Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getCaptionPropertyPath <em>Caption Property Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YBeanReferenceFieldImpl#getImagePropertyPath <em>Image Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YBeanReferenceFieldImpl extends YInputImpl implements YBeanReferenceField {
	/**
	 * The cached value of the '{@link #getValueBindingEndpoint() <em>Value Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBindingEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddableValueEndpoint valueBindingEndpoint;

	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getInMemoryBeanProvider() <em>In Memory Bean Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMemoryBeanProvider()
	 * @generated
	 * @ordered
	 */
	protected Class<?> inMemoryBeanProvider;

	/**
	 * The default value of the '{@link #getInMemoryBeanProviderQualifiedName() <em>In Memory Bean Provider Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMemoryBeanProviderQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInMemoryBeanProviderQualifiedName() <em>In Memory Bean Provider Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMemoryBeanProviderQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String inMemoryBeanProviderQualifiedName = IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionPropertyPath() <em>Caption Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionPropertyPath() <em>Caption Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String captionPropertyPath = CAPTION_PROPERTY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getImagePropertyPath() <em>Image Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePropertyPath() <em>Image Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String imagePropertyPath = IMAGE_PROPERTY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YBeanReferenceFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YBEAN_REFERENCE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint getValueBindingEndpoint() {
		if (valueBindingEndpoint != null && valueBindingEndpoint.eIsProxy()) {
			InternalEObject oldValueBindingEndpoint = (InternalEObject)valueBindingEndpoint;
			valueBindingEndpoint = (YEmbeddableValueEndpoint)eResolveProxy(oldValueBindingEndpoint);
			if (valueBindingEndpoint != oldValueBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, valueBindingEndpoint));
			}
		}
		return valueBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint basicGetValueBindingEndpoint() {
		return valueBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBindingEndpoint(YEmbeddableValueEndpoint newValueBindingEndpoint, NotificationChain msgs) {
		YEmbeddableValueEndpoint oldValueBindingEndpoint = valueBindingEndpoint;
		valueBindingEndpoint = newValueBindingEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, newValueBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBindingEndpoint(YEmbeddableValueEndpoint newValueBindingEndpoint) {
		if (newValueBindingEndpoint != valueBindingEndpoint) {
			NotificationChain msgs = null;
			if (valueBindingEndpoint != null)
				msgs = ((InternalEObject)valueBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
			if (newValueBindingEndpoint != null)
				msgs = ((InternalEObject)newValueBindingEndpoint).eInverseAdd(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
			msgs = basicSetValueBindingEndpoint(newValueBindingEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT, newValueBindingEndpoint, newValueBindingEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__EMF_NS_URI, oldEmfNsURI, emfNsURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, typeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getInMemoryBeanProvider() {
		return inMemoryBeanProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMemoryBeanProvider(Class<?> newInMemoryBeanProvider) {
		Class<?> oldInMemoryBeanProvider = inMemoryBeanProvider;
		inMemoryBeanProvider = newInMemoryBeanProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, oldInMemoryBeanProvider, inMemoryBeanProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInMemoryBeanProviderQualifiedName() {
		return inMemoryBeanProviderQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMemoryBeanProviderQualifiedName(String newInMemoryBeanProviderQualifiedName) {
		String oldInMemoryBeanProviderQualifiedName = inMemoryBeanProviderQualifiedName;
		inMemoryBeanProviderQualifiedName = newInMemoryBeanProviderQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME, oldInMemoryBeanProviderQualifiedName, inMemoryBeanProviderQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionPropertyPath() {
		return captionPropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionPropertyPath(String newCaptionPropertyPath) {
		String oldCaptionPropertyPath = captionPropertyPath;
		captionPropertyPath = newCaptionPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__CAPTION_PROPERTY_PATH, oldCaptionPropertyPath, captionPropertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePropertyPath() {
		return imagePropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePropertyPath(String newImagePropertyPath) {
		String oldImagePropertyPath = imagePropertyPath;
		imagePropertyPath = newImagePropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IMAGE_PROPERTY_PATH, oldImagePropertyPath, imagePropertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint createValueEndpoint() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT:
				if (valueBindingEndpoint != null)
					msgs = ((InternalEObject)valueBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
				return basicSetValueBindingEndpoint((YEmbeddableValueEndpoint)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT:
				return basicSetValueBindingEndpoint(null, msgs);
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
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT:
				if (resolve) return getValueBindingEndpoint();
				return basicGetValueBindingEndpoint();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE:
				return getValue();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE:
				return getType();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__EMF_NS_URI:
				return getEmfNsURI();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				return getInMemoryBeanProvider();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME:
				return getInMemoryBeanProviderQualifiedName();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__CAPTION_PROPERTY_PATH:
				return getCaptionPropertyPath();
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IMAGE_PROPERTY_PATH:
				return getImagePropertyPath();
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
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE:
				setValue(newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE:
				setType((Class<?>)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__EMF_NS_URI:
				setEmfNsURI((String)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((String)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				setInMemoryBeanProvider((Class<?>)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME:
				setInMemoryBeanProviderQualifiedName((String)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__CAPTION_PROPERTY_PATH:
				setCaptionPropertyPath((String)newValue);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IMAGE_PROPERTY_PATH:
				setImagePropertyPath((String)newValue);
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
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)null);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE:
				setType((Class<?>)null);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__EMF_NS_URI:
				setEmfNsURI(EMF_NS_URI_EDEFAULT);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName(TYPE_QUALIFIED_NAME_EDEFAULT);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				setInMemoryBeanProvider((Class<?>)null);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME:
				setInMemoryBeanProviderQualifiedName(IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME_EDEFAULT);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__CAPTION_PROPERTY_PATH:
				setCaptionPropertyPath(CAPTION_PROPERTY_PATH_EDEFAULT);
				return;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IMAGE_PROPERTY_PATH:
				setImagePropertyPath(IMAGE_PROPERTY_PATH_EDEFAULT);
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
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT:
				return valueBindingEndpoint != null;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE:
				return type != null;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__EMF_NS_URI:
				return EMF_NS_URI_EDEFAULT == null ? emfNsURI != null : !EMF_NS_URI_EDEFAULT.equals(emfNsURI);
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__TYPE_QUALIFIED_NAME:
				return TYPE_QUALIFIED_NAME_EDEFAULT == null ? typeQualifiedName != null : !TYPE_QUALIFIED_NAME_EDEFAULT.equals(typeQualifiedName);
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				return inMemoryBeanProvider != null;
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME:
				return IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME_EDEFAULT == null ? inMemoryBeanProviderQualifiedName != null : !IN_MEMORY_BEAN_PROVIDER_QUALIFIED_NAME_EDEFAULT.equals(inMemoryBeanProviderQualifiedName);
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__CAPTION_PROPERTY_PATH:
				return CAPTION_PROPERTY_PATH_EDEFAULT == null ? captionPropertyPath != null : !CAPTION_PROPERTY_PATH_EDEFAULT.equals(captionPropertyPath);
			case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__IMAGE_PROPERTY_PATH:
				return IMAGE_PROPERTY_PATH_EDEFAULT == null ? imagePropertyPath != null : !IMAGE_PROPERTY_PATH_EDEFAULT.equals(imagePropertyPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YValueBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT: return CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YValueBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT: return ExtensionModelPackage.YBEAN_REFERENCE_FIELD__VALUE_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", emfNsURI: ");
		result.append(emfNsURI);
		result.append(", typeQualifiedName: ");
		result.append(typeQualifiedName);
		result.append(", inMemoryBeanProvider: ");
		result.append(inMemoryBeanProvider);
		result.append(", inMemoryBeanProviderQualifiedName: ");
		result.append(inMemoryBeanProviderQualifiedName);
		result.append(", captionPropertyPath: ");
		result.append(captionPropertyPath);
		result.append(", imagePropertyPath: ");
		result.append(imagePropertyPath);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
	@SuppressWarnings("restriction")
	public void setLabel(String label) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescription(label));
		} else {
			ds.setLabel(label);
		}
	}

	/**
	 * Sets the label i18nKey by creating a new datadescription.
	 * 
	 * @param label
	 */
	@SuppressWarnings("restriction")
	public void setLabelI18nKey(String i18nKey) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescriptionForI18n(i18nKey));
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}

} //YBeanReferenceFieldImpl
