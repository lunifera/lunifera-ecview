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
package org.lunifera.ecview.core.common.editpart.binding;

import org.lunifera.ecview.core.common.visibility.IVisibilityProcessor;

/**
 * An editpart resonsible to provide observable values to bind the visibility
 * processor instance. Note, that an instance about the processor needs to be
 * past to this instance before accessing the observable value.
 */
public interface IVisibilityProcessorValueBindingEndpointEditpart extends
		IBindableValueEndpointEditpart {

	/**
	 * Sets the visibility processor which should be bound.
	 * 
	 * @param processor
	 */
	void setVisibilityProcessor(IVisibilityProcessor processor);

}
