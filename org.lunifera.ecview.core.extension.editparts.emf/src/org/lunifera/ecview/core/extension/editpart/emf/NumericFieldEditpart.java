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
package org.lunifera.ecview.core.extension.editpart.emf;

import org.lunifera.ecview.core.common.editpart.emf.FieldEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YNumericField;
import org.lunifera.ecview.core.ui.core.editparts.extension.INumericFieldEditpart;

/**
 * The implementation of the IUiNumericFieldEditpart.
 */
@SuppressWarnings("restriction")
public class NumericFieldEditpart extends FieldEditpart<YNumericField>
		implements INumericFieldEditpart {

	public NumericFieldEditpart() {
		super(ExtensionModelPackage.Literals.YNUMERIC_FIELD__DATATYPE);
	}

	@Override
	protected YNumericField createModel() {
		return (YNumericField) ExtensionModelFactory.eINSTANCE
				.createYNumericField();
	}

}
