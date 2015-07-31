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
package org.lunifera.ecview.core.common.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A default implementation of the slot. Offers {@link PropertyChangeSupport}.
 */
public class AbstractSlot implements ISlot {
	private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(
			this);

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(AbstractSlot.class);

	private final Class<?> valueType;
	private Object value;

	public AbstractSlot(Class<?> valueType) {
		this.valueType = valueType;
	}

	public AbstractSlot(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Value must not be null!");
		}
		this.value = value;
		this.valueType = value.getClass();
	}

	@Override
	public Class<?> getValueType() {
		return valueType;
	}

	/**
	 * Adds the given property change listener to the change support.
	 * 
	 * @param listener
	 *            Listener to be added
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * Adds the given property change listener to the change support.
	 * 
	 * @param property
	 *            Name of the property
	 * @param listener
	 *            Listener to be added
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String property,
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(property, listener);
	}

	/**
	 * Removes the given property change listener from the change support.
	 * 
	 * @param listener
	 *            Listener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	/**
	 * Removes the given property change listener from the change support.
	 * 
	 * @param property
	 *            Name of the property
	 * @param listener
	 *            Listener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String property,
			PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(property, listener);
	}

	/**
	 * Fires the property changed event.
	 * 
	 * @param property
	 *            Name of the property
	 * @param oldValue
	 *            The old value
	 * @param newValue
	 *            The new value
	 * @see java.beans.PropertyChangeSupport#firePropertyChange(String, Object,
	 *      Object)
	 */
	protected void firePropertyChanged(String property, Object oldValue,
			Object newValue) {
		changeSupport.firePropertyChange(property, oldValue, newValue);
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public void setValue(Object value) {

		if (this.value == value) {
			return;
		}

		// workaround since PropertyChangeSupport does not send events if(value
		// != this.value && this.value.equals(value))
		// so we need to set this value to null first
		if (this.value != null && this.value.equals(value)) {
			// reset the value to null
			firePropertyChanged("value", this.value, this.value = null);
		}

		firePropertyChanged("value", this.value, this.value = value);
	}
}
