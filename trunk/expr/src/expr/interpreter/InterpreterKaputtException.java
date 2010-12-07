package expr.interpreter;

import org.eclipse.emf.ecore.EObject;

public class InterpreterKaputtException extends Exception {

	public EObject element;

	public InterpreterKaputtException( EObject element, String message ) {
		super( message );
		this.element = element;
	}
	
}
