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
package org.lunifera.ecview.core.common.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface IExecutorService {

	/**
	 * Executes the given callable in a different thread.
	 * 
	 * @return future
	 */
	<V> Future<V> execute(Callable<V> callable);

	/**
	 * Executes the given runnable in a different thread.
	 * 
	 * @return future
	 */
	<V> Future<V> execute(Runnable runnable);

}
