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
package org.lunifera.ecview.core.extension.editpart.emf;

import org.lunifera.ecview.core.common.editpart.emf.FieldEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YProgressBar;
import org.lunifera.ecview.core.ui.core.editparts.extension.IProgressBarEditpart;

/**
 * The implementation of the YProgressBar.
 */
public class ProgressBarEditpart extends FieldEditpart<YProgressBar> implements
		IProgressBarEditpart {

	public ProgressBarEditpart() {
		super(ExtensionModelPackage.Literals.YPROGRESS_BAR__DATATYPE);
	}

	@Override
	protected YProgressBar createModel() {
		return (YProgressBar) ExtensionModelFactory.eINSTANCE
				.createYProgressBar();
	}

}
