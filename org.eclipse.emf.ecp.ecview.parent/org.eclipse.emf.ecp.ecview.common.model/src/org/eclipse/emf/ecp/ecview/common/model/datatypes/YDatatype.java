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
package org.eclipse.emf.ecp.ecview.common.model.datatypes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDatatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype#getValidators <em>Validators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage#getYDatatype()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YDatatype extends YDtBase {

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.validation.YValidator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validators</em>' reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage#getYDatatype_Validators()
	 * @model
	 * @generated
	 */
	EList<YValidator> getValidators();
} // YDatatype