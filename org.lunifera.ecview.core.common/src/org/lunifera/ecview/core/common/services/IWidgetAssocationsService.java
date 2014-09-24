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
package org.lunifera.ecview.core.common.services;

import java.util.List;

import org.lunifera.ecview.core.common.editpart.IElementEditpart;

/**
 * Is used to associate widgets with their model elements.
 */
public interface IWidgetAssocationsService<UI, MODEL> extends IUiKitBasedService {

	public static final String ID = IWidgetAssocationsService.class.getName();

	/**
	 * Returns the model element for the given ui widget.
	 * 
	 * @param model
	 */
	MODEL getModelElement(UI uiWidget);

	/**
	 * Returns the model element for the given id.
	 * 
	 * @param uiWidget
	 */
	MODEL getModelElement(String id);

	/**
	 * Returns the editpart for the given id.
	 * 
	 * @param editpart
	 */
	IElementEditpart getEditpart(String id);

	/**
	 * Returns the widget for the given model element.
	 * 
	 * @param modelElement
	 */
	UI getWidget(MODEL modelElement);

	/**
	 * Associates the uiWidget with the given model element. One model element
	 * can become assigned to different uiWidgets.
	 * 
	 * @param uiWidget
	 * @param modelElement
	 */
	void associate(UI uiWidget, MODEL modelElement);

	/**
	 * Removes the association for the given uiWidget.
	 * 
	 * @param uiWidget
	 */
	void remove(UI uiWidget);

	/**
	 * Returns all model elements.
	 */
	List<MODEL> getModelElements();

	/**
	 * Clears all associations.
	 */
	void clear();

}
