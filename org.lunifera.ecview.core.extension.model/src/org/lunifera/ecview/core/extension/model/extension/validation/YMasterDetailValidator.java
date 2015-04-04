/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.core.extension.model.extension.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.core.common.model.core.YEmbeddable;

import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

import org.lunifera.ecview.core.extension.model.datatypes.YMasterDetailDatatype;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YMasterDetailValidator {
	boolean validate();

	boolean validateDatatype(YMasterDetailDatatype value);
	boolean validateDatadescription(YDatadescription value);
	boolean validateSelection(Object value);
	boolean validateCollection(EList<Object> value);
	boolean validateType(Class<?> value);
	boolean validateEmfNsURI(String value);
	boolean validateMasterElement(YEmbeddable value);
	boolean validateDetailElement(YEmbeddable value);
	boolean validateTypeQualifiedName(String value);
}
