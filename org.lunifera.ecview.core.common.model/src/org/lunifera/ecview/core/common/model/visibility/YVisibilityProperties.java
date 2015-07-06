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
package org.lunifera.ecview.core.common.model.visibility;

import org.lunifera.ecview.core.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibility Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBorder <em>Border</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBold <em>Bold</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isStrikethrough <em>Strikethrough</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColorCode <em>Background Color Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColorCode <em>Foreground Color Code</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getCssId <em>Css Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties()
 * @model
 * @generated
 */
public interface YVisibilityProperties extends YElement {
	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Visible()
	 * @model
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Editable()
	 * @model
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Border()
	 * @model
	 * @generated
	 */
	boolean isBorder();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #isBorder()
	 * @generated
	 */
	void setBorder(boolean value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Bold()
	 * @model
	 * @generated
	 */
	boolean isBold();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #isBold()
	 * @generated
	 */
	void setBold(boolean value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Italic()
	 * @model
	 * @generated
	 */
	boolean isItalic();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #isItalic()
	 * @generated
	 */
	void setItalic(boolean value);

	/**
	 * Returns the value of the '<em><b>Strikethrough</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strikethrough</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strikethrough</em>' attribute.
	 * @see #setStrikethrough(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Strikethrough()
	 * @model
	 * @generated
	 */
	boolean isStrikethrough();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isStrikethrough <em>Strikethrough</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strikethrough</em>' attribute.
	 * @see #isStrikethrough()
	 * @generated
	 */
	void setStrikethrough(boolean value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(boolean)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_Underline()
	 * @model
	 * @generated
	 */
	boolean isUnderline();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #isUnderline()
	 * @generated
	 */
	void setUnderline(boolean value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.common.model.visibility.YColor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.visibility.YColor
	 * @see #setBackgroundColor(YColor)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_BackgroundColor()
	 * @model
	 * @generated
	 */
	YColor getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.visibility.YColor
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(YColor value);

	/**
	 * Returns the value of the '<em><b>Foreground Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.core.common.model.visibility.YColor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground Color</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.visibility.YColor
	 * @see #setForegroundColor(YColor)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_ForegroundColor()
	 * @model
	 * @generated
	 */
	YColor getForegroundColor();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColor <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color</em>' attribute.
	 * @see org.lunifera.ecview.core.common.model.visibility.YColor
	 * @see #getForegroundColor()
	 * @generated
	 */
	void setForegroundColor(YColor value);

	/**
	 * Returns the value of the '<em><b>Background Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color Code</em>' attribute.
	 * @see #setBackgroundColorCode(String)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_BackgroundColorCode()
	 * @model
	 * @generated
	 */
	String getBackgroundColorCode();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getBackgroundColorCode <em>Background Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color Code</em>' attribute.
	 * @see #getBackgroundColorCode()
	 * @generated
	 */
	void setBackgroundColorCode(String value);

	/**
	 * Returns the value of the '<em><b>Foreground Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground Color Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground Color Code</em>' attribute.
	 * @see #setForegroundColorCode(String)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_ForegroundColorCode()
	 * @model
	 * @generated
	 */
	String getForegroundColorCode();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getForegroundColorCode <em>Foreground Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color Code</em>' attribute.
	 * @see #getForegroundColorCode()
	 * @generated
	 */
	void setForegroundColorCode(String value);

	/**
	 * Returns the value of the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css Class</em>' attribute.
	 * @see #setCssClass(String)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_CssClass()
	 * @model
	 * @generated
	 */
	String getCssClass();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getCssClass <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css Class</em>' attribute.
	 * @see #getCssClass()
	 * @generated
	 */
	void setCssClass(String value);

	/**
	 * Returns the value of the '<em><b>Css Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css Id</em>' attribute.
	 * @see #setCssId(String)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYVisibilityProperties_CssId()
	 * @model
	 * @generated
	 */
	String getCssId();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties#getCssId <em>Css Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css Id</em>' attribute.
	 * @see #getCssId()
	 * @generated
	 */
	void setCssId(String value);

} // YVisibilityProperties
