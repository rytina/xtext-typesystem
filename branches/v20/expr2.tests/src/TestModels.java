

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.FluentIssueCollection;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import expr2.Expr2DslInjectorProvider;
import expr2.expr2Dsl.Formula;
import expr2.expr2Dsl.VarDecl;

@RunWith(XtextRunner.class)
@InjectWith(Expr2DslInjectorProvider.class)
public class TestModels extends XtextTest {
	
	
	@Test
	public void testBasics() {
		testFileNoSerializer("1-basic.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(0) ); 
	}
	
	
	@Test
	public void testTArray() throws Exception {
		testFileNoSerializer("4-array.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(1) ); 
		assertConstraints( issues.forType(Formula.class).named("anotherOne2").theOneAndOnlyContains("incompatible") );
	}


	@Test
	public void testCoercion() throws Exception {
		testFileNoSerializer("5-coercion.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(1) );
		assertConstraints( issues.forType(VarDecl.class).theOneAndOnlyContains("incompatible type"));
	}
	
	@Test
	public void testEnum() throws Exception {
		testFileNoSerializer("3-enum.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(1) ); 
		assertConstraints( issues.forType(Formula.class).named("col3").theOneAndOnlyContains("incompatible") );
	}

	
	@Test
	public void testSubtyping() throws Exception {
		testFileNoSerializer("2-subtyping.expr2");
		assertConstraints( issues.errorsOnly().sizeIs(2) );
		assertConstraints( issues.forType(Formula.class).named("t2").theOneAndOnlyContains("incompatible") );
		assertConstraints( issues.forType(Formula.class).named("t6").theOneAndOnlyContains("incompatible") );
	}


	
}
