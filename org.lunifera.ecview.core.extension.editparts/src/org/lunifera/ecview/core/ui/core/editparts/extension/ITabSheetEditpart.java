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
package org.lunifera.ecview.core.ui.core.editparts.extension;

import java.util.List;

import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;

/**
 * The abstraction for a tab sheet.
 */
public interface ITabSheetEditpart extends IEmbeddableEditpart {

	/**
	 * Returns an unmodifiable list with all tabs contained in the tabsheet.
	 * 
	 * @return elements The children editparts contained in this tabsheet
	 */
	List<ITabEditpart> getTabs();

	/**
	 * Adds a tab to the tabsheet. Adding the same tab twice has no effect.
	 * 
	 * @param tab
	 *            The editpart to be added.
	 */
	void addTab(ITabEditpart tab);

	/**
	 * Removes a tab from the tabsheet.
	 * 
	 * @param element
	 *            The editpart to be removed.
	 */
	void removeTab(ITabEditpart tab);

	/**
	 * Renders the given tab.
	 * 
	 * @param tab
	 */
	void renderTab(ITabEditpart tab);

	/**
	 * Disposes the given tab.
	 * 
	 * @param tab
	 */
	void disposeTab(ITabEditpart tab);

	/**
	 * Unrenders the given tab.
	 * 
	 * @param tab
	 */
	void unrenderTab(ITabEditpart tab);
}
