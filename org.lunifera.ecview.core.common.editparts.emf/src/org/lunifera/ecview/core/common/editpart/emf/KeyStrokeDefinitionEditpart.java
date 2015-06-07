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

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.IKeyStrokeDefinitionContainer;
import org.lunifera.ecview.core.common.editpart.IKeyStrokeDefinitionEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition;
import org.lunifera.ecview.core.common.model.core.impl.custom.KeyStrokeUtil;
import org.lunifera.runtime.common.keystroke.KeyStrokeDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the IKeyStrokeDefinitionEditpart.
 */
public class KeyStrokeDefinitionEditpart extends
		ElementEditpart<YKeyStrokeDefinition> implements
		IKeyStrokeDefinitionEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(KeyStrokeDefinitionEditpart.class);

	@Override
	protected YKeyStrokeDefinition createModel() {
		return (YKeyStrokeDefinition) CoreModelFactory.eINSTANCE
				.createYKeyStrokeDefinition();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		YKeyStrokeDefinition yElement = getModel();
		switch (featureId) {
		case CoreModelPackage.YKEY_STROKE_DEFINITION__KEY_CODE:
		case CoreModelPackage.YKEY_STROKE_DEFINITION__MODIFIER_KEYS:
			IElementEditpart parent = getEditpart((YElement) yElement
					.eContainer());
			LOGGER.info("Keystroke definition changed.");
			if (parent instanceof IKeyStrokeDefinitionContainer) {
				((IKeyStrokeDefinitionContainer) parent).keyStrokeChanged(this);
			}
			break;
		default:
			super.handleModelSet(featureId, notification);
		}
	}

	@Override
	public KeyStrokeDefinition getDefinition() {
		return KeyStrokeUtil.from(getModel());
	}
}
