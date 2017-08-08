/**
 */
package br.org.cursomde.exemplo2.questionario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Questionario#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Questionario#getDescricao <em>Descricao</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Questionario#getTempo <em>Tempo</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.Questionario#getPerguntas <em>Perguntas</em>}</li>
 * </ul>
 *
 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getQuestionario()
 * @model
 * @generated
 */
public interface Questionario extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getQuestionario_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Questionario#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Descricao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descricao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descricao</em>' attribute.
	 * @see #setDescricao(String)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getQuestionario_Descricao()
	 * @model
	 * @generated
	 */
	String getDescricao();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Questionario#getDescricao <em>Descricao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descricao</em>' attribute.
	 * @see #getDescricao()
	 * @generated
	 */
	void setDescricao(String value);

	/**
	 * Returns the value of the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo</em>' attribute.
	 * @see #setTempo(int)
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getQuestionario_Tempo()
	 * @model
	 * @generated
	 */
	int getTempo();

	/**
	 * Sets the value of the '{@link br.org.cursomde.exemplo2.questionario.Questionario#getTempo <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo</em>' attribute.
	 * @see #getTempo()
	 * @generated
	 */
	void setTempo(int value);

	/**
	 * Returns the value of the '<em><b>Perguntas</b></em>' containment reference list.
	 * The list contents are of type {@link br.org.cursomde.exemplo2.questionario.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perguntas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perguntas</em>' containment reference list.
	 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage#getQuestionario_Perguntas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getPerguntas();

} // Questionario
