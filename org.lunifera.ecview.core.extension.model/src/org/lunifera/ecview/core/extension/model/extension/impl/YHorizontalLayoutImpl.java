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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YMarginable;
import org.lunifera.ecview.core.common.model.core.YSpacingable;
import org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle;



/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Horizontal Layout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutImpl#isSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutImpl#isMargin <em>Margin</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutImpl#getCellStyles <em>Cell Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YHorizontalLayoutImpl extends YLayoutImpl implements
		YHorizontalLayout {
	/**
	 * The default value of the '{@link #isSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPACING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSpacing()
	 * @generated
	 * @ordered
	 */
	protected boolean spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARGIN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected boolean margin = MARGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCellStyles() <em>Cell Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCellStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<YHorizontalLayoutCellStyle> cellStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YHorizontalLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YHORIZONTAL_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(boolean newSpacing) {
		boolean oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YHORIZONTAL_LAYOUT__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(boolean newMargin) {
		boolean oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YHORIZONTAL_LAYOUT__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YHorizontalLayoutCellStyle> getCellStyles() {
		if (cellStyles == null) {
			cellStyles = new EObjectContainmentEList.Resolving<YHorizontalLayoutCellStyle>(YHorizontalLayoutCellStyle.class, this, ExtensionModelPackage.YHORIZONTAL_LAYOUT__CELL_STYLES);
		}
		return cellStyles;
	}

	public YHorizontalLayoutCellStyle getCellStyle(YEmbeddable element) {
		for (YHorizontalLayoutCellStyle style : getCellStyles()) {
			if (element == style.getTarget()) {
				return style;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__CELL_STYLES:
				return ((InternalEList<?>)getCellStyles()).basicRemove(otherEnd, msgs);
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
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__SPACING:
				return isSpacing();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__MARGIN:
				return isMargin();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__CELL_STYLES:
				return getCellStyles();
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
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__SPACING:
				setSpacing((Boolean)newValue);
				return;
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__MARGIN:
				setMargin((Boolean)newValue);
				return;
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__CELL_STYLES:
				getCellStyles().clear();
				getCellStyles().addAll((Collection<? extends YHorizontalLayoutCellStyle>)newValue);
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
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__CELL_STYLES:
				getCellStyles().clear();
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
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__SPACING:
				return spacing != SPACING_EDEFAULT;
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__MARGIN:
				return margin != MARGIN_EDEFAULT;
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT__CELL_STYLES:
				return cellStyles != null && !cellStyles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YSpacingable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YHORIZONTAL_LAYOUT__SPACING: return CoreModelPackage.YSPACINGABLE__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YHORIZONTAL_LAYOUT__MARGIN: return CoreModelPackage.YMARGINABLE__MARGIN;
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
		if (baseClass == YSpacingable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YSPACINGABLE__SPACING: return ExtensionModelPackage.YHORIZONTAL_LAYOUT__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YMARGINABLE__MARGIN: return ExtensionModelPackage.YHORIZONTAL_LAYOUT__MARGIN;
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
		result.append(" (spacing: ");
		result.append(spacing);
		result.append(", margin: ");
		result.append(margin);
		result.append(')');
		return result.toString();
	}

	@Override
	public YHorizontalLayoutCellStyle addCellStyle(YEmbeddable element) {
		YHorizontalLayoutCellStyle yStyle = ExtensionModelFactory.eINSTANCE.createYHorizontalLayoutCellStyle();
		yStyle.setTarget(element);
		getCellStyles().add(yStyle);
		return yStyle;
	}
	
	
} // YUiHorizontalLayoutImpl
