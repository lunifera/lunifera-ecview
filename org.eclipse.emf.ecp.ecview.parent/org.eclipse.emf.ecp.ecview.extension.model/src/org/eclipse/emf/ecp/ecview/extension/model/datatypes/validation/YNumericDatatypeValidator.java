/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes.validation;


/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YNumericDatatypeValidator {
	boolean validate();

	boolean validateGrouping(boolean value);
	boolean validateMarkNegative(boolean value);
}
