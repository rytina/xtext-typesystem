package expr.typesystem;

import de.itemis.xtext.typesystem.DefaultTypesystem;
import de.itemis.xtext.typesystem.exceptions.TypesystemConfigurationException;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.util.Utils;
import expr.exprDemo.ArrayAccess;
import expr.exprDemo.ArrayType;
import expr.exprDemo.EnumDecl;
import expr.exprDemo.EnumType;
import expr.exprDemo.ExprDemoPackage;
import expr.exprDemo.IntType;
import expr.exprDemo.NumberLiteral;
import expr.exprDemo.StringLiteral;
import expr.exprDemo.StringType;
import expr.exprDemo.Type;

import org.eclipse.emf.ecore.EObject;

public class ExprTypesystem extends DefaultTypesystem {

	private ExprDemoPackage lang = ExprDemoPackage.eINSTANCE;

	@Override
	protected void initialize() {
		
		try {
			

			/* --------------------------------------------------
			 * FUNCTIONSDECLARATION
			 */
			useTypeOfFeature(lang.getParameter(), lang.getParameter_Type());
			useTypeOfFeature(lang.getFunctionDeclaration(), lang.getFunctionDeclaration_Type());
			

			
		} catch (TypesystemConfigurationException e) {
			e.printStackTrace();
		}

	}

	
	
	/* --------------------------------------------------
	 * BASIC + SUBTYPING
	 */
	
	// the type of a number literal depends on whether it has a dot in it
	public EObject type( NumberLiteral l, TypeCalculationTrace trace ) {
		if ( l.getValue().indexOf(".") > 0 ) {
			trace.add(l, "dot found => float");
			return Utils.create(lang.getFloatType());
		} else {
			trace.add(l, "no dot found => int");
			return Utils.create(lang.getIntType());
		}
	}
	
	
	
	/* --------------------------------------------------
	 * ENUM: the type of an EnumDecl is an EnumType that
	 * references the declaration of which it is the type
	 */
	public EObject type( EnumDecl l, TypeCalculationTrace trace ) {
		EnumType t = (EnumType) Utils.create(lang.getEnumType());
		t.setEnumRef(l);
		trace.add(l, "enum, type is "+typeString(t));
		return t;
	}

	
	
	/* --------------------------------------------------
	 * ARRAY
	 */

	// pretty printer for array types
	public String typeToString( ArrayType a ) {
		return "array["+typeString(a.getBaseType())+"]";
	}	
	
	// an array type is an ArrayType that points to its base type
	public EObject type( ArrayType a, TypeCalculationTrace trace ) {
		ArrayType arraytype = (ArrayType) Utils.create(lang.getArrayType());
		EObject basetype = typeof( a.getBaseType(), trace );
		arraytype.setBaseType( (Type) basetype );
		trace.add(a, "base type is "+typeString(basetype));
		return arraytype;
	}
	
	// the type of an array access expression is it's base type
	// (since an array access expression "removes" the array-ness)
	public EObject type( ArrayAccess a, TypeCalculationTrace trace ) {
		ArrayType arrayType = (ArrayType) typeof( a.getExpr(), trace );
		trace.add( a, "array type is "+typeString(arrayType));
		Type bt = arrayType.getBaseType();
		trace.add( a, "base type is is "+typeString(bt));
		return bt;
	}

	
	/* --------------------------------------------------
	 * COERCION
	 */

	// stupid example, but:
	// if the string contains an actual number, treat it as an int type
	public EObject typeCoerce( EObject candidateElement, StringType candidate, IntType expected, TypeCalculationTrace trace ) {
		if ( candidateElement instanceof StringLiteral ) {
			try {
				Integer.valueOf(((StringLiteral) candidateElement).getValue());
				trace.add( candidateElement, "element is number-valued string literal -> coercing to int");
				return create(lang.getIntType());
			} catch ( NumberFormatException fallthrough ) {}
		}
		return null;
	}
	

	
	
	
	
	
	
	
	
	public String typeToString( EObject o ) {
		String cn = o.eClass().getName();
		if ( cn.toLowerCase().endsWith("type")) return cn.substring(0,cn.length()-4);
		return null;
	}
	
		

 
	
	

}
