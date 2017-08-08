package br.org.cursomde.generator;

import org.eclipse.xtext.generator.IGenerator2;

import br.org.cursomde.MathRuntimeModule;

public class GeraCodigoRuntimeModule extends MathRuntimeModule {


	@Override
	public Class<? extends IGenerator2> bindIGenerator2() {
		return GeraCodigoMath.class;
	}
	
//	@Override
//	public Class<? extends IGenerator> bindIGenerator() {
//        return GeraCodigoMath.class;
//	}
}
