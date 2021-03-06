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
package org.lunifera.ecview.core.ui.core.editparts.extension.presentation;

import java.util.List;

import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITabEditpart;

/**
 * TabSheetPresentations are an abstraction above a tabSheet an are responsible
 * to create the UI-Kit specific elements and to handle them. One important
 * thing to notice is, that the life cycle of tabs is handled by their
 * edit parts. And so an tabs must never dispose its tab tabs!
 * 
 * @param <C>
 */
public interface ITabSheetPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Returns a list containing all tab tabs.
	 * 
	 * @return tabren
	 */
	List<ITabEditpart> getTabs();
 
	/**
	 * Returns true, if the given tab is contained.
	 * 
	 * @param tab
	 *            The tab
	 * @return true if the tab is contained. False
	 *         otherwise.
	 */
	boolean contains(ITabEditpart tab);
	
	/**
	 * Adds a tab to the this tabSheet. Note, that the tab can
	 * be of any kind and it not parameterized.
	 * 
	 * @param tab
	 *            The tab to be added
	 */
	void add(ITabEditpart tab);

	/**
	 * Removes a tab from this tabSheet.
	 * 
	 * @param tab
	 *            The tab to be removed
	 */
	void remove(ITabEditpart tab);

	/**
	 * Inserts the given tab at the index.
	 * 
	 * @param tab
	 *            The tab to be inserted
	 * @param index
	 *            The index where the tab should be inserted
	 */
	void insert(ITabEditpart tab, int index);

	/**
	 * Moves the tab from its current index to the given one.
	 * 
	 * @param tab
	 *            The tab
	 * @param index
	 *            The index where the tab should be moved to
	 */
	void move(ITabEditpart tab, int index);

	/**
	 * Will render the tab tabs.<br>
	 * <ul>
	 * <li><b>force == false:</b> Only elements will be rendered that are not
	 * rendered yet. Already rendered elements will not be touched.</li>
	 * <li><b>force == true:</b> First will unrender all tab tabs and
	 * afterward it will render them again.</li>
	 * </ul>
	 * 
	 * @param force
	 *            see method description
	 */
	void renderTabs(boolean force);
}
