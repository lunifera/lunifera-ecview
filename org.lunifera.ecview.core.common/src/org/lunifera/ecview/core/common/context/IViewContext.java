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
package org.lunifera.ecview.core.common.context;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.lunifera.ecview.core.common.beans.ISlot;
import org.lunifera.ecview.core.common.editpart.IExposedActionEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.visibility.IVisibilityManager;

/**
 * Context containing information about the current {@link IViewEditpart}
 * instance.<br>
 * Not intended to be subclassed.
 */
public interface IViewContext extends IContext {

	/**
	 * A Map<String, Object> can be provided by the parameter at rendering time.
	 * This map will be used to initialize the services.
	 */
	public static final String PARAM_SERVICES = "viewcontext.services";

	/**
	 * Allows to pass an instance of {@link IConfiguration}. It will be set to
	 * the view context before starting rendering.
	 */
	public static final String PARAM_CONFIGURATION = "viewcontext.configuration";

	/**
	 * Returns the URI that specifies the UI kit to be used.
	 * 
	 * @return presentationURI
	 */
	String getPresentationURI();

	/**
	 * Returns the {@link IViewEditpart} that is related with this context.
	 * 
	 * @return viewEditpart
	 */
	IViewEditpart getViewEditpart();

	/**
	 * Returns the visibility manager.
	 * 
	 * @return
	 */
	IVisibilityManager getVisibilityManager();

	/**
	 * Returns the view set context of the parent edit part or <code>null</code>
	 * if no parent exists.
	 * 
	 * @return parentContext
	 */
	IViewSetContext getParentContext();

	/**
	 * Returns a list of exposed actions. These actions must be supported by the
	 * UI element, that embeds the view rendered by this context.<br>
	 * Common usecases may be "loading models from JPA", "support JPA queries",
	 * "open different eclipse or vaaclipse views",...
	 * 
	 * @return
	 */
	List<IExposedActionEditpart> getExposedActions();

	/**
	 * Registers an instance of value bean to the context. It can be accessed by
	 * the selector. See also {@link ISlot} or {@link #getValueBean(String)
	 * getValueBean}.
	 * 
	 * @param selector
	 *            The selector string to identify the value bean instance.
	 * @param bean
	 *            The value bean.
	 * @return
	 */
	void setBean(String selector, Object bean);

	/**
	 * Returns the root layout where all UI elements should be child elements
	 * from it.
	 * 
	 * @return rootLayout
	 */
	Object getRootLayout();

	/**
	 * Renders the UI based on the {@link IViewEditpart} and the given
	 * presentationURI.
	 * 
	 * @param presentationURI
	 *            The URI that specifies the UI kit to be used. May be
	 *            <code>null</code>.
	 * @param rootLayout
	 *            The given root layout is the base element for the elements to
	 *            be rendered.
	 * @param parameter
	 *            Parameters that can be passed for rendering
	 * @return
	 * @throws ContextException
	 *             if the UI was already rendered or the rootlayout is
	 *             <code>null</code>
	 */
	void render(String presentationURI, Object rootLayout,
			Map<String, Object> parameter) throws ContextException;

	/**
	 * Returns true, if the UI was already rendered.
	 * 
	 * @return rendered
	 */
	boolean isRendered();

	/**
	 * Executes the given runnable. It is ensured that the runnable will be
	 * executed within the context of the user interface related to this
	 * context.
	 * 
	 * @param runnable
	 */
	void exec(Runnable runnable);

	/**
	 * Executes the given runnable in a different thread. It is ensured that the
	 * runnable will be executed within the context of the user interface
	 * related to this context.
	 * 
	 * @param runnable
	 */
	Future<?> execAsync(Runnable runnable);

}
