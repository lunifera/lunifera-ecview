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
package org.lunifera.ecview.core.ui.core.editparts.extension;

import org.lunifera.ecview.core.common.editpart.IEmbeddableEditpart;

/**
 * An edit part for master details.
 */
public interface IMasterDetailEditpart extends IEmbeddableEditpart {

	/**
	 * Returns the master editpart.
	 * 
	 * @return master The editpart that controls the master presentation.
	 */
	IEmbeddableEditpart getMaster();

	/**
	 * Returns the detail editpart.
	 * 
	 * @return detail The editpart that controls the detail presentation.
	 */
	IEmbeddableEditpart getDetail();

	/**
	 * Sets the editpart that controls the master presentation.
	 * 
	 * @param master
	 */
	void setMaster(IEmbeddableEditpart master);

	/**
	 * Sets the editpart that controls the detail presentation.
	 * 
	 * @param detail
	 */
	void setDetail(IEmbeddableEditpart detail);

}
