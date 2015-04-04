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

import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;

/**
 * TabSheetPresentations are an abstraction above a tabSheet an are responsible
 * to create the UI-Kit specific elements and to handle them. One important
 * thing to notice is, that the life cycle of tabs is handled by their edit
 * parts. And so an tabs must never dispose its tab tabs!
 * 
 * @param <C>
 */
public interface IMasterDetailPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Returns the master presentation
	 * 
	 * @return presentation
	 */
	IWidgetPresentation<?> getMaster();

	/**
	 * Returns the detail presentation
	 * 
	 * @return presentation
	 */
	IWidgetPresentation<?> getDetail();

	/**
	 * Sets the master presentation
	 * 
	 * @param master
	 */
	void setMaster(IWidgetPresentation<?> master);

	/**
	 * Sets the detail presentation
	 * 
	 * @param detail
	 */
	void setDetail(IWidgetPresentation<?> detail);
}
