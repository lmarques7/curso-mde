/**
 */
package br.org.cursomde.exemplo2.questionario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resposta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Resposta#getTexto <em>Texto</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Resposta#getProximaPergunta <em>Proxima Pergunta</em>}</li>
 * </ul>
 *
 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getResposta()
 * @model
 * @generated
 */
public interface Resposta extends EObject {
	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getResposta_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Resposta#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

	/**
	 * Returns the value of the '<em><b>Proxima Pergunta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxima Pergunta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxima Pergunta</em>' reference.
	 * @see #setProximaPergunta(Item)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getResposta_ProximaPergunta()
	 * @model
	 * @generated
	 */
	Item getProximaPergunta();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Resposta#getProximaPergunta <em>Proxima Pergunta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxima Pergunta</em>' reference.
	 * @see #getProximaPergunta()
	 * @generated
	 */
	void setProximaPergunta(Item value);

} // Resposta
