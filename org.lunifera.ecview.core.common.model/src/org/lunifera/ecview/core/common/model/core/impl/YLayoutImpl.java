/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.common.model.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YLayout;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Layout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl#isInitialEditable <em>Initial Editable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl#isInitialEnabled <em>Initial Enabled</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YLayoutImpl extends YEmbeddableImpl implements YLayout {
	/**
	 * The default value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDITABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEditable = INITIAL_EDITABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_ENABLED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEnabled = INITIAL_ENABLED_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<YEmbeddable> elements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YLAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEditable() {
		return initialEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEditable(boolean newInitialEditable) {
		boolean oldInitialEditable = initialEditable;
		initialEditable = newInitialEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YLAYOUT__INITIAL_EDITABLE, oldInitialEditable, initialEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YLAYOUT__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEnabled() {
		return initialEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEnabled(boolean newInitialEnabled) {
		boolean oldInitialEnabled = initialEnabled;
		initialEnabled = newInitialEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YLAYOUT__INITIAL_ENABLED, oldInitialEnabled, initialEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YLAYOUT__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YEmbeddable> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList.Resolving<YEmbeddable>(YEmbeddable.class, this, CoreModelPackage.YLAYOUT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YLAYOUT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YLAYOUT__INITIAL_EDITABLE:
				return isInitialEditable();
			case CoreModelPackage.YLAYOUT__EDITABLE:
				return isEditable();
			case CoreModelPackage.YLAYOUT__INITIAL_ENABLED:
				return isInitialEnabled();
			case CoreModelPackage.YLAYOUT__ENABLED:
				return isEnabled();
			case CoreModelPackage.YLAYOUT__ELEMENTS:
				return getElements();
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
			case CoreModelPackage.YLAYOUT__INITIAL_EDITABLE:
				setInitialEditable((Boolean)newValue);
				return;
			case CoreModelPackage.YLAYOUT__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case CoreModelPackage.YLAYOUT__INITIAL_ENABLED:
				setInitialEnabled((Boolean)newValue);
				return;
			case CoreModelPackage.YLAYOUT__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CoreModelPackage.YLAYOUT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends YEmbeddable>)newValue);
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
			case CoreModelPackage.YLAYOUT__INITIAL_EDITABLE:
				setInitialEditable(INITIAL_EDITABLE_EDEFAULT);
				return;
			case CoreModelPackage.YLAYOUT__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case CoreModelPackage.YLAYOUT__INITIAL_ENABLED:
				setInitialEnabled(INITIAL_ENABLED_EDEFAULT);
				return;
			case CoreModelPackage.YLAYOUT__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CoreModelPackage.YLAYOUT__ELEMENTS:
				getElements().clear();
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
			case CoreModelPackage.YLAYOUT__INITIAL_EDITABLE:
				return initialEditable != INITIAL_EDITABLE_EDEFAULT;
			case CoreModelPackage.YLAYOUT__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case CoreModelPackage.YLAYOUT__INITIAL_ENABLED:
				return initialEnabled != INITIAL_ENABLED_EDEFAULT;
			case CoreModelPackage.YLAYOUT__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case CoreModelPackage.YLAYOUT__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
		if (baseClass == YEditable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YLAYOUT__INITIAL_EDITABLE: return CoreModelPackage.YEDITABLE__INITIAL_EDITABLE;
				case CoreModelPackage.YLAYOUT__EDITABLE: return CoreModelPackage.YEDITABLE__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YEnable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YLAYOUT__INITIAL_ENABLED: return CoreModelPackage.YENABLE__INITIAL_ENABLED;
				case CoreModelPackage.YLAYOUT__ENABLED: return CoreModelPackage.YENABLE__ENABLED;
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
		if (baseClass == YEditable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YEDITABLE__INITIAL_EDITABLE: return CoreModelPackage.YLAYOUT__INITIAL_EDITABLE;
				case CoreModelPackage.YEDITABLE__EDITABLE: return CoreModelPackage.YLAYOUT__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YEnable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YENABLE__INITIAL_ENABLED: return CoreModelPackage.YLAYOUT__INITIAL_ENABLED;
				case CoreModelPackage.YENABLE__ENABLED: return CoreModelPackage.YLAYOUT__ENABLED;
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
		result.append(" (initialEditable: ");
		result.append(initialEditable);
		result.append(", editable: ");
		result.append(editable);
		result.append(", initialEnabled: ");
		result.append(initialEnabled);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean addElement(YEmbeddable element) {
		return getElements().add(element);
	}

	@Override
	public void insertElement(int index, YEmbeddable element) {
		getElements().add(Math.min(getElements().size(), index), element);
	}

	@Override
	public void moveElement(int newPosition, YEmbeddable element) {
		getElements().move(newPosition, element);
	}

	@Override
	public boolean removeElement(YEmbeddable element) {
		return getElements().remove(element);
	}

	@Override
	public int getIndex(YEmbeddable element) {
		return getElements().indexOf(element);
	}

	@Override
	public YEmbeddable getElement(int index) {
		return getElements().get(index);
	}

	@Override
	public void setLabel(String label) {
		// nothing to do
		
	}

	@Override
	public void setLabelI18nKey(String i18nKey) {
		// nothing to do
		
	}

} // YUiLayoutImpl
