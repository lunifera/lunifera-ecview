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
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.impl.YLayoutImpl;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YSplitPanel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YSplit Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSplitPanelImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSplitPanelImpl#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSplitPanelImpl#isFillHorizontal <em>Fill Horizontal</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSplitPanelImpl#getSplitPosition <em>Split Position</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.extension.model.extension.impl.YSplitPanelImpl#isVertical <em>Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YSplitPanelImpl extends YLayoutImpl implements YSplitPanel {
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
	 * The cached value of the '{@link #getCellStyles() <em>Cell Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<YHorizontalLayoutCellStyle> cellStyles;

	/**
	 * The default value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_HORIZONTAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean fillHorizontal = FILL_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSplitPosition() <em>Split Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int SPLIT_POSITION_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getSplitPosition() <em>Split Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitPosition()
	 * @generated
	 * @ordered
	 */
	protected int splitPosition = SPLIT_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean vertical = VERTICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YSplitPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YSPLIT_PANEL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YSPLIT_PANEL__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPLIT_PANEL__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YHorizontalLayoutCellStyle> getCellStyles() {
		if (cellStyles == null) {
			cellStyles = new EObjectContainmentEList.Resolving<YHorizontalLayoutCellStyle>(YHorizontalLayoutCellStyle.class, this, ExtensionModelPackage.YSPLIT_PANEL__CELL_STYLES);
		}
		return cellStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillHorizontal() {
		return fillHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillHorizontal(boolean newFillHorizontal) {
		boolean oldFillHorizontal = fillHorizontal;
		fillHorizontal = newFillHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPLIT_PANEL__FILL_HORIZONTAL, oldFillHorizontal, fillHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSplitPosition() {
		return splitPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitPosition(int newSplitPosition) {
		int oldSplitPosition = splitPosition;
		splitPosition = newSplitPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPLIT_PANEL__SPLIT_POSITION, oldSplitPosition, splitPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical(boolean newVertical) {
		boolean oldVertical = vertical;
		vertical = newVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPLIT_PANEL__VERTICAL, oldVertical, vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayoutCellStyle getCellStyle(YEmbeddable element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YSPLIT_PANEL__CELL_STYLES:
				return ((InternalEList<?>)getCellStyles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YSPLIT_PANEL__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YSPLIT_PANEL__CELL_STYLES:
				return getCellStyles();
			case ExtensionModelPackage.YSPLIT_PANEL__FILL_HORIZONTAL:
				return isFillHorizontal();
			case ExtensionModelPackage.YSPLIT_PANEL__SPLIT_POSITION:
				return getSplitPosition();
			case ExtensionModelPackage.YSPLIT_PANEL__VERTICAL:
				return isVertical();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionModelPackage.YSPLIT_PANEL__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__CELL_STYLES:
				getCellStyles().clear();
				getCellStyles().addAll((Collection<? extends YHorizontalLayoutCellStyle>)newValue);
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__FILL_HORIZONTAL:
				setFillHorizontal((Boolean)newValue);
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__SPLIT_POSITION:
				setSplitPosition((Integer)newValue);
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__VERTICAL:
				setVertical((Boolean)newValue);
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
			case ExtensionModelPackage.YSPLIT_PANEL__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__CELL_STYLES:
				getCellStyles().clear();
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__FILL_HORIZONTAL:
				setFillHorizontal(FILL_HORIZONTAL_EDEFAULT);
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__SPLIT_POSITION:
				setSplitPosition(SPLIT_POSITION_EDEFAULT);
				return;
			case ExtensionModelPackage.YSPLIT_PANEL__VERTICAL:
				setVertical(VERTICAL_EDEFAULT);
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
			case ExtensionModelPackage.YSPLIT_PANEL__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YSPLIT_PANEL__CELL_STYLES:
				return cellStyles != null && !cellStyles.isEmpty();
			case ExtensionModelPackage.YSPLIT_PANEL__FILL_HORIZONTAL:
				return fillHorizontal != FILL_HORIZONTAL_EDEFAULT;
			case ExtensionModelPackage.YSPLIT_PANEL__SPLIT_POSITION:
				return splitPosition != SPLIT_POSITION_EDEFAULT;
			case ExtensionModelPackage.YSPLIT_PANEL__VERTICAL:
				return vertical != VERTICAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (fillHorizontal: ");
		result.append(fillHorizontal);
		result.append(", splitPosition: ");
		result.append(splitPosition);
		result.append(", vertical: ");
		result.append(vertical);
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
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}


} //YSplitPanelImpl
