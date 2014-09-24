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
package org.lunifera.ecview.core.common.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractWidgetAssocationsService<UI, MODEL> implements
		IWidgetAssocationsService<UI, MODEL> {

	protected Map<UI, MODEL> associations = Collections
			.synchronizedMap(new HashMap<UI, MODEL>());

	@Override
	public MODEL getModelElement(UI uiWidget) {
		return associations.get(uiWidget);
	}

	@Override
	public UI getWidget(MODEL modelElement) {
		synchronized (associations) {
			for (Map.Entry<UI, MODEL> entry : associations.entrySet()) {
				if (entry.getValue() == modelElement) {
					return entry.getKey();
				}
			}
		}
		return null;
	}

	@Override
	public void associate(UI uiWidget, MODEL modelElement) {
		associations.put(uiWidget, modelElement);
	}

	@Override
	public void remove(UI uiWidget) {
		associations.remove(uiWidget);
	}

	@Override
	public void clear() {
		associations.clear();
	}

	@Override
	public List<MODEL> getModelElements() {
		return new ArrayList<MODEL>(associations.values());
	}

}
