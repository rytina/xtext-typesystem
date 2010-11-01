package tests;


import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;
import expr.exprDemo.Formula;

public class Subtyping extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		EObject root = initializeAndGetRoot(new ExprDemoStandaloneSetup(), 
				R.modelroot+"/2-subtyping.expr");

		assertConstraints( allIssues.errorsOnly().sizeIs(2) );
		
		allIssues.dumpIssues();
		
		assertConstraints( allIssues.forType(Formula.class).named("t2").theOneAndOnlyContains("incompatible") );
		assertConstraints( allIssues.forType(Formula.class).named("t6").theOneAndOnlyContains("incompatible") );
		
	}
	
}
