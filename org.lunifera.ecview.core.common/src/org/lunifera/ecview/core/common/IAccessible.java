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
package org.lunifera.ecview.core.common;

import org.lunifera.ecview.core.common.beans.IBeanRegistry;
import org.lunifera.ecview.core.common.services.IServiceRegistry;

/**
 * An interface that extends the {@link IBeanRegistry} and
 * {@link IServiceRegistry}.<br>
 * Not intended to be subclassed.
 */
public interface IAccessible extends IBeanRegistry, IServiceRegistry {

}
