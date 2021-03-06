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
package org.lunifera.ecview.core.ui.common.tests.editparts.emf.binding;

import org.eclipse.core.databinding.observable.Realm;
import org.lunifera.ecview.core.common.binding.AbstractBindingManager;

public class DefaultBindingManager extends AbstractBindingManager {

	public DefaultBindingManager() {
		super(new DefaultRealm());
	}

	public static class DefaultRealm extends Realm {

		public DefaultRealm() {
			setDefault(this);
		}

		@Override
		public boolean isCurrent() {
			return true;
		}
	}
}
