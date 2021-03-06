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
 * This service returns the string value for a given i18nKey and locale.
 */
public interface II18nService extends IDisposable {

	public static String ID = II18nService.class.getName();

	/**
	 * Returns the i18nKey for the given key and locale.
	 * 
	 * @param i18nKey
	 * @param locale
	 * @return
	 */
	String getValue(String i18nKey, Locale locale);

}
