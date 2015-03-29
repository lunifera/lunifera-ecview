/**
 */
package org.lunifera.ecview.core.common.model.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Key Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getKeyCode()
 * @model
 * @generated
 */
public enum KeyCode implements Enumerator {
	/**
	 * The '<em><b>ENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTER(13, "ENTER", "ENTER"),

	/**
	 * The '<em><b>ESCAPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	ESCAPE(27, "ESCAPE", "ESCAPE"),

	/**
	 * The '<em><b>PAGE UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_UP_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_UP(33, "PAGE_UP", "PAGE_UP"),

	/**
	 * The '<em><b>PAGE DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_DOWN(34, "PAGE_DOWN", "PAGE_DOWN"),

	/**
	 * The '<em><b>TAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB_VALUE
	 * @generated
	 * @ordered
	 */
	TAB(9, "TAB", "TAB"),

	/**
	 * The '<em><b>ARROW LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_LEFT(37, "ARROW_LEFT", "ARROW_LEFT"),

	/**
	 * The '<em><b>ARROW UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_UP_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_UP(38, "ARROW_UP", "ARROW_UP"),

	/**
	 * The '<em><b>ARROW RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_RIGHT(39, "ARROW_RIGHT", "ARROW_RIGHT"),

	/**
	 * The '<em><b>ARROW DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_DOWN(40, "ARROW_DOWN", "ARROW_DOWN"),

	/**
	 * The '<em><b>BACKSPACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	BACKSPACE(8, "BACKSPACE", "BACKSPACE"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(46, "DELETE", "DELETE"),

	/**
	 * The '<em><b>INSERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(45, "INSERT", "INSERT"),

	/**
	 * The '<em><b>END</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_VALUE
	 * @generated
	 * @ordered
	 */
	END(35, "END", "END"),

	/**
	 * The '<em><b>HOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(36, "HOME", "HOME"),

	/**
	 * The '<em><b>F1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F1_VALUE
	 * @generated
	 * @ordered
	 */
	F1(112, "F1", "F1"),

	/**
	 * The '<em><b>F2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F2_VALUE
	 * @generated
	 * @ordered
	 */
	F2(113, "F2", "F2"),

	/**
	 * The '<em><b>F3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F3_VALUE
	 * @generated
	 * @ordered
	 */
	F3(114, "F3", "F3"),

	/**
	 * The '<em><b>F4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F4_VALUE
	 * @generated
	 * @ordered
	 */
	F4(115, "F4", "F4"),

	/**
	 * The '<em><b>F5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F5_VALUE
	 * @generated
	 * @ordered
	 */
	F5(116, "F5", "F5"),

	/**
	 * The '<em><b>F6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F6_VALUE
	 * @generated
	 * @ordered
	 */
	F6(117, "F6", "F6"),

	/**
	 * The '<em><b>F7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F7_VALUE
	 * @generated
	 * @ordered
	 */
	F7(118, "F7", "F7"),

	/**
	 * The '<em><b>F8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F8_VALUE
	 * @generated
	 * @ordered
	 */
	F8(119, "F8", "F8"),

	/**
	 * The '<em><b>F9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F9_VALUE
	 * @generated
	 * @ordered
	 */
	F9(120, "F9", "F9"),

	/**
	 * The '<em><b>F10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F10_VALUE
	 * @generated
	 * @ordered
	 */
	F10(121, "F10", "F10"),

	/**
	 * The '<em><b>F11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F11_VALUE
	 * @generated
	 * @ordered
	 */
	F11(122, "F11", "F11"),

