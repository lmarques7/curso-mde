package questionario;
import java.util.Scanner;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import br.org.cursomde.exemplo2.questionario.Item;
import br.org.cursomde.exemplo2.questionario.Questionario;
import br.org.cursomde.exemplo2.questionario.Resposta;
 
public class Executa extends AbstractWorkflowComponent {
 	@Override
 	public void checkConfiguration(Issues issues) { }
 
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
    	EObject model = (EObject) ctx.get("model");
    	Questionario questionario = (Questionario)model;
    	Item itemAtual = null;
    	for(Item i: questionario.getPerguntas()) {
        	if(i.isInicio()) { itemAtual = i;  break;  }
    	}
    	if(itemAtual == null) {
            issues.addError("Não existe mensagem definida como inicial!");
        	return;
    	}
        System.out.println(itemAtual.getMensagem());
    	Scanner console = new Scanner(System.in);
    	while(!itemAtual.isFim()) {
        	for(int i=1;i<=itemAtual.getAlternativas().size();i++) {
 	           Resposta r = itemAtual.getAlternativas().get(i-1);
            	System.out.println(i+")  "+r.getTexto());
        	}
            System.out.println("Digite sua resposta");
        	int opcao = console.nextInt();
        	itemAtual = itemAtual.getAlternativas().get(opcao-1).getProximaPergunta();
            System.out.println(itemAtual.getMensagem());
    	}
        System.out.println("Fim do questionário");
  try { console.close();  }
  catch (Exception e) {
    	e.printStackTrace();
 	  }
	}
}
