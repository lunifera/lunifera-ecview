/**
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
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayout;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Vertical Layout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutImpl#isSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutImpl#isMargin <em>Margin</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutImpl#getCellStyles <em>Cell Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YVerticalLayoutImpl extends YLayoutImpl implements YVerticalLayout {
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
	protected EList<YVerticalLayoutCellStyle> cellStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YVerticalLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YVERTICAL_LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YVERTICAL_LAYOUT__SPACING, oldSpacing, spacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YVERTICAL_LAYOUT__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YVerticalLayoutCellStyle> getCellStyles() {
		if (cellStyles == null) {
			cellStyles = new EObjectContainmentEList.Resolving<YVerticalLayoutCellStyle>(YVerticalLayoutCellStyle.class, this, ExtensionModelPackage.YVERTICAL_LAYOUT__CELL_STYLES);
		}
		return cellStyles;
	}

	public YVerticalLayoutCellStyle getCellStyle(YEmbeddable element) {
		for (YVerticalLayoutCellStyle style : getCellStyles()) {
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
			case ExtensionModelPackage.YVERTICAL_LAYOUT__CELL_STYLES:
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
			case ExtensionModelPackage.YVERTICAL_LAYOUT__SPACING:
				return isSpacing();
			case ExtensionModelPackage.YVERTICAL_LAYOUT__MARGIN:
				return isMargin();
			case ExtensionModelPackage.YVERTICAL_LAYOUT__CELL_STYLES:
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
			case ExtensionModelPackage.YVERTICAL_LAYOUT__SPACING:
				setSpacing((Boolean)newValue);
				return;
			case ExtensionModelPackage.YVERTICAL_LAYOUT__MARGIN:
				setMargin((Boolean)newValue);
				return;
			case ExtensionModelPackage.YVERTICAL_LAYOUT__CELL_STYLES:
				getCellStyles().clear();
				getCellStyles().addAll((Collection<? extends YVerticalLayoutCellStyle>)newValue);
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
			case ExtensionModelPackage.YVERTICAL_LAYOUT__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case ExtensionModelPackage.YVERTICAL_LAYOUT__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case ExtensionModelPackage.YVERTICAL_LAYOUT__CELL_STYLES:
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
			case ExtensionModelPackage.YVERTICAL_LAYOUT__SPACING:
				return spacing != SPACING_EDEFAULT;
			case ExtensionModelPackage.YVERTICAL_LAYOUT__MARGIN:
				return margin != MARGIN_EDEFAULT;
			case ExtensionModelPackage.YVERTICAL_LAYOUT__CELL_STYLES:
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
				case ExtensionModelPackage.YVERTICAL_LAYOUT__SPACING: return CoreModelPackage.YSPACINGABLE__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YVERTICAL_LAYOUT__MARGIN: return CoreModelPackage.YMARGINABLE__MARGIN;
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
				case CoreModelPackage.YSPACINGABLE__SPACING: return ExtensionModelPackage.YVERTICAL_LAYOUT__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YMARGINABLE__MARGIN: return ExtensionModelPackage.YVERTICAL_LAYOUT__MARGIN;
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
	public YVerticalLayoutCellStyle addCellStyle(YEmbeddable element) {
		YVerticalLayoutCellStyle yStyle = ExtensionModelFactory.eINSTANCE.createYVerticalLayoutCellStyle();
		yStyle.setTarget(element);
		getCellStyles().add(yStyle);
		return yStyle;
	}

} // YUiVerticalLayoutImpl
