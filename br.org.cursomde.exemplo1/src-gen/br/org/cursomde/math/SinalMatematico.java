/**
 * generated by Xtext 2.12.0
 */
package br.org.cursomde.math;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sinal Matematico</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.org.cursomde.math.MathPackage#getSinalMatematico()
 * @model
 * @generated
 */
public enum SinalMatematico implements Enumerator
{
  /**
   * The '<em><b>SOMA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOMA_VALUE
   * @generated
   * @ordered
   */
  SOMA(0, "SOMA", "+"),

  /**
   * The '<em><b>SUBTRACAO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBTRACAO_VALUE
   * @generated
   * @ordered
   */
  SUBTRACAO(1, "SUBTRACAO", "-"),

  /**
   * The '<em><b>MULTIPLICACAO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULTIPLICACAO_VALUE
   * @generated
   * @ordered
   */
  MULTIPLICACAO(2, "MULTIPLICACAO", "*"),

  /**
   * The '<em><b>DIVISAO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIVISAO_VALUE
   * @generated
   * @ordered
   */
  DIVISAO(3, "DIVISAO", "/");

  /**
   * The '<em><b>SOMA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOMA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOMA
   * @model literal="+"
   * @generated
   * @ordered
   */
  public static final int SOMA_VALUE = 0;

  /**
   * The '<em><b>SUBTRACAO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUBTRACAO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBTRACAO
   * @model literal="-"
   * @generated
   * @ordered
   */
  public static final int SUBTRACAO_VALUE = 1;

  /**
   * The '<em><b>MULTIPLICACAO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MULTIPLICACAO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MULTIPLICACAO
   * @model literal="*"
   * @generated
   * @ordered
   */
  public static final int MULTIPLICACAO_VALUE = 2;

  /**
   * The '<em><b>DIVISAO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DIVISAO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIVISAO
   * @model literal="/"
   * @generated
   * @ordered
   */
  public static final int DIVISAO_VALUE = 3;

  /**
   * An array of all the '<em><b>Sinal Matematico</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SinalMatematico[] VALUES_ARRAY =
    new SinalMatematico[]
    {
      SOMA,
      SUBTRACAO,
      MULTIPLICACAO,
      DIVISAO,
    };

  /**
   * A public read-only list of all the '<em><b>Sinal Matematico</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SinalMatematico> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Sinal Matematico</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SinalMatematico get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SinalMatematico result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Sinal Matematico</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SinalMatematico getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SinalMatematico result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Sinal Matematico</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SinalMatematico get(int value)
  {
    switch (value)
    {
      case SOMA_VALUE: return SOMA;
      case SUBTRACAO_VALUE: return SUBTRACAO;
      case MULTIPLICACAO_VALUE: return MULTIPLICACAO;
      case DIVISAO_VALUE: return DIVISAO;
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
  private SinalMatematico(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //SinalMatematico
