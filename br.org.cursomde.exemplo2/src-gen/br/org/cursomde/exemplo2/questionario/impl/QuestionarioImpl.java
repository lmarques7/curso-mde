/**
 */
package br.org.cursomde.exemplo2.questionario.impl;

import br.org.cursomde.exemplo2.questionario.Item;
import br.org.cursomde.exemplo2.questionario.Questionario;
import br.org.cursomde.exemplo2.questionario.QuestionarioPackage;

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
 * An implementation of the model object '<em><b>Questionario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl#getDescricao <em>Descricao</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link br.org.cursomde.exemplo2.questionario.impl.QuestionarioImpl#getPerguntas <em>Perguntas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionarioImpl extends MinimalEObjectImpl.Container implements Questionario {
	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescricao() <em>Descricao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescricao()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRICAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescricao() <em>Descricao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescricao()
	 * @generated
	 * @ordered
	 */
	protected String descricao = DESCRICAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected int tempo = TEMPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerguntas() <em>Perguntas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerguntas()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> perguntas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionarioPackage.Literals.QUESTIONARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.QUESTIONARIO__TITULO, oldTitulo,
					titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescricao(String newDescricao) {
		String oldDescricao = descricao;
		descricao = newDescricao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.QUESTIONARIO__DESCRICAO,
					oldDescricao, descricao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempo() {
		return tempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(int newTempo) {
		int oldTempo = tempo;
		tempo = newTempo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionarioPackage.QUESTIONARIO__TEMPO, oldTempo,
					tempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getPerguntas() {
		if (perguntas == null) {
			perguntas = new EObjectContainmentEList<Item>(Item.class, this,
					QuestionarioPackage.QUESTIONARIO__PERGUNTAS);
		}
		return perguntas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuestionarioPackage.QUESTIONARIO__PERGUNTAS:
			return ((InternalEList<?>) getPerguntas()).basicRemove(otherEnd, msgs);
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
		case QuestionarioPackage.QUESTIONARIO__TITULO:
			return getTitulo();
		case QuestionarioPackage.QUESTIONARIO__DESCRICAO:
			return getDescricao();
		case QuestionarioPackage.QUESTIONARIO__TEMPO:
			return getTempo();
		case QuestionarioPackage.QUESTIONARIO__PERGUNTAS:
			return getPerguntas();
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
		case QuestionarioPackage.QUESTIONARIO__TITULO:
			setTitulo((String) newValue);
			return;
		case QuestionarioPackage.QUESTIONARIO__DESCRICAO:
			setDescricao((String) newValue);
			return;
		case QuestionarioPackage.QUESTIONARIO__TEMPO:
			setTempo((Integer) newValue);
			return;
		case QuestionarioPackage.QUESTIONARIO__PERGUNTAS:
			getPerguntas().clear();
			getPerguntas().addAll((Collection<? extends Item>) newValue);
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
		case QuestionarioPackage.QUESTIONARIO__TITULO:
			setTitulo(TITULO_EDEFAULT);
			return;
		case QuestionarioPackage.QUESTIONARIO__DESCRICAO:
			setDescricao(DESCRICAO_EDEFAULT);
			return;
		case QuestionarioPackage.QUESTIONARIO__TEMPO:
			setTempo(TEMPO_EDEFAULT);
			return;
		case QuestionarioPackage.QUESTIONARIO__PERGUNTAS:
			getPerguntas().clear();
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
		case QuestionarioPackage.QUESTIONARIO__TITULO:
			return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
		case QuestionarioPackage.QUESTIONARIO__DESCRICAO:
			return DESCRICAO_EDEFAULT == null ? descricao != null : !DESCRICAO_EDEFAULT.equals(descricao);
		case QuestionarioPackage.QUESTIONARIO__TEMPO:
			return tempo != TEMPO_EDEFAULT;
		case QuestionarioPackage.QUESTIONARIO__PERGUNTAS:
			return perguntas != null && !perguntas.isEmpty();
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
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(", descricao: ");
		result.append(descricao);
		result.append(", tempo: ");
		result.append(tempo);
		result.append(')');
		return result.toString();
	}

} //QuestionarioImpl
