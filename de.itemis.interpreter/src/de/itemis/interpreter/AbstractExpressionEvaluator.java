package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.itemis.interpreter.logging.LogEntry;

public abstract class AbstractExpressionEvaluator extends InterpreterPart {

	public AbstractExpressionEvaluator( ExecutionContext ctx ) {
		super(ctx);
		ctx.setEvaluator(this);
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
	
	protected Object doublePlusDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNull(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNull(right, log)).doubleValue();
		return leftVal + rightVal;
	}
	
	protected Object doubleMinusDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNull(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNull(right, log)).doubleValue();
		return leftVal - rightVal;
	}
	
	protected Object doubleTimesDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNull(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNull(right, log)).doubleValue();
		return leftVal * rightVal;
	}
	
	protected Object doubleDivDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNull(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNull(right, log)).doubleValue();
		return leftVal / rightVal;
	}
	
}
