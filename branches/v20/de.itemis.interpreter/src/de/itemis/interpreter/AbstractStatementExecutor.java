package de.itemis.interpreter;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.itemis.interpreter.logging.LogEntry;

public abstract  class AbstractStatementExecutor extends InterpreterPart {

	public AbstractStatementExecutor( ExecutionContext ctx ) {
		super(ctx);
		ctx.setExecutor(this);
	}

	public String getLogMessage(EObject o) {
		return "executing "+o.eClass().getName();
	}
	
	protected LogEntry log( EObject o, LogEntry log ) {
		String m = getLogMessage(o);
		if ( m != null ) {
			return log.child(LogEntry.Kind.debug, o, m );	
		}
		return log;
	}
	
	public Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException {
		return ctx.getEvaluator().eval(expr, parentLog);
	}
	
	public Object evalLog( EObject expr, LogEntry parentLog ) throws InterpreterException {
		return ctx.getEvaluator().evalLog(expr, parentLog);
	}
	
	public Object evalCheckNullLog( EObject expr, LogEntry parentLog ) throws InterpreterException {
		return ctx.getEvaluator().evalCheckNullLog(expr, parentLog);
	}
	
	public abstract void execute( EObject statement, LogEntry parentLog ) throws InterpreterException;

	public void execute(List<? extends EObject> statements, LogEntry parentLog ) throws InterpreterException {
		for (EObject s: statements) {
			execute(s, parentLog);
		}
	}
	
}
