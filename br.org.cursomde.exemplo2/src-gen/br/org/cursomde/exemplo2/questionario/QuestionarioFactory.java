/**
 */
package br.org.cursomde.exemplo2.questionario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.org.cursomde.exemplo2.questionario.QuestionarioPackage
 * @generated
 */
public interface QuestionarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionarioFactory eINSTANCE = br.org.cursomde.exemplo2.questionario.impl.QuestionarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionario</em>'.
	 * @generated
	 */
	Questionario createQuestionario();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Resposta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resposta</em>'.
	 * @generated
	 */
	Resposta createResposta();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuestionarioPackage getQuestionarioPackage();

} //QuestionarioFactory
