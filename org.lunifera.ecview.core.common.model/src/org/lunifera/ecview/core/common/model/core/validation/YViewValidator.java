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
package org.lunifera.ecview.core.common.model.core.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.core.common.model.binding.YBindingSet;

import org.lunifera.ecview.core.common.model.core.YAlignment;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YCommandSet;
import org.lunifera.ecview.core.common.model.core.YDeviceType;
import org.lunifera.ecview.core.common.model.core.YDialog;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;
import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.common.model.core.YView}.
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

	boolean validateContentAlignment(YAlignment value);

	boolean validateVisibilityProcessors(EList<YVisibilityProcessor> value);

	boolean validateExposedActions(EList<YExposedAction> value);

	boolean validateExposedActions(YExposedAction value);

	boolean validateVisibilityProcessor(EList<YVisibilityProcessor> value);

	boolean validateCommandSet(EList<YCommandSet> value);

	boolean validateOrphanDatatypes(EList<YDatatype> value);

	boolean validateOrphanDatadescriptions(EList<YDatadescription> value);
}
