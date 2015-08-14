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
package org.lunifera.ecview.core.common.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IConverterEditpart;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class DelegatingConverterFactory implements IConverterFactory {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(DelegatingConverterFactory.class);
	private static DelegatingConverterFactory instance = new DelegatingConverterFactory();

	private final List<IConverterFactory> delegates = Collections
			.synchronizedList(new ArrayList<IConverterFactory>());
	private List<IConverterFactory> stashed;

	private DelegatingConverterFactory() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static DelegatingConverterFactory getInstance() {
		return instance;
	}

	/**
	 * Removes all factories. Should only be used very carefully
	 */
	public void clear() {
		delegates.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(IViewContext uiContext, IConverterEditpart editpart) {
		for (IConverterFactory factory : delegates
				.toArray(new IConverterFactory[delegates.size()])) {
			if (factory.isFor(uiContext, editpart)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object createConverter(IViewContext uiContext,
			IConverterEditpart editpart) throws IllegalArgumentException {
		for (IConverterFactory factory : delegates
				.toArray(new IConverterFactory[delegates.size()])) {
			if (factory.isFor(uiContext, editpart)) {
				try {
					Object result = factory
							.createConverter(uiContext, editpart);
					if (result != null) {
						return result;
					}
				} catch (IllegalArgumentException e) {
					// nothing to do. Try the next factory
				}
			}
		}
		LOGGER.error("No proper converterFactory found for elements {} {}",
				new Object[] { uiContext, editpart });
		return null;
	}

	/**
	 * Will stash the current state. ONLY FOR TESTS!
	 */
	public void stash() {
		if (stashed != null) {
			return;
		}
		stashed = new ArrayList<IConverterFactory>(delegates);
	}

	/**
	 * Will unstash the stashed state. ONLY FOR TESTS!
	 */
	public void unstash() {
		if (stashed == null) {
			return;
		}
		delegates.clear();
		delegates.addAll(stashed);
		stashed = null;
	}

	/**
	 * Adds a new factory to the manager.
	 * 
	 * @param factory
	 *            Factory to be added.
	 */
	public void addDelegate(IConverterFactory factory) {
		if (!delegates.contains(factory)) {
			delegates.add(factory);
		}
	}

	/**
	 * Removes the factory from the manager.
	 * 
	 * @param factory
	 *            Factory to be removed.
	 */
	public void removeDelegate(IConverterFactory factory) {
		if (factory == null) {
			return;
		}
		delegates.remove(factory);
	}

	/**
	 * OSGi-DS component.
	 */
	public static class ServiceComponent {

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            Component context
		 * @param properties
		 *            Map of properties
		 */
		public void activate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("DelegatingPresenterFactory activated");
		}

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            Component context
		 * @param properties
		 *            Map of properties
		 */
		public void deactivate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("DelegatingPresenterFactory deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory
		 *            Factory to be added
		 */
		protected void addDelegate(IConverterFactory factory) {
			DelegatingConverterFactory.getInstance().addDelegate(factory);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory
		 *            Factory to be added
		 */
		protected void removeDelegate(IConverterFactory factory) {
			DelegatingConverterFactory.getInstance().removeDelegate(factory);
		}
	}
}
