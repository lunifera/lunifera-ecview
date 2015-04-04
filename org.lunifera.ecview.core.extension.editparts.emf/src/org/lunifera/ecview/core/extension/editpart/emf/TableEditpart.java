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
import org.lunifera.ecview.core.common.editpart.emf.FieldEditpart;
import org.lunifera.ecview.core.common.filter.IFilterablePresentation;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITableEditpart;

/**
 * The implementation of the IUiTableEditpart.
 */
@SuppressWarnings("restriction")
public class TableEditpart extends FieldEditpart<YTable> implements
		ITableEditpart {

	public TableEditpart() {
		super(ExtensionModelPackage.Literals.YTABLE__DATATYPE);
	}

	@Override
	protected YTable createModel() {
		return (YTable) ExtensionModelFactory.eINSTANCE.createYTable();
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YTABLE__FILTER:
			IFilterablePresentation presentation = getPresentation();
			presentation.applyFilter(notification.getNewValue());
			break;
		default:
			super.handleModelSet(featureId, notification);
		}

	}

}
