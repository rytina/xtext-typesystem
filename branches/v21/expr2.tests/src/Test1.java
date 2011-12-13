

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
public class Test1 extends XtextTest {
	
	
	@Test
	public void testBasics() {
		testFileNoSerializer("1-basic.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(0) ); 
	}
	
}
