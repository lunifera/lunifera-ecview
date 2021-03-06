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
package org.lunifera.ecview.core.common.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.binding.impl.YValueBindingEndpointImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YContext Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YContextValueBindingEndpointImpl#getUrlString <em>Url String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YContextValueBindingEndpointImpl extends YValueBindingEndpointImpl implements YContextValueBindingEndpoint {
	/**
	 * The default value of the '{@link #getUrlString() <em>Url String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlString()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlString() <em>Url String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlString()
	 * @generated
	 * @ordered
	 */
	protected String urlString = URL_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YContextValueBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YCONTEXT_VALUE_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlString() {
		return urlString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlString(String newUrlString) {
		String oldUrlString = urlString;
		urlString = newUrlString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING, oldUrlString, urlString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING:
				return getUrlString();
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
			case CoreModelPackage.YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING:
				setUrlString((String)newValue);
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
			case CoreModelPackage.YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING:
				setUrlString(URL_STRING_EDEFAULT);
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
			case CoreModelPackage.YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING:
				return URL_STRING_EDEFAULT == null ? urlString != null : !URL_STRING_EDEFAULT.equals(urlString);
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
		result.append(" (urlString: ");
		result.append(urlString);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isBindsElement(YElement element) {
		return false;
	}

} //YContextValueBindingEndpointImpl
