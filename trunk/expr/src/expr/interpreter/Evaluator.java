package expr.interpreter;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;
import expr.exprDemo.Formula;
import expr.exprDemo.Multi;
import expr.exprDemo.NumberLiteral;
import expr.exprDemo.Plus;
import expr.exprDemo.StringLiteral;
import expr.exprDemo.Symbol;
import expr.exprDemo.SymbolRef;
import expr.exprDemo.VarDecl;

public class Evaluator extends AbstractExprDemoExpressionEvaluator {

	public Evaluator(ExecutionContext ctx) {
		super(ctx);
	}
	
	@Override
	protected Object evalNumberLiteral(NumberLiteral expr, LogEntry log)
			throws InterpreterException {
		return new Double( expr.getValue() );
	}
	
	@Override
	protected Object evalStringLiteral(StringLiteral expr, LogEntry log)
			throws InterpreterException {
		return ( expr.getValue() );
	}
	
	@Override
	protected Object evalMulti(Multi expr, LogEntry log)
			throws InterpreterException {
		Double l = (Double)evalCheckNull( expr.getLeft(), log);
		Double r = (Double)evalCheckNull( expr.getRight(), log);
		return new Double( l.doubleValue() * r.doubleValue() );
	}
	
	@Override
	protected Object evalPlus(Plus expr, LogEntry log)
			throws InterpreterException {
		Double l = (Double)evalCheckNull( expr.getLeft(), log);
		Double r = (Double)evalCheckNull( expr.getRight(), log);
		return new Double( l.doubleValue() + r.doubleValue() );
	}
	
	@Override
	protected Object evalSymbolRef(SymbolRef expr, LogEntry log)
			throws InterpreterException {
		Symbol symbol = expr.getSymbol();
		if ( symbol instanceof VarDecl ) {
			return ctx.symboltable.getCheckNull(symbol);
		}
		if ( symbol instanceof Formula ) {
			return eval(((Formula) symbol).getExpr(), log);
		}
		throw new InterpreterException(expr, "interpreter failed; cannot resolve symbol reference "+expr.eClass().getName());
	}

}
