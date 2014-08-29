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
package org.lunifera.ecview.core.common.editpart.emf.binding;

import org.lunifera.ecview.core.common.editpart.binding.IBindableListEndpointEditpart;
import org.lunifera.ecview.core.common.editpart.binding.IBindingSetEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.model.binding.YBindingEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IBindingSetEditpart}.
 * 
 * @param <M>
 */
public abstract class BindableListEndpointEditpart<M extends YBindingEndpoint>
		extends ElementEditpart<M> implements IBindableListEndpointEditpart {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(BindableListEndpointEditpart.class);

	/**
	 * A default constructor.
	 */
	public BindableListEndpointEditpart() {
	}

	@Override
	protected void internalDispose() {
		try {
		} finally {
			super.internalDispose();
		}
	}
}
