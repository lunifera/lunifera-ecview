/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.common.model.core.impl;

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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YCssAble;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YVisibleable;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesFactory;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.common.model.datatypes.YDatatype;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Embeddable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getCssID <em>Css ID</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#isInitialVisible <em>Initial Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getOrphanDatatypes <em>Orphan Datatypes</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl#getOrphanDatadescriptions <em>Orphan Datadescriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YEmbeddableImpl extends MinimalEObjectImpl.Container
		implements YEmbeddable {
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
	 * The default value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected String cssClass = CSS_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected String cssID = CSS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitialVisible() <em>Initial Visible</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_VISIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInitialVisible() <em>Initial Visible</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean initialVisible = INITIAL_VISIBLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrphanDatatypes()
	 * <em>Orphan Datatypes</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrphanDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<YDatatype> orphanDatatypes;
	/**
	 * The cached value of the '{@link #getOrphanDatadescriptions()
	 * <em>Orphan Datadescriptions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrphanDatadescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<YDatadescription> orphanDatadescriptions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YEmbeddableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YEMBEDDABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CoreModelPackage.YEMBEDDABLE__TAGS);
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
			properties = new EcoreEMap<String,String>(CoreModelPackage.Literals.YSTRING_TO_STRING_MAP, YStringToStringMapImpl.class, this, CoreModelPackage.YEMBEDDABLE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssClass(String newCssClass) {
		String oldCssClass = cssClass;
		cssClass = newCssClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__CSS_CLASS, oldCssClass, cssClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssID() {
		return cssID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssID(String newCssID) {
		String oldCssID = cssID;
		cssID = newCssID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__CSS_ID, oldCssID, cssID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialVisible() {
		return initialVisible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialVisible(boolean newInitialVisible) {
		boolean oldInitialVisible = initialVisible;
		initialVisible = newInitialVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE, oldInitialVisible, initialVisible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__VISIBLE, oldVisible, visible));
	}

	protected YDatadescription createDatadescription(String label) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabel(label);

		getOrphanDatadescriptions().add(dsc);

		return dsc;
	}

	protected YDatadescription createDatadescriptionForI18n(String i18nKey) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabelI18nKey(i18nKey);

		getOrphanDatadescriptions().add(dsc);

		return dsc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YDatatype> getOrphanDatatypes() {
		if (orphanDatatypes == null) {
			orphanDatatypes = new EObjectContainmentEList.Resolving<YDatatype>(YDatatype.class, this, CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES);
		}
		return orphanDatatypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YDatadescription> getOrphanDatadescriptions() {
		if (orphanDatadescriptions == null) {
			orphanDatadescriptions = new EObjectContainmentEList.Resolving<YDatadescription>(YDatadescription.class, this, CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS);
		}
		return orphanDatadescriptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YLayout getParent() {
		EObject container = eContainer();
		if (container instanceof YLayout) {
			return (YLayout) container;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YEMBEDDABLE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES:
				return ((InternalEList<?>)getOrphanDatatypes()).basicRemove(otherEnd, msgs);
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS:
				return ((InternalEList<?>)getOrphanDatadescriptions()).basicRemove(otherEnd, msgs);
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
			case CoreModelPackage.YEMBEDDABLE__ID:
				return getId();
			case CoreModelPackage.YEMBEDDABLE__NAME:
				return getName();
			case CoreModelPackage.YEMBEDDABLE__TAGS:
				return getTags();
			case CoreModelPackage.YEMBEDDABLE__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				return getCssClass();
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				return getCssID();
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				return isInitialVisible();
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				return isVisible();
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES:
				return getOrphanDatatypes();
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS:
				return getOrphanDatadescriptions();
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
			case CoreModelPackage.YEMBEDDABLE__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				setCssClass((String)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				setCssID((String)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				setInitialVisible((Boolean)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES:
				getOrphanDatatypes().clear();
				getOrphanDatatypes().addAll((Collection<? extends YDatatype>)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS:
				getOrphanDatadescriptions().clear();
				getOrphanDatadescriptions().addAll((Collection<? extends YDatadescription>)newValue);
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
			case CoreModelPackage.YEMBEDDABLE__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__TAGS:
				getTags().clear();
				return;
			case CoreModelPackage.YEMBEDDABLE__PROPERTIES:
				getProperties().clear();
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				setCssClass(CSS_CLASS_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				setCssID(CSS_ID_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				setInitialVisible(INITIAL_VISIBLE_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES:
				getOrphanDatatypes().clear();
				return;
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS:
				getOrphanDatadescriptions().clear();
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
			case CoreModelPackage.YEMBEDDABLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YEMBEDDABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YEMBEDDABLE__TAGS:
				return tags != null && !tags.isEmpty();
			case CoreModelPackage.YEMBEDDABLE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT.equals(cssID);
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				return initialVisible != INITIAL_VISIBLE_EDEFAULT;
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES:
				return orphanDatatypes != null && !orphanDatatypes.isEmpty();
			case CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS:
				return orphanDatadescriptions != null && !orphanDatadescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YEMBEDDABLE__CSS_CLASS: return CoreModelPackage.YCSS_ABLE__CSS_CLASS;
				case CoreModelPackage.YEMBEDDABLE__CSS_ID: return CoreModelPackage.YCSS_ABLE__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YVisibleable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE: return CoreModelPackage.YVISIBLEABLE__INITIAL_VISIBLE;
				case CoreModelPackage.YEMBEDDABLE__VISIBLE: return CoreModelPackage.YVISIBLEABLE__VISIBLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YCSS_ABLE__CSS_CLASS: return CoreModelPackage.YEMBEDDABLE__CSS_CLASS;
				case CoreModelPackage.YCSS_ABLE__CSS_ID: return CoreModelPackage.YEMBEDDABLE__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YVisibleable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YVISIBLEABLE__INITIAL_VISIBLE: return CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE;
				case CoreModelPackage.YVISIBLEABLE__VISIBLE: return CoreModelPackage.YEMBEDDABLE__VISIBLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", cssClass: ");
		result.append(cssClass);
		result.append(", cssID: ");
		result.append(cssID);
		result.append(", initialVisible: ");
		result.append(initialVisible);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

	@Override
	public YValueBindingEndpoint createVisibleEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YVISIBLEABLE__VISIBLE);
		return endpoint;
	}

	@Override
	public YValueBindingEndpoint createCssIdEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YCSS_ABLE__CSS_ID);
		return endpoint;
	}

	@Override
	public YValueBindingEndpoint createCssClassEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YCSS_ABLE__CSS_CLASS);
		return endpoint;
	}
	
} // YUiEmbeddableImpl
