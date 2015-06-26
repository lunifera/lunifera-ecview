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
package org.lunifera.ecview.core.common.uri;


/**
 * Abstract class to unify all the methods used in the extended scope classes.
 * 
 * @author dominguez
 * 
 * @param <A>
 */
public abstract class AbstractScope implements IURIScope {

	private String segment;

	protected AbstractScope() {
	}

	public String getURISegment() {
		return segment;
	}

	/**
	 * Sets the URI segment. See {@link #getURISegment()}.
	 * 
	 * @param segment
	 */
	protected void setURISegment(String segment) {
		this.segment = segment;
	}

}
