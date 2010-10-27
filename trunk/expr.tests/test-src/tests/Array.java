package tests;


import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;
import expr.exprDemo.Formula;

public class Array extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		EObject root = initializeAndGetRoot(new ExprDemoStandaloneSetup(), 
				R.modelroot+"/array.expr");

		assertConstraints( allIssues.errorsOnly().sizeIs(1) ); 
		assertConstraints( allIssues.forType(Formula.class).named("anotherOne2").theOneAndOnlyContains("incompatible") );
	}
	
}
