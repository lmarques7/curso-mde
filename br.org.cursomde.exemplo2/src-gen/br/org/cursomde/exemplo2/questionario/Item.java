/**
 */
package br.org.cursomde.exemplo2.questionario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Item#getMensagem <em>Mensagem</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Item#isInicio <em>Inicio</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Item#isFim <em>Fim</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Item#getAlternativas <em>Alternativas</em>}</li>
 * </ul>
 *
 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Mensagem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mensagem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensagem</em>' attribute.
	 * @see #setMensagem(String)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getItem_Mensagem()
	 * @model
	 * @generated
	 */
	String getMensagem();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Item#getMensagem <em>Mensagem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mensagem</em>' attribute.
	 * @see #getMensagem()
	 * @generated
	 */
	void setMensagem(String value);

	/**
	 * Returns the value of the '<em><b>Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio</em>' attribute.
	 * @see #setInicio(boolean)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getItem_Inicio()
	 * @model
	 * @generated
	 */
	boolean isInicio();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Item#isInicio <em>Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio</em>' attribute.
	 * @see #isInicio()
	 * @generated
	 */
	void setInicio(boolean value);

	/**
	 * Returns the value of the '<em><b>Fim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fim</em>' attribute.
	 * @see #setFim(boolean)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getItem_Fim()
	 * @model
	 * @generated
	 */
	boolean isFim();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Item#isFim <em>Fim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fim</em>' attribute.
	 * @see #isFim()
	 * @generated
	 */
	void setFim(boolean value);

	/**
	 * Returns the value of the '<em><b>Alternativas</b></em>' containment reference list.
	 * The list contents are of type {@link br.org.cursomde.exemplo2.questionario.Resposta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternativas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativas</em>' containment reference list.
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getItem_Alternativas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resposta> getAlternativas();

} // Item
