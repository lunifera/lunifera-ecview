/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.common.model.core.validation;

import org.eclipse.emf.ecp.ecview.common.model.core.YUnit;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.common.model.core.YWidthable}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YWidthableValidator {
	boolean validate();

	boolean validateWidth(int value);
	boolean validateWidthUnit(YUnit value);
}
