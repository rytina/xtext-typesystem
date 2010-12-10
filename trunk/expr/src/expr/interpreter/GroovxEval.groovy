package expr.interpreter


import de.itemis.interpreter.ExecutionContext 
import de.itemis.interpreter.InterpreterException 
import de.itemis.interpreter.logging.LogEntry 
import expr.exprDemo.Expr;
import expr.exprDemo.Formula 
import expr.exprDemo.FunctionDeclaration;
import expr.exprDemo.Multi 
import expr.exprDemo.NumberLiteral 
import expr.exprDemo.Parameter;
import expr.exprDemo.Plus 
import expr.exprDemo.StringLiteral 
import expr.exprDemo.Symbol 
import expr.exprDemo.SymbolRef 
import expr.exprDemo.VarDecl 

class GroovxEval extends AbstractExprDemoExpressionEvaluator {

	public GroovxEval(ExecutionContext ctx) {
		super(ctx);
	}
	
	def protected Object evalNumberLiteral(NumberLiteral expr, LogEntry log) throws InterpreterException {
		expr.value;
	}	
	
	protected def evalStringLiteral(StringLiteral expr, LogEntry log) throws InterpreterException {
		expr.value;
	}
	
	protected def evalMulti(Multi expr, LogEntry log) throws InterpreterException {
		doLeftRight( expr, log, { x, y -> x * y } )
	}
	
	protected def evalPlus(Plus expr, LogEntry log) throws InterpreterException {
		doLeftRight( expr, log, { x, y -> x + y } )
	}
	
	protected def evalSymbolRef(SymbolRef expr, LogEntry log) throws InterpreterException {
		Symbol s = expr.symbol
		switch(s) {
			case VarDecl:
				return ctx.symboltable.getCheckNull(s)
			case Formula:
				return eval(((Formula) s).getExpr(), log)
			case Parameter:
				return ctx.symboltable.get(s);
			case FunctionDeclaration:
				FunctionDeclaration fd = (FunctionDeclaration) s;
				ctx.symboltable.push("calling function");
				for( int i=0; i<expr.getActuals().size(); i++ ) {
					Expr actual = expr.getActuals().get(i);
					Parameter formal = (Parameter) fd.getParams().get(i);
					ctx.symboltable.put(formal, evalCheckNull(actual, log));
				}
				ctx.getExecutor().execute( fd.getElements(), log );
				Object res = ctx.symboltable.get(Evaluator.RETURN_SYMBOL);
				ctx.symboltable.pop();
				return res;
	}
	}
	
	
	private def Object doLeftRight( Object expr, LogEntry log, Closure c ) {
		double l = evalCheckNull( expr.left, log )
		double r = evalCheckNull( expr.right, log )
		return c(l,r)
	}
	
}
