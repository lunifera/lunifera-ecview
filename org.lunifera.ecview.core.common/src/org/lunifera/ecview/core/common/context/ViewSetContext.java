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
package org.lunifera.ecview.core.common.context;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.editpart.IViewSetEditpart;

/**
 * Implementation of {@link IViewSetContext}.
 */
public class ViewSetContext extends DisposableContext implements
		IViewSetContext {

	private final IViewSetEditpart editPart;

	/**
	 * Constructor.
	 * 
	 * @param editPart
	 *            The viewSetEditpart
	 */
	public ViewSetContext(IViewSetEditpart editPart) {
		this.editPart = editPart;
		this.editPart.setContext(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IViewSetEditpart getViewSetEditpart() {
		checkDisposed();

		return editPart;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<IViewContext> getViewContexts() {
		checkDisposed();

		List<IViewContext> childContexts = new ArrayList<IViewContext>();
		for (IViewEditpart child : editPart.getViews()) {
			IViewContext childContext = child.getContext();
			if (childContext != null) {
				childContexts.add(childContext);
			}
		}
		return childContexts;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void internalDispose() {
		try {
			List<IViewContext> temp = getViewContexts();
			for (IViewContext childContext : temp.toArray(new IViewContext[temp
					.size()])) {
				childContext.dispose();
			}

		} finally {
		}
	}

	@Override
	protected void updateLocale(Locale locale) {
		List<IViewContext> temp = getViewContexts();
		for (IViewContext childContext : temp.toArray(new IViewContext[temp
				.size()])) {
			childContext.setLocale(locale);
		}
	}

}
