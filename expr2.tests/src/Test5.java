

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
public class Test5 extends XtextTest {
	
	@Test
	public void testCoercion() throws Exception {
		testFileNoSerializer("5-coercion.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(1) );
		assertConstraints( issues.forType(VarDecl.class).theOneAndOnlyContains("incompatible type"));
	}
	
	
}
