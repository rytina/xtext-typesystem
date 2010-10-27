package tests;


import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import de.itemis.xtext.typesystem.testing.XTextTestCase;
import expr.ExprDemoStandaloneSetup;

public class Basic extends XTextTestCase {

	@Test
	public void testTypesOfParams() throws Exception {
		EObject root = initializeAndGetRoot(new ExprDemoStandaloneSetup(), 
				R.modelroot+"/basic.expr");
		assertConstraints( allIssues.errorsOnly().sizeIs(0) ); 
		
	}
	
	
}