	/**
	 * The '<em><b>F12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F12_VALUE
	 * @generated
	 * @ordered
	 */
	F12(123, "F12", "F12"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(65, "A", "A"),

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(66, "B", "B"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(67, "C", "C"),

	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(68, "D", "D"),

	/**
	 * The '<em><b>E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E_VALUE
	 * @generated
	 * @ordered
	 */
	E(69, "E", "E"),

	/**
	 * The '<em><b>F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F_VALUE
	 * @generated
	 * @ordered
	 */
	F(70, "F", "F"),

	/**
	 * The '<em><b>G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #G_VALUE
	 * @generated
	 * @ordered
	 */
	G(71, "G", "G"),

	/**
	 * The '<em><b>H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H_VALUE
	 * @generated
	 * @ordered
	 */
	H(72, "H", "H"),

	/**
	 * The '<em><b>I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I_VALUE
	 * @generated
	 * @ordered
	 */
	I(73, "I", "I"),

	/**
	 * The '<em><b>J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #J_VALUE
	 * @generated
	 * @ordered
	 */
	J(74, "J", "J"),

	/**
	 * The '<em><b>K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #K_VALUE
	 * @generated
	 * @ordered
	 */
	K(75, "K", "K"),

	/**
	 * The '<em><b>L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L_VALUE
	 * @generated
	 * @ordered
	 */
	L(76, "L", "L"),

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(77, "M", "M"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(78, "N", "N"),

	/**
	 * The '<em><b>O</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O_VALUE
	 * @generated
	 * @ordered
	 */
	O(79, "O", "O"),

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P_VALUE
	 * @generated
	 * @ordered
	 */
	P(80, "P", "P"),

	/**
	 * The '<em><b>Q</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Q_VALUE
	 * @generated
	 * @ordered
	 */
	Q(81, "Q", "Q"),

	/**
	 * The '<em><b>R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R_VALUE
	 * @generated
	 * @ordered
	 */
	R(82, "R", "R"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(83, "S", "S"),

	/**
	 * The '<em><b>T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T_VALUE
	 * @generated
	 * @ordered
	 */
	T(84, "T", "T"),

	/**
	 * The '<em><b>U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U_VALUE
	 * @generated
	 * @ordered
	 */
	U(85, "U", "U"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(86, "V", "V"),

	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(87, "W", "W"),

	/**
	 * The '<em><b>X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X_VALUE
	 * @generated
	 * @ordered
	 */
	X(88, "X", "X"),

	/**
	 * The '<em><b>Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Y_VALUE
	 * @generated
	 * @ordered
	 */
	Y(89, "Y", "Y"),

	/**
	 * The '<em><b>Z</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Z_VALUE
	 * @generated
	 * @ordered
	 */
	Z(90, "Z", "Z"),

	/**
	 * The '<em><b>NUM0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM0_VALUE
	 * @generated
	 * @ordered
	 */
	NUM0(48, "NUM0", "NUM0"),

	/**
	 * The '<em><b>NUM1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM1_VALUE
	 * @generated
	 * @ordered
	 */
	NUM1(49, "NUM1", "NUM1"),

	/**
	 * The '<em><b>NUM2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM2_VALUE
	 * @generated
	 * @ordered
	 */
	NUM2(50, "NUM2", "NUM2"),

	/**
	 * The '<em><b>NUM3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM3_VALUE
	 * @generated
	 * @ordered
	 */
	NUM3(51, "NUM3", "NUM3"),

	/**
	 * The '<em><b>NUM4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM4_VALUE
	 * @generated
	 * @ordered
	 */
	NUM4(52, "NUM4", "NUM4"),

	/**
	 * The '<em><b>NUM5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM5_VALUE
	 * @generated
	 * @ordered
	 */
	NUM5(53, "NUM5", "NUM5"),

	/**
	 * The '<em><b>NUM6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM6_VALUE
	 * @generated
	 * @ordered
	 */
	NUM6(54, "NUM6", "NUM6"),

	/**
	 * The '<em><b>NUM7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM7_VALUE
	 * @generated
	 * @ordered
	 */
	NUM7(55, "NUM7", "NUM7"),

	/**
	 * The '<em><b>NUM8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM8_VALUE
	 * @generated
	 * @ordered
	 */
	NUM8(56, "NUM8", "NUM8"),

	/**
	 * The '<em><b>NUM9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM9_VALUE
	 * @generated
	 * @ordered
	 */
	NUM9(57, "NUM9", "NUM9"),

	/**
	 * The '<em><b>SPACEBAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACEBAR_VALUE
	 * @generated
	 * @ordered
	 */
	SPACEBAR(32, "SPACEBAR", "SPACEBAR");

	/**
	 * The '<em><b>ENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTER_VALUE = 13;

	/**
	 * The '<em><b>ESCAPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESCAPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESCAPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESCAPE_VALUE = 27;

	/**
	 * The '<em><b>PAGE UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGE UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_UP_VALUE = 33;

	/**
	 * The '<em><b>PAGE DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGE DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_DOWN_VALUE = 34;

	/**
	 * The '<em><b>TAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAB_VALUE = 9;

	/**
	 * The '<em><b>ARROW LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_LEFT_VALUE = 37;

	/**
	 * The '<em><b>ARROW UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_UP_VALUE = 38;

	/**
	 * The '<em><b>ARROW RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_RIGHT_VALUE = 39;

	/**
	 * The '<em><b>ARROW DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_DOWN_VALUE = 40;

	/**
	 * The '<em><b>BACKSPACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BACKSPACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKSPACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BACKSPACE_VALUE = 8;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 46;

	/**
	 * The '<em><b>INSERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 45;

	/**
	 * The '<em><b>END</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>END</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_VALUE = 35;

	/**
	 * The '<em><b>HOME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 36;

	/**
	 * The '<em><b>F1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F1_VALUE = 112;

	/**
	 * The '<em><b>F2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F2_VALUE = 113;

	/**
	 * The '<em><b>F3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F3_VALUE = 114;

	/**
	 * The '<em><b>F4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F4_VALUE = 115;

	/**
	 * The '<em><b>F5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F5_VALUE = 116;

	/**
	 * The '<em><b>F6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F6
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F6_VALUE = 117;

	/**
	 * The '<em><b>F7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F7_VALUE = 118;

	/**
	 * The '<em><b>F8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F8_VALUE = 119;

	/**
	 * The '<em><b>F9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F9
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F9_VALUE = 120;

	/**
	 * The '<em><b>F10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F10
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F10_VALUE = 121;

	/**
	 * The '<em><b>F11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F11
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F11_VALUE = 122;

	/**
	 * The '<em><b>F12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F12</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F12
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F12_VALUE = 123;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 65;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 66;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 67;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 68;

	/**
	 * The '<em><b>E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E_VALUE = 69;

	/**
	 * The '<em><b>F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F_VALUE = 70;

	/**
	 * The '<em><b>G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #G
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int G_VALUE = 71;

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #H
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H_VALUE = 72;

	/**
	 * The '<em><b>I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I_VALUE = 73;

	/**
	 * The '<em><b>J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>J</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #J
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int J_VALUE = 74;

	/**
	 * The '<em><b>K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>K</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #K
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int K_VALUE = 75;

	/**
	 * The '<em><b>L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>L</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #L
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L_VALUE = 76;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 77;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 78;

	/**
	 * The '<em><b>O</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>O</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #O
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int O_VALUE = 79;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #P
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P_VALUE = 80;

	/**
	 * The '<em><b>Q</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Q</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #Q
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int Q_VALUE = 81;

	/**
	 * The '<em><b>R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #R
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R_VALUE = 82;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 83;

	/**
	 * The '<em><b>T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T_VALUE = 84;

	/**
	 * The '<em><b>U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int U_VALUE = 85;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 86;

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>W</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 87;

	/**
	 * The '<em><b>X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X_VALUE = 88;

	/**
	 * The '<em><b>Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #Y
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int Y_VALUE = 89;

	/**
	 * The '<em><b>Z</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Z</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #Z
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int Z_VALUE = 90;

	/**
	 * The '<em><b>NUM0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM0_VALUE = 48;

	/**
	 * The '<em><b>NUM1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM1_VALUE = 49;

	/**
	 * The '<em><b>NUM2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM2_VALUE = 50;

	/**
	 * The '<em><b>NUM3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM3_VALUE = 51;

	/**
	 * The '<em><b>NUM4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM4_VALUE = 52;

	/**
	 * The '<em><b>NUM5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM5_VALUE = 53;

	/**
	 * The '<em><b>NUM6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM6
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM6_VALUE = 54;

	/**
	 * The '<em><b>NUM7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM7_VALUE = 55;

	/**
	 * The '<em><b>NUM8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM8_VALUE = 56;

	/**
	 * The '<em><b>NUM9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM9
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM9_VALUE = 57;

	/**
	 * The '<em><b>SPACEBAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPACEBAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPACEBAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPACEBAR_VALUE = 32;

	/**
	 * An array of all the '<em><b>Key Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KeyCode[] VALUES_ARRAY =
		new KeyCode[] {
			ENTER,
			ESCAPE,
			PAGE_UP,
			PAGE_DOWN,
			TAB,
			ARROW_LEFT,
			ARROW_UP,
			ARROW_RIGHT,
			ARROW_DOWN,
			BACKSPACE,
			DELETE,
			INSERT,
			END,
			HOME,
			F1,
			F2,
			F3,
			F4,
			F5,
			F6,
			F7,
			F8,
			F9,
			F10,
			F11,
			F12,
			A,
			B,
			C,
			D,
			E,
			F,
			G,
			H,
			I,
			J,
			K,
			L,
			M,
			N,
			O,
			P,
			Q,
			R,
			S,
			T,
			U,
			V,
			W,
			X,
			Y,
			Z,
			NUM0,
			NUM1,
			NUM2,
			NUM3,
			NUM4,
			NUM5,
			NUM6,
			NUM7,
			NUM8,
			NUM9,
			SPACEBAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Key Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KeyCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Key Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyCode get(int value) {
		switch (value) {
			case ENTER_VALUE: return ENTER;
			case ESCAPE_VALUE: return ESCAPE;
			case PAGE_UP_VALUE: return PAGE_UP;
			case PAGE_DOWN_VALUE: return PAGE_DOWN;
			case TAB_VALUE: return TAB;
			case ARROW_LEFT_VALUE: return ARROW_LEFT;
			case ARROW_UP_VALUE: return ARROW_UP;
			case ARROW_RIGHT_VALUE: return ARROW_RIGHT;
			case ARROW_DOWN_VALUE: return ARROW_DOWN;
			case BACKSPACE_VALUE: return BACKSPACE;
			case DELETE_VALUE: return DELETE;
			case INSERT_VALUE: return INSERT;
			case END_VALUE: return END;
			case HOME_VALUE: return HOME;
			case F1_VALUE: return F1;
			case F2_VALUE: return F2;
			case F3_VALUE: return F3;
			case F4_VALUE: return F4;
			case F5_VALUE: return F5;
			case F6_VALUE: return F6;
			case F7_VALUE: return F7;
			case F8_VALUE: return F8;
			case F9_VALUE: return F9;
			case F10_VALUE: return F10;
			case F11_VALUE: return F11;
			case F12_VALUE: return F12;
			case A_VALUE: return A;
			case B_VALUE: return B;
			case C_VALUE: return C;
			case D_VALUE: return D;
			case E_VALUE: return E;
			case F_VALUE: return F;
			case G_VALUE: return G;
			case H_VALUE: return H;
			case I_VALUE: return I;
			case J_VALUE: return J;
			case K_VALUE: return K;
			case L_VALUE: return L;
			case M_VALUE: return M;
			case N_VALUE: return N;
			case O_VALUE: return O;
			case P_VALUE: return P;
			case Q_VALUE: return Q;
			case R_VALUE: return R;
			case S_VALUE: return S;
			case T_VALUE: return T;
			case U_VALUE: return U;
			case V_VALUE: return V;
			case W_VALUE: return W;
			case X_VALUE: return X;
			case Y_VALUE: return Y;
			case Z_VALUE: return Z;
			case NUM0_VALUE: return NUM0;
			case NUM1_VALUE: return NUM1;
			case NUM2_VALUE: return NUM2;
			case NUM3_VALUE: return NUM3;
			case NUM4_VALUE: return NUM4;
			case NUM5_VALUE: return NUM5;
			case NUM6_VALUE: return NUM6;
			case NUM7_VALUE: return NUM7;
			case NUM8_VALUE: return NUM8;
			case NUM9_VALUE: return NUM9;
			case SPACEBAR_VALUE: return SPACEBAR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private KeyCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //KeyCode
