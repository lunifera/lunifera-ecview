/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.validation;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YNumericFieldValidator {
	boolean validate();

	boolean validateDatatype(YNumericDatatype value);
	boolean validateDatadescription(YDatadescription value);
	boolean validateValue(long value);

	boolean validateGrouping(boolean value);

	boolean validateMarkNegative(boolean value);
}
