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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.core.YFlatAlignment;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesFactory;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YColumn;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YColumn</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getOrphanDatadescriptions <em>Orphan Datadescriptions</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#isOrderable <em>Orderable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#isCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getExpandRatio <em>Expand Ratio</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl#getPropertyPath <em>Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YColumnImpl extends MinimalEObjectImpl.Container implements
		YColumn {
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
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

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
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

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
	 * The default value of the '{@link #isOrderable() <em>Orderable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isOrderable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOrderable() <em>Orderable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isOrderable()
	 * @generated
	 * @ordered
	 */
	protected boolean orderable = ORDERABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected boolean collapsed = COLLAPSED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected boolean collapsible = COLLAPSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final YFlatAlignment ALIGNMENT_EDEFAULT = YFlatAlignment.LEFT;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected YFlatAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpandRatio() <em>Expand Ratio</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExpandRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float EXPAND_RATIO_EDEFAULT = -1.0F;

	/**
	 * The cached value of the '{@link #getExpandRatio() <em>Expand Ratio</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExpandRatio()
	 * @generated
	 * @ordered
	 */
	protected float expandRatio = EXPAND_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String propertyPath = PROPERTY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YCOLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__ICON, oldIcon, icon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__VISIBLE, oldVisible, visible));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YCOLUMN__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YDatadescription> getOrphanDatadescriptions() {
		if (orphanDatadescriptions == null) {
			orphanDatadescriptions = new EObjectContainmentEList.Resolving<YDatadescription>(YDatadescription.class, this, ExtensionModelPackage.YCOLUMN__ORPHAN_DATADESCRIPTIONS);
		}
		return orphanDatadescriptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrderable() {
		return orderable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderable(boolean newOrderable) {
		boolean oldOrderable = orderable;
		orderable = newOrderable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__ORDERABLE, oldOrderable, orderable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsed() {
		return collapsed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsed(boolean newCollapsed) {
		boolean oldCollapsed = collapsed;
		collapsed = newCollapsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__COLLAPSED, oldCollapsed, collapsed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsible() {
		return collapsible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsible(boolean newCollapsible) {
		boolean oldCollapsible = collapsible;
		collapsible = newCollapsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__COLLAPSIBLE, oldCollapsible, collapsible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YFlatAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(YFlatAlignment newAlignment) {
		YFlatAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public float getExpandRatio() {
		return expandRatio;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandRatio(float newExpandRatio) {
		float oldExpandRatio = expandRatio;
		expandRatio = newExpandRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__EXPAND_RATIO, oldExpandRatio, expandRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyPath() {
		return propertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPath(String newPropertyPath) {
		String oldPropertyPath = propertyPath;
		propertyPath = newPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YCOLUMN__PROPERTY_PATH, oldPropertyPath, propertyPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YCOLUMN__ORPHAN_DATADESCRIPTIONS:
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
			case ExtensionModelPackage.YCOLUMN__ID:
				return getId();
			case ExtensionModelPackage.YCOLUMN__NAME:
				return getName();
			case ExtensionModelPackage.YCOLUMN__ICON:
				return getIcon();
			case ExtensionModelPackage.YCOLUMN__VISIBLE:
				return isVisible();
			case ExtensionModelPackage.YCOLUMN__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YCOLUMN__ORPHAN_DATADESCRIPTIONS:
				return getOrphanDatadescriptions();
			case ExtensionModelPackage.YCOLUMN__ORDERABLE:
				return isOrderable();
			case ExtensionModelPackage.YCOLUMN__COLLAPSED:
				return isCollapsed();
			case ExtensionModelPackage.YCOLUMN__COLLAPSIBLE:
				return isCollapsible();
			case ExtensionModelPackage.YCOLUMN__ALIGNMENT:
				return getAlignment();
			case ExtensionModelPackage.YCOLUMN__EXPAND_RATIO:
				return getExpandRatio();
			case ExtensionModelPackage.YCOLUMN__PROPERTY_PATH:
				return getPropertyPath();
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
			case ExtensionModelPackage.YCOLUMN__ID:
				setId((String)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__NAME:
				setName((String)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__ICON:
				setIcon((String)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__ORPHAN_DATADESCRIPTIONS:
				getOrphanDatadescriptions().clear();
				getOrphanDatadescriptions().addAll((Collection<? extends YDatadescription>)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__ORDERABLE:
				setOrderable((Boolean)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__COLLAPSED:
				setCollapsed((Boolean)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__COLLAPSIBLE:
				setCollapsible((Boolean)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__ALIGNMENT:
				setAlignment((YFlatAlignment)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__EXPAND_RATIO:
				setExpandRatio((Float)newValue);
				return;
			case ExtensionModelPackage.YCOLUMN__PROPERTY_PATH:
				setPropertyPath((String)newValue);
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
			case ExtensionModelPackage.YCOLUMN__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YCOLUMN__ORPHAN_DATADESCRIPTIONS:
				getOrphanDatadescriptions().clear();
				return;
			case ExtensionModelPackage.YCOLUMN__ORDERABLE:
				setOrderable(ORDERABLE_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__COLLAPSIBLE:
				setCollapsible(COLLAPSIBLE_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__EXPAND_RATIO:
				setExpandRatio(EXPAND_RATIO_EDEFAULT);
				return;
			case ExtensionModelPackage.YCOLUMN__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
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
			case ExtensionModelPackage.YCOLUMN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExtensionModelPackage.YCOLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtensionModelPackage.YCOLUMN__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ExtensionModelPackage.YCOLUMN__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case ExtensionModelPackage.YCOLUMN__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YCOLUMN__ORPHAN_DATADESCRIPTIONS:
				return orphanDatadescriptions != null && !orphanDatadescriptions.isEmpty();
			case ExtensionModelPackage.YCOLUMN__ORDERABLE:
				return orderable != ORDERABLE_EDEFAULT;
			case ExtensionModelPackage.YCOLUMN__COLLAPSED:
				return collapsed != COLLAPSED_EDEFAULT;
			case ExtensionModelPackage.YCOLUMN__COLLAPSIBLE:
				return collapsible != COLLAPSIBLE_EDEFAULT;
			case ExtensionModelPackage.YCOLUMN__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case ExtensionModelPackage.YCOLUMN__EXPAND_RATIO:
				return expandRatio != EXPAND_RATIO_EDEFAULT;
			case ExtensionModelPackage.YCOLUMN__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
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
		result.append(", icon: ");
		result.append(icon);
		result.append(", visible: ");
		result.append(visible);
		result.append(", orderable: ");
		result.append(orderable);
		result.append(", collapsed: ");
		result.append(collapsed);
		result.append(", collapsible: ");
		result.append(collapsible);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", expandRatio: ");
		result.append(expandRatio);
		result.append(", propertyPath: ");
		result.append(propertyPath);
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

} // YColumnImpl
