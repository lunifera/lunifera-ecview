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
package org.lunifera.ecview.core.extension.model.datatypes;

import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YText Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage#getYTextDatatype()
 * @model
 * @generated
 */
public interface YTextDatatype extends YDatatype, YMaxLengthValidationConfig, YMinLengthValidationConfig, YRegexpValidationConfig {

} // YTextDatatype
