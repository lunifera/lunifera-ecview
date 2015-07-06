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
package org.lunifera.ecview.core.common.notification;

import org.lunifera.ecview.core.common.editpart.IElementEditpart;

public class LifecycleEvent implements ILifecycleEvent {

	private final IElementEditpart editpart;
	private final String type;

	public LifecycleEvent(IElementEditpart editpart, String type) {
		super();
		this.editpart = editpart;
		this.type = type;
	}

	@Override
	public IElementEditpart getEditpart() {
		return editpart;
	}

	@Override
	public String getType() {
		return type;
	}

}
