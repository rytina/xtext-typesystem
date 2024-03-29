package de.itemis.interpreter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.itemis.interpreter.logging.LogEntry;
import de.itemis.interpreter.logging.LogEntry.Kind;

public abstract class AbstractExpressionEvaluator extends InterpreterPart {

	public AbstractExpressionEvaluator( ExecutionContext ctx ) {
		super(ctx);
		ctx.setEvaluator(this);
	}
	
	public abstract Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException;

	protected Object checkNull( EObject e, Object o ) throws UnexpectedNullException {
		if ( o == null ) {
			throw new UnexpectedNullException(e, "unexpected null value");
		}
		return o;
	}
	
	public Object evalCheckNullLog( EObject expr, LogEntry parentLog ) throws InterpreterException {
		return log( expr, checkNull( expr, eval( expr, parentLog ) ), parentLog );
	}
	
	public Object evalLog( EObject expr, LogEntry parentLog ) throws InterpreterException {
		return log( expr, eval( expr, parentLog ), parentLog );
	}
	
	protected Object doublePlusDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNullLog(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNullLog(right, log)).doubleValue();
		return leftVal + rightVal;
	}
	
	protected Object doubleMinusDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNullLog(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNullLog(right, log)).doubleValue();
		return leftVal - rightVal;
	}
	
	protected Object doubleTimesDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNullLog(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNullLog(right, log)).doubleValue();
		return leftVal * rightVal;
	}
	
	protected Object doubleDivDouble( EObject left, EObject right, LogEntry log ) throws InterpreterException {
		double leftVal = ((Double)evalCheckNullLog(left, log)).doubleValue();
		double rightVal = ((Double)evalCheckNullLog(right, log)).doubleValue();
		return leftVal / rightVal;
	}
	
	
	protected Object intDoublePlus( EObject expr, EObject left, EObject right, LogEntry log ) throws InterpreterException {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		if ( leftVal instanceof Integer && rightVal instanceof Integer ) return Integer.valueOf( ((Integer)leftVal).intValue() + ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Double && rightVal instanceof Integer ) return Double.valueOf( ((Double)leftVal).doubleValue() + ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Integer && rightVal instanceof Double ) return Double.valueOf( ((Integer)leftVal).intValue() + ((Double)rightVal).doubleValue() );
		if ( leftVal instanceof Double && rightVal instanceof Double ) return Double.valueOf( ((Double)leftVal).doubleValue() + ((Double)rightVal).doubleValue() );
		throw new InterpreterException(expr, "don't know how to handle addition in doubleIntPlus(...)");
	}
	
	protected Object intDoubleMinus( EObject expr, EObject left, EObject right, LogEntry log ) throws InterpreterException {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		if ( leftVal instanceof Integer && rightVal instanceof Integer ) return Integer.valueOf( ((Integer)leftVal).intValue() - ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Double && rightVal instanceof Integer ) return Double.valueOf( ((Double)leftVal).doubleValue() - ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Integer && rightVal instanceof Double ) return Double.valueOf( ((Integer)leftVal).intValue() - ((Double)rightVal).doubleValue() );
		if ( leftVal instanceof Double && rightVal instanceof Double ) return Double.valueOf( ((Double)leftVal).doubleValue() - ((Double)rightVal).doubleValue() );
		throw new InterpreterException(expr, "don't know how to handle subtraction in doubleIntMinus(...)");
	}
	
	protected Object intDoubleMulti( EObject expr, EObject left, EObject right, LogEntry log ) throws InterpreterException {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		if ( leftVal instanceof Integer && rightVal instanceof Integer ) return Integer.valueOf( ((Integer)leftVal).intValue() * ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Double && rightVal instanceof Integer ) return Double.valueOf( ((Double)leftVal).doubleValue() * ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Integer && rightVal instanceof Double ) return Double.valueOf( ((Integer)leftVal).intValue() * ((Double)rightVal).doubleValue() );
		if ( leftVal instanceof Double && rightVal instanceof Double ) return Double.valueOf( ((Double)leftVal).doubleValue() * ((Double)rightVal).doubleValue() );
		throw new InterpreterException(expr, "don't know how to handle multiplication in doubleIntMulti(...)");
	}
	
	protected Object intDoubleDiv( EObject expr, EObject left, EObject right, LogEntry log ) throws InterpreterException {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		if ( leftVal instanceof Integer && rightVal instanceof Integer ) return Integer.valueOf( ((Integer)leftVal).intValue() / ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Double && rightVal instanceof Integer ) return Double.valueOf( ((Double)leftVal).doubleValue() / ((Integer)rightVal).intValue() );
		if ( leftVal instanceof Integer && rightVal instanceof Double ) return Double.valueOf( ((Integer)leftVal).intValue() / ((Double)rightVal).doubleValue() );
		if ( leftVal instanceof Double && rightVal instanceof Double ) return Double.valueOf( ((Double)leftVal).doubleValue() / ((Double)rightVal).doubleValue() );
		throw new InterpreterException(expr, "don't know how to handle division in doubleIntDiv(...)");
	}
	
	protected int intDoubleCompareNumeric(Object left, Object right) {
		if ( left.equals(right) ) return 0;
		if ( left instanceof Integer && right instanceof Integer ) {
			int l = ((Integer)left).intValue();
			int r = ((Integer)right).intValue();
			if ( l < r ) return -1;
			if ( l > r ) return 1;
		}
		else if ( left instanceof Double && right instanceof Integer ) {
			double l = ((Double)left).doubleValue();
			int r = ((Integer)right).intValue();
			if ( l < r ) return -1;
			if ( l > r ) return 1;
		}
		else if ( left instanceof Integer && right instanceof Double ) {
			int l = ((Integer)left).intValue();
			double r = ((Double)right).doubleValue();
			if ( l < r ) return -1;
			if ( l > r ) return 1;
		}
		else if ( left instanceof Double && right instanceof Double ) {
			double l = ((Double)left).doubleValue();
			double r = ((Double)right).doubleValue();
			if ( l < r ) return -1;
			if ( l > r ) return 1;
		}
		return 0;
	}

	protected Object intDoubleEquals(EObject left, EObject right, LogEntry log) {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		int c = intDoubleCompareNumeric( leftVal, rightVal );
		return c == 0;
	}

	protected Object intDoubleUnequals(EObject left, EObject right, LogEntry log) {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		int c = intDoubleCompareNumeric( leftVal, rightVal );
		return c != 0;
	}

	protected Object intDoubleGreater(EObject left, EObject right, LogEntry log) {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		int c = intDoubleCompareNumeric( leftVal, rightVal );
		return c > 0;
	}
	
	protected Object intDoubleGreaterEquals(EObject left, EObject right, LogEntry log) {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		int c = intDoubleCompareNumeric( leftVal, rightVal );
		return c >= 0;
	}
	
	protected Object intDoubleSmaller(EObject left, EObject right, LogEntry log) {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		int c = intDoubleCompareNumeric( leftVal, rightVal );
		return c < 0;
	}

	protected Object intDoubleSmallerEquals(EObject left, EObject right, LogEntry log) {
		Object leftVal = evalCheckNullLog( left, log );
		Object rightVal = evalCheckNullLog( right, log );
		int c = intDoubleCompareNumeric( leftVal, rightVal );
		return c <= 0;
	}
	
	protected Object booleanOr(EObject left, EObject right, LogEntry log) {
		boolean leftVal = ((Boolean)evalCheckNullLog( left, log )).booleanValue();
		boolean rightVal = ((Boolean)evalCheckNullLog( right, log )).booleanValue();
		return leftVal || rightVal;
	}

	protected Object booleanAnd(EObject left, EObject right, LogEntry log) {
		boolean leftVal = ((Boolean)evalCheckNullLog( left, log )).booleanValue();
		boolean rightVal = ((Boolean)evalCheckNullLog( right, log )).booleanValue();
		return leftVal && rightVal;
	}

	protected Object booleanNot(EObject expr, LogEntry log) {
		boolean val = ((Boolean)evalCheckNullLog( expr, log )).booleanValue();
		return !val;
	}

	protected Object callAndReturnWithPositionalArgs(String name, EList<? extends EObject> formals,
			EList<? extends EObject> actuals, EList<? extends EObject> bodyStatements, Object returnSymbol, LogEntry log) {
		ctx.environment.push(name);
		for( int i=0; i<actuals.size(); i++ ) {
			EObject actual = actuals.get(i);
			EObject formal = formals.get(i);
			ctx.environment.put(formal, evalCheckNullLog(actual, log));
		}
		ctx.getExecutor().execute( bodyStatements, log );
		Object res = ctx.environment.get(returnSymbol);
		ctx.environment.pop();
		return res;
	}

	
	protected Object log( EObject expr, Object res, LogEntry log ) {
		log.child(Kind.result, expr, "result: "+res.toString());
		return res;
	}
	







	
}
