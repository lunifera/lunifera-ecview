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

/**
 * A lifecycle handler becomes notified about the lifecycle events of elements.
 */
public interface ILifecycleHandler {

	/**
	 * Passes the event about the current lifecycle of an element.
	 * 
	 * @param event
	 */
	void notifyLifecycle(ILifecycleEvent event);

}
