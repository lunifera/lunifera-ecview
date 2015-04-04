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

import java.util.Locale;

import org.lunifera.ecview.core.common.IAccessible;
import org.lunifera.ecview.core.common.disposal.IDisposable;

/**
 * Marker interface for context.
 * 
 * @author dominguez
 * 
 */
public interface IContext extends IDisposable, IAccessible {

	/**
	 * Sets the current locale of the view or viewset.
	 * 
	 * @param locale
	 */
	void setLocale(Locale locale);

	/**
	 * Returns the current locale of the view or viewset.
	 * 
	 * @return
	 */
	Locale getLocale();

}