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

import java.util.List;

/**
 * An IUiLayoutEditpart is an abstraction of a uiElementContainer. Itself can
 * contain {@link IEmbeddableEditpart} and so layouts can also contain other
 * layouts.
 */
public interface ILayoutEditpart extends IEmbeddableEditpart, IEmbeddableParent {

	/**
	 * Returns an unmodifiable list with all children contained in the layout.
	 * 
	 * @return elements The children editparts contained in this layoutEditpart
	 */
	List<IEmbeddableEditpart> getElements();

	/**
	 * Adds an element to the layout. Adding the same element twice has no
	 * effect.
	 * 
	 * @param element
	 *            The editpart to be added.
	 */
	void addElement(IEmbeddableEditpart element);

	/**
	 * Removes an element from the layout.
	 * 
	 * @param element
	 *            The editpart to be removed.
	 */
	void removeElement(IEmbeddableEditpart element);

}
