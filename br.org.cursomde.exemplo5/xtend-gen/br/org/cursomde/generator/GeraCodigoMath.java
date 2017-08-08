package br.org.cursomde.generator;

import br.org.cursomde.math.Armazena;
import br.org.cursomde.math.Expressao;
import br.org.cursomde.math.Operacao;
import br.org.cursomde.math.Problema;
import br.org.cursomde.math.SinalMatematico;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * import org.eclipse.emf.ecore.resource.Resource
 * import org.eclipse.xtext.generator.IGenerator
 * import org.eclipse.xtext.generator.IFileSystemAccess
 * import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*\
 */
@SuppressWarnings("all")
public class GeraCodigoMath implements IGenerator2 {
  /**
   * override void doGenerate(Resource resource, IFileSystemAccess fsa) {
   * for(e:resource.allContentsIterable.filter(typeof(Problema))) {
   * fsa.generateFile(e.name+".java",e.compile)
   * }
   * }
   */
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Problema> _filter = Iterables.<Problema>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Problema.class);
    for (final Problema e : _filter) {
      String _name = e.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, this.compile(e));
    }
  }
  
  public CharSequence compile(final Problema p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String args[]) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double resultado = 0;");
    _builder.newLine();
    {
      EList<Expressao> _expressoes = p.getExpressoes();
      for(final Expressao expressao : _expressoes) {
        _builder.append("\t\t");
        CharSequence _compile = this.compile(expressao);
        _builder.append(_compile, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("System.out.println(\"O resultado é \"+resultado);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final Armazena a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("resultado = ");
    int _termo = a.getTermo();
    _builder.append(_termo);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compile(final Operacao o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("resultado = resultado ");
    SinalMatematico _sinal = o.getSinal();
    _builder.append(_sinal);
    _builder.append(" ");
    int _termo = o.getTermo();
    _builder.append(_termo);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  public CharSequence compile(final Expressao a) {
    if (a instanceof Armazena) {
      return _compile((Armazena)a);
    } else if (a instanceof Operacao) {
      return _compile((Operacao)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
}
