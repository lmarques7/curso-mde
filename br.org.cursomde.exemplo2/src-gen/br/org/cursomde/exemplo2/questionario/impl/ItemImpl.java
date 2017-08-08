/**
 */
package br.org.cursomde.exemplo2.questionario.impl;

import br.org.cursomde.exemplo2.questionario.Item;
import br.org.cursomde.exemplo2.questionario.QuestionarioPackage;
import br.org.cursomde.exemplo2.questionario.Resposta;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.ItemImpl#getMensagem <em>Mensagem</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.ItemImpl#isInicio <em>Inicio</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.ItemImpl#isFim <em>Fim</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.ItemImpl#getAlternativas <em>Alternativas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The default value of the '{@link #getMensagem() <em>Mensagem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensagem()
	 * @generated
	 * @ordered
	 */
	protected static final String MENSAGEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMensagem() <em>Mensagem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensagem()
	 * @generated
	 * @ordered
	 */
	protected String mensagem = MENSAGEM_EDEFAULT;

	/**
	 * The default value of the '{@link #isInicio() <em>Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INICIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInicio() <em>Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicio()
	 * @generated
	 * @ordered
	 */
	protected boolean inicio = INICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #isFim() <em>Fim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFim()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFim() <em>Fim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFim()
	 * @generated
	 * @ordered
	 */
	protected boolean fim = FIM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlternativas() <em>Alternativas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativas()
	 * @generated
	 * @ordered
	 */
	protected EList<Resposta> alternativas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionarioPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMensagem(String newMensagem) {
		String oldMensagem = mensagem;
		mensagem = newMensagem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.ITEM__MENSAGEM, oldMensagem,
					mensagem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInicio() {
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInicio(boolean newInicio) {
		boolean oldInicio = inicio;
		inicio = newInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.ITEM__INICIO, oldInicio, inicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFim() {
		return fim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFim(boolean newFim) {
		boolean oldFim = fim;
		fim = newFim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.ITEM__FIM, oldFim, fim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resposta> getAlternativas() {
		if (alternativas == null) {
			alternativas = new EObjectContainmentEList<Resposta>(Resposta.class, this,
					QuestionarioPackage.ITEM__ALTERNATIVAS);
		}
		return alternativas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuestionarioPackage.ITEM__ALTERNATIVAS:
			return ((InternalEList<?>) getAlternativas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuestionarioPackage.ITEM__MENSAGEM:
			return getMensagem();
		case QuestionarioPackage.ITEM__INICIO:
			return isInicio();
		case QuestionarioPackage.ITEM__FIM:
			return isFim();
		case QuestionarioPackage.ITEM__ALTERNATIVAS:
			return getAlternativas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QuestionarioPackage.ITEM__MENSAGEM:
			setMensagem((String) newValue);
			return;
		case QuestionarioPackage.ITEM__INICIO:
			setInicio((Boolean) newValue);
			return;
		case QuestionarioPackage.ITEM__FIM:
			setFim((Boolean) newValue);
			return;
		case QuestionarioPackage.ITEM__ALTERNATIVAS:
			getAlternativas().clear();
			getAlternativas().addAll((Collection<? extends Resposta>) newValue);
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
		case QuestionarioPackage.ITEM__MENSAGEM:
			setMensagem(MENSAGEM_EDEFAULT);
			return;
		case QuestionarioPackage.ITEM__INICIO:
			setInicio(INICIO_EDEFAULT);
			return;
		case QuestionarioPackage.ITEM__FIM:
			setFim(FIM_EDEFAULT);
			return;
		case QuestionarioPackage.ITEM__ALTERNATIVAS:
			getAlternativas().clear();
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
		case QuestionarioPackage.ITEM__MENSAGEM:
			return MENSAGEM_EDEFAULT == null ? mensagem != null : !MENSAGEM_EDEFAULT.equals(mensagem);
		case QuestionarioPackage.ITEM__INICIO:
			return inicio != INICIO_EDEFAULT;
		case QuestionarioPackage.ITEM__FIM:
			return fim != FIM_EDEFAULT;
		case QuestionarioPackage.ITEM__ALTERNATIVAS:
			return alternativas != null && !alternativas.isEmpty();
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
		result.append(" (mensagem: ");
		result.append(mensagem);
		result.append(", inicio: ");
		result.append(inicio);
		result.append(", fim: ");
		result.append(fim);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
