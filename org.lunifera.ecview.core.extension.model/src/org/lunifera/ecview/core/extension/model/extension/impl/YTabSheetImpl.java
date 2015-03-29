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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YFocusable;
import org.lunifera.ecview.core.common.model.core.impl.YEmbeddableImpl;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YTab;
import org.lunifera.ecview.core.extension.model.extension.YTabSheet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YTab Sheet</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YTabSheetImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YTabSheetImpl#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YTabSheetImpl extends YEmbeddableImpl implements YTabSheet {
	/**
	 * The default value of the '{@link #getTabIndex() <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int TAB_INDEX_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getTabIndex() <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabIndex()
	 * @generated
	 * @ordered
	 */
	protected int tabIndex = TAB_INDEX_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<YTab> tabs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YTabSheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YTAB_SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTabIndex() {
		return tabIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabIndex(int newTabIndex) {
		int oldTabIndex = tabIndex;
		tabIndex = newTabIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTAB_SHEET__TAB_INDEX, oldTabIndex, tabIndex));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YTab> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentWithInverseEList.Resolving<YTab>(YTab.class, this, ExtensionModelPackage.YTAB_SHEET__TABS, ExtensionModelPackage.YTAB__PARENT);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YTAB_SHEET__TABS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTabs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YTAB_SHEET__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
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
			case ExtensionModelPackage.YTAB_SHEET__TAB_INDEX:
				return getTabIndex();
			case ExtensionModelPackage.YTAB_SHEET__TABS:
				return getTabs();
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
			case ExtensionModelPackage.YTAB_SHEET__TAB_INDEX:
				setTabIndex((Integer)newValue);
				return;
			case ExtensionModelPackage.YTAB_SHEET__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends YTab>)newValue);
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
			case ExtensionModelPackage.YTAB_SHEET__TAB_INDEX:
				setTabIndex(TAB_INDEX_EDEFAULT);
				return;
			case ExtensionModelPackage.YTAB_SHEET__TABS:
				getTabs().clear();
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
			case ExtensionModelPackage.YTAB_SHEET__TAB_INDEX:
				return tabIndex != TAB_INDEX_EDEFAULT;
			case ExtensionModelPackage.YTAB_SHEET__TABS:
				return tabs != null && !tabs.isEmpty();
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
		if (baseClass == YFocusable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YTAB_SHEET__TAB_INDEX: return CoreModelPackage.YFOCUSABLE__TAB_INDEX;
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
		if (baseClass == YFocusable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YFOCUSABLE__TAB_INDEX: return ExtensionModelPackage.YTAB_SHEET__TAB_INDEX;
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
		result.append(" (tabIndex: ");
		result.append(tabIndex);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setLabel(String label) {
		// nothing to do -- tabsheets don't have labels
	}

	@Override
	public void setLabelI18nKey(String i18nKey) {
		// nothing to do -- tabsheets don't have labels
	}

} // YTabSheetImpl
