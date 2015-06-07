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
package org.lunifera.ecview.core.common.editpart.emf.validation;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ValidatorFactory;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.emf.validation.validator.BeanValidationValidator;
import org.lunifera.ecview.core.common.editpart.validation.IBeanValidationValidatorEditpart;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YBeanValidationValidator;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.validation.IValidationConfig;
import org.lunifera.ecview.core.common.validation.IValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanValidationValidatorEditpart extends
		ValidatorEditpart<YBeanValidationValidator> implements
		IBeanValidationValidatorEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BeanValidationValidatorEditpart.class);

	private ValidationConfigToValidatorBridge bridgeObserver;

	public BeanValidationValidatorEditpart() {
		super(
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS,
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS_FULLY_QUALIFIED_NAME,
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_PROPERTY);
	}

	@Override
	protected YBeanValidationValidator createModel() {
		return ValidationFactory.eINSTANCE.createYBeanValidationValidator();
	}

	@Override
	protected IValidator createValidator() {
		YBeanValidationValidator yModel = getModel();

		ValidatorFactory jsr303ValidatorFactory = (ValidatorFactory) getViewContext(
				yModel).getService(ValidatorFactory.class.getName());
		if (jsr303ValidatorFactory == null) {
			LOGGER.error("JSR303ValidatorFactory not available.");
			return null;
		}

		BeanValidationValidator validator = new BeanValidationValidator(
				yModel.getBvalClass(), yModel.getBvalProperty(),
				jsr303ValidatorFactory);
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
		Map<EStructuralFeature, EStructuralFeature> mapping = new HashMap<EStructuralFeature, EStructuralFeature>();
		mapping.put(
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS,
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS);
		mapping.put(
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS_FULLY_QUALIFIED_NAME,
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_CLASS_FULLY_QUALIFIED_NAME);
		mapping.put(
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_PROPERTY,
				ValidationPackage.Literals.YBEAN_VALIDATION_VALIDATOR_CONFIG__BVAL_PROPERTY);

		bridgeObserver = new ValidationConfigToValidatorBridge(
				validatable, getModel(), mapping);
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
