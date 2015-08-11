/**
 */
package org.lunifera.ecview.core.extension.model.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YActivateable;
import org.lunifera.ecview.core.common.model.core.YBindable;
import org.lunifera.ecview.core.common.model.core.YFocusable;
import org.lunifera.ecview.core.common.model.core.impl.YActionImpl;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YToggleButton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YToggle Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl#isInitialActivated <em>Initial Activated</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl#isActivated <em>Activated</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl#getDatadescription <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YToggleButtonImpl extends YActionImpl implements YToggleButton {
	/**
	 * The default value of the '{@link #isInitialActivated() <em>Initial Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_ACTIVATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInitialActivated() <em>Initial Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean initialActivated = INITIAL_ACTIVATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean activated = ACTIVATED_EDEFAULT;

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
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YToggleButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YTOGGLE_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialActivated() {
		return initialActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialActivated(boolean newInitialActivated) {
		boolean oldInitialActivated = initialActivated;
		initialActivated = newInitialActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTOGGLE_BUTTON__INITIAL_ACTIVATED, oldInitialActivated, initialActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivated(boolean newActivated) {
		boolean oldActivated = activated;
		activated = newActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTOGGLE_BUTTON__ACTIVATED, oldActivated, activated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTOGGLE_BUTTON__TAB_INDEX, oldTabIndex, tabIndex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YTOGGLE_BUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTOGGLE_BUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YTOGGLE_BUTTON__INITIAL_ACTIVATED:
				return isInitialActivated();
			case ExtensionModelPackage.YTOGGLE_BUTTON__ACTIVATED:
				return isActivated();
			case ExtensionModelPackage.YTOGGLE_BUTTON__TAB_INDEX:
				return getTabIndex();
			case ExtensionModelPackage.YTOGGLE_BUTTON__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
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
			case ExtensionModelPackage.YTOGGLE_BUTTON__INITIAL_ACTIVATED:
				setInitialActivated((Boolean)newValue);
				return;
			case ExtensionModelPackage.YTOGGLE_BUTTON__ACTIVATED:
				setActivated((Boolean)newValue);
				return;
			case ExtensionModelPackage.YTOGGLE_BUTTON__TAB_INDEX:
				setTabIndex((Integer)newValue);
				return;
			case ExtensionModelPackage.YTOGGLE_BUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
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
			case ExtensionModelPackage.YTOGGLE_BUTTON__INITIAL_ACTIVATED:
				setInitialActivated(INITIAL_ACTIVATED_EDEFAULT);
				return;
			case ExtensionModelPackage.YTOGGLE_BUTTON__ACTIVATED:
				setActivated(ACTIVATED_EDEFAULT);
				return;
			case ExtensionModelPackage.YTOGGLE_BUTTON__TAB_INDEX:
				setTabIndex(TAB_INDEX_EDEFAULT);
				return;
			case ExtensionModelPackage.YTOGGLE_BUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
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
			case ExtensionModelPackage.YTOGGLE_BUTTON__INITIAL_ACTIVATED:
				return initialActivated != INITIAL_ACTIVATED_EDEFAULT;
			case ExtensionModelPackage.YTOGGLE_BUTTON__ACTIVATED:
				return activated != ACTIVATED_EDEFAULT;
			case ExtensionModelPackage.YTOGGLE_BUTTON__TAB_INDEX:
				return tabIndex != TAB_INDEX_EDEFAULT;
			case ExtensionModelPackage.YTOGGLE_BUTTON__DATADESCRIPTION:
				return datadescription != null;
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
		if (baseClass == YActivateable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YTOGGLE_BUTTON__INITIAL_ACTIVATED: return CoreModelPackage.YACTIVATEABLE__INITIAL_ACTIVATED;
				case ExtensionModelPackage.YTOGGLE_BUTTON__ACTIVATED: return CoreModelPackage.YACTIVATEABLE__ACTIVATED;
				default: return -1;
			}
		}
		if (baseClass == YFocusable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YTOGGLE_BUTTON__TAB_INDEX: return CoreModelPackage.YFOCUSABLE__TAB_INDEX;
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
		if (baseClass == YActivateable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YACTIVATEABLE__INITIAL_ACTIVATED: return ExtensionModelPackage.YTOGGLE_BUTTON__INITIAL_ACTIVATED;
				case CoreModelPackage.YACTIVATEABLE__ACTIVATED: return ExtensionModelPackage.YTOGGLE_BUTTON__ACTIVATED;
				default: return -1;
			}
		}
		if (baseClass == YFocusable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YFOCUSABLE__TAB_INDEX: return ExtensionModelPackage.YTOGGLE_BUTTON__TAB_INDEX;
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
		result.append(" (initialActivated: ");
		result.append(initialActivated);
		result.append(", activated: ");
		result.append(activated);
		result.append(", tabIndex: ");
		result.append(tabIndex);
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
			getOrphanDatadescriptions().add(getDatadescription());
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
			getOrphanDatadescriptions().add(getDatadescription());
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}
	
	@Override
	public String getLabel() {
		YDatadescription ds = getDatadescription();
		if (ds != null) {
			return ds.getLabel();
		}
		return "";
	}

	@Override
	public String getLabelI18nKey() {
		YDatadescription ds = getDatadescription();
		if (ds != null) {
			return ds.getLabelI18nKey();
		}
		return "";
	}

} //YToggleButtonImpl
