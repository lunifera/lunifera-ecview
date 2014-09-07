package org.lunifera.ecview.core.extension.model.extension.util;

import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.util.SimpleCoreModelFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;
import org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory;
import org.lunifera.ecview.core.extension.model.datatypes.YCheckBoxDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YComboBoxDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YListDataType;
import org.lunifera.ecview.core.extension.model.datatypes.YNumericDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YProgressBarDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTableDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextAreaDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTreeDatatype;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YBrowser;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.extension.model.extension.YCheckBox;
import org.lunifera.ecview.core.extension.model.extension.YColumn;
import org.lunifera.ecview.core.extension.model.extension.YComboBox;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.extension.model.extension.YDecimalField;
import org.lunifera.ecview.core.extension.model.extension.YFormLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YImage;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
import org.lunifera.ecview.core.extension.model.extension.YList;
import org.lunifera.ecview.core.extension.model.extension.YMasterDetail;
import org.lunifera.ecview.core.extension.model.extension.YNumericField;
import org.lunifera.ecview.core.extension.model.extension.YOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YPanel;
import org.lunifera.ecview.core.extension.model.extension.YProgressBar;
import org.lunifera.ecview.core.extension.model.extension.YSpanInfo;
import org.lunifera.ecview.core.extension.model.extension.YSplitPanel;
import org.lunifera.ecview.core.extension.model.extension.YTab;
import org.lunifera.ecview.core.extension.model.extension.YTabSheet;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.extension.model.extension.YTextArea;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.core.extension.model.extension.YTree;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayout;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle;

public class SimpleExtensionModelFactory extends SimpleCoreModelFactory {

