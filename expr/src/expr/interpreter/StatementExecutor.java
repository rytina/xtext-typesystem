package expr.interpreter;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;
import expr.exprDemo.Assert;
import expr.exprDemo.Expr;
import expr.exprDemo.Formula;
import expr.exprDemo.VarDecl;

public class StatementExecutor extends AbstractExprDemoStatementExecutor {

	public StatementExecutor(ExecutionContext ctx, Evaluator evaluator ) {
		super(ctx, evaluator);
	}
	
	@Override
	protected void executeVarDecl(VarDecl s, LogEntry log)
			throws InterpreterException {
		Expr init = ((VarDecl) s).getInit();
		if ( init != null) {
			ctx.symboltable.put(s, eval( init, log ));
		}
	}
	
	@Override
	protected void executeFormula(Formula s, LogEntry log)
			throws InterpreterException {
		ctx.symboltable.put(s, eval( s.getExpr(), log ) );
	}
	
	@Override
	protected void executeAssert(Assert s, LogEntry log)
			throws InterpreterException {
		Object expected = eval( s.getExpected(), log );
		Object actual = eval( s.getActual(), log );
		if ( !expected.equals(actual) ) {
			ctx.messages.addError(s, "Failed; expected "+expected+", but is "+actual );
		}
	}

} 
