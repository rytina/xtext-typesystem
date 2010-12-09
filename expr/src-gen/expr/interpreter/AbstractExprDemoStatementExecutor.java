
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

	public AbstractExprDemoStatementExecutor( ExecutionContext ctx, AbstractExpressionEvaluator evaluator ) {
		super(ctx, evaluator);
	}

	public void execute( EObject statement, LogEntry parentLog ) throws InterpreterException {
	
		LogEntry localLog = parentLog.child(LogEntry.Kind.debug, statement, "executing "+statement.eClass().getName());
	
		
		if ( statement instanceof FunctionDeclaration ) {
			executeFunctionDeclaration( (FunctionDeclaration)statement, localLog );
			return;
		}
		
		if ( statement instanceof Parameter ) {
			executeParameter( (Parameter)statement, localLog );
			return;
		}
		
		if ( statement instanceof EnumLiteral ) {
			executeEnumLiteral( (EnumLiteral)statement, localLog );
			return;
		}
		
		if ( statement instanceof VarDecl ) {
			executeVarDecl( (VarDecl)statement, localLog );
			return;
		}
		
		if ( statement instanceof Formula ) {
			executeFormula( (Formula)statement, localLog );
			return;
		}
		
		if ( statement instanceof Symbol ) {
			executeSymbol( (Symbol)statement, localLog );
			return;
		}
		
		if ( statement instanceof Return ) {
			executeReturn( (Return)statement, localLog );
			return;
		}
		
		if ( statement instanceof Assert ) {
			executeAssert( (Assert)statement, localLog );
			return;
		}
		
		if ( statement instanceof EnumDecl ) {
			executeEnumDecl( (EnumDecl)statement, localLog );
			return;
		}
		
		
		throw new InterpreterException(statement, "generated execute(...) method cannot handle type "+statement.eClass().getName());
		
	}

	
	
	protected void executeFunctionDeclaration( FunctionDeclaration s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeFunctionDeclaration not implemented");
	} 
	
	protected void executeParameter( Parameter s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeParameter not implemented");
	} 
	
	protected void executeEnumLiteral( EnumLiteral s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeEnumLiteral not implemented");
	} 
	
	protected void executeVarDecl( VarDecl s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeVarDecl not implemented");
	} 
	
	protected void executeFormula( Formula s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeFormula not implemented");
	} 
	
	protected void executeSymbol( Symbol s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeSymbol not implemented");
	} 
	
	protected void executeReturn( Return s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeReturn not implemented");
	} 
	
	protected void executeAssert( Assert s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeAssert not implemented");
	} 
	
	protected void executeEnumDecl( EnumDecl s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeEnumDecl not implemented");
	} 
	


}
