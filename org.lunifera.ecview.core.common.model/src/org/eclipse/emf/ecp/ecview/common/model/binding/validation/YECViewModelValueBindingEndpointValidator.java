/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.common.model.binding.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YECViewModelValueBindingEndpointValidator {
	boolean validate();

	boolean validateElement(EObject value);
	boolean validateFeatures(EList<EStructuralFeature> value);
	boolean validatePropertyPath(String value);
	boolean validateType(Class<?> value);
	boolean validateTypeQualifiedName(String value);

	boolean validateEmfNsURI(String value);
}
