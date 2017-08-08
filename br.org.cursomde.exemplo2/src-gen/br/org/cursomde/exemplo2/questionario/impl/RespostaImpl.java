/**
 */
package br.org.cursomde.exemplo2.questionario.impl;

import br.org.cursomde.exemplo2.questionario.Item;
import br.org.cursomde.exemplo2.questionario.QuestionarioPackage;
import br.org.cursomde.exemplo2.questionario.Resposta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resposta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.RespostaImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.RespostaImpl#getProximaPergunta <em>Proxima Pergunta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RespostaImpl extends MinimalEObjectImpl.Container implements Resposta {
	/**
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProximaPergunta() <em>Proxima Pergunta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProximaPergunta()
	 * @generated
	 * @ordered
	 */
	protected Item proximaPergunta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespostaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionarioPackage.Literals.RESPOSTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.RESPOSTA__TEXTO, oldTexto,
					texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getProximaPergunta() {
		if (proximaPergunta != null && proximaPergunta.eIsProxy()) {
			InternalEObject oldProximaPergunta = (InternalEObject) proximaPergunta;
			proximaPergunta = (Item) eResolveProxy(oldProximaPergunta);
			if (proximaPergunta != oldProximaPergunta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QuestionarioPackage.RESPOSTA__PROXIMA_PERGUNTA, oldProximaPergunta, proximaPergunta));
			}
		}
		return proximaPergunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetProximaPergunta() {
		return proximaPergunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProximaPergunta(Item newProximaPergunta) {
		Item oldProximaPergunta = proximaPergunta;
		proximaPergunta = newProximaPergunta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.RESPOSTA__PROXIMA_PERGUNTA,
					oldProximaPergunta, proximaPergunta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuestionarioPackage.RESPOSTA__TEXTO:
			return getTexto();
		case QuestionarioPackage.RESPOSTA__PROXIMA_PERGUNTA:
			if (resolve)
				return getProximaPergunta();
			return basicGetProximaPergunta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QuestionarioPackage.RESPOSTA__TEXTO:
			setTexto((String) newValue);
			return;
		case QuestionarioPackage.RESPOSTA__PROXIMA_PERGUNTA:
			setProximaPergunta((Item) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QuestionarioPackage.RESPOSTA__TEXTO:
			setTexto(TEXTO_EDEFAULT);
			return;
		case QuestionarioPackage.RESPOSTA__PROXIMA_PERGUNTA:
			setProximaPergunta((Item) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QuestionarioPackage.RESPOSTA__TEXTO:
			return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
		case QuestionarioPackage.RESPOSTA__PROXIMA_PERGUNTA:
			return proximaPergunta != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (texto: ");
		result.append(texto);
		result.append(')');
		return result.toString();
	}

} //RespostaImpl
