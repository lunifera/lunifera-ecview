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
package org.lunifera.ecview.core.common.editpart;

public interface IEmbeddableParent {

	/**
	 * Calling this method will render the child editpart without adding it to
	 * the model.
	 * 
	 * @param child
	 */
	void renderChild(IEmbeddableEditpart child);

	/**
	 * Calling this method will unrender the child editpart without removing it
	 * from the model.
	 * 
	 * @param child
	 */
	void unrenderChild(IEmbeddableEditpart child);

	/**
	 * Calling this method will dispose the child editpart without removing it
	 * from the model.
	 * 
	 * @param child
	 */
	void disposeChild(IEmbeddableEditpart child);

}
