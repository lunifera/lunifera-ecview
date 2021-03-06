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
package org.lunifera.ecview.core.common.model.core.util;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.model.core.YEditable;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YEnable;
import org.lunifera.ecview.core.common.model.core.YVisibleable;

public class CoreModelUtil {

	/**
	 * Initializes the transient values.
	 * 
	 * @param yEmbeddable
	 */
	public static void initTransientValues(YEmbeddable yEmbeddable) {
		if (yEmbeddable instanceof YEditable) {
			((YEditable) yEmbeddable).setEditable(((YEditable) yEmbeddable)
					.isInitialEditable());
		}

		if (yEmbeddable instanceof YEnable) {
			((YEnable) yEmbeddable).setEnabled(((YEnable) yEmbeddable)
					.isInitialEnabled());
		}

		if (yEmbeddable instanceof YVisibleable) {
			((YVisibleable) yEmbeddable)
					.setVisible(((YVisibleable) yEmbeddable).isInitialVisible());
		}
	}

	/**
	 * Casts the given object to EObject.
	 * 
	 * @param object
	 * @return
	 */
	public static EObject castEObject(Object object) {
		return (EObject) object;
	}

}
