/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator for the bundle.
 */
public class Activator implements BundleActivator {

	private static BundleContext context;

	/**
	 * Returns the context.
	 * 
	 * @return context
	 */
	public static BundleContext getContext() {
		return context;
	}

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public void start(BundleContext bundleContext) throws Exception {
		// END SUPRESS CATCH EXCEPTION
		Activator.context = bundleContext;
	}

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public void stop(BundleContext bundleContext) throws Exception {
		// END SUPRESS CATCH EXCEPTION
		Activator.context = null;
	}

}
