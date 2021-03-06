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
package org.lunifera.ecview.core.databinding.tests.pojo.model;

public class PPerson {

	private PAddress address;

	/**
	 * @return the address
	 */
	public PAddress getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(PAddress address) {
		this.address = address;
	}

	/**
	 * Creates a new instance of person. All references are properly setup and
	 * the isoCode of the country is set to the given value.
	 * 
	 * @param isoCode
	 * @return
	 */
	public static PPerson newInstance(String isoCode) {
		PPerson person = new PPerson();
		PAddress address = new PAddress();
		person.setAddress(address);
		PCountry country = new PCountry();
		country.setIsoCode(isoCode);
		address.setCountry(country);
		return person;
	}

}
