

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
public class Test2 extends XtextTest {
	
	@Test
	public void testSubtyping() throws Exception {
		testFileNoSerializer("2-subtyping.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(2) );
		assertConstraints( issues.forType(Formula.class).named("t2").theOneAndOnlyContains("incompatible") );
		assertConstraints( issues.forType(Formula.class).named("t6").theOneAndOnlyContains("incompatible") );
	}
	
	
}
