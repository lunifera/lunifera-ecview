/**
 */
package org.lunifera.ecview.core.extension.model.extension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YFocusable;
import org.lunifera.ecview.core.common.model.core.impl.YActionImpl;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YButton</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl#isInitialEditable <em>Initial Editable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl#getClickListeners <em>Click Listeners</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl#getLastClickTime <em>Last Click Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YButtonImpl extends YActionImpl implements YButton {
	/**
	 * The default value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEditable = INITIAL_EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

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
	 * The cached value of the '{@link #getClickListeners() <em>Click Listeners</em>}' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClickListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<YButtonClickListener> clickListeners;

	/**
	 * The default value of the '{@link #getLastClickTime() <em>Last Click Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLastClickTime()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_CLICK_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastClickTime() <em>Last Click Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLastClickTime()
	 * @generated
	 * @ordered
	 */
	protected long lastClickTime = LAST_CLICK_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YBUTTON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEditable() {
		return initialEditable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEditable(boolean newInitialEditable) {
		boolean oldInitialEditable = initialEditable;
		initialEditable = newInitialEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBUTTON__INITIAL_EDITABLE, oldInitialEditable, initialEditable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBUTTON__EDITABLE, oldEditable, editable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBUTTON__TAB_INDEX, oldTabIndex, tabIndex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YBUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBUTTON__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YButtonClickListener> getClickListeners() {
		if (clickListeners == null) {
			clickListeners = new EDataTypeUniqueEList<YButtonClickListener>(YButtonClickListener.class, this, ExtensionModelPackage.YBUTTON__CLICK_LISTENERS);
		}
		return clickListeners;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastClickTime() {
		return lastClickTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastClickTime(long newLastClickTime) {
		long oldLastClickTime = lastClickTime;
		lastClickTime = newLastClickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YBUTTON__LAST_CLICK_TIME, oldLastClickTime, lastClickTime));
	}

	/**
	 * Adds a listener that is notified if the button was clicked.
	 * 
	 * @generated NOT
	 */
	@Override
	public void addClickListener(YButtonClickListener listener) {
		getClickListeners().add(listener);
	}

	/**
	 * Removes a listener that is notified if the button was clicked.
	 * 
	 * @generated NOT
	 */
	@Override
	public void removeClickListener(YButtonClickListener listener) {
		getClickListeners().remove(listener);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YBUTTON__INITIAL_EDITABLE:
				return isInitialEditable();
			case ExtensionModelPackage.YBUTTON__EDITABLE:
				return isEditable();
			case ExtensionModelPackage.YBUTTON__TAB_INDEX:
				return getTabIndex();
			case ExtensionModelPackage.YBUTTON__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YBUTTON__CLICK_LISTENERS:
				return getClickListeners();
			case ExtensionModelPackage.YBUTTON__LAST_CLICK_TIME:
				return getLastClickTime();
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
			case ExtensionModelPackage.YBUTTON__INITIAL_EDITABLE:
				setInitialEditable((Boolean)newValue);
				return;
			case ExtensionModelPackage.YBUTTON__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case ExtensionModelPackage.YBUTTON__TAB_INDEX:
				setTabIndex((Integer)newValue);
				return;
			case ExtensionModelPackage.YBUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YBUTTON__CLICK_LISTENERS:
				getClickListeners().clear();
				getClickListeners().addAll((Collection<? extends YButtonClickListener>)newValue);
				return;
			case ExtensionModelPackage.YBUTTON__LAST_CLICK_TIME:
				setLastClickTime((Long)newValue);
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
			case ExtensionModelPackage.YBUTTON__INITIAL_EDITABLE:
				setInitialEditable(INITIAL_EDITABLE_EDEFAULT);
				return;
			case ExtensionModelPackage.YBUTTON__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case ExtensionModelPackage.YBUTTON__TAB_INDEX:
				setTabIndex(TAB_INDEX_EDEFAULT);
				return;
			case ExtensionModelPackage.YBUTTON__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YBUTTON__CLICK_LISTENERS:
				getClickListeners().clear();
				return;
			case ExtensionModelPackage.YBUTTON__LAST_CLICK_TIME:
				setLastClickTime(LAST_CLICK_TIME_EDEFAULT);
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
			case ExtensionModelPackage.YBUTTON__INITIAL_EDITABLE:
				return initialEditable != INITIAL_EDITABLE_EDEFAULT;
			case ExtensionModelPackage.YBUTTON__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case ExtensionModelPackage.YBUTTON__TAB_INDEX:
				return tabIndex != TAB_INDEX_EDEFAULT;
			case ExtensionModelPackage.YBUTTON__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YBUTTON__CLICK_LISTENERS:
				return clickListeners != null && !clickListeners.isEmpty();
			case ExtensionModelPackage.YBUTTON__LAST_CLICK_TIME:
				return lastClickTime != LAST_CLICK_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YEditable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YBUTTON__INITIAL_EDITABLE: return CoreModelPackage.YEDITABLE__INITIAL_EDITABLE;
				case ExtensionModelPackage.YBUTTON__EDITABLE: return CoreModelPackage.YEDITABLE__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YFocusable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YBUTTON__TAB_INDEX: return CoreModelPackage.YFOCUSABLE__TAB_INDEX;
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
		if (baseClass == YEditable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YEDITABLE__INITIAL_EDITABLE: return ExtensionModelPackage.YBUTTON__INITIAL_EDITABLE;
				case CoreModelPackage.YEDITABLE__EDITABLE: return ExtensionModelPackage.YBUTTON__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YFocusable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YFOCUSABLE__TAB_INDEX: return ExtensionModelPackage.YBUTTON__TAB_INDEX;
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
		result.append(" (initialEditable: ");
		result.append(initialEditable);
		result.append(", editable: ");
		result.append(editable);
		result.append(", tabIndex: ");
		result.append(tabIndex);
		result.append(", clickListeners: ");
		result.append(clickListeners);
		result.append(", lastClickTime: ");
		result.append(lastClickTime);
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

	@Override
	public YValueBindingEndpoint createEditableEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YEDITABLE__EDITABLE);
		return endpoint;
	}

	@Override
	public YValueBindingEndpoint createEnabledEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) CoreModelPackage.Literals.YENABLE__ENABLED);
		return endpoint;
	}

	public YECViewModelValueBindingEndpoint createClickEndpoint() {
		YECViewModelValueBindingEndpoint endpoint = BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
		endpoint.setElement(this);
		endpoint.getFeatures()
				.add((EStructuralFeature) ExtensionModelPackage.Literals.YBUTTON__LAST_CLICK_TIME);
		return endpoint;
	}

} // YButtonImpl
