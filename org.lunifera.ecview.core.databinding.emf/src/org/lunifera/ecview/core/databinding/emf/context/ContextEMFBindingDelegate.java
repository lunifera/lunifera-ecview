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
package org.lunifera.ecview.core.databinding.emf.context;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.lunifera.ecview.core.common.beans.IBeanRegistry;
import org.lunifera.ecview.core.common.beans.ISlot;
import org.lunifera.ecview.core.common.binding.observables.ContextBindingDelegate;
import org.lunifera.ecview.core.common.uri.AccessibleScope;
import org.lunifera.ecview.core.common.uri.BeanScope;
import org.lunifera.ecview.core.common.uri.URIHelper;

public class ContextEMFBindingDelegate extends ContextBindingDelegate {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(IBeanRegistry registry, URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		BeanScope beanScope = scope.getBeanScope();
		if (beanScope == null) {
			return false;
		}
		ISlot slot = beanScope.accessBeanSlot(registry);
		if (slot == null
				|| !EObject.class.isAssignableFrom(slot.getValueType())) {
			return false;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(IBeanRegistry registry, URI bindingURI) {
		return observeValue(Realm.getDefault(), registry, bindingURI);
	}

	/**
	 * {@inheritDoc}
	 */
	public IObservableValue observeValue(Realm realm, IBeanRegistry registry,
			URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		ISlot slot = scope.getBeanScope().accessBeanSlot(registry);

		if (slot == null) {
			throw new IllegalArgumentException("Bean slot must be available!");
		}

		// normalize bean fragment
		String beanFragment = AccessibleScope
				.removeSlotValueFragmentToken(scope.getBeanFragment());

		IObservableValue observabelValue = null;
		// no fragment specified
		if (beanFragment.equals("")) {
			observabelValue = BeansObservables.observeValue(realm, slot,
					ISlot.PROP_VALUE);
		} else {
			EObject eObject = (EObject) slot.getValue();

			// build the feature path
			//
			EClass eClass = eObject.eClass();
			List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
			String[] properties = beanFragment.split("\\.");
			for (String property : properties) {
				EStructuralFeature feature = eClass
						.getEStructuralFeature(property);
				if (feature == null) {
					throw new IllegalStateException(String.format(
							"%s is not a valid feature for %s!", property,
							eClass.getName()));
				}

				features.add(feature);
				if (feature instanceof EReference) {
					EReference eReference = (EReference) feature;
					eClass = eReference.getEReferenceType();
				}
			}

			FeaturePath path = FeaturePath.fromList(features
					.toArray(new EStructuralFeature[features.size()]));

			// observe detail
			//
			IObservableValue masterObservable = BeansObservables.observeValue(
					realm, slot, ISlot.PROP_VALUE);
			observabelValue = EMFProperties.value(path).observeDetail(
					masterObservable);
		}
		return observabelValue;
	}

	@Override
	public IObservableList observeList(IBeanRegistry registry, URI bindingURI,
			Class<?> elementType) {
		return observeList(Realm.getDefault(), registry, bindingURI, elementType);
	}

	@Override
	public IObservableList observeList(Realm realm, IBeanRegistry registry,
			URI bindingURI, Class<?> elementType) {

		AccessibleScope scope = URIHelper.toScope(bindingURI);
		ISlot slot = scope.getBeanScope().accessBeanSlot(registry);

		if (slot == null) {
			throw new IllegalArgumentException("Bean slot must be available!");
		}

		// normalize bean fragment
		String beanFragment = AccessibleScope
				.removeSlotValueFragmentToken(scope.getBeanFragment());

		IObservableList observabelList = null;
		// no fragment specified
		if (beanFragment.equals("")) {
			return BeanProperties.list(slot.getClass(), ISlot.PROP_VALUE,
					elementType).observe(realm, slot);
		} else {
			EObject eObject = (EObject) slot.getValue();

			// build the feature path
			//
			EClass eClass = eObject.eClass();
			List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
			String[] properties = beanFragment.split("\\.");
			for (String property : properties) {
				EStructuralFeature feature = eClass
						.getEStructuralFeature(property);
				if (feature == null) {
					throw new IllegalStateException(String.format(
							"%s is not a valid feature for %s!", property,
							eClass.getName()));
				}

				features.add(feature);
				if (feature instanceof EReference) {
					EReference eReference = (EReference) feature;
					eClass = eReference.getEReferenceType();
				}
			}

			FeaturePath path = FeaturePath.fromList(features
					.toArray(new EStructuralFeature[features.size()]));

			// observe detail
			//
			IObservableValue masterObservable = BeanProperties.value(
					slot.getClass(), ISlot.PROP_VALUE, slot.getValueType()).observe(
					realm, slot);
			observabelList = EMFProperties.list(path).observeDetail(
					masterObservable);
		}
		return observabelList;

	}

}
