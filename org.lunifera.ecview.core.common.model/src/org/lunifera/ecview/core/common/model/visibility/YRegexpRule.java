/**
 */
package org.lunifera.ecview.core.common.model.visibility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YRegexp Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.core.common.model.visibility.YRegexpRule#getRegExpression <em>Reg Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYRegexpRule()
 * @model abstract="true"
 * @generated
 */
public interface YRegexpRule extends YVisibilityRule {
	/**
	 * Returns the value of the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Expression</em>' attribute.
	 * @see #setRegExpression(String)
	 * @see org.lunifera.ecview.core.common.model.visibility.VisibilityPackage#getYRegexpRule_RegExpression()
	 * @model
	 * @generated
	 */
	String getRegExpression();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.core.common.model.visibility.YRegexpRule#getRegExpression <em>Reg Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Expression</em>' attribute.
	 * @see #getRegExpression()
	 * @generated
	 */
	void setRegExpression(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YVisibilityRuleBindingEndpoint createRuleEndpoint();

} // YRegexpRule
