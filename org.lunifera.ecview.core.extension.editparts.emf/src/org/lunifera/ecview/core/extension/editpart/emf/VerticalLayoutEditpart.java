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

import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayout;
import org.lunifera.ecview.core.ui.core.editparts.extension.IVerticalLayoutEditpart;

/**
 * The implementation of the IUigridLayoutEditpart.
 */
@SuppressWarnings("restriction")
public class VerticalLayoutEditpart extends LayoutEditpart<YVerticalLayout> implements IVerticalLayoutEditpart {

	@Override
	protected YVerticalLayout createModel() {
		return (YVerticalLayout) ExtensionModelFactory.eINSTANCE.createYVerticalLayout();
	}

}
