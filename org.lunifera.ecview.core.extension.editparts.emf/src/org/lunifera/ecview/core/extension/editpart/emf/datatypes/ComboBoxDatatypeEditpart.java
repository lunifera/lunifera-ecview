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
package org.lunifera.ecview.core.extension.editpart.emf.datatypes;

import org.lunifera.ecview.core.common.editpart.emf.datatypes.DatatypeEditpart;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory;
import org.lunifera.ecview.core.extension.model.datatypes.YComboBoxDatatype;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IComboBoxDatatypeEditpart;

/**
 * An edit part for datatypes.
 */
@SuppressWarnings("restriction")
public class ComboBoxDatatypeEditpart extends
		DatatypeEditpart<YComboBoxDatatype> implements
		IComboBoxDatatypeEditpart {

	@Override
	protected YComboBoxDatatype createModel() {
		return ExtDatatypesFactory.eINSTANCE.createYComboBoxDatatype();
	}

}
