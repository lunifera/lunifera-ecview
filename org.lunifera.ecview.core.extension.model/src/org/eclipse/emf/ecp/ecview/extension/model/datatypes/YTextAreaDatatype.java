/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.extension.model.datatypes;

import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidationConfig;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidationConfig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YText Area Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.lunifera.ecview.core.extension.model.datatypes.ExtDatatypesPackage#getYTextAreaDatatype()
 * @model
 * @generated
 */
public interface YTextAreaDatatype extends YDatatype, YMinLengthValidationConfig, YMaxLengthValidationConfig, YRegexpValidationConfig {
} // YTextAreaDatatype
