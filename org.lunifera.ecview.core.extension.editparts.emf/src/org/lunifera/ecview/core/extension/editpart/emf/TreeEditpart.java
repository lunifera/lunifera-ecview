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
import org.lunifera.ecview.core.extension.model.extension.YTree;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITreeEditpart;

/**
 * The implementation of the IUiTableEditpart.
 */
@SuppressWarnings("restriction")
public class TreeEditpart extends FieldEditpart<YTree> implements ITreeEditpart {

	public TreeEditpart() {
		super(ExtensionModelPackage.Literals.YTREE__DATATYPE);
	}

	@Override
	protected YTree createModel() {
		return (YTree) ExtensionModelFactory.eINSTANCE.createYTree();
	}

}
