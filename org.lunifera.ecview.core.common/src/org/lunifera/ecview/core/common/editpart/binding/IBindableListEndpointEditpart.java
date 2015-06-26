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
package org.lunifera.ecview.core.common.editpart.binding;

import org.eclipse.core.databinding.observable.list.IObservableList;

/**
 * An editpart resonsible to provide observable values.
 */
public interface IBindableListEndpointEditpart extends IBindableEndpointEditpart {

	/**
	 * Returns the target observable that can be used in databinding.
	 * 
	 * @return
	 */
	<A extends IObservableList> A getObservable();

	/**
	 * Register a refresh provider.
	 * 
	 * @param refresh
	 */
	void setRefreshProvider(RefreshProvider refresh);

	interface RefreshProvider {

		/**
		 * Is called to refresh the given binding.
		 */
		void refresh();

	}

}
