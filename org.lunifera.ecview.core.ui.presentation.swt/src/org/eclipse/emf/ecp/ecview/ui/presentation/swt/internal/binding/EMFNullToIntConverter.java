/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.lunifera.ecview.core.ui.presentation.swt.internal.binding;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFNullToIntConverter implements IConverter {

	private final EStructuralFeature feature;
	private final int defaultValue;

	public EMFNullToIntConverter(EStructuralFeature feature, int defaultValue) {
		this.feature = feature;
		this.defaultValue = defaultValue;
	}

	@Override
	public Object getToType() {
		return Integer.class;
	}

	@Override
	public Object getFromType() {
		return feature;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject == null) {
			return defaultValue;
		}
		return fromObject;
	}
}