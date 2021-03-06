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

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class is responsible to observe changes at a validatable and to forward
 * the changes to the validator.
 */
public class ValidationConfigToValidatorBridge extends AdapterImpl {

	private final EObject sourceValidatable;
	private final EObject targetValidator;

	private final Map<EStructuralFeature, EStructuralFeature> mapping;
	private boolean disposed;
	private boolean calledAfterDispose;

	/**
	 * Creates an instance for the given values.
	 * 
	 * @param sourceValidatable
	 * @param sourceFeature
	 * @param targetValidator
	 * @param targetFeature
	 * @return
	 */
	public static ValidationConfigToValidatorBridge createObserver(
			EObject sourceValidatable, EStructuralFeature sourceFeature,
			EObject targetValidator, EStructuralFeature targetFeature) {

		return new ValidationConfigToValidatorBridge(sourceValidatable,
				targetValidator, Collections.singletonMap(sourceFeature,
						targetFeature));
	}

	public ValidationConfigToValidatorBridge(EObject sourceValidatable,
			EObject targetValidator,
			Map<EStructuralFeature, EStructuralFeature> mapping) {
		super();
		this.sourceValidatable = sourceValidatable;
		this.targetValidator = targetValidator;
		this.mapping = mapping;

		sourceValidatable.eAdapters().add(this);
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (calledAfterDispose) {
			throw new IllegalStateException("Observer is disposed!");
		}

		// this method is called after disposal once, since the eObjects are
		// nested. So one call after dispose is fine.
		if (disposed) {
			calledAfterDispose = true;
		}

		EStructuralFeature sourceFeature = (EStructuralFeature) notification
				.getFeature();

		// if there is a mapping available, then set the value from
		// source#sourceFeature to target#targetFeature
		if (mapping.containsKey(sourceFeature)) {
			EStructuralFeature targetFeature = mapping.get(sourceFeature);
			targetValidator.eSet(targetFeature, notification.getNewValue());
		}
	}

	public void dispose() {
		try {
			sourceValidatable.eAdapters().remove(this);
		} finally {
			disposed = true;
		}
	}

}
