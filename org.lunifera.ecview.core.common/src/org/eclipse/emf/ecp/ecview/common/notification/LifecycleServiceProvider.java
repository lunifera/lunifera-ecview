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
package org.lunifera.ecview.core.common.notification;

import org.lunifera.ecview.core.common.context.IContext;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.services.IServiceProvider;

/**
 * Provides the {@link ILifecycleService} implementation to the services of
 * {@link IViewContext}.
 */
public class LifecycleServiceProvider implements IServiceProvider {

	@Override
	public boolean isFor(String selector, IContext context) {
		return selector.equals(ILifecycleService.class.getName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A> A createService(String selector, IContext context) {
		return (A) new LifecycleService();
	}
}