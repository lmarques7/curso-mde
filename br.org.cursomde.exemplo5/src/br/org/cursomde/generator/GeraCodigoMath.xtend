package br.org.cursomde.generator

import br.org.cursomde.math.Armazena
import br.org.cursomde.math.Operacao
import br.org.cursomde.math.Problema
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext

//Se estiver usando Eclipse Kepler ou inferior, use este conjunto de imports 
/* 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*\
*/

class GeraCodigoMath implements IGenerator2 {
	
	//Se estiver usando Eclipse Kepler ou inferior, use o método abaixo e 
	//comente o método doGenerate
	/* 
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e:resource.allContentsIterable.filter(typeof(Problema))) {
			fsa.generateFile(e.name+".java",e.compile)
		}
	}	 
	*/
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e:resource.allContents.toIterable.filter(typeof(Problema))){
		//for(e:resource.allContentsIterable.filter(typeof(Problema))) {
			fsa.generateFile(e.name+".java",e.compile)
		}
	}
          
//     override doGenerate(Resource resource, IFileSystemAccess fsa) {
//		for(e:resource.allContents.toIterable.filter(typeof(Problema))){
//		//for(e:resource.allContentsIterable.filter(typeof(Problema))) {
//			fsa.generateFile(e.name+".java",e.compile)
//		}
//	}
      
	
	def compile(Problema p) '''
	public class «p.name» {
		public static void main(String args[]) {
			double resultado = 0;
			«FOR expressao:p.expressoes»
				«expressao.compile»
			«ENDFOR»
			System.out.println("O resultado é "+resultado);
		}
	}
	'''
	
	def dispatch compile(Armazena a) '''
		resultado = «a.termo»;
	'''
	
	def dispatch compile(Operacao o) '''
		resultado = resultado «o.sinal» «o.termo»;
	'''
	
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}
