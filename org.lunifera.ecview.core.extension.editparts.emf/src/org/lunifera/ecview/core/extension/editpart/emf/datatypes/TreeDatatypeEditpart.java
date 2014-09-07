/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.extension.editpart.emf.datatypes;

import org.lunifera.ecview.core.common.editpart.emf.datatypes.DatatypeEditpart;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory;
import org.lunifera.ecview.core.extension.model.datatypes.YTreeDatatype;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.ITreeDatatypeEditpart;

/**
 * An edit part for datatypes.
 */
@SuppressWarnings("restriction")
public class TreeDatatypeEditpart extends DatatypeEditpart<YTreeDatatype>
		implements ITreeDatatypeEditpart {

	@Override
	protected YTreeDatatype createModel() {
		return ExtDatatypesFactory.eINSTANCE.createYTreeDatatype();
	}

}