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
package org.lunifera.ecview.core.extension.model.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YPanel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YPanel</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YPanelImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YPanelImpl#getFirstContent <em>First Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YPanelImpl#getSecondContent <em>Second Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YPanelImpl extends YLayoutImpl implements YPanel {
	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * The cached value of the '{@link #getFirstContent() <em>First Content</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFirstContent()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable firstContent;

	/**
	 * The cached value of the '{@link #getSecondContent() <em>Second Content</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSecondContent()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable secondContent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YPANEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YPANEL__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YPANEL__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getFirstContent() {
		if (firstContent != null && firstContent.eIsProxy()) {
			InternalEObject oldFirstContent = (InternalEObject)firstContent;
			firstContent = (YEmbeddable)eResolveProxy(oldFirstContent);
			if (firstContent != oldFirstContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YPANEL__FIRST_CONTENT, oldFirstContent, firstContent));
			}
		}
		return firstContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable basicGetFirstContent() {
		return firstContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstContent(YEmbeddable newFirstContent) {
		YEmbeddable oldFirstContent = firstContent;
		firstContent = newFirstContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YPANEL__FIRST_CONTENT, oldFirstContent, firstContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getSecondContent() {
		if (secondContent != null && secondContent.eIsProxy()) {
			InternalEObject oldSecondContent = (InternalEObject)secondContent;
			secondContent = (YEmbeddable)eResolveProxy(oldSecondContent);
			if (secondContent != oldSecondContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YPANEL__SECOND_CONTENT, oldSecondContent, secondContent));
			}
		}
		return secondContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable basicGetSecondContent() {
		return secondContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondContent(YEmbeddable newSecondContent) {
		YEmbeddable oldSecondContent = secondContent;
		secondContent = newSecondContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YPANEL__SECOND_CONTENT, oldSecondContent, secondContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayoutCellStyle getCellStyle(YEmbeddable element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YPANEL__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YPANEL__FIRST_CONTENT:
				if (resolve) return getFirstContent();
				return basicGetFirstContent();
			case ExtensionModelPackage.YPANEL__SECOND_CONTENT:
				if (resolve) return getSecondContent();
				return basicGetSecondContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionModelPackage.YPANEL__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YPANEL__FIRST_CONTENT:
				setFirstContent((YEmbeddable)newValue);
				return;
			case ExtensionModelPackage.YPANEL__SECOND_CONTENT:
				setSecondContent((YEmbeddable)newValue);
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
			case ExtensionModelPackage.YPANEL__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YPANEL__FIRST_CONTENT:
				setFirstContent((YEmbeddable)null);
				return;
			case ExtensionModelPackage.YPANEL__SECOND_CONTENT:
				setSecondContent((YEmbeddable)null);
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
			case ExtensionModelPackage.YPANEL__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YPANEL__FIRST_CONTENT:
				return firstContent != null;
			case ExtensionModelPackage.YPANEL__SECOND_CONTENT:
				return secondContent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
	@Override
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
	@Override
	public void setLabelI18nKey(String i18nKey) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescriptionForI18n(i18nKey));
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}

} // YPanelImpl
