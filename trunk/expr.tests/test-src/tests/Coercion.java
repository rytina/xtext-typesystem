package tests;


import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;
import expr.exprDemo.VarDecl;

public class Coercion extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		EObject root = initializeAndGetRoot(new ExprDemoStandaloneSetup(), 
				R.modelroot+"/coercion.expr");

		assertConstraints( allIssues.errorsOnly().sizeIs(1) );
		assertConstraints( allIssues.forType(VarDecl.class).theOneAndOnlyContains("incompatible type"));
		
	}
	
	
}
