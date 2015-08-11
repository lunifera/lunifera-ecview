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

import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator.Context;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.metadata.ConstraintDescriptor;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.validation.IValidator;
import org.lunifera.runtime.common.dispose.AbstractDisposable;
import org.lunifera.runtime.common.validation.IStatus;
import org.lunifera.runtime.common.validation.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanValidationValidator extends AbstractDisposable implements
		IValidator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BeanValidationValidator.class);

	private final Class<?> beanClass;
	private final String propertyName;
	private final Class<?> propertyClass;
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
		this.propertyClass = getPropertyType(beanClass, propertyName);
		this.propertyName = propertyName;
		locale = Locale.getDefault();
	}

	protected Class<?> getPropertyType(Class<?> beanClass, String propertyName) {
		for (PropertyDescriptor desc : PropertyUtils
				.getPropertyDescriptors(beanClass)) {
			if (desc.getName().equals(propertyName)) {
				return desc.getPropertyType();
			}
		}
		throw new IllegalStateException("Property " + propertyName
				+ " not available in class " + beanClass.getName());
	}

	@Override
	public Class<?> getType() {
		return propertyClass;
	}

	@Override
	public boolean isCheckValidType() {
		return false;
	}

	@Override
	public IStatus validateValue(Object value) {
		if (javaxBeanValidator == null) {
			return Status.createStatus("", BeanValidationValidator.class,
					IStatus.Severity.ERROR,
					"Error occured: javaxBeanValidator was null.");
		}
		Set<?> violations = null;
		try {
			Object convertedValue = value;
			if (value != null && value instanceof Number
					&& !propertyClass.isAssignableFrom(value.getClass())) {
				convertedValue = convertNumber(value);
			}

			violations = javaxBeanValidator.validateValue(beanClass,
					propertyName, convertedValue);
		} catch (Exception e) {
			return Status.createErrorStatus(e);
		}

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
		String msg = violation.getMessage();

		IStatus status = Status.createStatus(violation.toString(),
				violation.getRootBeanClass(), IStatus.Severity.ERROR, msg);
		return status;
	}

	private Object convertNumber(Object value) {
		if(propertyClass == Byte.class || propertyClass == Byte.TYPE) {
			return NumberUtils.toByte(value.toString());
		} else if(propertyClass == Short.class || propertyClass == Short.TYPE) {
			return NumberUtils.toShort(value.toString());
		} else if(propertyClass == Integer.class || propertyClass == Integer.TYPE) {
			return NumberUtils.toInt(value.toString());
		} else if(propertyClass == Double.class || propertyClass == Double.TYPE) {
			return NumberUtils.toDouble(value.toString());
		} else if(propertyClass == Float.class || propertyClass == Float.TYPE) {
			return NumberUtils.toFloat(value.toString());
		} else if(propertyClass == Long.class || propertyClass == Long.TYPE) {
			return NumberUtils.toLong(value.toString());
		}
		
		return null;
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

		public <T> T unwrap(Class<T> arg0) {
			return null;
		}
	}
}
