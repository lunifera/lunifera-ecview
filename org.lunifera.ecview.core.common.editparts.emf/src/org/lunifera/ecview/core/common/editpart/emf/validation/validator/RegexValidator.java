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
package org.lunifera.ecview.core.common.editpart.emf.validation.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;
import org.lunifera.ecview.core.common.validation.StringValidator;
import org.lunifera.runtime.common.validation.IStatus;
import org.lunifera.runtime.common.validation.Status;

/**
 * Validates the string value if it matches the given regular expression.
 */
public class RegexValidator extends StringValidator {

	public static final String DEFAULT_ERROR_CODE = "org.lunifera.ecview.core.common.editpart.emf.validation.validator.RegexValidator";
	private static final String DEF_MESSAGE = "Value ${value} does not match the required pattern ${regex}!";
	private String defaultMessage = DEF_MESSAGE;

	private Pattern pattern;
	private Matcher matcher = null;
	private String regexp;

	public RegexValidator(YRegexpValidationConfig yValidator) {
		super(yValidator.getErrorCode());
		if (isStringValid(yValidator.getDefaultErrorMessage())) {
			defaultMessage = yValidator.getDefaultErrorMessage();
		}
		updateParameter(yValidator);
	}

	/**
	 * Get a new or reused matcher for the pattern
	 * 
	 * @param value
	 *            the string to find matches in
	 * @return Matcher for the string
	 */
	private Matcher getMatcher(String value) {
		if (matcher == null) {
			matcher = pattern.matcher(value);
		} else {
			matcher.reset(value);
		}
		return matcher;
	}

	@Override
	public IStatus doValidate(String value) {
		if (value == null || value.isEmpty()) {
			return IStatus.OK;
		}

		if (!getMatcher(value).matches()) {
			return Status.createStatus(errorCode, getClass(),
					IStatus.Severity.ERROR, createMessage(value));
		}
		return IStatus.OK;
	}

	/**
	 * Creates the message.
	 * 
	 * @param value
	 * @return
	 */
	protected String createMessage(String value) {
		String message = getMessage();
		if (!isStringValid(message)) {
			return "Error message missing!";
		}
		message = message.replaceAll("\\$\\{value\\}", value);
		message = message.replaceAll("\\$\\{regex\\}", regexp);
		return message;
	}

	/**
	 * Creates the default message in english.
	 * 
	 * @return
	 */
	protected String getDefaultMessage() {
		return defaultMessage;
	}

	@Override
	public void updateParameter(Object model) {
		YRegexpValidationConfig yValidator = (YRegexpValidationConfig) model;
		this.regexp = yValidator.getRegExpression();
		this.pattern = Pattern.compile(regexp != null ? regexp : "");
		this.matcher = null;
	}

	@Override
	protected String getDefaultErrorCode() {
		return DEFAULT_ERROR_CODE;
	};

	@Override
	protected void internalDispose() {

	};

}