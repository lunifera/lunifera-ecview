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
package org.lunifera.ecview.core.common.uri;

import org.lunifera.ecview.core.common.IAccessible;
import org.lunifera.ecview.core.common.context.IViewContext;

public class ViewScope extends AccessibleScope {

	public static final String SCHEMA = "view";
	private static final String URI_SEGMENT = SCHEMA + "://";

	public ViewScope() {
		super(URI_SEGMENT);
	}

	/**
	 * Accesses the object in the given context that is described by the uri of
	 * this scope.
	 * 
	 * @param context
	 * @return
	 */
	public Object access(IViewContext context) {
		if (beanScope != null) {
			return beanScope.access(context);
		} else if (serviceScope != null) {
			return serviceScope.access(context);
		}

		return null;
	}

	/**
	 * Accesses the object in the given context that is described by the uri of
	 * this scope.
	 * 
	 * @param context
	 * @return
	 */
	public Object access(IAccessible accessible) {

		if (!(accessible instanceof IViewContext)) {
			throw new IllegalStateException(String.format(
					"%s is not a legal accessible!", accessible.getClass()
							.getName()));
		}

		return access((IViewContext) accessible);
	}
}
