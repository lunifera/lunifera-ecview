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
package org.lunifera.ecview.core.common.editpart.emf.validation;

import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.emf.validation.validator.MinLengthValidator;
import org.lunifera.ecview.core.common.editpart.validation.IMinLengthValidatorEditpart;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.validation.IValidationConfig;
import org.lunifera.ecview.core.common.validation.IValidator;

public class MinLengthValidatorEditpart extends
		ValidatorEditpart<YMinLengthValidator> implements
		IMinLengthValidatorEditpart {

	private ValidationConfigToValidatorBridge bridgeObserver;

	public MinLengthValidatorEditpart() {
		super(
				ValidationPackage.Literals.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH);
	}

	@Override
	protected YMinLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMinLengthValidator();
	}

	@Override
	protected IValidator createValidator() {
		checkDisposed();

		MinLengthValidator validator = new MinLengthValidator(getModel());
		IViewContext context = getViewContext(getModel());
		validator.setI18nService((II18nService) context
				.getService(II18nService.class.getName()));
		validator.setLocale(context.getLocale());
		return validator;
	}

	@Override
	public void setConfig(IValidationConfig config) {
		checkDisposed();

		YMinLengthValidationConfig validatable = (YMinLengthValidationConfig) config
				.getValidationSettings();

		// create an observer that transfers the changes at the validatable to
		// the validator
		bridgeObserver = ValidationConfigToValidatorBridge
				.createObserver(
						validatable,
						ValidationPackage.Literals.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH,
						getModel(),
						ValidationPackage.Literals.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH);
	}

	@Override
	protected void internalDispose() {
		try {
			if (bridgeObserver != null) {
				bridgeObserver.dispose();
				bridgeObserver = null;
			}
		} finally {
			super.internalDispose();
		}
	}
}
