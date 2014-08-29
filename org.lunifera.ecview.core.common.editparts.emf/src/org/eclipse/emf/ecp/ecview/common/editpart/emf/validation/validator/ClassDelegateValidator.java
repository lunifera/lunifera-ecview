/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.common.editpart.emf.validation.validator;

import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidationConfig;
import org.lunifera.ecview.core.common.types.ITypeProviderService;
import org.lunifera.ecview.core.common.validation.IStatus;
import org.lunifera.ecview.core.common.validation.IStatus.Severity;
import org.lunifera.ecview.core.common.validation.IValidator;
import org.lunifera.ecview.core.common.validation.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassDelegateValidator implements IValidator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ClassDelegateValidator.class);

	protected final String message;
	private ITypeProviderService service;
	private IValidator delegate;

	public ClassDelegateValidator(YClassDelegateValidationConfig yValidator,
			ITypeProviderService service) {
		this(yValidator, service, null);
	}

	public ClassDelegateValidator(YClassDelegateValidationConfig yValidator,
			ITypeProviderService service, String message) {
		this.message = message;
		this.service = service;
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
					Severity.ERROR, "Error occured: Delegate class was null.");
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
			} else {
				LOGGER.error("The class {} could not be loaded!",
						yValidator.getClassName());
			}

		} catch (InstantiationException e) {
			LOGGER.error(e.toString());
		} catch (IllegalAccessException e) {
			LOGGER.error(e.toString());
		}
	};
}
