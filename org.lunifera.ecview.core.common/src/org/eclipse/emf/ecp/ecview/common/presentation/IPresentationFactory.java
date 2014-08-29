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

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;

/**
 * Is responsible to return presenter based on the given element.
 */
public interface IPresentationFactory {

	/**
	 * Returns true, if the factory can be used for the given element.
	 * 
	 * @param uiContext
	 *            contains information about the current ui instance
	 * @param editpart
	 *            the editpart for which a presenter should be created.
	 * @return result
	 */
	boolean isFor(IViewContext uiContext, IElementEditpart editpart);

	/**
	 * Is used to create a new instance of a presenter.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @param uiContext
	 *            contains information about the current ui instance
	 * @param editpart
	 *            the editpart for which a presenter should be created.
	 * @return presentation
	 * 
	 * @throws IllegalArgumentException
	 *             if no presentation could be created.
	 */
	<A extends IWidgetPresentation<?>> A createPresentation(
			IViewContext uiContext, IElementEditpart editpart)
			throws IllegalArgumentException;

}