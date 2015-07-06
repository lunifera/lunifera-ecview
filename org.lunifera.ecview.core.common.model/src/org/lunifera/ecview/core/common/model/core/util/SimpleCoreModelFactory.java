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

import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBeanValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YContextValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.datatypes.DatatypesFactory;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

public class SimpleCoreModelFactory {

	/**
	 * Creates an instance of {@link YView}
	 * 
	 * @return
	 */
	public YView createView() {
		return CoreModelFactory.eINSTANCE.createYView();
	}

	/**
	 * Creates an instance of {@link YViewSet}
	 * 
	 * @return
	 */
	public YViewSet createViewSet() {
		return CoreModelFactory.eINSTANCE.createYViewSet();
	}

	/**
	 * Creates an instance of {@link YDatadescription}
	 * 
	 * @return
	 */
	public YDatadescription createDatadescription() {
		return DatatypesFactory.eINSTANCE.createYDatadescription();
	}

	/**
	 * Creates an instance of {@link YEmbeddableValueEndpoint}
	 * 
	 * @return
	 */
	public YEmbeddableValueEndpoint createEmbeddableValueEndpoint() {
		return CoreModelFactory.eINSTANCE.createYEmbeddableValueEndpoint();
	}

	/**
	 * Creates an instance of {@link YECViewModelValueBindingEndpoint}
	 * 
	 * @return
	 */
	public YECViewModelValueBindingEndpoint createECViewModelValueBindingEndpoint() {
		return BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
	} 

	/**
	 * Creates an instance of {@link YECViewModelListBindingEndpoint}
	 * 
	 * @return
	 */ 
	public YECViewModelListBindingEndpoint createECViewModelListBindingEndpoint() {
		return BindingFactory.eINSTANCE.createYECViewModelListBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YContextValueBindingEndpoint}
	 * 
	 * @return
	 */
	public YContextValueBindingEndpoint createContextBindingEndpoint() {
		return CoreModelFactory.eINSTANCE.createYContextValueBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YBeanValueBindingEndpoint}
	 * 
	 * @return
	 */
	public YBeanValueBindingEndpoint createBeanBindingEndpoint() {
		return BindingFactory.eINSTANCE.createYBeanValueBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YBeanSlotValueBindingEndpoint}
	 * 
	 * @return
	 */
	public YBeanSlotValueBindingEndpoint createBeanSlotValueBindingEndpoint() {
		return CoreModelFactory.eINSTANCE.createYBeanSlotValueBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YBeanSlotListBindingEndpoint}
	 * 
	 * @return
	 */
	public YBeanSlotListBindingEndpoint createBeanSlotListBindingEndpoint() {
		return CoreModelFactory.eINSTANCE.createYBeanSlotListBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YBeanSlot}
	 * 
	 * @return
	 */
	public YBeanSlot createBeanSlot() {
		return CoreModelFactory.eINSTANCE.createYBeanSlot();
	}

}
