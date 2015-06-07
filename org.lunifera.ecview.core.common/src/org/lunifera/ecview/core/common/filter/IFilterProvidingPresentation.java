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
package org.lunifera.ecview.core.common.filter;

/**
 * The presentation will provide filters that may be used for queries. Therefore
 * it collects all filters from its search fields and creates a compound filter.<br>
 * The type of filter depends on the used UI-Kit.
 */
public interface IFilterProvidingPresentation {

	/**
	 * Returns the filter that can be used for queries.
	 * 
	 * @return
	 */
	Object getFilter();

}
