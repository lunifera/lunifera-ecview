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
package org.lunifera.ecview.core.common.model.binding.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.junit.Test;

public class YBindingSetTest {
	private BindingFactory factory = BindingFactory.eINSTANCE;

	@Test
	public void test_addBinding() {
		YBindingSet set = factory.createYBindingSet();
		assertEquals(0, set.getBindings().size());

		YValueBindingEndpoint value1 = CoreModelFactory.eINSTANCE
				.createYContextValueBindingEndpoint();
		YValueBindingEndpoint value2 = CoreModelFactory.eINSTANCE
				.createYContextValueBindingEndpoint();

		YBinding binding = set.addBinding(value1, value2);
		assertEquals(1, set.getBindings().size());
		assertSame(value1, binding.getTargetEndpoint());
		assertSame(value2, binding.getModelEndpoint());

	}
}
