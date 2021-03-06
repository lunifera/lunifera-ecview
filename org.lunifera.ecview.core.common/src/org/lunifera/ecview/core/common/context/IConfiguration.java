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

/**
 * This class is called if the view becomes rendered.
 * 
 * @noimplement should not be implemented by clients. Use ConfigurationAdapter
 *              instead.
 */
public interface IConfiguration {

	/**
	 * Is called before the UI rendering is started.
	 * 
	 * @param context
	 */
	void beforeUiRendering(IContext context);

	/**
	 * Is called after the UI rendering was finished.
	 * 
	 * @param context
	 */
	void afterUiRendering(IContext context);

	/**
	 * Is called before the binding is activated.
	 * 
	 * @param context
	 */
	void beforeBind(IContext context);

	/**
	 * Is called after the binding was activated.
	 * 
	 * @param context
	 */
	void afterBind(IContext context);

}
