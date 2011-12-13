package expr2.interpreter;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;
import expr2.expr2Dsl.Formula;
import expr2.expr2Dsl.FunctionDeclaration;
import expr2.expr2Dsl.Minus;
import expr2.expr2Dsl.Multi;
import expr2.expr2Dsl.NumberLiteral;
import expr2.expr2Dsl.Parameter;
import expr2.expr2Dsl.Plus;
import expr2.expr2Dsl.StringLiteral;
import expr2.expr2Dsl.Symbol;
import expr2.expr2Dsl.SymbolRef;
import expr2.expr2Dsl.VarDecl;

public class Evaluator extends AbstractExpr2DslExpressionEvaluator {

	public static final String RETURN_SYMBOL = "____ret____";

	public Evaluator(ExecutionContext ctx) {
		super(ctx);
	}
	
	protected Object evalNumberLiteral(NumberLiteral expr, LogEntry log) {
		return new Double( expr.getValue() );
	}
	
	protected Object evalStringLiteral(StringLiteral expr, LogEntry log) {
		return expr.getValue();
	}
	
	protected Object evalMulti(Multi expr, LogEntry log) {
		return doubleTimesDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	protected Object evalPlus(Plus expr, LogEntry log) {
		return doublePlusDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	protected Object evalMinus(Minus expr, LogEntry log) {
		return doubleMinusDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	protected Object evalSymbolRef(SymbolRef expr, LogEntry log) {
		Symbol symbol = expr.getSymbol();
		if ( symbol instanceof VarDecl ) {
			return log( symbol, ctx.environment.getCheckNull(symbol), log);
		}
		if ( symbol instanceof Formula ) {
			return evalCheckNullLog(((Formula) symbol).getExpr(), log);
		}
		if ( symbol instanceof Parameter ) {
			return log( symbol, ctx.environment.get(symbol), log );
		}
		if ( symbol instanceof FunctionDeclaration ) {
			FunctionDeclaration fd = (FunctionDeclaration) symbol;
			return callAndReturnWithPositionalArgs("calling "+fd.getName(), fd.getParams(), 
					expr.getActuals(), fd.getElements(), RETURN_SYMBOL, log);
		}
		throw new InterpreterException(expr, "interpreter failed; cannot resolve symbol reference "+expr.eClass().getName());
	}
	

}
