
package expr.interpreter;

import org.eclipse.emf.ecore.EObject;
import expr.exprDemo.*; 

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MethodNotImplementedException;
import de.itemis.interpreter.AbstractExpressionEvaluator;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.logging.LogEntry;


public abstract class AbstractExprDemoExpressionEvaluator extends AbstractExpressionEvaluator {

	public AbstractExprDemoExpressionEvaluator( ExecutionContext ctx ) {
		super(ctx);
	}

	public Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException {

		LogEntry localLog = parentLog.child(LogEntry.Kind.eval, expr, "evaluating "+expr.eClass().getName());

		
		if ( expr instanceof Equals ) {
			return evalEquals( (Equals)expr, localLog );
		}
		
		if ( expr instanceof Plus ) {
			return evalPlus( (Plus)expr, localLog );
		}
		
		if ( expr instanceof Multi ) {
			return evalMulti( (Multi)expr, localLog );
		}
		
		if ( expr instanceof ArrayAccess ) {
			return evalArrayAccess( (ArrayAccess)expr, localLog );
		}
		
		if ( expr instanceof SymbolRef ) {
			return evalSymbolRef( (SymbolRef)expr, localLog );
		}
		
		if ( expr instanceof NumberLiteral ) {
			return evalNumberLiteral( (NumberLiteral)expr, localLog );
		}
		
		if ( expr instanceof StringLiteral ) {
			return evalStringLiteral( (StringLiteral)expr, localLog );
		}
		
		if ( expr instanceof Expression ) {
			return evalExpression( (Expression)expr, localLog );
		}
		
		
		throw new InterpreterException(expr, "generated eval(...) method cannot handle type "+expr.eClass().getName());
	}

	
	
	protected Object evalEquals( Equals expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalEquals not implemented");
	} 
	
	protected Object evalPlus( Plus expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalPlus not implemented");
	} 
	
	protected Object evalMulti( Multi expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalMulti not implemented");
	} 
	
	protected Object evalArrayAccess( ArrayAccess expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalArrayAccess not implemented");
	} 
	
	protected Object evalSymbolRef( SymbolRef expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalSymbolRef not implemented");
	} 
	
	protected Object evalNumberLiteral( NumberLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalNumberLiteral not implemented");
	} 
	
	protected Object evalStringLiteral( StringLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalStringLiteral not implemented");
	} 
	
	protected Object evalExpression( Expression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalExpression not implemented");
	} 
	


}
