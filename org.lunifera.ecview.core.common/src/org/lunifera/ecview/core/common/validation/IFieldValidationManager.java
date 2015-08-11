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
package org.lunifera.ecview.core.common.validation;

import java.util.List;

import org.lunifera.runtime.common.dispose.IDisposable;
import org.lunifera.runtime.common.validation.IStatus;

/**
 * This class is responsible to handle validation results on UI level.
 */
public interface IFieldValidationManager extends IDisposable {

	/**
	 * Register validation status for the given context.
	 * 
	 * @param context
	 * @param status
	 */
	void registerResult(Object context, List<IStatus> status);

	/**
	 * Returns all validation results for the given context.
	 * 
	 * @param context
	 * @return
	 */
	List<IStatus> getResults(Object context);

	/**
	 * Sets the enhancer.
	 * 
	 * @param enhancer
	 */
	void setEnhancer(Enhancer enhancer);

	/**
	 * Adds a new validation listener.
	 * 
	 * @param listener
	 */
	void addListener(Listener listener);

	/**
	 * Removes the given validation listener.
	 * 
	 * @param listener
	 */
	void removeListener(Listener listener);

	/**
	 * An enhancer may be used, to enhance the IStatus with additional
	 * information. For instance a property for the currently active view.
	 */
	interface Enhancer {

		/**
		 * Enhances the status.
		 * 
		 * @param status
		 */
		void enhance(IStatus status);

	}

	/**
	 * Notifies the listener about a changed validation.
	 */
	interface Listener {

		/**
		 * Is called, if the status changed.
		 * 
		 * @param event
		 */
		void validationChanged(Event event);
	}

	public static class Event {

		private final Object context;
		private final List<IStatus> oldStatus;
		private final List<IStatus> newStatus;

		public Event(Object context, List<IStatus> oldStatus,
				List<IStatus> newStatus) {
			super();
			this.context = context;
			this.oldStatus = oldStatus;
			this.newStatus = newStatus;
		}

		/**
		 * @return the context
		 */
		public Object getContext() {
			return context;
		}

		/**
		 * @return the oldStatus
		 */
		public List<IStatus> getOldStatus() {
			return oldStatus;
		}

		/**
		 * @return the newStatus
		 */
		public List<IStatus> getNewStatus() {
			return newStatus;
		}

	}
}
