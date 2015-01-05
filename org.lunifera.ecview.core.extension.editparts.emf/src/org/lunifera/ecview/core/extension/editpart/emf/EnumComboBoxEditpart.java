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
package org.lunifera.ecview.core.extension.editpart.emf;

import org.lunifera.ecview.core.common.editpart.emf.FieldEditpart;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YEnumComboBox;
import org.lunifera.ecview.core.ui.core.editparts.extension.IEnumComboBoxEditpart;

/**
 * The implementation of the IUiComboBoxEditpart.
 */
@SuppressWarnings("restriction")
public class EnumComboBoxEditpart extends FieldEditpart<YEnumComboBox>
		implements IEnumComboBoxEditpart {

	public EnumComboBoxEditpart() {
		super(ExtensionModelPackage.Literals.YENUM_COMBO_BOX__DATATYPE);
	}

	@Override
	protected YEnumComboBox createModel() {
		return (YEnumComboBox) ExtensionModelFactory.eINSTANCE
				.createYEnumComboBox();
	}

}
