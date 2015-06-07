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

import java.net.URL;
import java.util.Locale;

import org.lunifera.runtime.common.dispose.AbstractDisposable;
import org.lunifera.runtime.common.i18n.I18nRegistry;

/**
 * The I18nService uses the given URLs to add property files.
 * <p>
 * See {@link I18nRegistry} for details about the file name pattern.
 */
public class URLI18nService extends AbstractDisposable implements II18nService {

	private I18nRegistry registry = new I18nRegistry();

	/**
	 * Append the translations.
	 * @param url
	 */
	public void append(URL url) {
		checkDisposed();
		registry.addResource(url);
	}

	@Override
	public String getValue(String i18nKey, Locale locale) {
		checkDisposed();
		return registry.findTranslation(locale, i18nKey);
	}

	@Override
	protected void internalDispose() {
		registry = null;
	}

}
