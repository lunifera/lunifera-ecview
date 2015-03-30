/**
 */
package org.lunifera.ecview.core.extension.model.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YFocusable;
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
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YPanelImpl#getTabIndex <em>Tab Index</em>}</li>
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YPANEL__TAB_INDEX, oldTabIndex, tabIndex));
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
			case ExtensionModelPackage.YPANEL__TAB_INDEX:
				return getTabIndex();
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
			case ExtensionModelPackage.YPANEL__TAB_INDEX:
				setTabIndex((Integer)newValue);
				return;
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
			case ExtensionModelPackage.YPANEL__TAB_INDEX:
				setTabIndex(TAB_INDEX_EDEFAULT);
				return;
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
			case ExtensionModelPackage.YPANEL__TAB_INDEX:
				return tabIndex != TAB_INDEX_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YFocusable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YPANEL__TAB_INDEX: return CoreModelPackage.YFOCUSABLE__TAB_INDEX;
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
				case CoreModelPackage.YFOCUSABLE__TAB_INDEX: return ExtensionModelPackage.YPANEL__TAB_INDEX;
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
	@Override
	public void setLabelI18nKey(String i18nKey) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescriptionForI18n(i18nKey));
			getOrphanDatadescriptions().add(getDatadescription());
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}

} // YPanelImpl
