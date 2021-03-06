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
package org.lunifera.ecview.core.common.model.core.listeners;

import org.lunifera.ecview.core.common.model.core.YField;

public interface YValueChangeListener {

	/**
	 * Is called if the value of the field has changed.
	 * 
	 * @param event
	 */
	void valueChanged(Event event);

	public static class Event {
		private final YField yField;
		private final Object newValue;
		private final Object oldValue;

		public Event(YField yField, Object oldValue, Object newValue) {
			this.yField = yField;
			this.oldValue = oldValue;
			this.newValue = newValue;
		}

		/**
		 * Returns the field which value was changed.
		 * 
		 * @return the yField
		 */
		public YField getField() {
			return yField;
		}

		/**
		 * Returns the new value of the field.
		 * 
		 * @return the newValue
		 */
		public Object getNewValue() {
			return newValue;
		}

		/**
		 * Returns the old value of the field.
		 * 
		 * @return the oldValue
		 */
		protected Object getOldValue() {
			return oldValue;
		}

	}
}
