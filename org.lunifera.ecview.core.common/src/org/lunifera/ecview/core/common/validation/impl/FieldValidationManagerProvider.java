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
package org.lunifera.ecview.core.common.validation.impl;

import org.lunifera.ecview.core.common.context.IContext;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.services.IServiceProvider;
import org.lunifera.ecview.core.common.validation.IFieldValidationManager;
import org.osgi.service.component.annotations.Component;

/**
 * Provides the {@link IFieldValidationManager} implementation to the services of
 * {@link IViewContext}.
 */
@Component
public class FieldValidationManagerProvider implements IServiceProvider {

	@Override
	public boolean isFor(String selector, IContext context) {
		return selector.equals(IFieldValidationManager.class.getName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A> A createService(String selector, IContext context) {
		return (A) new FieldValidationManager();
	}
}