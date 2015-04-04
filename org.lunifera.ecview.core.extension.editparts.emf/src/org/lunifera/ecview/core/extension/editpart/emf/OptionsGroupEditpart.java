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
import org.lunifera.ecview.core.extension.model.extension.YOptionsGroup;
import org.lunifera.ecview.core.ui.core.editparts.extension.IOptionsGroupEditpart;

@SuppressWarnings("restriction")
public class OptionsGroupEditpart extends FieldEditpart<YOptionsGroup>
		implements IOptionsGroupEditpart {

	public OptionsGroupEditpart() {
		super(ExtensionModelPackage.Literals.YOPTIONS_GROUP__DATATYPE);
	}

	@Override
	protected YOptionsGroup createModel() {
		return (YOptionsGroup) ExtensionModelFactory.eINSTANCE
				.createYOptionsGroup();
	}

}
