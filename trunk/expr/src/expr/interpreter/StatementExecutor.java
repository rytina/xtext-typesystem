package expr.interpreter;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;
import expr.exprDemo.Assert;
import expr.exprDemo.Expr;
import expr.exprDemo.Formula;
import expr.exprDemo.Return;
import expr.exprDemo.VarDecl;

public class StatementExecutor extends AbstractExprDemoStatementExecutor {

	public StatementExecutor(ExecutionContext ctx ) {
		super(ctx);
	}
	
	@Override
	protected void executeVarDecl(VarDecl s, LogEntry log) {
		Expr init = ((VarDecl) s).getInit();
		if ( init != null) {
			ctx.environment.put(s, evalCheckNullLog( init, log ));
		}
	}
	
	@Override
	protected void executeFormula(Formula s, LogEntry log) {
		ctx.environment.put(s, evalCheckNullLog( s.getExpr(), log ) );
	}
	
	@Override
	protected void executeAssert(Assert s, LogEntry log) {
		Object expected = evalCheckNullLog( s.getExpected(), log );
		Object actual = evalCheckNullLog( s.getActual(), log );
		if ( !expected.equals(actual) ) {
			ctx.messages.addError(s, "Failed; expected "+expected+", but is "+actual );
		}
	}
	
	@Override
	protected void executeReturn(Return s, LogEntry log) {
		ctx.environment.put(Evaluator.RETURN_SYMBOL, evalCheckNullLog(s.getExpr(), log));
	}

} 
