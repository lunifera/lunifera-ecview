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
package org.lunifera.ecview.core.common.beans;

import org.lunifera.ecview.core.common.IAccessible;

/**
 * Implementations are responsible to initialize the bean slots. This is
 * necessary since databinding needs the type of the value that will be stored
 * in the slot. Otherwise no context binding is possible.
 */
public interface IBeanSlotInitializer {

	/**
	 * Initializes the bean slots.
	 * 
	 * @param registry
	 */
	void intialize(IBeanRegistry registry);

}
