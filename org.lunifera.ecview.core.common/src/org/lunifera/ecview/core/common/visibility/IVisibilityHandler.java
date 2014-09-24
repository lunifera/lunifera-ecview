/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.common.visibility;

public interface IVisibilityHandler {

	/**
	 * Resets the options to their default values.
	 */
	void reset();
	
	/**
	 * Returns the foregroundColor property or <code>null</code> if not present.
	 */
	Color getForegroundColor();

	/**
	 * Sets the <code>foregroundColor</code> property to this instance.
	 * 
	 * @param foregroundColor
	 *            - the property
	 * 
	 */
	void setForegroundColor(final Color foregroundColor);

	/**
	 * Returns the backgroundColor property or <code>null</code> if not present.
	 */
	Color getBackgroundColor();

	/**
	 * Sets the <code>backgroundColor</code> property to this instance.
	 * 
	 * @param backgroundColor
	 *            - the property
	 */
	void setBackgroundColor(final Color backgroundColor);

	/**
	 * Returns the foregroundColorCode property or <code>null</code> if not
	 * present.
	 */
	String getForegroundColorCode();

	/**
	 * Sets the <code>foregroundColorCode</code> property to this instance.
	 * 
	 * @param foregroundColorCode
	 *            - the property
	 * 
	 */
	void setForegroundColorCode(String foregroundColorCode);

	/**
	 * Returns the backgroundColorCode property or <code>null</code> if not
	 * present.
	 */
	String getBackgroundColorCode();

	/**
	 * Sets the <code>backgroundColorCode</code> property to this instance.
	 * 
	 * @param backgroundColorCode
	 *            - the property
	 */
	void setBackgroundColorCode(final String backgroundColor);

	/**
	 * Returns the editable property or <code>null</code> if not present.
	 */
	boolean isEditable();

	/**
	 * Sets the <code>editable</code> property to this instance.
	 * 
	 * @param editable
	 *            - the property
	 */
	void setEditable(final boolean editable);

	/**
	 * Returns the enabled property or <code>null</code> if not present.
	 */
	boolean isEnabled();

	/**
	 * Sets the <code>enabled</code> property to this instance.
	 * 
	 * @param enabled
	 *            - the property
	 */
	void setEnabled(final boolean enabled);

	/**
	 * Returns the visible property or <code>null</code> if not present.
	 */
	boolean isVisible();

	/**
	 * Sets the <code>visible</code> property to this instance.
	 * 
	 * @param visible
	 *            - the property
	 */
	void setVisible(final boolean visible);

	/**
	 * Returns the bold property or <code>null</code> if not present.
	 */
	boolean isBold();

	/**
	 * Sets the <code>bold</code> property to this instance.
	 * 
	 * @param bold
	 *            - the property
	 */
	void setBold(final boolean bold);

	/**
	 * Returns the border property or <code>null</code> if not present.
	 */
	boolean isBorder();

	/**
	 * Sets the <code>border</code> property to this instance.
	 * 
	 * @param border
	 *            - the property
	 */
	void setBorder(final boolean border);

	/**
	 * Returns the italic property or <code>null</code> if not present.
	 */
	boolean isItalic();

	/**
	 * Sets the <code>italic</code> property to this instance.
	 * 
	 * @param italic
	 *            - the property
	 */
	void setItalic(final boolean italic);

	/**
	 * Returns the strikethrough property or <code>null</code> if not present.
	 */
	boolean isStrikethrough();

	/**
	 * Sets the <code>strikethrough</code> property to this instance.
	 * 
	 * @param strikethrough
	 *            - the property
	 */
	void setStrikethrough(final boolean strikethrough);

	/**
	 * Returns the underline property or <code>null</code> if not present.
	 */
	boolean isUnderline();

	/**
	 * Sets the <code>underline</code> property to this instance.
	 * 
	 * @param underline
	 *            - the property
	 */
	void setUnderline(final boolean underline);

	/**
	 * Applies the options to the assigned UI element.
	 */
	void apply();

}
