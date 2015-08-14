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
package org.lunifera.ecview.core.common.editpart;

import java.util.List;

import org.lunifera.ecview.core.common.editpart.validation.IValidatorEditpart;

/**
 * An IUiFieldEditpart is an abstraction of an input field. For normal it does
 * not contain any children, but is contained by {@link ILayoutEditpart}.<br>
 * See also {@link IEmbeddableEditpart}
 */
public interface IFieldEditpart extends IEmbeddableEditpart {

	/**
	 * Adds a validator to the field. Adding a validator twice has no effect.
	 * 
	 * @param validator
	 */
	void addValidator(IValidatorEditpart validator);

	/**
	 * Removes the validator from the field.
	 * 
	 * @param validator
	 */
	void removeValidator(IValidatorEditpart validator);

	/**
	 * Returns an unmodifiable list of validators.
	 * 
	 * @return
	 */
	List<IValidatorEditpart> getValidators();

	/**
	 * Returns the converter editpart or <code>null</code> if no converter is
	 * available.
	 * 
	 * @return
	 */
	IConverterEditpart getConverter();

}