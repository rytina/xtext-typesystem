package expr.typesystem;

import org.eclipse.emf.ecore.EObject;

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

public class ExprTypesystem extends DefaultTypesystem {

	private ExprDemoPackage lang = ExprDemoPackage.eINSTANCE;

	@Override
	protected void initialize() {
		
		try {
			
			useCloneAsType(lang.getIntType());
			useCloneAsType(lang.getBoolType());
			useCloneAsType(lang.getFloatType());
			 
			useTypeOfFeature(lang.getVarDecl(), lang.getVarDecl_Type()); 
			useTypeOfFeature(lang.getFormula(), lang.getFormula_Type()); 
			
			useTypeOfFeature(lang.getSymbolRef(), lang.getSymbolRef_Symbol());
			
			declareSubtype(lang.getIntType(), lang.getFloatType());
			
			computeCommonType(lang.getPlus(), lang.getPlus_Left(), lang.getPlus_Right() );
			computeCommonType(lang.getMulti(), lang.getMulti_Left(), lang.getMulti_Right() );
			
			ensureFeatureType(lang.getPlus(), lang.getPlus_Left(), lang.getIntType(), lang.getFloatType());
			ensureFeatureType(lang.getPlus(), lang.getPlus_Right(), lang.getIntType(), lang.getFloatType());
			
			ensureFeatureType(lang.getMulti(), lang.getMulti_Left(), lang.getIntType(), lang.getFloatType());
			ensureFeatureType(lang.getMulti(), lang.getMulti_Right(), lang.getIntType(), lang.getFloatType());
			
			ensureOrderedCompatibility(lang.getFormula(), lang.getFormula_Type(), lang.getFormula_Expr());
			
			// enums
			useTypeOfFeature(lang.getEnumType(), lang.getEnumType_EnumRef());
			useTypeOfAncestor(lang.getEnumLiteral(), lang.getEnumDecl());
			declareTypeComparisonFeature(lang.getEnumType(), lang.getEnumType_EnumRef());
			
			// array
			declareTypeRecursionFeature(lang.getArrayType(), lang.getArrayType_BaseType());
			ensureFeatureType(lang.getArrayAccess(), lang.getArrayAccess_Expr(), lang.getArrayType());
			ensureFeatureType("array index must be Int, idiot :)", lang.getArrayAccess(), lang.getArrayAccess_Index(), lang.getIntType());
			
			// coercion
			useCloneAsType(lang.getStringType());
			useFixedType(lang.getStringLiteral(), lang.getStringType());
			ensureOrderedCompatibility(lang.getVarDecl(), lang.getVarDecl_Type(), lang.getVarDecl_Init());

			
		} catch (TypesystemConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
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
	
	public String typeToString( ArrayType a ) {
		return "array["+typeString(a.getBaseType())+"]";
	}	
	
	public EObject type( ArrayType a, TypeCalculationTrace trace ) {
		ArrayType arraytype = (ArrayType) Utils.create(lang.getArrayType());
		EObject basetype = typeof( a.getBaseType(), trace );
		arraytype.setBaseType( (Type) basetype );
		trace.add(a, "base type is "+typeString(basetype));
		return arraytype;
	}
		
	public EObject type( ArrayAccess a, TypeCalculationTrace trace ) {
		ArrayType arrayType = (ArrayType) typeof( a.getExpr(), trace );
		trace.add( a, "array type is "+typeString(arrayType));
		Type bt = arrayType.getBaseType();
		trace.add( a, "base type is is "+typeString(bt));
		return bt;
	}
		

	public EObject type( EnumDecl l, TypeCalculationTrace trace ) {
		EnumType t = (EnumType) Utils.create(lang.getEnumType());
		t.setEnumRef(l);
		trace.add(l, "enum, type is "+typeString(t));
		return t;
	}
 
	
	
	public EObject type( NumberLiteral l, TypeCalculationTrace trace ) {
		if ( l.getValue().toString().indexOf(".") > 0 ) {
			return Utils.create(lang.getFloatType());
		} else {
			return Utils.create(lang.getIntType());
		}
	}

}
