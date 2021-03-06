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
package org.lunifera.ecview.core.common.editpart;

import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityProcessable;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityProcessorEditpart;
import org.lunifera.ecview.core.common.presentation.IWidgetPresentation;

/**
 * An IUiEmbeddableEditpart is an abstraction of editparts that can be added to
 * a {@link ILayoutEditpart}.</br> They have an assigned parent, that must never
 * be <code>null</code> if the IUiEmbeddableEditpart is attached to its parent.
 */
public interface IEmbeddableEditpart extends IElementEditpart,
		IVisibilityProcessable {

	/**
	 * Name for "parent" property.
	 */
	String PROP_PARENT = "parent";
	/**
	 * Name for "cssClass" property.
	 */
	String PROP_CSSCLASS = "cssClass";
	/**
	 * Name for "cssID" property.
	 */
	String PROP_CSSID = "cssID";

	/**
	 * Returns the parent of this embeddable edit part.<br>
	 * Will be <code>null</code> for the layout that is attached to the view as
	 * content.
	 * 
	 * @return editpart The parent editpart
	 */
	IEmbeddableParent getParent();

	/**
	 * Returns the view edit part of this embeddable edit part.<br>
	 * May be <code>null</code> as far as this element and no of its parents are
	 * attached to a view.
	 * 
	 * @return editpart The view editpart
	 */
	IViewEditpart getView();

	/**
	 * Returns the widget presentation for the edit part.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @return presentation The presentation of that editpart used to render the
	 *         UI.
	 */
	<A extends IWidgetPresentation<?>> A getPresentation();

	/**
	 * Requests rendering of the current editpart. This method will forward the
	 * request to the parent if available and the parent will handle the steps
	 * required to render the editpart properly.
	 */
	void requestRender();

	/**
	 * This method is called by the parent presentation to render the contents
	 * of the editpart.
	 * 
	 * @param parentWidget
	 *            - The parent widget the new widget will be placed on.
	 * @return newWidget - without adding it to the parentWidget.
	 */
	Object render(Object parentWidget);

	/**
	 * Requests unrendering of the current editpart. This method will forward
	 * the request to the parent if available and the parent will handle the
	 * steps required to unrender the editpart properly.
	 */
	void requestUnrender();

	/**
	 * This method is called by the parent editpart and tells the current
	 * editpart, that it should unrender its presentation now.
	 */
	void unrender();

	/**
	 * Returns true, if the editparts presentation is rendered.
	 * 
	 * @return
	 */
	boolean isRendered();

	/**
	 * Returns the rendered widget by the editparts presentation. Will return
	 * <code>null</code> if the presentation was not rendered yet.
	 * 
	 * @return
	 */
	Object getWidget();

	/**
	 * Requests disposal of the current editpart. This method will forward the
	 * request to the parent if available and the parent will handle the steps
	 * required to dispose the editpart properly.
	 */
	void requestDispose();

}
