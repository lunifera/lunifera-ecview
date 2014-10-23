/*******************************************************************************
 * Copyright (c) 2012 by committers of lunifera.org

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributor:
 * 		Florian Pirchner - initial implementation
 * 
 *******************************************************************************/
package org.lunifera.ecview.core.vaadin.databinding.tests.model;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.ecview.core.vaadin.databinding.VaadinObservables;

import com.vaadin.data.util.IndexedContainer;

public class ContainerItemSetTests {

	@Before
	public void setup() {
		VaadinObservables.getRealm(null);
	}

	@Test
	public void test_containerItemSet() {
		// Binded
		// VaadinObservables.observeItemSet(Container.ItemSetChangeNotifier)
		// Am besten IndexedContainer verwenden und manuell item hinzuf��gen
		IndexedContainer container = new IndexedContainer();
		WritableList itemIds = new WritableList();

		DataBindingContext dbc = new DataBindingContext();
		dbc.bindList(itemIds, VaadinObservables
				.observeContainerItemSetContents(container, String.class));

		Assert.assertEquals(0, itemIds.size());
		container.addItem("1");
		Assert.assertEquals(1, itemIds.size());
	}

	@Test
	public void test_targetToModel() {
		// Binded
		// VaadinObservables.observeItemSet(Container.ItemSetChangeNotifier)
		// Am besten IndexedContainer verwenden und manuell item hinzuf��gen
		IndexedContainer container = new IndexedContainer();
		WritableList itemIds = new WritableList();

		DataBindingContext dbc = new DataBindingContext();
		dbc.bindList(itemIds, VaadinObservables
				.observeContainerItemSetContents(container, String.class));

		Assert.assertEquals(0, container.size());
		itemIds.add("1");
		Assert.assertEquals(1, container.size());
	}

}
