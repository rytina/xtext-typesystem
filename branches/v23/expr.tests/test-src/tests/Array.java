package tests;


import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;
import expr.exprDemo.Formula;

public class Array extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		initializeAndGetRoot(new ExprDemoStandaloneSetup(), R.modelroot+"/4-array.expr");

		assertConstraints( allIssues.errorsOnly().sizeIs(1) ); 
		assertConstraints( allIssues.forType(Formula.class).named("anotherOne2").theOneAndOnlyContains("incompatible") );
	}
	
}
