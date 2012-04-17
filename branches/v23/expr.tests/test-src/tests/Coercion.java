package tests;


import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;
import expr.exprDemo.VarDecl;

public class Coercion extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		initializeAndGetRoot(new ExprDemoStandaloneSetup(), R.modelroot+"/5-coercion.expr");

		assertConstraints( allIssues.errorsOnly().sizeIs(1) );
		assertConstraints( allIssues.forType(VarDecl.class).theOneAndOnlyContains("incompatible type"));
		
	}
	
	
}
