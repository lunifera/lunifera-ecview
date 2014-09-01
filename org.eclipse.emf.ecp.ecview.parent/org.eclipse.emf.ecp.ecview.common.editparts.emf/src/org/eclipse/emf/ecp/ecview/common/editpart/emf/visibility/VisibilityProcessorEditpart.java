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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.visibility;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityProcessorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityFactory;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;

public class VisibilityProcessorEditpart<M extends YVisibilityProcessor>
		extends ElementEditpart<M> implements IVisibilityProcessorEditpart {

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) VisibilityFactory.eINSTANCE.createYRuledVisibilityProcessor();
	}

}