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

import java.util.Locale;

import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.validation.IValidator;
import org.lunifera.runtime.common.dispose.AbstractDisposable;
import org.lunifera.runtime.common.types.ITypeProviderService;
import org.lunifera.runtime.common.validation.IStatus;
import org.lunifera.runtime.common.validation.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassDelegateValidator extends AbstractDisposable implements
		IValidator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ClassDelegateValidator.class);

	private ITypeProviderService service;
	private IValidator delegate;

	private Locale locale;
	private II18nService i18nService;

	public ClassDelegateValidator(YClassDelegateValidator yValidator,
			IViewContext context) {
		service = context.getService(ITypeProviderService.class.getName());
		i18nService = context.getService(II18nService.class.getName());
		locale = context.getLocale();
		updateParameter(yValidator);
	}

	@Override
	public Class<?> getType() {
		return delegate.getType();
	}

	@Override
	public IStatus validateValue(Object value) {
		if (delegate == null) {
			return Status.createStatus("", ClassDelegateValidator.class,
					IStatus.Severity.ERROR,
					"Error occured: Delegate class was null.");
		}
		return delegate.validateValue(value);
	}

	@Override
	public void updateParameter(Object model) {
		YClassDelegateValidationConfig yValidator = (YClassDelegateValidationConfig) model;
		Class<?> delegateClass = service.forName(
				ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATOR,
				yValidator.getClassName());
		try {
			if (delegateClass != null) {
				delegate = (IValidator) delegateClass.newInstance();
				delegate.setI18nService(i18nService);
				delegate.setLocale(locale);
			} else {
				LOGGER.error("The class {} could not be loaded!",
						yValidator.getClassName());
			}

		} catch (InstantiationException e) {
			LOGGER.error(e.toString());
		} catch (IllegalAccessException e) {
			LOGGER.error(e.toString());
		}
	}

	@Override
	protected void internalDispose() {

	}

	@Override
	public void setLocale(Locale locale) {
		this.locale = locale;
		if (delegate != null) {
			delegate.setLocale(locale);
		}
	}

	@Override
	public void setI18nService(II18nService i18nService) {
		this.i18nService = i18nService;
		if (delegate != null) {
			delegate.setI18nService(i18nService);
		}
	}

	@Override
	public boolean isCheckValidType() {
		return delegate.isCheckValidType();
	}
}
