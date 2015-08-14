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

import org.lunifera.ecview.core.common.validation.IValidator;

/**
 * FieldPresentations are elements that display information but can not embed
 * any further widgets like layouts.
 * 
 * @param <C>
 */
public interface IFieldPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Adds the validator to the field.
	 * 
	 * @param validator
	 */
	void addValidator(IValidator validator);

	/**
	 * Removes the validator from the field.
	 * 
	 * @param validator
	 */
	void removeValidator(IValidator validator);

	/**
	 * Sets the converter that should be used for this field to converter data
	 * "from and to model" and "from and to UI".
	 * 
	 * @param object
	 */
	void setConverter(Object object);

	/**
	 * An event to indicate added or removed validator.
	 */
	public static class Event {

		public static final byte ADD = 0;
		public static final byte REMOVE = 1;

		private final short type;
		private final IValidator validator;

		public Event(byte type, IValidator validator) {
			super();
			this.type = type;
			this.validator = validator;
		}

		/**
		 * Returns the event. May be {@link #ADD} or {@link #REMOVE}.
		 * 
		 * @return
		 */
		public short getType() {
			return type;
		}

		/**
		 * Returns the validator.
		 * 
		 * @return
		 */
		public IValidator getValidator() {
			return validator;
		}

	}

}
