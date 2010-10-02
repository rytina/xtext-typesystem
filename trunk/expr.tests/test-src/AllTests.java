

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.Array;
import tests.Basic;
import tests.Coercion;
import tests.Enum;
import tests.Subtyping;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	Basic.class,
	Subtyping.class,
	Enum.class,
	Array.class,
	Coercion.class
})
public class AllTests {

}
   

