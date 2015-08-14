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
package org.lunifera.ecview.core.ui.common.tests.editparts.emf.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.lunifera.ecview.core.common.editpart.emf.common.IResourceManager;
import org.lunifera.ecview.core.common.editpart.emf.common.ResourceManager;
import org.lunifera.ecview.core.common.editpart.emf.internal.OrphanViewsResource;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;

/**
 * Tests the {@link ResourceManager}.
 */
@SuppressWarnings("restriction")
public class ResourceManagerTest {

	/**
	 * Tests the getResource method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getResource() {
		Resource r1_1 = ResourceManager.getInstance().getResource(
				CoreModelPackage.eNS_URI);
		Resource r1_2 = ResourceManager.getInstance().getResource(
				CoreModelPackage.eNS_URI);
		Assert.assertSame(r1_1, r1_2);

		Resource r2_1 = ResourceManager.getInstance().getResource(
				URI.createURI(CoreModelPackage.eNS_URI));
		Resource r2_2 = ResourceManager.getInstance().getResource(
				URI.createURI(CoreModelPackage.eNS_URI));
		Assert.assertSame(r2_1, r2_2);

		Resource r3_1 = ResourceManager.getInstance().getResource(
				IResourceManager.ORPHAN_VIEW_RESOURCE_URI_STRING);
		Resource r3_2 = ResourceManager.getInstance().getResource(
				IResourceManager.ORPHAN_VIEW_RESOURCE_URI_STRING);
		Assert.assertSame(r3_1, r3_2);
		Assert.assertTrue(r3_1 instanceof OrphanViewsResource);

		Resource r4_1 = ResourceManager.getInstance().getResource(
				IResourceManager.ORPHAN_VIEW_RESOURCE_URI);
		Resource r4_2 = ResourceManager.getInstance().getResource(
				IResourceManager.ORPHAN_VIEW_RESOURCE_URI);
		Assert.assertSame(r4_1, r4_2);
		Assert.assertTrue(r4_1 instanceof OrphanViewsResource);
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the get resourceSet method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getResourceSet() {
		// END SUPRESS CATCH EXCEPTION
		Assert.assertNotNull(ResourceManager.getInstance().getResourceSet());
	}
}
