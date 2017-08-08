package br.org.cursomde.generator;

import br.org.cursomde.math.Armazena;
import br.org.cursomde.math.Expressao;
import br.org.cursomde.math.MathFactory;
import br.org.cursomde.math.Operacao;
import br.org.cursomde.math.Problema;
import br.org.cursomde.math.SinalMatematico;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

@SuppressWarnings("all")
public class MathTransformations implements IWorkflowComponent {
  @Override
  public void invoke(final IWorkflowContext ctx) {
    Object _get = ctx.get("model");
    final List<Problema> model = ((List<Problema>) _get);
    this.transforma(model);
  }
  
  @Override
  public void postInvoke() {
  }
  
  @Override
  public void preInvoke() {
  }
  
  public void transforma(final List<Problema> probs) {
    for (final Problema p : probs) {
      this.transformaProblema(p);
    }
  }
  
  public boolean transformaProblema(final Problema problema) {
    boolean _xblockexpression = false;
    {
      EList<Expressao> _expressoes = problema.getExpressoes();
      for (final Expressao exp : _expressoes) {
        boolean _matched = false;
        if (exp instanceof Armazena) {
          _matched=true;
          this.incrementaArmazena(((Armazena)exp));
        }
        if (!_matched) {
          if (exp instanceof Operacao) {
            _matched=true;
            this.trocaSomaPorSubtracao(((Operacao)exp));
          }
        }
      }
      _xblockexpression = this.adicionaExpressao(problema);
    }
    return _xblockexpression;
  }
  
  public void incrementaArmazena(final Armazena armazena) {
    int _termo = armazena.getTermo();
    int _plus = (_termo + 10);
    armazena.setTermo(_plus);
  }
  
  public void trocaSomaPorSubtracao(final Operacao operacao) {
    SinalMatematico _sinal = operacao.getSinal();
    boolean _equals = Objects.equal(_sinal, SinalMatematico.SOMA);
    if (_equals) {
      operacao.setSinal(SinalMatematico.SUBTRACAO);
    }
  }
  
  public boolean adicionaExpressao(final Problema problema) {
    boolean _xblockexpression = false;
    {
      final Operacao op = MathFactory.eINSTANCE.createOperacao();
      op.setSinal(SinalMatematico.SOMA);
      op.setTermo(1234);
      _xblockexpression = problema.getExpressoes().add(op);
    }
    return _xblockexpression;
  }
}
