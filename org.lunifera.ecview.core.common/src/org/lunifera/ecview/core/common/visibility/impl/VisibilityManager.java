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
import org.lunifera.ecview.core.common.services.IWidgetAssocationsService;
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler;
import org.lunifera.ecview.core.common.visibility.IVisibilityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VisibilityManager implements IVisibilityManager {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(VisibilityManager.class);

	private IWidgetAssocationsService<?, ?> associations;
	private IViewContext context;

	public VisibilityManager(IViewContext context) {
		this.context = context;
		this.associations = context.getService(IWidgetAssocationsService.ID);
	}

	@Override
	public IViewContext getViewContext() {
		return context;
	}

	@Override
	public IVisibilityHandler getById(String id) {
		try {
			return new VisibilityHandler(associations, id);
		} catch (Exception e) {
			LOGGER.error("{}", e);
		}

		return null;
	}
}
