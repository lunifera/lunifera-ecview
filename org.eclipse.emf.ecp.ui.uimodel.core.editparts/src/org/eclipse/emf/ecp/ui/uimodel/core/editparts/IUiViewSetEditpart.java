/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.core.editparts;

import java.util.List;

/**
 * An IUiRootEditpart is a container for views. They can be put there and also be accessed again, but the root does not
 * control the lifecycle of the views. Removing / deleting the root will never delete the referenced views.
 */
public interface IUiViewSetEditpart extends IUiElementEditpart {

	/**
	 * Returns an unmodifiable list with all views referenced by the root. The root does not control the lifecycle of
	 * the views.
	 * 
	 * @return
	 */
	List<IUiViewEditpart> getViews();

	/**
	 * Adds a view to the root. Adding the same view twice has no effect.
	 * 
	 * @param view
	 */
	void addView(IUiViewEditpart view);

	/**
	 * Removes a view from the root.
	 * 
	 * @param view
	 */
	void removeView(IUiViewEditpart view);

}