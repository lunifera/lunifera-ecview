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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IValidatorEditpart;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.validation.YValidator;
import org.lunifera.ecview.core.common.validation.IValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IValidatorEditpart}.
 * 
 * @param <M>
 */
public abstract class ValidatorEditpart<M extends YValidator> extends
		ElementEditpart<M> implements IValidatorEditpart {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ValidatorEditpart.class);

	private IValidator validator;
	private Set<EStructuralFeature> changeFeatures;

	/**
	 * A default constructor.
	 */
	public ValidatorEditpart(EStructuralFeature... changeFeatures) {
		if (changeFeatures != null) {
			this.changeFeatures = new HashSet<>();
			this.changeFeatures.addAll(Arrays.asList(changeFeatures));
		}
	}
	
	@Override
	protected void internalDispose() {
		try {
			if (validator != null) {
				validator.dispose();
			}
			validator = null;
			changeFeatures = null;
		} finally {
			super.internalDispose();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IValidator> A getValidator() {
		checkDisposed();

		if (this.validator == null) {
			this.validator = createValidator();
		}
		return (A) this.validator;
	}

	/**
	 * Returns a new instance of the validator to use.
	 * 
	 * @return
	 */
	protected abstract IValidator createValidator();

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		// if the notification is for a registered feature, then update the
		// validator
		if (changeFeatures != null
				&& changeFeatures.contains(notification.getFeature())) {
			if (validator != null) {
				validator.updateParameter(notification.getNotifier());
			}
		}
		super.handleModelSet(featureId, notification);
	}

}
