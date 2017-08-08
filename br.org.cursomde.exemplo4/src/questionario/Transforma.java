package questionario;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import br.org.cursomde.exemplo2.questionario.Item;
import br.org.cursomde.exemplo2.questionario.Questionario;
import br.org.cursomde.exemplo2.questionario.QuestionarioFactory;
import br.org.cursomde.exemplo2.questionario.Resposta;

public class Transforma extends AbstractWorkflowComponent {
	@Override
	public void checkConfiguration(Issues issues) { }

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		EObject model = (EObject) ctx.get("model");
		Questionario questionario = (Questionario) model;
		Item itemInicial = null;
		for (Item i : questionario.getPerguntas()) {
			if (i.isInicio()) {
				itemInicial = i;
				break;
			}
		}
		if (itemInicial == null) {
			issues.addError("Não existe mensagem definida como inicial!");
			return;
		}
		for (Item i : questionario.getPerguntas()) {
			if (!i.isInicio() && !i.isFim()) {
				Resposta r = QuestionarioFactory.eINSTANCE.createResposta();
				r.setTexto("Voltar ao início");
				r.setProximaPergunta(itemInicial);
				i.getAlternativas().add(r);
			}
		}
	}
}
