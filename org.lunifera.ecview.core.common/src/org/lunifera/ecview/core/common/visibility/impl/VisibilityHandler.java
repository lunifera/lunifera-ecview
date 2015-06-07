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
package org.lunifera.ecview.core.common.visibility.impl;

import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityProcessable;
import org.lunifera.ecview.core.common.visibility.Color;
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler;

public class VisibilityHandler implements IVisibilityHandler {

	private final IVisibilityProcessable editpart;
	
	private Color foregroundColor;
	private Color backgroundColor;
	private String foregroundColorCode;
	private String backgroundColorCode;
	private boolean editable;
	private boolean enabled;
	private boolean visible;
	private boolean bold;
	private boolean border;
	private boolean italic;
	private boolean strikethrough;
	private boolean underline;

	public VisibilityHandler(IVisibilityProcessable editpart) {
		this.editpart = editpart;
		
		reset();
	}
	
	@Override
	public void reset() {
		foregroundColor = Color.UNDEFINED;
		backgroundColor = Color.UNDEFINED;
		foregroundColorCode = "";
		backgroundColorCode = "";
		editable = true;
		enabled = true;
		visible = true;
		bold = false;
		border = false;
		italic = false;
		strikethrough = false;
		underline = false;
	}

	/**
	 * @return the foregroundColor
	 */
	public Color getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * @param foregroundColor
	 *            the foregroundColor to set
	 */
	public void setForegroundColor(Color foregroundColor) {
		this.foregroundColor = foregroundColor;
	}

	/**
	 * @return the backgroundColor
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @param backgroundColor
	 *            the backgroundColor to set
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @return the foregroundColorCode
	 */
	public String getForegroundColorCode() {
		return foregroundColorCode;
	}

	/**
	 * @param foregroundColorCode
	 *            the foregroundColorCode to set
	 */
	public void setForegroundColorCode(String foregroundColorCode) {
		this.foregroundColorCode = foregroundColorCode;
	}

	/**
	 * @return the backgroundColorCode
	 */
	public String getBackgroundColorCode() {
		return backgroundColorCode;
	}

	/**
	 * @param backgroundColorCode
	 *            the backgroundColorCode to set
	 */
	public void setBackgroundColorCode(String backgroundColorCode) {
		this.backgroundColorCode = backgroundColorCode;
	}

	/**
	 * @return the editable
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * @param editable
	 *            the editable to set
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @param visible
	 *            the visible to set
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	/**
	 * @return the bold
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * @param bold
	 *            the bold to set
	 */
	public void setBold(boolean bold) {
		this.bold = bold;
	}

	/**
	 * @return the border
	 */
	public boolean isBorder() {
		return border;
	}

	/**
	 * @param border
	 *            the border to set
	 */
	public void setBorder(boolean border) {
		this.border = border;
	}

	/**
	 * @return the italic
	 */
	public boolean isItalic() {
		return italic;
	}

	/**
	 * @param italic
	 *            the italic to set
	 */
	public void setItalic(boolean italic) {
		this.italic = italic;
	}

	/**
	 * @return the strikethrough
	 */
	public boolean isStrikethrough() {
		return strikethrough;
	}

	/**
	 * @param strikethrough
	 *            the strikethrough to set
	 */
	public void setStrikethrough(boolean strikethrough) {
		this.strikethrough = strikethrough;
	}

	/**
	 * @return the underline
	 */
	public boolean isUnderline() {
		return underline;
	}

	/**
	 * @param underline
	 *            the underline to set
	 */
	public void setUnderline(boolean underline) {
		this.underline = underline;
	}

	@Override
	public void apply() {
		editpart.apply(this);
	}

}
