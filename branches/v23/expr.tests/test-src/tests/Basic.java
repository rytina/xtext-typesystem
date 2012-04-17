package tests;


import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;

public class Basic extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		initializeAndGetRoot(new ExprDemoStandaloneSetup(), R.modelroot+"/1-basic.expr");
		assertConstraints( allIssues.errorsOnly().sizeIs(0) ); 
		
	}
	
	
}
