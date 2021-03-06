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
package org.lunifera.ecview.core.common.binding.observables;

import java.net.URI;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.beans.IBeanRegistry;

/**
 * The base class of {@link IContextBindingDelegate} that should be overridden by
 * subclasses.
 */
public class ContextBindingDelegate implements IContextBindingDelegate {

	@Override
	public boolean isFor(IBeanRegistry registry, URI bindingURI) {
		return false;
	}

	@Override
	public IObservableValue observeValue(IBeanRegistry registry, URI bindingURI) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IObservableValue observeValue(Realm realm, IBeanRegistry registry,
			URI bindingURI) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IObservableList observeList(IBeanRegistry registry, URI bindingURI, Class<?> elementType) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IObservableList observeList(Realm realm, IBeanRegistry registry,
			URI bindingURI, Class<?> elementType) {
		throw new UnsupportedOperationException();
	}

}
