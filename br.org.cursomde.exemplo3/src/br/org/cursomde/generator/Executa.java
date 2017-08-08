package br.org.cursomde.generator;

import java.util.List;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import br.org.cursomde.math.Armazena;
import br.org.cursomde.math.Expressao;
import br.org.cursomde.math.Operacao;
import br.org.cursomde.math.Problema;

public class Executa implements IWorkflowComponent {
	@Override
	public void invoke(IWorkflowContext ctx) {
		@SuppressWarnings("unchecked")
		List<Problema> model = (List<Problema>) ctx.get("model");
		for (Problema problema : model) {
			float resultado = 0;
			for (Expressao expressao : problema.getExpressoes()) {
				int valor = expressao.getTermo();
				if (expressao instanceof Armazena) {
					System.out.println("  Armazena " + valor);
					resultado = valor;
				} else {
					Operacao operacao = (Operacao) expressao;
					switch (operacao.getSinal()) {
					case SOMA:
						System.out.println("  Soma " + valor);
						resultado = resultado + valor;
						break;
					case SUBTRACAO:
						System.out.println("  Subtrai " + valor);
						resultado = resultado - valor;
						break;
					case DIVISAO:
						System.out.println("  Divide " + valor);
						resultado = resultado / valor;
						break;
					case MULTIPLICACAO:
						System.out.println("  Multiplica " + valor);
						resultado = resultado * valor;
						break;
					}
				}
			}
			System.out.println("=" + resultado);
		}
	}
	@Override
	public void postInvoke() { }
	@Override
	public void preInvoke() { }
}
