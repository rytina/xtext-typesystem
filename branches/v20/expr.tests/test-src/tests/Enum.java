package tests;


import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;
import expr.exprDemo.Formula;

public class Enum extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		initializeAndGetRoot(new ExprDemoStandaloneSetup(), R.modelroot+"/3-enum.expr");

		assertConstraints( allIssues.errorsOnly().sizeIs(1) ); 
		assertConstraints( allIssues.forType(Formula.class).named("col3").theOneAndOnlyContains("incompatible") );
		
	}
	
}
