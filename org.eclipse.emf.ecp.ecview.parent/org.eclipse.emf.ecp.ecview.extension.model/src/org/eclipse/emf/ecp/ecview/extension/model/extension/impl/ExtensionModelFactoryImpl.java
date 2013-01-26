/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ecview.extension.model.extension.*;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionModelFactoryImpl extends EFactoryImpl implements ExtensionModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtensionModelFactory init() {
		try {
			ExtensionModelFactory theExtensionModelFactory = (ExtensionModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipse.org/emf/ecp/ecview/extension/view"); 
			if (theExtensionModelFactory != null) {
				return theExtensionModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtensionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExtensionModelPackage.YTEXT_FIELD: return createYTextField();
			case ExtensionModelPackage.YGRID_LAYOUT: return createYGridLayout();
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE: return createYGridLayoutCellStyle();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT: return createYHorizontalLayout();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT_CELL_STYLE: return createYHorizontalLayoutCellStyle();
			case ExtensionModelPackage.YVERTICAL_LAYOUT: return createYVerticalLayout();
			case ExtensionModelPackage.YVERTICAL_LAYOUT_CELL_STYLE: return createYVerticalLayoutCellStyle();
			case ExtensionModelPackage.YSPAN_INFO: return createYSpanInfo();
			case ExtensionModelPackage.YTABLE: return createYTable();
			case ExtensionModelPackage.YLABEL: return createYLabel();
			case ExtensionModelPackage.YTEXT_AREA: return createYTextArea();
			case ExtensionModelPackage.YCHECK_BOX: return createYCheckBox();
			case ExtensionModelPackage.YDECIMAL_FIELD: return createYDecimalField();
			case ExtensionModelPackage.YNUMERIC_FIELD: return createYNumericField();
			case ExtensionModelPackage.YCOMBO_BOX: return createYComboBox();
			case ExtensionModelPackage.YLIST: return createYList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExtensionModelPackage.YALIGNMENT:
				return createYAlignmentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExtensionModelPackage.YALIGNMENT:
				return convertYAlignmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextField createYTextField() {
		YTextFieldImpl yTextField = new YTextFieldImpl();
		return yTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGridLayout createYGridLayout() {
		YGridLayoutImpl yGridLayout = new YGridLayoutImpl();
		return yGridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGridLayoutCellStyle createYGridLayoutCellStyle() {
		YGridLayoutCellStyleImpl yGridLayoutCellStyle = new YGridLayoutCellStyleImpl();
		return yGridLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayout createYHorizontalLayout() {
		YHorizontalLayoutImpl yHorizontalLayout = new YHorizontalLayoutImpl();
		return yHorizontalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayoutCellStyle createYHorizontalLayoutCellStyle() {
		YHorizontalLayoutCellStyleImpl yHorizontalLayoutCellStyle = new YHorizontalLayoutCellStyleImpl();
		return yHorizontalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVerticalLayout createYVerticalLayout() {
		YVerticalLayoutImpl yVerticalLayout = new YVerticalLayoutImpl();
		return yVerticalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVerticalLayoutCellStyle createYVerticalLayoutCellStyle() {
		YVerticalLayoutCellStyleImpl yVerticalLayoutCellStyle = new YVerticalLayoutCellStyleImpl();
		return yVerticalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSpanInfo createYSpanInfo() {
		YSpanInfoImpl ySpanInfo = new YSpanInfoImpl();
		return ySpanInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTable createYTable() {
		YTableImpl yTable = new YTableImpl();
		return yTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YLabel createYLabel() {
		YLabelImpl yLabel = new YLabelImpl();
		return yLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextArea createYTextArea() {
		YTextAreaImpl yTextArea = new YTextAreaImpl();
		return yTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCheckBox createYCheckBox() {
		YCheckBoxImpl yCheckBox = new YCheckBoxImpl();
		return yCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDecimalField createYDecimalField() {
		YDecimalFieldImpl yDecimalField = new YDecimalFieldImpl();
		return yDecimalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericField createYNumericField() {
		YNumericFieldImpl yNumericField = new YNumericFieldImpl();
		return yNumericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComboBox createYComboBox() {
		YComboBoxImpl yComboBox = new YComboBoxImpl();
		return yComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YList createYList() {
		YListImpl yList = new YListImpl();
		return yList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAlignment createYAlignmentFromString(EDataType eDataType, String initialValue) {
		YAlignment result = YAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelPackage getExtensionModelPackage() {
		return (ExtensionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtensionModelPackage getPackage() {
		return ExtensionModelPackage.eINSTANCE;
	}

} //ExtensionModelFactoryImpl