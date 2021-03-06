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

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.emf.LayoutEditpart;
import org.lunifera.ecview.core.common.presentation.ILayoutPresentation;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.ui.core.editparts.extension.IGridLayoutEditpart;

/**
 * The implementation of the IUigridLayoutEditpart.
 */
@SuppressWarnings("restriction")
public class GridLayoutEditpart extends LayoutEditpart<YGridLayout> implements
		IGridLayoutEditpart {

	@Override
	protected YGridLayout createModel() {
		return (YGridLayout) ExtensionModelFactory.eINSTANCE
				.createYGridLayout();
	}

	@Override
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YGRID_LAYOUT__COLUMNS:
		case ExtensionModelPackage.YGRID_LAYOUT__MARGIN:
		case ExtensionModelPackage.YGRID_LAYOUT__SPACING:
			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				presenter.unrender();
			}
			break;
		default:
			break;
		}
	}

}
