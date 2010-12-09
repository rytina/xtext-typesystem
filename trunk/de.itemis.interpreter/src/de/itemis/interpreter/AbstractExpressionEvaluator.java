package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.itemis.interpreter.logging.LogEntry;

public abstract class AbstractExpressionEvaluator extends InterpreterPart {

	public AbstractExpressionEvaluator( ExecutionContext ctx ) {
		super(ctx);
	}
	
	public abstract Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException;

	protected Object checkNull( EObject e, Object o ) throws UnexpectedNullException {
		if ( o == null ) {
			throw new UnexpectedNullException(e, "unexpected null value");
		}
		return o;
	}
	
	public Object evalCheckNull( EObject expr, LogEntry parentLog ) throws InterpreterException {
		return checkNull( expr, eval( expr, parentLog ) );
	}
	
}
