/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.lunifera.ecview.core.extension.editpart.emf;

import org.lunifera.ecview.core.common.editpart.emf.ActionEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.ui.core.editparts.extension.IButtonEditpart;

/**
 * The implementation of the IButtonEditpart.
 */
public class ButtonEditpart extends ActionEditpart<YButton> implements
		IButtonEditpart {

	protected YButton createModel() {
		return (YButton) ExtensionModelFactory.eINSTANCE
				.createYButton();
	}

}
