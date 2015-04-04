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
import org.lunifera.ecview.core.common.filter.IFilterProvidingPresentation;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YSearchPanel;
import org.lunifera.ecview.core.ui.core.editparts.extension.ISearchPanelEditpart;

/**
 * The implementation of the ISearchPanelEditpart.
 */
@SuppressWarnings("restriction")
public class SearchPanelEditpart extends LayoutEditpart<YSearchPanel> implements
		ISearchPanelEditpart {

	@Override
	protected YSearchPanel createModel() {
		return (YSearchPanel) ExtensionModelFactory.eINSTANCE
				.createYSearchPanel();
	}

	@Override
	public void initialize(YSearchPanel model) {
		super.initialize(model);
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		switch (featureId) {
		case ExtensionModelPackage.YSEARCH_PANEL__APPLY_FILTER:
			applyFilter();
			break;
		default:
			super.handleModelSet(featureId, notification);
		}
	}

	/**
	 * Accesses the presentation to return the filter and puts the new filter in
	 * the model. So other parties can react for the changed filter.
	 */
	private void applyFilter() {
		IFilterProvidingPresentation presentation = (IFilterProvidingPresentation) getPresentation();
		Object filter = presentation.getFilter();
		getModel().setFilter(filter);
	}

}
