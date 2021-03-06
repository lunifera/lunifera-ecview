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

import org.lunifera.ecview.core.common.disposal.IDisposable;

/**
 * This service can be consumed by the viewContext or viewSetContext and will
 * notify listener about a locale change.
 */
public interface ILocaleChangedService extends IDisposable {

	public static String ID = ILocaleChangedService.class.getName();

	/**
	 * Adds a locale listener to the service.
	 * 
	 * @param listener
	 */
	void addLocaleListener(LocaleListener listener);

	/**
	 * Removes the given locale listener from the service.
	 * 
	 * @param listener
	 */
	void removeLocaleListener(LocaleListener listener);

	/**
	 * Notifies the listener about the changed locale.
	 */
	void notifyLocaleChanged(Locale locale);

	interface LocaleListener {

		/**
		 * Notifies the listener about a locale change.
		 * 
		 * @param locale
		 */
		void localeChanged(Locale locale);

	}

}
