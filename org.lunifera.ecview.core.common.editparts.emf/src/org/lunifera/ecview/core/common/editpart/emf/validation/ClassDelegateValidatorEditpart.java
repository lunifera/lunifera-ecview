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

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.emf.validation.validator.ClassDelegateValidator;
import org.lunifera.ecview.core.common.editpart.validation.IClassDelegateValidatorEditpart;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.validation.IValidationConfig;
import org.lunifera.ecview.core.common.validation.IValidator;

public class ClassDelegateValidatorEditpart extends
		ValidatorEditpart<YClassDelegateValidator> implements
		IClassDelegateValidatorEditpart {

	private ValidationConfigToValidatorBridge bridgeObserver;

	public ClassDelegateValidatorEditpart() {
		super(
				ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME);
	}

	@Override
	protected YClassDelegateValidator createModel() {
		return ValidationFactory.eINSTANCE.createYClassDelegateValidator();
	}

	@Override
	protected IValidator createValidator() {
		IViewContext context = getViewContext(getModel());
		return new ClassDelegateValidator(getModel(), context);
	}

	@Override
	public void setConfig(IValidationConfig config) {
		YClassDelegateValidator validatable = (YClassDelegateValidator) config
				.getValidationSettings();
		// create an observer that transfers the changes at the validatable to
		// the validator
		bridgeObserver = ValidationConfigToValidatorBridge
				.createObserver(
						validatable,
						ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME,
						getModel(),
						ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME);
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
