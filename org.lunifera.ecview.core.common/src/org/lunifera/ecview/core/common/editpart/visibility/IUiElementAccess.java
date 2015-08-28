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
package org.lunifera.ecview.core.common.editpart.visibility;

public interface IUiElementAccess {

	/**
	 * Returns true, of the UI element contains a tag with the given tagName.
	 * 
	 * @param tag
	 * @return
	 */
	boolean containsTag(String tag);

	/**
	 * Returns true, of the UI element contains a property with the given key.
	 * 
	 * @param tag
	 * @return
	 */
	boolean containsProperty(String key);

	/**
	 * Returns the property value from the UI element with the given key.
	 * 
	 * @param key
	 * @return
	 */
	String getPropertyValue(String key);

}
