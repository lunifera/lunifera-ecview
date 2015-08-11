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
import org.lunifera.runtime.common.dispose.AbstractDisposable;
import org.lunifera.runtime.common.validation.IStatus;

/**
 * A validator that returns true by default, if the given value is not a String.
 */
public abstract class StringValidator extends AbstractDisposable implements
		IValidator {

	protected final String errorCode;
	protected Locale locale;
	protected II18nService i18nService;

	public StringValidator(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Returns the raw message containing replacement patterns.
	 */
	protected String getMessage() {
		String result = null;
		if (i18nService != null) {
			if (isStringValid(errorCode)) {
				result = i18nService.getValue(errorCode, locale);
			}
			if (!isStringValid(result)) {
				result = getDefaultMessage();
			}
			if (!isStringValid(result)) {
				result = i18nService.getValue(getDefaultErrorCode(), locale);
			}
			if (!isStringValid(result)) {
				result = "Error message missing for " + getDefaultErrorCode();
			}
		} else {
			result = getDefaultMessage();
		}

		return result;
	}

	@Override
	public boolean isCheckValidType() {
		return true;
	}

	protected boolean isStringValid(String result) {
		return result != null && !result.equals("");
	}

	/**
	 * Returns the default error code.
	 * 
	 * @return
	 */
	protected abstract String getDefaultErrorCode();

	/**
	 * Returns the default message.
	 * 
	 * @return
	 */
	protected abstract String getDefaultMessage();

	@Override
	public Class<?> getType() {
		return String.class;
	}

	@Override
	public IStatus validateValue(Object value) {
		if (!(value instanceof String)) {
			return IStatus.OK;
		}

		return doValidate((String) value);
	}

	/**
	 * Delegates the given value.
	 * 
	 * @param value
	 * @return IStatus - the validation status.
	 */
	protected abstract IStatus doValidate(String value);

	@Override
	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	@Override
	public void setI18nService(II18nService i18nService) {
		this.i18nService = i18nService;
	}

	@Override
	protected void internalDispose() {

	}

}
