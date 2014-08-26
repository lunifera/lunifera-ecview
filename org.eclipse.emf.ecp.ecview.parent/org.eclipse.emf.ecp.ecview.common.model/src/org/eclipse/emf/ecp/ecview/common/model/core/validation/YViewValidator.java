/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.common.model.core.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;

import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YCommandSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YDeviceType;
import org.eclipse.emf.ecp.ecview.common.model.core.YDialog;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.common.model.core.YView}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YViewValidator {
	boolean validate();

	boolean validateRoot(YViewSet value);
	boolean validateViewName(String value);
	boolean validateContent(YEmbeddable value);
	boolean validateBindingSet(YBindingSet value);
	boolean validateBeanSlots(EList<YBeanSlot> value);

	boolean validateCommandSet(YCommandSet value);

	boolean validateDialogs(EList<YDialog> value);

	boolean validateDeviceType(YDeviceType value);

	boolean validateCommandSet(EList<YCommandSet> value);

	boolean validateOrphanDatatypes(EList<YDatatype> value);

	boolean validateOrphanDatadescriptions(EList<YDatadescription> value);
}
