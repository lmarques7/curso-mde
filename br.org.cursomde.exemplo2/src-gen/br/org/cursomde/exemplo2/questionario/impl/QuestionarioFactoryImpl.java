/**
 */
package br.org.cursomde.exemplo2.questionario.impl;

import br.org.cursomde.exemplo2.questionario.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionarioFactoryImpl extends EFactoryImpl implements QuestionarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionarioFactory init() {
		try {
			QuestionarioFactory theQuestionarioFactory = (QuestionarioFactory) EPackage.Registry.INSTANCE
					.getEFactory(QuestionarioPackage.eNS_URI);
			if (theQuestionarioFactory != null) {
				return theQuestionarioFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionarioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QuestionarioPackage.QUESTIONARIO:
			return createQuestionario();
		case QuestionarioPackage.ITEM:
			return createItem();
		case QuestionarioPackage.RESPOSTA:
			return createResposta();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionario createQuestionario() {
		QuestionarioImpl questionario = new QuestionarioImpl();
		return questionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resposta createResposta() {
		RespostaImpl resposta = new RespostaImpl();
		return resposta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionarioPackage getQuestionarioPackage() {
		return (QuestionarioPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionarioPackage getPackage() {
		return QuestionarioPackage.eINSTANCE;
	}

} //QuestionarioFactoryImpl
