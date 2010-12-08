package expr.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.itemis.interpreter.MessageList;
import de.itemis.interpreter.SymbolTable;

import expr.exprDemo.Assert;
import expr.exprDemo.Element;
import expr.exprDemo.Expr;
import expr.exprDemo.Formula;
import expr.exprDemo.Model;
import expr.exprDemo.Multi;
import expr.exprDemo.NumberLiteral;
import expr.exprDemo.Plus;
import expr.exprDemo.StringLiteral;
import expr.exprDemo.Symbol;
import expr.exprDemo.SymbolRef;
import expr.exprDemo.VarDecl;

public class ExprModelInterpreter {

	private SymbolTable symtab = new SymbolTable();
	private MessageList messages = new MessageList();
	
	public MessageList runModel( Model m ) {
		try {
			execute(m.getElements());
			return messages;
		} catch ( Throwable t ) {
			t.printStackTrace();
		}
		return null;
	}

	private void execute(EList<Element> elements) {
		for (Element element : elements) {
			execute( element );
		}
		
	}

	private void execute(Element element) {
		try {
			if ( element instanceof VarDecl ) {
				Expr init = ((VarDecl) element).getInit();
				if ( init != null) {
					Object initVal = eval( init );
					symtab.put(element, initVal);
				}
			} else if ( element instanceof Formula ) {
				Object val = eval( ((Formula) element).getExpr() );
				symtab.put(element, val);
			} else if ( element instanceof Assert ) {
				Expr expected = ((Assert) element).getExpected();
				Expr actual = ((Assert) element).getActual();
				Object expectedVal = eval( expected );
				Object actualVal = eval( actual );
				if ( !expectedVal.equals(actualVal) ) {
					messages.addError(element, "Failed; expected "+expectedVal+", but is "+actualVal );
				}
			}
		} catch ( InterpreterKaputtException ex ) {
			messages.addError(ex.element, ex.getMessage());
		}
		
	}

	private Object eval(Expr e) throws InterpreterKaputtException {
		if ( e instanceof Multi ) {
			Multi p = (Multi) e;
			Double l = (Double)eval( ((Multi) e).getLeft());
			Double r = (Double)eval( ((Multi) e).getRight());
			return new Double( l.doubleValue() * r.doubleValue() );
		}
		if ( e instanceof Plus ) {
			Plus p = (Plus) e;
			Double l = (Double)eval( ((Plus) e).getLeft());
			Double r = (Double)eval( ((Plus) e).getRight());
			if ( l == null ) {
				messages.addError(e, "left value is null");
				return 0;
			}
			if ( r == null ) {
				messages.addError(e, "right value is null");
				return 0;
			}
			return new Double( l.doubleValue() + r.doubleValue() );
		}
		if ( e instanceof NumberLiteral ) {
			return new Double( ((NumberLiteral) e).getValue() );
		}
		if ( e instanceof SymbolRef ) {
			Symbol symbol = ((SymbolRef) e).getSymbol();
			if ( symbol instanceof VarDecl ) {
				return symtab.get(symbol);
			}
			if ( symbol instanceof Formula ) {
				return eval(((Formula) symbol).getExpr());
			}
			throw new InterpreterKaputtException(e, "interpreter failed; cannot resolve symbol reference"+e.eClass().getName());
		}
		if ( e instanceof StringLiteral ) {
			return ((StringLiteral) e).getValue();
		}
		throw new InterpreterKaputtException(e, "interpreter failed for "+e.eClass().getName());
	}
	
	
}
