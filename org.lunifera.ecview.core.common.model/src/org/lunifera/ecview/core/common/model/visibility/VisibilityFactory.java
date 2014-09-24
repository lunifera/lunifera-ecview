/**
 */
package org.lunifera.ecview.core.common.model.visibility;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage
 * @generated
 */
public interface VisibilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisibilityFactory eINSTANCE = org.lunifera.ecview.core.common.model.visibility.impl.VisibilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YVisibility Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YVisibility Processor</em>'.
	 * @generated
	 */
	YVisibilityProcessor createYVisibilityProcessor();

	/**
	 * Returns a new object of class '<em>YVisibility Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YVisibility Properties</em>'.
	 * @generated
	 */
	YVisibilityProperties createYVisibilityProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisibilityPackage getVisibilityPackage();

} //VisibilityFactory
