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
package org.lunifera.ecview.core.common.editpart.emf;

import org.lunifera.ecview.core.common.editpart.IConverterEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YConverter;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.presentation.DelegatingConverterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the IOpenDialogCommandEditpart.
 */
public class ConverterEditpart extends ElementEditpart<YConverter> implements
		IConverterEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ConverterEditpart.class);
	private Object delegate;

	@Override
	protected YConverter createModel() {
		return (YConverter) CoreModelFactory.eINSTANCE
				.createYDelegateConverter();
	}

	@Override
	public Object getDelegate() {
		if (delegate == null) {
			YField yField = (YField) getModel().eContainer();
			delegate = DelegatingConverterFactory.getInstance()
					.createConverter(getViewContext(yField), this);

			LOGGER.info("Created converter for " + getModel());
		}

		return delegate;
	}
}
