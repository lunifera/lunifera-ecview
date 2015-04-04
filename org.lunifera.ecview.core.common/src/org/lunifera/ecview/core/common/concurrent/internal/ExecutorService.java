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
package org.lunifera.ecview.core.common.concurrent.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.lunifera.ecview.core.common.concurrent.IExecutorService;
import org.osgi.service.component.ComponentContext;

public class ExecutorService implements IExecutorService {

	private java.util.concurrent.ExecutorService executor;

	protected void activate(ComponentContext context) {
		executor = Executors.newFixedThreadPool(10);
	}

	protected void deactivate(ComponentContext context) {
		executor.shutdown();
		executor = null;
	}

	@Override
	public <V> Future<V> execute(Callable<V> callable) {
		return executor.submit(callable);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Future<?> execute(Runnable runnable) {
		return executor.submit(runnable);
	}

}
