/**
 */
package br.org.cursomde.exemplo2.questionario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.org.cursomde.exemplo2.questionario.QuestionarioFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "questionario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/questionario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "questionario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionarioPackage eINSTANCE = br.org.cursomde.exemplo2.questionario.impl.QuestionarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl <em>Questionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl
	 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioPackageImpl#getQuestionario()
	 * @generated
	 */
	int QUESTIONARIO = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARIO__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Descricao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARIO__DESCRICAO = 1;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARIO__TEMPO = 2;

	/**
	 * The feature id for the '<em><b>Perguntas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARIO__PERGUNTAS = 3;

	/**
	 * The number of structural features of the '<em>Questionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Questionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.org.cursomde.exemplo2.questionario.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.org.cursomde.exemplo2.questionario.impl.ItemImpl
	 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>Mensagem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MENSAGEM = 0;

	/**
	 * The feature id for the '<em><b>Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__INICIO = 1;

	/**
	 * The feature id for the '<em><b>Fim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__FIM = 2;

	/**
	 * The feature id for the '<em><b>Alternativas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ALTERNATIVAS = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.org.cursomde.exemplo2.questionario.impl.RespostaImpl <em>Resposta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.org.cursomde.exemplo2.questionario.impl.RespostaImpl
	 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioPackageImpl#getResposta()
	 * @generated
	 */
	int RESPOSTA = 2;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPOSTA__TEXTO = 0;

	/**
	 * The feature id for the '<em><b>Proxima Pergunta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPOSTA__PROXIMA_PERGUNTA = 1;

	/**
	 * The number of structural features of the '<em>Resposta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPOSTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resposta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPOSTA_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link br.org.cursomde.exemplo2.questionario.Questionario <em>Questionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionario</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Questionario
	 * @generated
	 */
	EClass getQuestionario();

	/**
	 * Returns the meta object for the attribute '{@link br.org.cursomde.exemplo2.questionario.Questionario#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Questionario#getTitulo()
	 * @see #getQuestionario()
	 * @generated
	 */
	EAttribute getQuestionario_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link br.org.cursomde.exemplo2.questionario.Questionario#getDescricao <em>Descricao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descricao</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Questionario#getDescricao()
	 * @see #getQuestionario()
	 * @generated
	 */
	EAttribute getQuestionario_Descricao();

	/**
	 * Returns the meta object for the attribute '{@link br.org.cursomde.exemplo2.questionario.Questionario#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Questionario#getTempo()
	 * @see #getQuestionario()
	 * @generated
	 */
	EAttribute getQuestionario_Tempo();

	/**
	 * Returns the meta object for the containment reference list '{@link br.org.cursomde.exemplo2.questionario.Questionario#getPerguntas <em>Perguntas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perguntas</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Questionario#getPerguntas()
	 * @see #getQuestionario()
	 * @generated
	 */
	EReference getQuestionario_Perguntas();

	/**
	 * Returns the meta object for class '{@link br.org.cursomde.exemplo2.questionario.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link br.org.cursomde.exemplo2.questionario.Item#getMensagem <em>Mensagem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mensagem</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Item#getMensagem()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Mensagem();

	/**
	 * Returns the meta object for the attribute '{@link br.org.cursomde.exemplo2.questionario.Item#isInicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inicio</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Item#isInicio()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Inicio();

	/**
	 * Returns the meta object for the attribute '{@link br.org.cursomde.exemplo2.questionario.Item#isFim <em>Fim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fim</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Item#isFim()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Fim();

	/**
	 * Returns the meta object for the containment reference list '{@link br.org.cursomde.exemplo2.questionario.Item#getAlternativas <em>Alternativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternativas</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Item#getAlternativas()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Alternativas();

	/**
	 * Returns the meta object for class '{@link br.org.cursomde.exemplo2.questionario.Resposta <em>Resposta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resposta</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Resposta
	 * @generated
	 */
	EClass getResposta();

	/**
	 * Returns the meta object for the attribute '{@link br.org.cursomde.exemplo2.questionario.Resposta#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Resposta#getTexto()
	 * @see #getResposta()
	 * @generated
	 */
	EAttribute getResposta_Texto();

	/**
	 * Returns the meta object for the reference '{@link br.org.cursomde.exemplo2.questionario.Resposta#getProximaPergunta <em>Proxima Pergunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proxima Pergunta</em>'.
	 * @see br.org.cursomde.exemplo2.questionario.Resposta#getProximaPergunta()
	 * @see #getResposta()
	 * @generated
	 */
	EReference getResposta_ProximaPergunta();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuestionarioFactory getQuestionarioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl <em>Questionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl
		 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioPackageImpl#getQuestionario()
		 * @generated
		 */
		EClass QUESTIONARIO = eINSTANCE.getQuestionario();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONARIO__TITULO = eINSTANCE.getQuestionario_Titulo();

		/**
		 * The meta object literal for the '<em><b>Descricao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONARIO__DESCRICAO = eINSTANCE.getQuestionario_Descricao();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONARIO__TEMPO = eINSTANCE.getQuestionario_Tempo();

		/**
		 * The meta object literal for the '<em><b>Perguntas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONARIO__PERGUNTAS = eINSTANCE.getQuestionario_Perguntas();

		/**
		 * The meta object literal for the '{@link br.org.cursomde.exemplo2.questionario.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.org.cursomde.exemplo2.questionario.impl.ItemImpl
		 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Mensagem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__MENSAGEM = eINSTANCE.getItem_Mensagem();

		/**
		 * The meta object literal for the '<em><b>Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__INICIO = eINSTANCE.getItem_Inicio();

		/**
		 * The meta object literal for the '<em><b>Fim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__FIM = eINSTANCE.getItem_Fim();

		/**
		 * The meta object literal for the '<em><b>Alternativas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ALTERNATIVAS = eINSTANCE.getItem_Alternativas();

		/**
		 * The meta object literal for the '{@link br.org.cursomde.exemplo2.questionario.impl.RespostaImpl <em>Resposta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.org.cursomde.exemplo2.questionario.impl.RespostaImpl
		 * @see br.org.cursomde.exemplo2.questionario.impl.QuestionarioPackageImpl#getResposta()
		 * @generated
		 */
		EClass RESPOSTA = eINSTANCE.getResposta();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPOSTA__TEXTO = eINSTANCE.getResposta_Texto();

		/**
		 * The meta object literal for the '<em><b>Proxima Pergunta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPOSTA__PROXIMA_PERGUNTA = eINSTANCE.getResposta_ProximaPergunta();

	}

} //QuestionarioPackage
