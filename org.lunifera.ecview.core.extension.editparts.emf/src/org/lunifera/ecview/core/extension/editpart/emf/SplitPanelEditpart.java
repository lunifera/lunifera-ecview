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

import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YSplitPanel;
import org.lunifera.ecview.core.ui.core.editparts.extension.ISplitPanelEditpart;

@SuppressWarnings("restriction")
public class SplitPanelEditpart extends LayoutEditpart<YSplitPanel> implements
		ISplitPanelEditpart {

	@Override
	protected YSplitPanel createModel() {
		return (YSplitPanel) ExtensionModelFactory.eINSTANCE
				.createYSplitPanel();
	}

}
