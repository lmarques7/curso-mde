/*
 * generated by Xtext 2.12.0
 */
package br.org.cursomde.serializer;

import br.org.cursomde.math.Armazena;
import br.org.cursomde.math.MathPackage;
import br.org.cursomde.math.Operacao;
import br.org.cursomde.math.Problema;
import br.org.cursomde.services.MathGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathPackage.ARMAZENA:
				sequence_Armazena(context, (Armazena) semanticObject); 
				return; 
			case MathPackage.OPERACAO:
				sequence_Operacao(context, (Operacao) semanticObject); 
				return; 
			case MathPackage.PROBLEMA:
				sequence_Problema(context, (Problema) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expressao returns Armazena
	 *     Armazena returns Armazena
	 *
	 * Constraint:
	 *     termo=INT
	 */
	protected void sequence_Armazena(ISerializationContext context, Armazena semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.EXPRESSAO__TERMO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.EXPRESSAO__TERMO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArmazenaAccess().getTermoINTTerminalRuleCall_1_0(), semanticObject.getTermo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expressao returns Operacao
	 *     Operacao returns Operacao
	 *
	 * Constraint:
	 *     (sinal=SinalMatematico termo=INT)
	 */
	protected void sequence_Operacao(ISerializationContext context, Operacao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.OPERACAO__SINAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.OPERACAO__SINAL));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.EXPRESSAO__TERMO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.EXPRESSAO__TERMO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperacaoAccess().getSinalSinalMatematicoEnumRuleCall_0_0(), semanticObject.getSinal());
		feeder.accept(grammarAccess.getOperacaoAccess().getTermoINTTerminalRuleCall_1_0(), semanticObject.getTermo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Problema returns Problema
	 *
	 * Constraint:
	 *     (name=ID expressoes+=Expressao*)
	 */
	protected void sequence_Problema(ISerializationContext context, Problema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}