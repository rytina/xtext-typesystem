package expr2.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MessageList;
import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.util.Utils;
import expr2.expr2Dsl.Assert;
import expr2.expr2Dsl.Element;
import expr2.expr2Dsl.Expr;
import expr2.expr2Dsl.Expr2DslPackage;
import expr2.expr2Dsl.Formula;
import expr2.expr2Dsl.FunctionDeclaration;
import expr2.expr2Dsl.Model;
import expr2.expr2Dsl.Parameter;
import expr2.expr2Dsl.Return;
import expr2.expr2Dsl.Symbol;
import expr2.expr2Dsl.SymbolRef;
import expr2.expr2Dsl.VarDecl;
import expr2.interpreter.ExprModelInterpreter;
 

public class Expr2DslJavaValidator extends AbstractExpr2DslJavaValidator {

	public static final String INTERPRETERFAILED = "INTERPRETERFAILED";

	@Inject
	private ITypesystem ts;
	
	private Expr2DslPackage lang = Expr2DslPackage.eINSTANCE;

	
	@Check
	public void checkTypesystemRules( EObject x ) {
		ts.checkTypesystemConstraints(x, this);
	}
	
	@Check 
	public void checkArgs( SymbolRef r ) {		// FUNC
		Symbol symbol = r.getSymbol();
		if ( symbol instanceof FunctionDeclaration && r.getActuals().isEmpty() ) {
			error( "arguments missing", lang.getSymbolRef_Actuals() );
		}
	}
	
	@Check
	public void checkReturnOnlyInFunction( Return r ) {
		if ( Utils.ancestor(r, FunctionDeclaration.class) == null ) {
			error( "return can only be used inside of funtctions", r, null, -1);
		}
	}
	
	@Check()
	public void runAssertStatements( Model m ) {
		if ( !m.isIsTested() ) return;
		try {
			MessageList errors = new ExprModelInterpreter().runModel(m, ts);
			for (MessageList.MessageItem o: errors.getMessages()) {
				error( o.message, o.element, null, -1, INTERPRETERFAILED );
			}
		} catch (InterpreterException e) {
			if ( e.getFailedObject() != null ) {
				error( e.getMessage(), e.getFailedObject(), null, -1, INTERPRETERFAILED );
			} else {
				error( e.getMessage(), m, null, -1, INTERPRETERFAILED );
				e.printStackTrace();
			}
		}
	}
	
	@Check
	public void checkReturnExprType( Return r ) {
		FunctionDeclaration f = Utils.ancestor(r, FunctionDeclaration.class);
		EObject ftype = ts.typeof( f, new TypeCalculationTrace() );
		EObject rtype = ts.typeof( r.getExpr(), new TypeCalculationTrace() );
		if ( !ts.isCompatibleTypeOrdered(f, ftype, r, rtype, new TypeCalculationTrace()) ) {
			error( "incompatible types; expected "+
					ts.typeString(ftype)+", found "+
					ts.typeString(rtype), lang.getReturn_Expr());
		}
	}

	@Check
	public void checkArgumentTypes( SymbolRef r ) {
		Symbol symbol = r.getSymbol();
		if ( symbol instanceof FunctionDeclaration ) {
			FunctionDeclaration fd = (FunctionDeclaration) symbol;
			if ( r.getActuals().size() != fd.getParams().size() ) {
				error( "wrong number of args ", r, null, -1 );
				return;
			}
			EList<Expr> actuals = r.getActuals();
			int i = 0;
			for (Expr a: actuals) {
				Parameter p = (Parameter) fd.getParams().get(i);
				EObject ptype = ts.typeof( p, new TypeCalculationTrace() );
				EObject atype = ts.typeof( a, new TypeCalculationTrace() );
				if ( !ts.isCompatibleTypeOrdered(p, ptype, a, atype, new TypeCalculationTrace()) ) {
					error( "incompatible types; expected "+
							ts.typeString(ptype)+", found "+
							ts.typeString(atype), a, null, -1);
				}
				i++;
			}
		}
	}
	
	@Check
	public void checkTestCoverage( Formula f )  {
		Model m = Utils.ancestor(f, Model.class);
		if ( !m.isIsTested() ) return;
		EList<Element> elements = m.getElements();
		for (Element element : elements) {
			if ( element instanceof Assert ) {
				Expr actual = ((Assert) element).getActual();
				if ( actual instanceof SymbolRef ) {
					if ( ((SymbolRef) actual).getSymbol() == f ) return; // alles ok!
				}
			}
		}
		warning("no test found for this formula", f, null, -1);
	}	
	
	@Check
	public void checkReadonlyStuff(VarDecl ctx) {
		if ( ctx.isReadonly() && ctx.getInit() == null ) {
			error("readonly vars must have an init expression", ctx, null, -1);
		}
	}

}
