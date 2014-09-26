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
package org.lunifera.ecview.core.extension.editpart.emf;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.editpart.emf.common.AbstractEditpartManager;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.BrowserDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.CheckBoxDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.ComboBoxDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.DateTimeDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.DecimalDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.ListDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.NumericDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.OptionsGroupDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.ProgressBarDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.TabSheetDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.TableDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.TextDatatypeEditpart;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.TreeDatatypeEditpart;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage;
import org.lunifera.ecview.core.extension.model.datatypes.YBrowserDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YCheckBoxDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YComboBoxDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YListDataType;
import org.lunifera.ecview.core.extension.model.datatypes.YNumericDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YOptionsGroupDataType;
import org.lunifera.ecview.core.extension.model.datatypes.YProgressBarDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTabSheetDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTableDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextAreaDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTreeDatatype;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField;
import org.lunifera.ecview.core.extension.model.extension.YBrowser;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.extension.model.extension.YCheckBox;
import org.lunifera.ecview.core.extension.model.extension.YComboBox;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.extension.model.extension.YDecimalField;
import org.lunifera.ecview.core.extension.model.extension.YFormLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout;
import org.lunifera.ecview.core.extension.model.extension.YImage;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
import org.lunifera.ecview.core.extension.model.extension.YList;
import org.lunifera.ecview.core.extension.model.extension.YMasterDetail;
import org.lunifera.ecview.core.extension.model.extension.YNumericField;
import org.lunifera.ecview.core.extension.model.extension.YNumericSearchField;
import org.lunifera.ecview.core.extension.model.extension.YOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YPanel;
import org.lunifera.ecview.core.extension.model.extension.YProgressBar;
import org.lunifera.ecview.core.extension.model.extension.YSearchPanel;
import org.lunifera.ecview.core.extension.model.extension.YSplitPanel;
import org.lunifera.ecview.core.extension.model.extension.YTab;
import org.lunifera.ecview.core.extension.model.extension.YTabSheet;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.extension.model.extension.YTextArea;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.core.extension.model.extension.YTextSearchField;
import org.lunifera.ecview.core.extension.model.extension.YTree;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayout;
import org.lunifera.ecview.core.ui.core.editparts.extension.IBooleanSearchFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IBrowserEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IButtonEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ICheckboxEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IDateTimeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IDecimalFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IFormLayoutEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IGridLayoutEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IHorizontalLayoutEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IImageEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ILabelEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IListEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IMasterDetailEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.INumericFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.INumericSearchFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IOptionsGroupEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IPanelEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IProgressBarEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ISearchPanelEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ISplitPanelEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITabEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITabSheetEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITableEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITextAreaEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITextFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITextSearchFieldEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITreeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.IVerticalLayoutEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IBrowserDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.ICheckBoxDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IComboBoxDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IDateTimeDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IDecimalDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IListDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.INumericDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IOptionsGroupDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.IProgressBarDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.ITabSheetDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.ITableDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.ITextAreaDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.ITextDatatypeEditpart;
import org.lunifera.ecview.core.ui.core.editparts.extension.datatypes.ITreeDatatypeEditpart;
import org.osgi.service.component.ComponentContext;

