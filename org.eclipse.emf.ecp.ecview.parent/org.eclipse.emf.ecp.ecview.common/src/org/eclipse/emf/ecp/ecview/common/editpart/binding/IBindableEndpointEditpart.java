/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.editpart.binding;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;

/**
 * An editpart resonsible to provide observable values.
 */
public interface IBindableEndpointEditpart extends IElementEditpart {

	/**
	 * Returns the target observable that can be used in databinding.
	 * 
	 * @return
	 */
	<A extends IObservableValue> A getObservable();

}