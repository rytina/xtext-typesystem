

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import expr2.Expr2DslInjectorProvider;
import expr2.expr2Dsl.Formula;
import expr2.expr2Dsl.VarDecl;

@RunWith(XtextRunner.class)
@InjectWith(Expr2DslInjectorProvider.class)
public class Test3 extends XtextTest {
	
	@Test
	public void testEnum() throws Exception {
		testFileNoSerializer("3-enum.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(1) ); 
		assertConstraints( issues.forType(Formula.class).named("col3").theOneAndOnlyContains("incompatible") );
	}

		
}
