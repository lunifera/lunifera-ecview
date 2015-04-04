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

import org.lunifera.ecview.core.common.context.IViewContext;

public abstract class ECViewRunable implements Runnable {

	private final IViewContext context;

	public ECViewRunable(IViewContext context) {
		super();
		this.context = context;
	}

	/**
	 * The view context, this runnable is assigned to. May be <code>null</code>.
	 * 
	 * @return
	 */
	public IViewContext getContext() {
		return context;
	}

}
