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
import org.lunifera.ecview.core.common.context.IViewSetContext;
import org.lunifera.ecview.core.common.context.ViewContext;

public class ViewsetScope extends AccessibleScope {

	public static final String SCHEMA = "viewset";
	private static final String URI_SEGMENT = SCHEMA + "://";

	public ViewsetScope() {
		super(URI_SEGMENT);
	}

	/**
	 * Accesses the object in the given context that is described by the uri of
	 * this scope.
	 * 
	 * @param context
	 * @return
	 */
	public Object access(IAccessible accessible) {
		IViewSetContext context = null;
		if (accessible instanceof IViewContext) {
			context = ((ViewContext) accessible).getParentContext();
		} else if (accessible instanceof IViewSetContext) {
			context = (IViewSetContext) accessible;
		} else {
			throw new IllegalStateException(String.format(
					"%s is not a legal accessible!", accessible.getClass()
							.getName()));
		}
		return access(context);
	}

	/**
	 * Accesses the object in the given context that is described by the uri of
	 * this scope.
	 * 
	 * @param context
	 * @return
	 */
	public Object access(IViewContext context) {
		return access(context.getParentContext());
	}

	/**
	 * Accesses the object in the given context that is described by the uri of
	 * this scope.
	 * 
	 * @param context
	 * @return
	 */
	public Object access(IViewSetContext context) {
		if (beanScope != null) {
			return beanScope.access(context);
		} else if (serviceScope != null) {
			return serviceScope.access(context);
		}

		return null;
	}
}
