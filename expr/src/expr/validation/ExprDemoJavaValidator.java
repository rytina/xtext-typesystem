package expr.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.util.Utils;
import expr.exprDemo.Expr;
import expr.exprDemo.ExprDemoPackage;
import expr.exprDemo.FunctionDeclaration;
import expr.exprDemo.Parameter;
import expr.exprDemo.Return;
import expr.exprDemo.Symbol;
import expr.exprDemo.SymbolRef;
import expr.services.ExprDemoGrammarAccess.FunctionDeclarationElements;
 

public class ExprDemoJavaValidator extends AbstractExprDemoJavaValidator {

	@Inject
	private ITypesystem ts;
	
	private ExprDemoPackage lang = ExprDemoPackage.eINSTANCE;

	
	@Check
	public void checkTypesystemRules( EObject x ) {
		ts.checkTypesystemConstraints(x, this);
	}
	
	@Check 
	public void checkArgs( SymbolRef r ) {		// FUNC
		Symbol symbol = r.getSymbol();
		if ( symbol instanceof FunctionDeclaration && r.getActuals().isEmpty() ) {
			error( "arguments missing", r, -1 );
		}
	}
	
	@Check
	public void checkReturnOnlyInFunction( Return r ) {
		if ( Utils.ancestor(r, FunctionDeclaration.class) == null ) {
			error( "return can only be used inside of funtctions", r, -1);
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
					ts.typeString(rtype), r, lang.RETURN__EXPR);
		}
	}

	@Check
	public void checkArgumentTypes( SymbolRef r ) {
		Symbol symbol = r.getSymbol();
		if ( symbol instanceof FunctionDeclaration ) {
			FunctionDeclaration fd = (FunctionDeclaration) symbol;
			if ( r.getActuals().size() != fd.getParams().size() ) {
				error( "wrong number of args ", r, -1 );
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
							ts.typeString(atype), a, -1);
				}
				i++;
			}
		}
	}
	
	

	
}
