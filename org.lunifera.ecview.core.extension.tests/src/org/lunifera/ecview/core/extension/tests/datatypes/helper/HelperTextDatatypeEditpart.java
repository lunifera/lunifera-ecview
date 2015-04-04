
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


package org.lunifera.ecview.core.extension.tests.datatypes.helper;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.TextDatatypeEditpart;

@SuppressWarnings("restriction")
public class HelperTextDatatypeEditpart extends TextDatatypeEditpart {
	
	@Override
	public ValidatorDelta internalGetValidatorsDelta(DatatypeBridge bridge,
			Notification notification) {
		return super.internalGetValidatorsDelta(bridge, notification);
	}

	@Override
	public Set<DatatypeBridge> getBridges() {
		return super.getBridges();
	}

}