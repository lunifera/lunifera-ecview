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
package org.lunifera.ecview.core.extension.editpart.emf;

import org.lunifera.ecview.core.common.editpart.emf.FieldEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.ui.core.editparts.extension.IDateTimeEditpart;

/**
 * The implementation of the IUiCheckBoxEditpart.
 */
@SuppressWarnings("restriction")
public class DateTimeEditpart extends FieldEditpart<YDateTime> implements
		IDateTimeEditpart {

	public DateTimeEditpart() {
		super(ExtensionModelPackage.Literals.YDATE_TIME__DATATYPE);
	}

	@Override
	protected YDateTime createModel() {
		return (YDateTime) ExtensionModelFactory.eINSTANCE.createYDateTime();
	}

}
