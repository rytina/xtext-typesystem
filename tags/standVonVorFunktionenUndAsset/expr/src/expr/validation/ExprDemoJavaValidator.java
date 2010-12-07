package expr.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.itemis.xtext.typesystem.ITypesystem;
 

public class ExprDemoJavaValidator extends AbstractExprDemoJavaValidator {

	@Inject
	private ITypesystem ts;
	
	@Check
	public void checkTypesystemRules( EObject x ) {
		ts.checkTypesystemConstraints(x, this);
	}
	
}
