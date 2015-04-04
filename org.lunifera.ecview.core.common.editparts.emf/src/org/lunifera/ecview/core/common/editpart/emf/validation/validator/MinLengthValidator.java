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

import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.validation.IStatus;
import org.lunifera.ecview.core.common.validation.Status;
import org.lunifera.ecview.core.common.validation.StringValidator;

public class MinLengthValidator extends StringValidator {

	public static final String DEFAULT_ERROR_CODE = "org.lunifera.ecview.core.common.editpart.emf.validation.validator.MinLengthValidator";
	private static final String DEF_MESSAGE = "Minimum length is ${minLength}. Length of \"${value}\" is ${currentLength}!";

	private String defaultMessage = DEF_MESSAGE;
	private int minLength;

	public MinLengthValidator(YMinLengthValidationConfig yValidator) {
		super(yValidator.getErrorCode());
		if (isStringValid(yValidator.getDefaultErrorMessage())) {
			defaultMessage = yValidator.getDefaultErrorMessage();
		}

		updateParameter(yValidator);
	}

	@Override
	public IStatus doValidate(String value) {
		if (value.trim().length() < minLength) {
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
		message = message.replaceAll("\\$\\{minLength\\}",
				Integer.toString(minLength));
		message = message.replaceAll("\\$\\{currentLength\\}",
				Integer.toString(value.trim().length()));
		message = message.replaceAll("\\$\\{value\\}", value);
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
		YMinLengthValidationConfig yValidator = (YMinLengthValidationConfig) model;
		this.minLength = yValidator.getMinLength();
	}

	@Override
	protected String getDefaultErrorCode() {
		return DEFAULT_ERROR_CODE;
	};

	@Override
	protected void internalDispose() {

	};

}
