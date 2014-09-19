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
package org.lunifera.ecview.core.common.presentation;

/**
 * Is used to initialize widgets after their creation.
 */
public interface IInitializerService {

	/**
	 * Will initialize the widget with predefined settings like minium size,...
	 * 
	 * @param widget
	 * @param model
	 */
	void initialize(Object widget, Object model);

}
