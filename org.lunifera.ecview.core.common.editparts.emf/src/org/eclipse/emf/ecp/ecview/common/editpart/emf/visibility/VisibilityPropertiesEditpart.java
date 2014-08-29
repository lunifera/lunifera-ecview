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
package org.lunifera.ecview.core.common.editpart.emf.visibility;

import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityPropertiesEditpart;
import org.lunifera.ecview.core.common.model.visibility.VisibilityFactory;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProperties;

public class VisibilityPropertiesEditpart extends
		ElementEditpart<YVisibilityProperties> implements
		IVisibilityPropertiesEditpart {

	@Override
	protected YVisibilityProperties createModel() {
		return VisibilityFactory.eINSTANCE.createYVisibilityProperties();
	}
	
	
	
}
