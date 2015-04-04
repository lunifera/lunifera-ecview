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
package org.lunifera.ecview.core.common.editpart.emf;

import org.lunifera.ecview.core.common.editpart.ICommandEditpart;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.model.core.YCommand;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * See {@link ElementEditpart}.
 * 
 * @param <M>
 */
public abstract class CommandEditpart<M extends YCommand> extends
		ElementEditpart<M> implements ICommandEditpart {

//	private static final Logger LOGGER = LoggerFactory
//			.getLogger(CommandEditpart.class);

	/**
	 * The default constructor.
	 */
	protected CommandEditpart() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IElementEditpart getParent() {
		YElement yParent = (YElement) getModel().eContainer();
		if (yParent != null) {
			return yParent != null ? (IElementEditpart) getEditpart(yParent)
					: null;
		}
		return null;
	}

	@Override
	public IViewEditpart getView() {
		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) getEditpart(yView) : null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {

		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void requestDispose() {
		// if (getParent() != null) {
		// getParent().disposeChild(this);
		// } else {
		// dispose();
		// }
	}
}
