/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.core.vaadin.presentation.internal;

import java.util.Locale;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.filter.IFilterProvidingPresentation;
import org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YNumericSearchField;
import org.lunifera.ecview.core.ui.core.editparts.extension.INumericSearchFieldEditpart;
import org.lunifera.ecview.core.vaadin.components.fields.search.NumericSearchField;
import org.lunifera.ecview.core.vaadin.components.fields.search.filter.NumericFilterProperty;
import org.lunifera.ecview.core.vaadin.presentation.IConstants;
import org.lunifera.ecview.core.vaadin.presentation.internal.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.Field;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class NumericSearchFieldPresentation extends
		AbstractFieldWidgetPresenter<Component> implements
		IFilterProvidingPresentation {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(NumericSearchFieldPresentation.class);

	private final ModelAccess modelAccess;
	private NumericSearchField field;
	private ObjectProperty<NumericFilterProperty> property;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public NumericSearchFieldPresentation(IElementEditpart editpart) {
		super((INumericSearchFieldEditpart) editpart);
		this.modelAccess = new ModelAccess(
				(YNumericSearchField) editpart.getModel());
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Component doCreateWidget(Object parent) {
		if (field == null) {
			field = new NumericSearchField(getEditpart().getId(),
					modelAccess.yField.getPropertyPath(),
					modelAccess.yField.getType());
			field.addStyleName(CSS_CLASS_CONTROL);
			field.addStyleName(IConstants.CSS_CLASS_SEARCHFIELD);

			field.setNullRepresentation("");
			field.setImmediate(true);
			setupComponent(field, getCastedModel());

			associateWidget(field, modelAccess.yField);
			if (modelAccess.isCssIdValid()) {
				field.setId(modelAccess.getCssID());
			} else {
				field.setId(getEditpart().getId());
			}

			property = new ObjectProperty<NumericFilterProperty>(null, NumericFilterProperty.class);
			field.setPropertyDataSource(property);

			// creates the binding for the field
			createBindings(modelAccess.yField, field);

			if (modelAccess.isCssClassValid()) {
				field.addStyleName(modelAccess.getCssClass());
			}

			applyCaptions();

			initializeField(field);
		}
		return field;
	}

	@Override
	public Object getFilter() {
		return field != null ? field.getFilter() : null;
	}

	@Override
	protected void doUpdateLocale(Locale locale) {
		// no need to set the locale to the ui elements. Is handled by vaadin
		// internally.

		// update the captions
		applyCaptions();
	}

	/**
	 * Applies the labels to the widgets.
	 */
	protected void applyCaptions() {
		II18nService service = getI18nService();
		Util.applyCaptions(service, modelAccess.getLabel(),
				modelAccess.getLabelI18nKey(), getLocale(), field);

		field.setDescription(service.getValue(
				IConstants.I18N_TOOLTIP_NUMBERSEARCHFIELD, getLocale()));
	}

	@Override
	protected Field<?> doGetField() {
		return field;
	}

	@Override
	protected IObservable internalGetObservableEndpoint(
			YEmbeddableBindingEndpoint bindableValue) {
		if (bindableValue == null) {
			throw new IllegalArgumentException(
					"BindableValue must not be null!");
		}

		if (bindableValue instanceof YEmbeddableValueEndpoint) {
			return internalGetValueEndpoint();
		}
		throw new IllegalArgumentException("Not a valid input: "
				+ bindableValue);
	}

	/**
	 * Returns the observable to observe value.
	 * 
	 * @return
	 */
	protected IObservableValue internalGetValueEndpoint() {
		// return the observable value for text
		return EMFObservables.observeValue(castEObject(getModel()),
				ExtensionModelPackage.Literals.YNUMERIC_SEARCH_FIELD__VALUE);
	}

	/**
	 * Creates the bindings for the given values.
	 * 
	 * @param yField
	 * @param field
	 */
	protected void createBindings(YNumericSearchField yField,
			NumericSearchField field) {
		// create the model binding from ridget to ECView-model
		registerBinding(createBindings_Value(castEObject(getModel()),
				ExtensionModelPackage.Literals.YNUMERIC_SEARCH_FIELD__VALUE,
				field));

		super.createBindings(yField, field, null);
	}

	@Override
	public Component getWidget() {
		return field;
	}

	@Override
	public boolean isRendered() {
		return field != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doUnrender() {
		if (field != null) {

			// unbind all active bindings
			unbind();

			ComponentContainer parent = ((ComponentContainer) field.getParent());
			if (parent != null) {
				parent.removeComponent(field);
			}

			// remove assocations
			unassociateWidget(field);

			field = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			unrender();
		} finally {
			super.internalDispose();
		}
	}

	/**
	 * A helper class.
	 */
	private static class ModelAccess {
		private final YNumericSearchField yField;

		public ModelAccess(YNumericSearchField yField) {
			super();
			this.yField = yField;
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yField.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.lunifera.ecview.core.ui.core.model.core.YCssAble#getCssID()
		 */
		public String getCssID() {
			return yField.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabel() {
			return yField.getDatadescription() != null ? yField.getDatadescription().getLabel() : null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabelI18nKey() {
			return yField.getDatadescription() != null ? yField.getDatadescription().getLabelI18nKey() : null;
		}
	}
}
