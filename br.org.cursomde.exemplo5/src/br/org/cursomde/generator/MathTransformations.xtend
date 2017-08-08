package br.org.cursomde.generator

import br.org.cursomde.math.Armazena
import br.org.cursomde.math.MathFactory
import br.org.cursomde.math.Operacao
import br.org.cursomde.math.Problema
import br.org.cursomde.math.SinalMatematico
import java.util.List
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class MathTransformations implements IWorkflowComponent {
	override void invoke(IWorkflowContext ctx) {
		val model = ctx.get("model") as List<Problema>;
		model.transforma()
	}
	override void postInvoke() { }
	override void preInvoke() { }
	
	def transforma(List<Problema> probs) {
		for(Problema p:probs)
			p.transformaProblema()
	}
	
	def transformaProblema(Problema problema) {
		for(exp: problema.expressoes) {
			switch(exp) {
				Armazena: exp.incrementaArmazena()
				Operacao: exp.trocaSomaPorSubtracao()
			}
		}
		problema.adicionaExpressao()
	}
	
	def incrementaArmazena(Armazena armazena) {
		armazena.setTermo(armazena.termo + 10)
	}
	
	def trocaSomaPorSubtracao(Operacao operacao) {
		if(operacao.sinal == SinalMatematico::SOMA) {
			operacao.setSinal(SinalMatematico::SUBTRACAO)
		}
	}
	
	def adicionaExpressao(Problema problema) {
		val op = MathFactory::eINSTANCE.createOperacao()
		op.setSinal(SinalMatematico::SOMA)
		op.setTermo(1234)
		problema.expressoes.add(op)
	}
}
