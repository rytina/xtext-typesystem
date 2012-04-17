
package expr2;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Expr2DslStandaloneSetup extends Expr2DslStandaloneSetupGenerated{

	public static void doSetup() {
		new Expr2DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

