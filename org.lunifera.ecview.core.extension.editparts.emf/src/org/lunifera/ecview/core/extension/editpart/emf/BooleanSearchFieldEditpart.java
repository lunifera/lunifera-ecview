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
import org.lunifera.ecview.core.common.filter.IFilterProvidingPresentation;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField;
import org.lunifera.ecview.core.ui.core.editparts.extension.IBooleanSearchFieldEditpart;

/**
 * The implementation of the IBooleanSearchFieldEditpart.
 */
@SuppressWarnings("restriction")
public class BooleanSearchFieldEditpart extends
		FieldEditpart<YBooleanSearchField> implements
		IBooleanSearchFieldEditpart {

	public BooleanSearchFieldEditpart() {
		super();
	}

	@Override
	protected YBooleanSearchField createModel() {
		return (YBooleanSearchField) ExtensionModelFactory.eINSTANCE
				.createYBooleanSearchField();
	}

	@Override
	public Object getFilter() {
		IFilterProvidingPresentation presentation = (IFilterProvidingPresentation) getPresentation();
		return presentation.getFilter();
	}
}
