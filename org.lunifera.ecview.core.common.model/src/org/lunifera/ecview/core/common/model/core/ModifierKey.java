/**
 */
package org.lunifera.ecview.core.common.model.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modifier Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.common.model.core.CoreModelPackage#getModifierKey()
 * @model
 * @generated
 */
public enum ModifierKey implements Enumerator {
	/**
	 * The '<em><b>SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	SHIFT(16, "SHIFT", "SHIFT"),

	/**
	 * The '<em><b>CTRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTRL_VALUE
	 * @generated
	 * @ordered
	 */
	CTRL(17, "CTRL", "CTRL"),

	/**
	 * The '<em><b>ALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT_VALUE
	 * @generated
	 * @ordered
	 */
	ALT(18, "ALT", "ALT"),

	/**
	 * The '<em><b>META</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(91, "META", "META");

	/**
	 * The '<em><b>SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHIFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHIFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_VALUE = 16;

	/**
	 * The '<em><b>CTRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CTRL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CTRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTRL_VALUE = 17;

	/**
	 * The '<em><b>ALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALT_VALUE = 18;

	/**
	 * The '<em><b>META</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>META</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #META
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 91;

	/**
	 * An array of all the '<em><b>Modifier Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModifierKey[] VALUES_ARRAY =
		new ModifierKey[] {
			SHIFT,
			CTRL,
			ALT,
			META,
		};

	/**
	 * A public read-only list of all the '<em><b>Modifier Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModifierKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modifier Key</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModifierKey get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModifierKey result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modifier Key</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModifierKey getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModifierKey result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modifier Key</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModifierKey get(int value) {
		switch (value) {
			case SHIFT_VALUE: return SHIFT;
			case CTRL_VALUE: return CTRL;
			case ALT_VALUE: return ALT;
			case META_VALUE: return META;
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
	private ModifierKey(int value, String name, String literal) {
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
	
} //ModifierKey
