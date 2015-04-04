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
package org.lunifera.ecview.core.common.model.visibility.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.model.visibility.YColor;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YVisibility Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isBorder <em>Border</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isStrikethrough <em>Strikethrough</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#getBackgroundColorCode <em>Background Color Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.impl.YVisibilityPropertiesImpl#getForegroundColorCode <em>Foreground Color Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YVisibilityPropertiesImpl extends MinimalEObjectImpl.Container implements YVisibilityProperties {
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
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

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
	 * The default value of the '{@link #isBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorder()
	 * @generated
	 * @ordered
	 */
	protected boolean border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean italic = ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrikethrough() <em>Strikethrough</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrikethrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIKETHROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrikethrough() <em>Strikethrough</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrikethrough()
	 * @generated
	 * @ordered
	 */
	protected boolean strikethrough = STRIKETHROUGH_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean underline = UNDERLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final YColor BACKGROUND_COLOR_EDEFAULT = YColor.UNDEFINED;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected YColor backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final YColor FOREGROUND_COLOR_EDEFAULT = YColor.UNDEFINED;

	/**
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected YColor foregroundColor = FOREGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColorCode() <em>Background Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColorCode() <em>Background Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColorCode()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColorCode = BACKGROUND_COLOR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForegroundColorCode() <em>Foreground Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREGROUND_COLOR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForegroundColorCode() <em>Foreground Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColorCode()
	 * @generated
	 * @ordered
	 */
	protected String foregroundColorCode = FOREGROUND_COLOR_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YVisibilityPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.YVISIBILITY_PROPERTIES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__EDITABLE, oldEditable, editable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(boolean newBorder) {
		boolean oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrikethrough() {
		return strikethrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrikethrough(boolean newStrikethrough) {
		boolean oldStrikethrough = strikethrough;
		strikethrough = newStrikethrough;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__STRIKETHROUGH, oldStrikethrough, strikethrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(boolean newUnderline) {
		boolean oldUnderline = underline;
		underline = newUnderline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__UNDERLINE, oldUnderline, underline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YColor getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(YColor newBackgroundColor) {
		YColor oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YColor getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColor(YColor newForegroundColor) {
		YColor oldForegroundColor = foregroundColor;
		foregroundColor = newForegroundColor == null ? FOREGROUND_COLOR_EDEFAULT : newForegroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColorCode() {
		return backgroundColorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColorCode(String newBackgroundColorCode) {
		String oldBackgroundColorCode = backgroundColorCode;
		backgroundColorCode = newBackgroundColorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE, oldBackgroundColorCode, backgroundColorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForegroundColorCode() {
		return foregroundColorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColorCode(String newForegroundColorCode) {
		String oldForegroundColorCode = foregroundColorCode;
		foregroundColorCode = newForegroundColorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE, oldForegroundColorCode, foregroundColorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ID:
				return getId();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__NAME:
				return getName();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__VISIBLE:
				return isVisible();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__EDITABLE:
				return isEditable();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ENABLED:
				return isEnabled();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BORDER:
				return isBorder();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BOLD:
				return isBold();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ITALIC:
				return isItalic();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__STRIKETHROUGH:
				return isStrikethrough();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__UNDERLINE:
				return isUnderline();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR:
				return getBackgroundColor();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR:
				return getForegroundColor();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE:
				return getBackgroundColorCode();
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE:
				return getForegroundColorCode();
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
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ID:
				setId((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__NAME:
				setName((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BORDER:
				setBorder((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BOLD:
				setBold((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__STRIKETHROUGH:
				setStrikethrough((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__UNDERLINE:
				setUnderline((Boolean)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR:
				setBackgroundColor((YColor)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR:
				setForegroundColor((YColor)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE:
				setBackgroundColorCode((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE:
				setForegroundColorCode((String)newValue);
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
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ID:
				setId(ID_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__STRIKETHROUGH:
				setStrikethrough(STRIKETHROUGH_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__UNDERLINE:
				setUnderline(UNDERLINE_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE:
				setBackgroundColorCode(BACKGROUND_COLOR_CODE_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE:
				setForegroundColorCode(FOREGROUND_COLOR_CODE_EDEFAULT);
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
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VisibilityPackage.YVISIBILITY_PROPERTIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisibilityPackage.YVISIBILITY_PROPERTIES__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BORDER:
				return border != BORDER_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BOLD:
				return bold != BOLD_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__ITALIC:
				return italic != ITALIC_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__STRIKETHROUGH:
				return strikethrough != STRIKETHROUGH_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__UNDERLINE:
				return underline != UNDERLINE_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR:
				return foregroundColor != FOREGROUND_COLOR_EDEFAULT;
			case VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR_CODE:
				return BACKGROUND_COLOR_CODE_EDEFAULT == null ? backgroundColorCode != null : !BACKGROUND_COLOR_CODE_EDEFAULT.equals(backgroundColorCode);
			case VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR_CODE:
				return FOREGROUND_COLOR_CODE_EDEFAULT == null ? foregroundColorCode != null : !FOREGROUND_COLOR_CODE_EDEFAULT.equals(foregroundColorCode);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", visible: ");
		result.append(visible);
		result.append(", editable: ");
		result.append(editable);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", border: ");
		result.append(border);
		result.append(", bold: ");
		result.append(bold);
		result.append(", italic: ");
		result.append(italic);
		result.append(", strikethrough: ");
		result.append(strikethrough);
		result.append(", underline: ");
		result.append(underline);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", foregroundColor: ");
		result.append(foregroundColor);
		result.append(", backgroundColorCode: ");
		result.append(backgroundColorCode);
		result.append(", foregroundColorCode: ");
		result.append(foregroundColorCode);
		result.append(')');
		return result.toString();
	}

} //YVisibilityPropertiesImpl