/**
 * An implementation of IEditPartManager for eObjects with
 * nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
@SuppressWarnings("restriction")
public class EditpartManager extends AbstractEditpartManager {

	protected void activate(ComponentContext context) {

	}

	protected void deactivate(ComponentContext context) {

	}

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(ExtensionModelPackage.eNS_URI)
					|| uriString.equals(ExtDatatypesPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(ExtensionModelPackage.eNS_URI)
					|| element.equals(ExtDatatypesPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		ElementEditpart<YElement> result = null;
		if (editPartClazz.isAssignableFrom(ITextFieldEditpart.class)) {
			result = createNewInstance(TextFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IGridLayoutEditpart.class)) {
			result = createNewInstance(GridLayoutEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IHorizontalLayoutEditpart.class)) {
			result = createNewInstance(HorizontalLayoutEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IVerticalLayoutEditpart.class)) {
			result = createNewInstance(VerticalLayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IFormLayoutEditpart.class)) {
			result = createNewInstance(FormLayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IListEditpart.class)) {
			result = createNewInstance(ListEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITableEditpart.class)) {
			result = createNewInstance(TableEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITreeEditpart.class)) {
			result = createNewInstance(TreeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IOptionsGroupEditpart.class)) {
			result = createNewInstance(OptionsGroupEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ILabelEditpart.class)) {
			result = createNewInstance(LabelEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITextAreaEditpart.class)) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IButtonEditpart.class)) {
			result = createNewInstance(ButtonEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ICheckboxEditpart.class)) {
			result = createNewInstance(CheckBoxEditpart.class);
		} else if (editPartClazz.isAssignableFrom(INumericFieldEditpart.class)) {
			result = createNewInstance(NumericFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IDecimalFieldEditpart.class)) {
			result = createNewInstance(DecimalFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IBrowserEditpart.class)) {
			result = createNewInstance(BrowserEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IDateTimeEditpart.class)) {
			result = createNewInstance(DateTimeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IProgressBarEditpart.class)) {
			result = createNewInstance(ProgressBarEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITabSheetEditpart.class)) {
			result = createNewInstance(TabSheetEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITabEditpart.class)) {
			result = createNewInstance(TabEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IBrowserDatatypeEditpart.class)) {
			result = createNewInstance(BrowserDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ICheckBoxDatatypeEditpart.class)) {
			result = createNewInstance(CheckBoxDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IComboBoxDatatypeEditpart.class)) {
			result = createNewInstance(ComboBoxDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IDateTimeDatatypeEditpart.class)) {
			result = createNewInstance(DateTimeDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IDecimalDatatypeEditpart.class)) {
			result = createNewInstance(DecimalDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IListDatatypeEditpart.class)) {
			result = createNewInstance(ListDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INumericDatatypeEditpart.class)) {
			result = createNewInstance(NumericDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IOptionsGroupDatatypeEditpart.class)) {
			result = createNewInstance(OptionsGroupDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IProgressBarDatatypeEditpart.class)) {
			result = createNewInstance(ProgressBarDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITableDatatypeEditpart.class)) {
			result = createNewInstance(TableDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ITabSheetDatatypeEditpart.class)) {
			result = createNewInstance(TabSheetDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ITextAreaDatatypeEditpart.class)) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITextDatatypeEditpart.class)) {
			result = createNewInstance(TextDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITreeDatatypeEditpart.class)) {
			result = createNewInstance(TreeDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IMasterDetailEditpart.class)) {
			result = createNewInstance(MasterDetailEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IImageEditpart.class)) {
			result = createNewInstance(ImageEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ITextSearchFieldEditpart.class)) {
			result = createNewInstance(TextSearchFieldEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INumericSearchFieldEditpart.class)) {
			result = createNewInstance(NumericSearchFieldEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IBooleanSearchFieldEditpart.class)) {
			result = createNewInstance(BooleanSearchFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ISplitPanelEditpart.class)) {
			result = createNewInstance(SplitPanelEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IPanelEditpart.class)) {
			result = createNewInstance(PanelEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ISearchPanelEditpart.class)) {
			result = createNewInstance(SearchPanelEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A>
	 *            an instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		ElementEditpart<YElement> result = null;
		if (yElement instanceof YTextField) {
			result = createNewInstance(TextFieldEditpart.class);
		} else if (yElement instanceof YGridLayout) {
			result = createNewInstance(GridLayoutEditpart.class);
		} else if (yElement instanceof YHorizontalLayout) {
			result = createNewInstance(HorizontalLayoutEditpart.class);
		} else if (yElement instanceof YVerticalLayout) {
			result = createNewInstance(VerticalLayoutEditpart.class);
		} else if (yElement instanceof YFormLayout) {
			result = createNewInstance(FormLayoutEditpart.class);
		} else if (yElement instanceof YTable) {
			result = createNewInstance(TableEditpart.class);
		} else if (yElement instanceof YTree) {
			result = createNewInstance(TreeEditpart.class);
		} else if (yElement instanceof YLabel) {
			result = createNewInstance(LabelEditpart.class);
		} else if (yElement instanceof YTextArea) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (yElement instanceof YButton) {
			result = createNewInstance(ButtonEditpart.class);
		} else if (yElement instanceof YCheckBox) {
			result = createNewInstance(CheckBoxEditpart.class);
		} else if (yElement instanceof YComboBox) {
			result = createNewInstance(ComboBoxEditpart.class);
		} else if (yElement instanceof YList) {
			result = createNewInstance(ListEditpart.class);
		} else if (yElement instanceof YOptionsGroup) {
			result = createNewInstance(OptionsGroupEditpart.class);
		} else if (yElement instanceof YNumericField) {
			result = createNewInstance(NumericFieldEditpart.class);
		} else if (yElement instanceof YDecimalField) {
			result = createNewInstance(DecimalFieldEditpart.class);
		} else if (yElement instanceof YDateTime) {
			result = createNewInstance(DateTimeEditpart.class);
		} else if (yElement instanceof YBrowser) {
			result = createNewInstance(BrowserEditpart.class);
		} else if (yElement instanceof YProgressBar) {
			result = createNewInstance(ProgressBarEditpart.class);
		} else if (yElement instanceof YTabSheet) {
			result = createNewInstance(TabSheetEditpart.class);
		} else if (yElement instanceof YTab) {
			result = createNewInstance(TabEditpart.class);
		} else if (yElement instanceof YBrowserDatatype) {
			result = createNewInstance(BrowserDatatypeEditpart.class);
		} else if (yElement instanceof YCheckBoxDatatype) {
			result = createNewInstance(CheckBoxDatatypeEditpart.class);
		} else if (yElement instanceof YComboBoxDatatype) {
			result = createNewInstance(ComboBoxDatatypeEditpart.class);
		} else if (yElement instanceof YDateTimeDatatype) {
			result = createNewInstance(DateTimeDatatypeEditpart.class);
		} else if (yElement instanceof YDecimalDatatype) {
			result = createNewInstance(DecimalDatatypeEditpart.class);
		} else if (yElement instanceof YListDataType) {
			result = createNewInstance(ListDatatypeEditpart.class);
		} else if (yElement instanceof YNumericDatatype) {
			result = createNewInstance(NumericDatatypeEditpart.class);
		} else if (yElement instanceof YOptionsGroupDataType) {
			result = createNewInstance(OptionsGroupDatatypeEditpart.class);
		} else if (yElement instanceof YProgressBarDatatype) {
			result = createNewInstance(ProgressBarDatatypeEditpart.class);
		} else if (yElement instanceof YTableDatatype) {
			result = createNewInstance(TableDatatypeEditpart.class);
		} else if (yElement instanceof YTabSheetDatatype) {
			result = createNewInstance(TabSheetDatatypeEditpart.class);
		} else if (yElement instanceof YTextAreaDatatype) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (yElement instanceof YTextDatatype) {
			result = createNewInstance(TextDatatypeEditpart.class);
		} else if (yElement instanceof YTreeDatatype) {
			result = createNewInstance(TreeDatatypeEditpart.class);
		} else if (yElement instanceof YMasterDetail) {
			result = createNewInstance(MasterDetailEditpart.class);
		} else if (yElement instanceof YImage) {
			result = createNewInstance(ImageEditpart.class);
		} else if (yElement instanceof YTextSearchField) {
			result = createNewInstance(TextSearchFieldEditpart.class);
		} else if (yElement instanceof YNumericSearchField) {
			result = createNewInstance(NumericSearchFieldEditpart.class);
		} else if (yElement instanceof YBooleanSearchField) {
			result = createNewInstance(BooleanSearchFieldEditpart.class);
		} else if (yElement instanceof YSplitPanel) {
			result = createNewInstance(SplitPanelEditpart.class);
		} else if (yElement instanceof YPanel) {
			result = createNewInstance(PanelEditpart.class);
		} else if (yElement instanceof YSearchPanel) {
			result = createNewInstance(SearchPanelEditpart.class);
		}

		if (result != null) {
			result.initialize((YElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            The type of the editpart for which an instance should be
	 *            created.
	 * @return editPart
	 * @throws InstantiationException
	 *             e
	 * @throws IllegalAccessException
	 *             e
	 */
	protected IElementEditpart newInstance(
			Class<? extends IElementEditpart> type)
			throws InstantiationException, IllegalAccessException {
		return type.newInstance();
	}
}
