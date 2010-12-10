package expr.interpreter;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;
import expr.exprDemo.Expr;
import expr.exprDemo.Formula;
import expr.exprDemo.FunctionDeclaration;
import expr.exprDemo.Multi;
import expr.exprDemo.NumberLiteral;
import expr.exprDemo.Parameter;
import expr.exprDemo.Plus;
import expr.exprDemo.StringLiteral;
import expr.exprDemo.Symbol;
import expr.exprDemo.SymbolRef;
import expr.exprDemo.VarDecl;

public class Evaluator extends AbstractExprDemoExpressionEvaluator {

	public static final String RETURN_SYMBOL = "____ret____";

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
		return expr.getValue();
	}
	
	@Override
	protected Object evalMulti(Multi expr, LogEntry log)
			throws InterpreterException {
		return doubleTimesDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	@Override
	protected Object evalPlus(Plus expr, LogEntry log)
			throws InterpreterException {
		return doublePlusDouble(expr.getLeft(), expr.getRight(), log);
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
		if ( symbol instanceof Parameter ) {
			return ctx.symboltable.get(symbol);
		}
		if ( symbol instanceof FunctionDeclaration ) {
			FunctionDeclaration fd = (FunctionDeclaration) symbol;
			ctx.symboltable.push("calling function");
			for( int i=0; i<expr.getActuals().size(); i++ ) {
				Expr actual = expr.getActuals().get(i);
				Parameter formal = (Parameter) fd.getParams().get(i);
				ctx.symboltable.put(formal, evalCheckNull(actual, log));
			}
			ctx.getExecutor().execute( fd.getElements(), log );
			Object res = ctx.symboltable.get(RETURN_SYMBOL);
			ctx.symboltable.pop();
			return res;
		}
		throw new InterpreterException(expr, "interpreter failed; cannot resolve symbol reference "+expr.eClass().getName());
	}
	

}
