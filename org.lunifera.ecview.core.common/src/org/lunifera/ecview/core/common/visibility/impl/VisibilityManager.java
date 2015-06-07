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
package org.lunifera.ecview.core.common.visibility.impl;

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityProcessable;
import org.lunifera.ecview.core.common.services.IWidgetAssocationsService;
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler;
import org.lunifera.ecview.core.common.visibility.IVisibilityManager;

public class VisibilityManager implements IVisibilityManager {

	private IWidgetAssocationsService<?, ?> associations;

	public VisibilityManager(IViewContext context) {
		associations = context.getService(IWidgetAssocationsService.ID);
	}

	@Override
	public IVisibilityHandler getById(String id) {
		IElementEditpart editpart = associations.getEditpart(id);
		if (editpart == null || !(editpart instanceof IVisibilityProcessable)) {
			return null;
		}
		return new VisibilityHandler((IVisibilityProcessable) editpart);
	}
}
