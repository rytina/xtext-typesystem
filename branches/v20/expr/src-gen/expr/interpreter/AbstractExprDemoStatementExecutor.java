
package expr.interpreter;

import org.eclipse.emf.ecore.EObject;
import expr.exprDemo.*; 

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MethodNotImplementedException;
import de.itemis.interpreter.AbstractStatementExecutor;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.logging.LogEntry;
import de.itemis.interpreter.AbstractExpressionEvaluator;


public abstract class AbstractExprDemoStatementExecutor extends AbstractStatementExecutor {

	public AbstractExprDemoStatementExecutor( ExecutionContext ctx ) {
		super(ctx);
	}

	public void execute( EObject statement, LogEntry parentLog ) throws InterpreterException {
		
		LogEntry localLog = log( statement, parentLog );
	
		
		
		throw new InterpreterException(statement, "generated execute(...) method cannot handle type "+statement.eClass().getName());
		
	}

	
	


}
