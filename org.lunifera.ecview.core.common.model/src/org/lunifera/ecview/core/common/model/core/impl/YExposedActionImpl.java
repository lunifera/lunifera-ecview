/**
 */
package org.lunifera.ecview.core.common.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YExposed Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#isInitialEnabled <em>Initial Enabled</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getLabelI18nKey <em>Label I1 8n Key</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getExternalClickTime <em>External Click Time</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getInternalClickTime <em>Internal Click Time</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getExecutedNotificationTime <em>Executed Notification Time</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#getCanceledNotificationTime <em>Canceled Notification Time</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.core.impl.YExposedActionImpl#isCheckDirty <em>Check Dirty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YExposedActionImpl extends MinimalEObjectImpl.Container implements YExposedAction {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelI18nKey() <em>Label I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelI18nKey()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_I1_8N_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelI18nKey() <em>Label I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelI18nKey()
	 * @generated
	 * @ordered
	 */
	protected String labelI18nKey = LABEL_I1_8N_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalClickTime() <em>External Click Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalClickTime()
	 * @generated
	 * @ordered
	 */
	protected static final long EXTERNAL_CLICK_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExternalClickTime() <em>External Click Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalClickTime()
	 * @generated
	 * @ordered
	 */
	protected long externalClickTime = EXTERNAL_CLICK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalClickTime() <em>Internal Click Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalClickTime()
	 * @generated
	 * @ordered
	 */
	protected static final long INTERNAL_CLICK_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInternalClickTime() <em>Internal Click Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalClickTime()
	 * @generated
	 * @ordered
	 */
	protected long internalClickTime = INTERNAL_CLICK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutedNotificationTime() <em>Executed Notification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNotificationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long EXECUTED_NOTIFICATION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExecutedNotificationTime() <em>Executed Notification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNotificationTime()
	 * @generated
	 * @ordered
	 */
	protected long executedNotificationTime = EXECUTED_NOTIFICATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanceledNotificationTime() <em>Canceled Notification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanceledNotificationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CANCELED_NOTIFICATION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCanceledNotificationTime() <em>Canceled Notification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanceledNotificationTime()
	 * @generated
	 * @ordered
	 */
	protected long canceledNotificationTime = CANCELED_NOTIFICATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckDirty() <em>Check Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckDirty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_DIRTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckDirty() <em>Check Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckDirty()
	 * @generated
	 * @ordered
	 */
	protected boolean checkDirty = CHECK_DIRTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YExposedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YEXPOSED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__INITIAL_ENABLED, oldInitialEnabled, initialEnabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelI18nKey() {
		return labelI18nKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelI18nKey(String newLabelI18nKey) {
		String oldLabelI18nKey = labelI18nKey;
		labelI18nKey = newLabelI18nKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__LABEL_I1_8N_KEY, oldLabelI18nKey, labelI18nKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExternalClickTime() {
		return externalClickTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalClickTime(long newExternalClickTime) {
		long oldExternalClickTime = externalClickTime;
		externalClickTime = newExternalClickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__EXTERNAL_CLICK_TIME, oldExternalClickTime, externalClickTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInternalClickTime() {
		return internalClickTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalClickTime(long newInternalClickTime) {
		long oldInternalClickTime = internalClickTime;
		internalClickTime = newInternalClickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__INTERNAL_CLICK_TIME, oldInternalClickTime, internalClickTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExecutedNotificationTime() {
		return executedNotificationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutedNotificationTime(long newExecutedNotificationTime) {
		long oldExecutedNotificationTime = executedNotificationTime;
		executedNotificationTime = newExecutedNotificationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__EXECUTED_NOTIFICATION_TIME, oldExecutedNotificationTime, executedNotificationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCanceledNotificationTime() {
		return canceledNotificationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanceledNotificationTime(long newCanceledNotificationTime) {
		long oldCanceledNotificationTime = canceledNotificationTime;
		canceledNotificationTime = newCanceledNotificationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__CANCELED_NOTIFICATION_TIME, oldCanceledNotificationTime, canceledNotificationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckDirty() {
		return checkDirty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckDirty(boolean newCheckDirty) {
		boolean oldCheckDirty = checkDirty;
		checkDirty = newCheckDirty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEXPOSED_ACTION__CHECK_DIRTY, oldCheckDirty, checkDirty));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YView getViewGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YEXPOSED_ACTION__ID:
				return getId();
			case CoreModelPackage.YEXPOSED_ACTION__NAME:
				return getName();
			case CoreModelPackage.YEXPOSED_ACTION__INITIAL_ENABLED:
				return isInitialEnabled();
			case CoreModelPackage.YEXPOSED_ACTION__ENABLED:
				return isEnabled();
			case CoreModelPackage.YEXPOSED_ACTION__ICON:
				return getIcon();
			case CoreModelPackage.YEXPOSED_ACTION__LABEL:
				return getLabel();
			case CoreModelPackage.YEXPOSED_ACTION__LABEL_I1_8N_KEY:
				return getLabelI18nKey();
			case CoreModelPackage.YEXPOSED_ACTION__EXTERNAL_CLICK_TIME:
				return getExternalClickTime();
			case CoreModelPackage.YEXPOSED_ACTION__INTERNAL_CLICK_TIME:
				return getInternalClickTime();
			case CoreModelPackage.YEXPOSED_ACTION__EXECUTED_NOTIFICATION_TIME:
				return getExecutedNotificationTime();
			case CoreModelPackage.YEXPOSED_ACTION__CANCELED_NOTIFICATION_TIME:
				return getCanceledNotificationTime();
			case CoreModelPackage.YEXPOSED_ACTION__CHECK_DIRTY:
				return isCheckDirty();
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
			case CoreModelPackage.YEXPOSED_ACTION__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__INITIAL_ENABLED:
				setInitialEnabled((Boolean)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__ICON:
				setIcon((String)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__LABEL:
				setLabel((String)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__LABEL_I1_8N_KEY:
				setLabelI18nKey((String)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__EXTERNAL_CLICK_TIME:
				setExternalClickTime((Long)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__INTERNAL_CLICK_TIME:
				setInternalClickTime((Long)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__EXECUTED_NOTIFICATION_TIME:
				setExecutedNotificationTime((Long)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__CANCELED_NOTIFICATION_TIME:
				setCanceledNotificationTime((Long)newValue);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__CHECK_DIRTY:
				setCheckDirty((Boolean)newValue);
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
			case CoreModelPackage.YEXPOSED_ACTION__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__INITIAL_ENABLED:
				setInitialEnabled(INITIAL_ENABLED_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__LABEL_I1_8N_KEY:
				setLabelI18nKey(LABEL_I1_8N_KEY_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__EXTERNAL_CLICK_TIME:
				setExternalClickTime(EXTERNAL_CLICK_TIME_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__INTERNAL_CLICK_TIME:
				setInternalClickTime(INTERNAL_CLICK_TIME_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__EXECUTED_NOTIFICATION_TIME:
				setExecutedNotificationTime(EXECUTED_NOTIFICATION_TIME_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__CANCELED_NOTIFICATION_TIME:
				setCanceledNotificationTime(CANCELED_NOTIFICATION_TIME_EDEFAULT);
				return;
			case CoreModelPackage.YEXPOSED_ACTION__CHECK_DIRTY:
				setCheckDirty(CHECK_DIRTY_EDEFAULT);
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
			case CoreModelPackage.YEXPOSED_ACTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YEXPOSED_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YEXPOSED_ACTION__INITIAL_ENABLED:
				return initialEnabled != INITIAL_ENABLED_EDEFAULT;
			case CoreModelPackage.YEXPOSED_ACTION__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case CoreModelPackage.YEXPOSED_ACTION__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case CoreModelPackage.YEXPOSED_ACTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CoreModelPackage.YEXPOSED_ACTION__LABEL_I1_8N_KEY:
				return LABEL_I1_8N_KEY_EDEFAULT == null ? labelI18nKey != null : !LABEL_I1_8N_KEY_EDEFAULT.equals(labelI18nKey);
			case CoreModelPackage.YEXPOSED_ACTION__EXTERNAL_CLICK_TIME:
				return externalClickTime != EXTERNAL_CLICK_TIME_EDEFAULT;
			case CoreModelPackage.YEXPOSED_ACTION__INTERNAL_CLICK_TIME:
				return internalClickTime != INTERNAL_CLICK_TIME_EDEFAULT;
			case CoreModelPackage.YEXPOSED_ACTION__EXECUTED_NOTIFICATION_TIME:
				return executedNotificationTime != EXECUTED_NOTIFICATION_TIME_EDEFAULT;
			case CoreModelPackage.YEXPOSED_ACTION__CANCELED_NOTIFICATION_TIME:
				return canceledNotificationTime != CANCELED_NOTIFICATION_TIME_EDEFAULT;
			case CoreModelPackage.YEXPOSED_ACTION__CHECK_DIRTY:
				return checkDirty != CHECK_DIRTY_EDEFAULT;
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
		if (baseClass == YEnable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YEXPOSED_ACTION__INITIAL_ENABLED: return CoreModelPackage.YENABLE__INITIAL_ENABLED;
				case CoreModelPackage.YEXPOSED_ACTION__ENABLED: return CoreModelPackage.YENABLE__ENABLED;
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
		if (baseClass == YEnable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YENABLE__INITIAL_ENABLED: return CoreModelPackage.YEXPOSED_ACTION__INITIAL_ENABLED;
				case CoreModelPackage.YENABLE__ENABLED: return CoreModelPackage.YEXPOSED_ACTION__ENABLED;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", initialEnabled: ");
		result.append(initialEnabled);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", icon: ");
		result.append(icon);
		result.append(", label: ");
		result.append(label);
		result.append(", labelI18nKey: ");
		result.append(labelI18nKey);
		result.append(", externalClickTime: ");
		result.append(externalClickTime);
		result.append(", internalClickTime: ");
		result.append(internalClickTime);
		result.append(", executedNotificationTime: ");
		result.append(executedNotificationTime);
		result.append(", canceledNotificationTime: ");
		result.append(canceledNotificationTime);
		result.append(", checkDirty: ");
		result.append(checkDirty);
		result.append(')');
		return result.toString();
	}

} //YExposedActionImpl