	private ExtensionModelFactory factory = ExtensionModelFactory.eINSTANCE;
	private ExtDatatypesFactory dtFactory = ExtDatatypesFactory.eINSTANCE;

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYTextField()
	 */
	public YTextField createTextField() {
		return factory.createYTextField();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYImage()
	 */
	public YImage createImage() {
		return factory.createYImage();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYProgressBar()
	 */
	public YProgressBar createProgressBar() {
		return factory.createYProgressBar();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYGridLayout()
	 */
	public YGridLayout createGridLayout() {
		return factory.createYGridLayout();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYGridLayoutCellStyle()
	 */
	public YGridLayoutCellStyle createGridLayoutCellStyle() {
		return factory.createYGridLayoutCellStyle();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYHorizontalLayout()
	 */
	public YHorizontalLayout createHorizontalLayout() {
		return factory.createYHorizontalLayout();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYHorizontalLayoutCellStyle()
	 */
	public YHorizontalLayoutCellStyle createHorizontalLayoutCellStyle() {
		return factory.createYHorizontalLayoutCellStyle();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYVerticalLayout()
	 */
	public YVerticalLayout createVerticalLayout() {
		return factory.createYVerticalLayout();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYFormLayout()
	 */
	public YFormLayout createFormLayout() {
		return factory.createYFormLayout();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYVerticalLayoutCellStyle()
	 */
	public YVerticalLayoutCellStyle createVerticalLayoutCellStyle() {
		return factory.createYVerticalLayoutCellStyle();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYSpanInfo()
	 */
	public YSpanInfo createSpanInfo() {
		return factory.createYSpanInfo();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYTable()
	 */
	public YTable createTable() {
		return factory.createYTable();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#creatYColumn()
	 */
	public YColumn createColumn() {
		return ExtensionModelFactory.eINSTANCE.createYColumn();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYTable()
	 */
	public YTabSheet createTabSheet() {
		return factory.createYTabSheet();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYTable()
	 */
	public YTab createTab() {
		return factory.createYTab();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYTree()
	 */
	public YTree createTree() {
		return factory.createYTree();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYLabel()
	 */
	public YLabel createLabel() {
		return factory.createYLabel();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYTextArea()
	 */
	public YTextArea createTextArea() {
		return factory.createYTextArea();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYBrowser()
	 */
	public YBrowser createBrowser() {
		return factory.createYBrowser();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYDateTime()
	 */
	public YDateTime createDateTime() {
		return factory.createYDateTime();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYCheckBox()
	 */
	public YCheckBox createCheckBox() {
		return factory.createYCheckBox();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYDecimalField()
	 */
	public YDecimalField createDecimalField() {
		return factory.createYDecimalField();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYNumericField()
	 */
	public YNumericField createNumericField() {
		return factory.createYNumericField();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYComboBox()
	 */
	public YComboBox createComboBox() {
		return factory.createYComboBox();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYList()
	 */
	public YList createList() {
		return factory.createYList();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYOptionsGroup()
	 */
	public YOptionsGroup createOptionsGroup() {
		return factory.createYOptionsGroup();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory#createYButton()
	 */
	public YButton createButton() {
		return factory.createYButton();
	}
	
	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYSplitPanel()
	 */
	public YSplitPanel createSplitPanel() {
		return factory.createYSplitPanel();
	}
	
	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYPanel()
	 */
	public YPanel createPanel() {
		return factory.createYPanel();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYTextDatatype()
	 */
	public YTextDatatype createTextDatatype() {
		return dtFactory.createYTextDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYProgressBarDatatype()
	 */
	public YProgressBarDatatype createProgressBarDatatype() {
		return dtFactory.createYProgressBarDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYTextAreaDatatype()
	 */
	public YTextAreaDatatype createTextAreaDatatype() {
		return dtFactory.createYTextAreaDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYNumericDatatype()
	 */
	public YNumericDatatype createNumericDatatype() {
		return dtFactory.createYNumericDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYDecimalDatatype()
	 */
	public YDecimalDatatype createDecimalDatatype() {
		return dtFactory.createYDecimalDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYTableDatatype()
	 */
	public YTableDatatype createTableDatatype() {
		return dtFactory.createYTableDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYTreeDatatype()
	 */
	public YTreeDatatype createTreeDatatype() {
		return dtFactory.createYTreeDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYCheckBoxDatatype()
	 */
	public YCheckBoxDatatype createCheckBoxDatatype() {
		return dtFactory.createYCheckBoxDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYComboBoxDatatype()
	 */
	public YComboBoxDatatype createComboBoxDatatype() {
		return dtFactory.createYComboBoxDatatype();
	}

	/**
	 * @return
	 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesFactory#createYListDataType()
	 */
	public YListDataType createListDataType() {
		return dtFactory.createYListDataType();
	}
	
	/**
	 * Creates an instance of {@link YHorizontalLayoutCellStyle}.
	 * 
	 * @param yComponent
	 *            set as target
	 * @param yLayout
	 *            style added to this layout
	 * @return
	 */
	public YHorizontalLayoutCellStyle createHorizontalLayoutCellStyle(
			YEmbeddable yComponent, YHorizontalLayout yLayout) {
		YHorizontalLayoutCellStyle yStyle = ExtensionModelFactory.eINSTANCE
				.createYHorizontalLayoutCellStyle();
		yStyle.setTarget(yComponent);
		yLayout.getCellStyles().add(yStyle);
		return yStyle;
	}

	/**
	 * Creates an instance of {@link YVerticalLayoutCellStyle}.
	 * 
	 * @param yComponent
	 *            set as target
	 * @param yLayout
	 *            style added to this layout
	 * @return
	 */
	public YVerticalLayoutCellStyle createVerticalLayoutCellStyle(
			YEmbeddable yComponent, YVerticalLayout yLayout) {
		YVerticalLayoutCellStyle yStyle = ExtensionModelFactory.eINSTANCE
				.createYVerticalLayoutCellStyle();
		yStyle.setTarget(yComponent);
		yLayout.getCellStyles().add(yStyle);
		return yStyle;
	}

	/**
	 * Returns a master detail element.
	 * 
	 * @return
	 */
	public YMasterDetail createMasterDetail() {
		return ExtensionModelFactory.eINSTANCE.createYMasterDetail();
	}

	public YMaxLengthValidator createMaxLengthValidator() {
		return ValidationFactory.eINSTANCE.createYMaxLengthValidator();
	}

	public YMinLengthValidator createMinLengthValidator() {
		return ValidationFactory.eINSTANCE.createYMinLengthValidator();
	}

	public YRegexpValidator createRegexpValidator() {
		return ValidationFactory.eINSTANCE.createYRegexpValidator();
	}

	public YClassDelegateValidator createClassDelegateValidator() {
		return ValidationFactory.eINSTANCE.createYClassDelegateValidator();
	}

}
