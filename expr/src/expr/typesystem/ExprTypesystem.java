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
			 * BASIC + SUBTYPING
			 */
			
			// see functions below...
			
			// primitive types use clones of themselves as their type
			useCloneAsType(lang.getIntType());
			useCloneAsType(lang.getBoolType());
			useCloneAsType(lang.getFloatType());
			useCloneAsType(lang.getStringType());

			// string literals have string type
			useFixedType(lang.getStringLiteral(), lang.getStringType());
			
			// variable declarations and formulas use have the type of their type
			useTypeOfFeature(lang.getVarDecl(), lang.getVarDecl_Type()); 
			useTypeOfFeature(lang.getFormula(), lang.getFormula_Type()); 
			
			// a symbol reference has the type of the symbol it references
			useTypeOfFeature(lang.getSymbolRef(), lang.getSymbolRef_Symbol());
			
			// plus and multi must have ints or floats on either side
			ensureFeatureType(lang.getPlus(), lang.getPlus_Left(), lang.getIntType(), lang.getFloatType());
			ensureFeatureType(lang.getPlus(), lang.getPlus_Right(), lang.getIntType(), lang.getFloatType());
			ensureFeatureType(lang.getMulti(), lang.getMulti_Left(), lang.getIntType(), lang.getFloatType());
			ensureFeatureType(lang.getMulti(), lang.getMulti_Right(), lang.getIntType(), lang.getFloatType());

			// float is a subtype of string
			declareSubtype(lang.getIntType(), lang.getFloatType());
			
			// the type of a plus or a multi is the "more general one" of their arguments
			computeCommonType(lang.getPlus(), lang.getPlus_Left(), lang.getPlus_Right() );
			computeCommonType(lang.getMulti(), lang.getMulti_Left(), lang.getMulti_Right() );
			
			// in a formula, the type of the expression must be the same
			// or a subtype of the declared type
			ensureOrderedCompatibility(lang.getFormula(), lang.getFormula_Type(), lang.getFormula_Expr());
			// ... similar for the init-expression of a var
			ensureOrderedCompatibility(lang.getVarDecl(), lang.getVarDecl_Type(), lang.getVarDecl_Init());	

			
			
			/* --------------------------------------------------
			 * ENUM 
			 */
			
			// see functions below...
			
			// when comparing enum types, make sure you also compare
			// the referenced enum (two EnumTypes are only equal if the
			// refernece the same Enum)
			declareTypeComparisonFeature(lang.getEnumType(), lang.getEnumType_EnumRef());

			// the type of an EnumType is the type of the referenced enum 
			useTypeOfFeature(lang.getEnumType(), lang.getEnumType_EnumRef());

			// an enum literal's type is the type of its "owning" enum
			useTypeOfAncestor(lang.getEnumLiteral(), lang.getEnumDecl());
			

			/* --------------------------------------------------
			 * ARRAY
			 */

			// see functions below...

			// when comparing two arrays, recurively compare their base types as well
			declareTypeRecursionFeature(lang.getArrayType(), lang.getArrayType_BaseType());
			
			// in an array expression, the expression to which you add [] must be of array type
			ensureFeatureType(lang.getArrayAccess(), lang.getArrayAccess_Expr(), lang.getArrayType());
			
			// the type of the array index expression must be int; notice the 
			// custom error message
			ensureFeatureType("array index must be Int", lang.getArrayAccess(), lang.getArrayAccess_Index(), lang.getIntType());
			
			
			/* --------------------------------------------------
			 * COERCION
			 */
			
			// see functions below...
			
			
		
			/* --------------------------------------------------
			 * ASSERT
			 */
			ensureFeatureType(lang.getAssert(), lang.getAssert_Expression(), lang.getBoolType());
			ensureFeatureType(lang.getAssert(), lang.getAssert_ErrorMsg(), lang.getStringType());
			useFixedType(lang.getEquals(), lang.getBoolType());
			

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
		if ( l.getValue().toString().indexOf(".") > 0 ) {
			return Utils.create(lang.getFloatType());
		} else {
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
