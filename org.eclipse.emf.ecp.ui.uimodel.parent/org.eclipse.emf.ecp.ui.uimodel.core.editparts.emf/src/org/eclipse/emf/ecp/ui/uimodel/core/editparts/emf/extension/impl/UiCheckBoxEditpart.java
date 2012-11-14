/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.UiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiCheckboxEditpart;

/**
 * The implementation of the IUichTextAreaEditpart.
 */
public class UiCheckBoxEditpart extends UiFieldEditpart<YUiCheckBox> implements
		IUiCheckboxEditpart {

	@Override
	protected YUiCheckBox createModel() {
		return (YUiCheckBox) UimodelExtensionFactory.eINSTANCE
				.createYUiCheckBox();
	}

}
