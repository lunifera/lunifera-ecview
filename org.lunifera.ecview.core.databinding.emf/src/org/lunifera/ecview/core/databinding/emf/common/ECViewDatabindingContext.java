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

package org.lunifera.ecview.core.databinding.emf.common;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;

public class ECViewDatabindingContext extends EMFDataBindingContext {

	public ECViewDatabindingContext() {
		super();
	}

	public ECViewDatabindingContext(Realm validationRealm) {
		super(validationRealm);
	}

	 @Override
	  protected UpdateValueStrategy createModelToTargetUpdateValueStrategy(IObservableValue fromValue, IObservableValue toValue)
	  {
	    return new ECViewUpdateValueStrategy();
	  }

	  @Override
	  protected UpdateValueStrategy createTargetToModelUpdateValueStrategy(IObservableValue fromValue, IObservableValue toValue)
	  {
	    return new ECViewUpdateValueStrategy();
	  }
	
	
	
}
