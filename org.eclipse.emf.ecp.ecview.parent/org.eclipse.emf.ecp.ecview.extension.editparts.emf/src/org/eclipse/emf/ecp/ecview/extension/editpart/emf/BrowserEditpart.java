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
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.EmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IBrowserEditpart;

/**
 * The implementation of the IUiCheckBoxEditpart.
 */
@SuppressWarnings("restriction")
public class BrowserEditpart extends EmbeddableEditpart<YBrowser> implements
		IBrowserEditpart {

	public BrowserEditpart() {
		super(ExtensionModelPackage.Literals.YBROWSER__DATATYPE);
	}

	@Override
	protected YBrowser createModel() {
		return (YBrowser) ExtensionModelFactory.eINSTANCE.createYBrowser();
	}

	@Override
	public List<IValidatorEditpart> getDatatypeValidators() {
		return Collections.emptyList();
	}

}