package de.itemis.interpreter;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.itemis.interpreter.logging.LogEntry;

public abstract  class AbstractStatementExecutor extends InterpreterPart {

	private AbstractExpressionEvaluator evaluator;

	public AbstractStatementExecutor( ExecutionContext ctx, AbstractExpressionEvaluator evaluator ) {
		super(ctx);
		this.evaluator = evaluator;
	}
	
	public Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException {
		return evaluator.eval(expr, parentLog);
	}
	
	public abstract void execute( EObject statement, LogEntry parentLog ) throws InterpreterException;

	public void execute(List<? extends EObject> statements, LogEntry parentLog ) throws InterpreterException {
		for (EObject s: statements) {
			execute(s, parentLog);
		}
	}
	
}
