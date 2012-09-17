/*******************************************************************************
 * Copyright (c) 2012 Florian Pirchner and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans;

import java.beans.PropertyChangeSupport;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;

/**
 * An abstraction for a value bean. It can keep a value. The implementation should be bindable with eclipse databinding
 * and offer {@link PropertyChangeSupport}.
 * <p>
 * For a use case see {@link IViewContext#getValueBean(String, Class)}.
 */
public interface IValueBean {

	/**
	 * Returns the given value.
	 * 
	 * @return
	 */
	Object getValue();

	/**
	 * Sets the given value.
	 * 
	 * @param value
	 */
	void setValue(Object value);

}