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
package org.lunifera.ecview.core.common.context;

import java.util.List;

import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;

/**
 * Context containing information about the current {@link IViewSetEditpart}
 * instance.<br>
 * Not intended to be subclassed.
 */
public interface IViewSetContext extends IContext {

	/**
	 * Returns the {@link IViewSetEditpart} that is related with this context.
	 * 
	 * @return viewSetEditpart
	 */
	IViewSetEditpart getViewSetEditpart();

	/**
	 * Returns a list of contained view contexts.
	 * 
	 * @return viewContexts
	 */
	List<IViewContext> getViewContexts();

}
