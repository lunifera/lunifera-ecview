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
package org.lunifera.ecview.core.common.binding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.UpdateSetStrategy;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.lunifera.ecview.core.common.disposal.AbstractDisposable;

/**
 * Is used to bind values. For details see {@link IECViewBindingManager}.
 */
public abstract class AbstractBindingManager extends AbstractDisposable
		implements IECViewBindingManager {

	private final Realm validationRealm;
	private final DataBindingContext dbc;

	public AbstractBindingManager(Realm validationRealm) {
		super();
		this.validationRealm = validationRealm;
		dbc = createDatabindingContext(validationRealm);
	}

	/**
	 * Creates a new instance of the databinding context.
	 * 
	 * @param validationRealm
	 * @return
	 */
	protected DataBindingContext createDatabindingContext(Realm validationRealm) {
		return new DataBindingContext(validationRealm);
	}

	public Realm getValidationRealm() {
		return validationRealm;
	}

	@Override
	public DataBindingContext getDatabindingContext() {
		return dbc;
	}

	@Override
	public Binding bindValue(IObservableValue target, IObservableValue model) {
		return bindValue(target, model, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE), new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE));
	}

	public final Binding bindValue(IObservableValue target,
			IObservableValue model, UpdateValueStrategy targetToModel,
			UpdateValueStrategy modelToTarget) {
		return dbc.bindValue(target, model, targetToModel, modelToTarget);
	}

	@Override
	public Binding bindList(IObservableList target, IObservableList model) {
		return bindList(target, model, new UpdateListStrategy(
				UpdateListStrategy.POLICY_UPDATE), new UpdateListStrategy(
				UpdateListStrategy.POLICY_UPDATE));
	}

	@Override
	public Binding bindList(IObservableList target, IObservableList model,
			UpdateListStrategy targetToModel, UpdateListStrategy modelToTarget) {
		return getDatabindingContext().bindList(target, model, targetToModel,
				modelToTarget);
	}

	@Override
	public Binding bindSet(IObservableSet target, IObservableSet model) {
		return bindSet(target, model, new UpdateSetStrategy(
				UpdateSetStrategy.POLICY_UPDATE), new UpdateSetStrategy(
				UpdateSetStrategy.POLICY_UPDATE));
	}

	@Override
	public Binding bindSet(IObservableSet target, IObservableSet model,
			UpdateSetStrategy targetToModel, UpdateSetStrategy modelToTarget) {
		return getDatabindingContext().bindSet(target, model,
				new UpdateSetStrategy(UpdateListStrategy.POLICY_UPDATE),
				new UpdateSetStrategy(UpdateListStrategy.POLICY_UPDATE));
	}

	@Override
	protected void internalDispose() {
		if (isDisposed()) {
			return;
		}

		dbc.dispose();
	}

}
