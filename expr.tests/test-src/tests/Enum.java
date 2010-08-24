package tests;


import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import de.itemis.xtext.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;
import expr.exprDemo.Formula;

public class Enum extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		EObject root = initializeAndGetRoot(new ExprDemoStandaloneSetup(), 
				R.modelroot+"/enum.expr");

		assertConstraints( allIssues.errorsOnly().sizeIs(1) ); 
		assertConstraints( allIssues.forType(Formula.class).named("col3").theOneAndOnlyContains("incompatible") );
		
	}
	
}
