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
import org.lunifera.ecview.core.common.model.datatypes.DatatypesFactory;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YNumericSearchField;
import org.lunifera.ecview.core.extension.model.extension.YSearchWildcards;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YNumeric Search Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl#getValueBindingEndpoint <em>Value Binding Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl#getWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YNumericSearchFieldImpl extends YInputImpl implements YNumericSearchField {
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
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWildcard() <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWildcard()
	 * @generated
	 * @ordered
	 */
	protected static final YSearchWildcards WILDCARD_EDEFAULT = YSearchWildcards.GT;

	/**
	 * The cached value of the '{@link #getWildcard() <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWildcard()
	 * @generated
	 * @ordered
	 */
	protected YSearchWildcards wildcard = WILDCARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YNumericSearchFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YNUMERIC_SEARCH_FIELD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, valueBindingEndpoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, newValueBindingEndpoint);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT, newValueBindingEndpoint, newValueBindingEndpoint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSearchWildcards getWildcard() {
		return wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWildcard(YSearchWildcards newWildcard) {
		YSearchWildcards oldWildcard = wildcard;
		wildcard = newWildcard == null ? WILDCARD_EDEFAULT : newWildcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__WILDCARD, oldWildcard, wildcard));
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
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT:
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
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT:
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
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT:
				if (resolve) return getValueBindingEndpoint();
				return basicGetValueBindingEndpoint();
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE:
				return getValue();
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__WILDCARD:
				return getWildcard();
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
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)newValue);
				return;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE:
				setValue((String)newValue);
				return;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__WILDCARD:
				setWildcard((YSearchWildcards)newValue);
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
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)null);
				return;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__WILDCARD:
				setWildcard(WILDCARD_EDEFAULT);
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
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT:
				return valueBindingEndpoint != null;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__WILDCARD:
				return wildcard != WILDCARD_EDEFAULT;
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
				case ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT: return CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT;
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
				case CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT: return ExtensionModelPackage.YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT;
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
		result.append(", wildcard: ");
		result.append(wildcard);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
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
	public void setLabelI18nKey(String i18nKey) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescriptionForI18n(i18nKey));
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}
	
	protected YDatadescription createDatadescription(String label) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabel(label);
		return dsc;
	}

	protected YDatadescription createDatadescriptionForI18n(String i18nKey) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabelI18nKey(i18nKey);
		return dsc;
	}

} //YNumericSearchFieldImpl
