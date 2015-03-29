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
package org.lunifera.ecview.core.common.editpart;

import org.lunifera.runtime.common.keystroke.KeyCode;
import org.lunifera.runtime.common.keystroke.KeyStrokeDefinition;

/**
 * Deals with keystroke definitions.
 */
public interface IKeyStrokeDefinitionEditpart extends IElementEditpart {

	/**
	 * Returns the key stroke definition as a immutable POJO. See {@link KeyCode}
	 * 
	 * @return
	 */
	KeyStrokeDefinition getDefinition();

}
