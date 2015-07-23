/*
 * Copyright 2000-2014 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Contribution:
 * Florian Pirchner - OSGi support
 */
package org.lunifera.ecview.core.common.editpart.emf.validation.validator;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator.Context;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.metadata.ConstraintDescriptor;

import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.validation.IStatus;
import org.lunifera.ecview.core.common.validation.IStatus.Severity;
import org.lunifera.ecview.core.common.validation.IValidator;
import org.lunifera.ecview.core.common.validation.Status;
import org.lunifera.runtime.common.dispose.AbstractDisposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanValidationValidator extends AbstractDisposable implements
		IValidator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BeanValidationValidator.class);

	private final String propertyName;
	private final Class<?> beanClass;
	private Locale locale;

	@SuppressWarnings("unused")
	private II18nService i18nService;
	@SuppressWarnings("unused")
	private final ValidatorFactory javaxBeanValidatorFactory;
	private final Validator javaxBeanValidator;

	public BeanValidationValidator(Class<?> beanClass, String propertyName,
			ValidatorFactory jsr303ValidatorFactory) {
		this.javaxBeanValidatorFactory = jsr303ValidatorFactory;
		this.javaxBeanValidator = jsr303ValidatorFactory.getValidator();
		this.beanClass = beanClass;
		this.propertyName = propertyName;
		locale = Locale.getDefault();
	}

	@Override
	public Class<?> getType() {
		return beanClass;
	}

	@Override
	public IStatus validateValue(Object value) {
		if (javaxBeanValidator == null) {
			return Status.createStatus("", BeanValidationValidator.class,
					Severity.ERROR,
					"Error occured: javaxBeanValidator was null.");
		}
		Set<?> violations = javaxBeanValidator.validateValue(beanClass,
				propertyName, value);

		if (violations.isEmpty()) {
			return IStatus.OK;
		}

		final ConstraintViolation<?> violation = (ConstraintViolation<?>) violations
				.iterator().next();
		// String msg = getJavaxBeanValidatorFactory()
		// .getMessageInterpolator().interpolate(
		// violation.getMessageTemplate(),
		// new SimpleContext(value, violation
		// .getConstraintDescriptor()), locale);
		String msg = violation.getMessageTemplate();

		IStatus status = Status.createStatus(violation.getMessageTemplate(),
				violation.getRootBeanClass(), IStatus.Severity.ERROR, msg);
		return status;
	}

	/**
	 * Sets the locale used for validation error messages.
	 * 
	 * Revalidation is not automatically triggered by setting the locale.
	 * 
	 * @param locale
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	/**
	 * Gets the locale used for validation error messages.
	 * 
	 * @return locale used for validation
	 */
	public Locale getLocale() {
		return locale;
	}

	@Override
	public void updateParameter(Object model) {
		// not supported yet
		LOGGER.error("Update parameter for BeanValidationValidator not allowed yet!");
	}

	@Override
	protected void internalDispose() {

	}

	@Override
	public void setI18nService(II18nService i18nService) {
		this.i18nService = i18nService;
	};

	/**
	 * Simple implementation of a message interpolator context that returns
	 * fixed values.
	 */
	@SuppressWarnings("serial")
	protected static class SimpleContext implements Context, Serializable {

		private final Object value;
		private final ConstraintDescriptor<?> descriptor;

		/**
		 * Create a simple immutable message interpolator context.
		 * 
		 * @param value
		 *            value being validated
		 * @param descriptor
		 *            ConstraintDescriptor corresponding to the constraint being
		 *            validated
		 */
		public SimpleContext(Object value, ConstraintDescriptor<?> descriptor) {
			this.value = value;
			this.descriptor = descriptor;
		}

		@Override
		public ConstraintDescriptor<?> getConstraintDescriptor() {
			return descriptor;
		}

		@Override
		public Object getValidatedValue() {
			return value;
		}

		@Override
		public <T> T unwrap(Class<T> arg0) {
			return null;
		}
	}
}
