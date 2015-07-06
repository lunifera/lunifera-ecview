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

import java.util.List;

/**
 * Implementations may return beans of any kind that are not persisted, but used
 * In-Memory. For instance as a suggestion list for combo boxes.
 */
public interface InMemoryBeanProvider {

	/**
	 * Returns a list of beans.
	 * 
	 * @return
	 */
	List<?> getBeans();

}
