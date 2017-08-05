/**
 * generated by Xtext 2.12.0
 */
package br.org.cursomde.math.impl;

import br.org.cursomde.math.Armazena;
import br.org.cursomde.math.Expressao;
import br.org.cursomde.math.MathFactory;
import br.org.cursomde.math.MathPackage;
import br.org.cursomde.math.Operacao;
import br.org.cursomde.math.Problema;
import br.org.cursomde.math.SinalMatematico;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathPackageImpl extends EPackageImpl implements MathPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass problemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armazenaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operacaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sinalMatematicoEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.org.cursomde.math.MathPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MathPackageImpl()
  {
    super(eNS_URI, MathFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MathPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MathPackage init()
  {
    if (isInited) return (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);

    // Obtain or create and register package
    MathPackageImpl theMathPackage = (MathPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MathPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MathPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMathPackage.createPackageContents();

    // Initialize created meta-data
    theMathPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMathPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MathPackage.eNS_URI, theMathPackage);
    return theMathPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProblema()
  {
    return problemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProblema_Name()
  {
    return (EAttribute)problemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProblema_Expressoes()
  {
    return (EReference)problemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressao()
  {
    return expressaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressao_Termo()
  {
    return (EAttribute)expressaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArmazena()
  {
    return armazenaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperacao()
  {
    return operacaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperacao_Sinal()
  {
    return (EAttribute)operacaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSinalMatematico()
  {
    return sinalMatematicoEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathFactory getMathFactory()
  {
    return (MathFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    problemaEClass = createEClass(PROBLEMA);
    createEAttribute(problemaEClass, PROBLEMA__NAME);
    createEReference(problemaEClass, PROBLEMA__EXPRESSOES);

    expressaoEClass = createEClass(EXPRESSAO);
    createEAttribute(expressaoEClass, EXPRESSAO__TERMO);

    armazenaEClass = createEClass(ARMAZENA);

    operacaoEClass = createEClass(OPERACAO);
    createEAttribute(operacaoEClass, OPERACAO__SINAL);

    // Create enums
    sinalMatematicoEEnum = createEEnum(SINAL_MATEMATICO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    armazenaEClass.getESuperTypes().add(this.getExpressao());
    operacaoEClass.getESuperTypes().add(this.getExpressao());

    // Initialize classes and features; add operations and parameters
    initEClass(problemaEClass, Problema.class, "Problema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProblema_Name(), ecorePackage.getEString(), "name", null, 0, 1, Problema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProblema_Expressoes(), this.getExpressao(), null, "expressoes", null, 0, -1, Problema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressaoEClass, Expressao.class, "Expressao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressao_Termo(), ecorePackage.getEInt(), "termo", null, 0, 1, Expressao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(armazenaEClass, Armazena.class, "Armazena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operacaoEClass, Operacao.class, "Operacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperacao_Sinal(), this.getSinalMatematico(), "sinal", null, 0, 1, Operacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(sinalMatematicoEEnum, SinalMatematico.class, "SinalMatematico");
    addEEnumLiteral(sinalMatematicoEEnum, SinalMatematico.SOMA);
    addEEnumLiteral(sinalMatematicoEEnum, SinalMatematico.SUBTRACAO);
    addEEnumLiteral(sinalMatematicoEEnum, SinalMatematico.MULTIPLICACAO);
    addEEnumLiteral(sinalMatematicoEEnum, SinalMatematico.DIVISAO);

    // Create resource
    createResource(eNS_URI);
  }

} //MathPackageImpl
