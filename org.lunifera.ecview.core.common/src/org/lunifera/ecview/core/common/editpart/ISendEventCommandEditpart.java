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
package org.lunifera.ecview.core.common.editpart;

/**
 * Sends events by event admin.
 */
public interface ISendEventCommandEditpart extends ICommandEditpart {
	/**
	 * This value is used as key to put the message into the map.
	 */
	public static final String PROP__MESSAGE_KEY = "data";
}
