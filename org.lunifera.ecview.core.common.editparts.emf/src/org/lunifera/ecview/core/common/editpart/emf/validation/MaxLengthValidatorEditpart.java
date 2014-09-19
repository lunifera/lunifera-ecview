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
import org.lunifera.ecview.core.common.editpart.emf.validation.validator.MaxLengthValidator;
import org.lunifera.ecview.core.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.validation.IValidationConfig;
import org.lunifera.ecview.core.common.validation.IValidator;

public class MaxLengthValidatorEditpart extends
		ValidatorEditpart<YMaxLengthValidator> implements
		IMaxLengthValidatorEditpart {

	private ValidationConfigToValidatorBridge bridgeObserver;

	public MaxLengthValidatorEditpart() {
		super(
				ValidationPackage.Literals.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH);
	}

	@Override
	protected YMaxLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMaxLengthValidator();
	}

	@Override
	protected IValidator createValidator() {
		MaxLengthValidator validator = new MaxLengthValidator(getModel());
		IViewContext context = getViewContext(getModel());
		validator.setI18nService((II18nService) context
				.getService(II18nService.class.getName()));
		validator.setLocale(context.getLocale());
		return validator;
	}

	@Override
	public void setConfig(IValidationConfig config) {
		YMaxLengthValidationConfig validatable = (YMaxLengthValidationConfig) config
				.getValidationSettings();
		// create an observer that transfers the changes at the validatable to
		// the validator
		bridgeObserver = ValidationConfigToValidatorBridge
				.createObserver(
						validatable,
						ValidationPackage.Literals.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH,
						getModel(),
						ValidationPackage.Literals.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH);
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
