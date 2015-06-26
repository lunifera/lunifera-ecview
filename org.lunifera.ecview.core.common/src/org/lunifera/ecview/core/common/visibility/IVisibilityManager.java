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
package org.lunifera.ecview.core.common.visibility;

import org.lunifera.ecview.core.common.context.IViewContext;

public interface IVisibilityManager {

	/**
	 * Returns the view context.
	 * 
	 * @return
	 */
	IViewContext getViewContext();

	/**
	 * Returns the visibility handler for the given id. Or <code>null</code> if
	 * no element could be found, or if the element is not a valid
	 * IVisibilityProcessable.
	 * 
	 * @param id
	 * @return
	 */
	IVisibilityHandler getById(String id);

}
