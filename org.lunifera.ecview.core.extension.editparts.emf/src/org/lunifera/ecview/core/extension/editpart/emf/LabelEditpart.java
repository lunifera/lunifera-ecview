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

import java.util.Collections;
import java.util.List;

import org.lunifera.ecview.core.common.editpart.emf.EmbeddableEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IValidatorEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
import org.lunifera.ecview.core.ui.core.editparts.extension.ILabelEditpart;

/**
 * The implementation of the IUiLabelEditpart.
 */
@SuppressWarnings("restriction")
public class LabelEditpart extends EmbeddableEditpart<YLabel> implements
		ILabelEditpart {

	@Override
	protected YLabel createModel() {
		return (YLabel) ExtensionModelFactory.eINSTANCE.createYLabel();
	}

	@Override
	public List<IValidatorEditpart> getDatatypeValidators() {
		return Collections.emptyList();
	}
}
