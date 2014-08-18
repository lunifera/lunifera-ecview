/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YComboBoxDatatype;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YComboBoxValidator {
	boolean validate();

	boolean validateDatadescription(YDatadescription value);
	boolean validateDatatype(YComboBoxDatatype value);
	boolean validateSelection(Object value);
	boolean validateCollection(EList<Object> value);
	boolean validateType(Class<?> value);
	boolean validateEmfNsURI(String value);

	boolean validateTypeQualifiedName(String value);

	boolean validateItemCaptionProperty(String value);

	boolean validateItemImageProperty(String value);

	boolean validateRowCaptionProperty(String value);

	boolean validateRowImageProperty(String value);
}
