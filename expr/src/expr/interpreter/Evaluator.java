package expr.interpreter;

import java.util.List;


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
	protected Object evalNumberLiteral(NumberLiteral expr, LogEntry log) {
		return new Double( expr.getValue() );
	}
	
	@Override
	protected Object evalStringLiteral(StringLiteral expr, LogEntry log) {
		return expr.getValue();
	}
	
	@Override
	protected Object evalMulti(Multi expr, LogEntry log) {
		return doubleTimesDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	@Override
	protected Object evalPlus(Plus expr, LogEntry log) {
		return doublePlusDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	@Override
	protected Object evalSymbolRef(SymbolRef expr, LogEntry log) {
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
			return callAndReturnWithPositionalArgs("calling "+fd.getName(), fd.getParams(), 
					expr.getActuals(), fd.getElements(), RETURN_SYMBOL, log);
		}
		throw new InterpreterException(expr, "interpreter failed; cannot resolve symbol reference "+expr.eClass().getName());
	}
	

}
