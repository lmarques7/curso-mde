package br.org.cursomde.generator;

import br.org.cursomde.MathStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GeraCodigoStandaloneSetup extends MathStandaloneSetup {
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new GeraCodigoRuntimeModule());
	}
}
