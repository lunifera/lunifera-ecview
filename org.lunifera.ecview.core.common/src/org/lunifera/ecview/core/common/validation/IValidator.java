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
package org.lunifera.ecview.core.common.validation;

import java.util.Locale;

import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.runtime.common.dispose.IDisposable;

/**
 * A validator is used to validate the given value.
 */
public interface IValidator extends IDisposable {

	/**
	 * Is called to update the validation parameter of this validator. For
	 * instance the minLength of a MinLengthValidator.
	 * 
	 * @param model
	 */
	void updateParameter(Object model);

	/**
	 * Checks if the given value is valid.
	 * 
	 * @param value
	 * @return
	 */
	IStatus validateValue(Object value);

	/**
	 * Returns the expected type of the value. If <code>null</code> is returned,
	 * the type will not become checked.
	 * 
	 * @return type - the expected type of the value or <code>null</code>
	 */
	Class<?> getType();

	/**
	 * Sets the locale the messages should be shown in.
	 * 
	 * @param locale
	 */
	void setLocale(Locale locale);

	/**
	 * Sets the i18n service to translate the messages.
	 * 
	 * @param locale
	 */
	void setI18nService(II18nService i18nService);

}
