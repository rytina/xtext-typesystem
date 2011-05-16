		package expr.typesys;

		import org.eclipse.emf.ecore.EObject;
		import de.itemis.xtext.typesystem.exceptions.TypesystemConfigurationException;
		import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

		public  abstract class ExprTypesystemGenerated extends de.itemis.xtext.typesystem.DefaultTypesystem {

			protected expr.exprDemo.ExprDemoPackage p = expr.exprDemo.ExprDemoPackage.eINSTANCE;

			protected void initialize() {

				try {

						// ----------------------------------------------------------------
						// Section: Basics

						declareSubtype( p.getIntType(), p.getFloatType());
						// include subtypes!
						useCloneAsType( p.getType() );
						useCloneAsType( p.getPrimitiveType() );
						useCloneAsType( p.getIntType() );
						useCloneAsType( p.getBoolType() );
						useCloneAsType( p.getFloatType() );
						useCloneAsType( p.getStringType() );
						// ------
						useFixedType( p.getStringLiteral(), p.getStringType() );
						useFixedType( p.getEquals(), p.getBoolType() );
						useTypeOfFeature( p.getVarDecl(), p.getVarDecl_Type() );
						ensureOrderedCompatibility( p.getVarDecl(), p.getVarDecl_Type(), p.getVarDecl_Init() );
						useTypeOfFeature( p.getFormula(), p.getFormula_Type() );
						ensureOrderedCompatibility( p.getFormula(), p.getFormula_Type(), p.getFormula_Expr() );
						useTypeOfFeature( p.getSymbolRef(), p.getSymbolRef_Symbol() );
						computeCommonType( p.getPlus(), p.getPlus_Left(), p.getPlus_Right());
						ensureFeatureType( p.getPlus(), p.getPlus_Left(), p.getIntType(), p.getFloatType() );
						ensureFeatureType( p.getPlus(), p.getPlus_Right(), p.getIntType(), p.getFloatType() );
						ensureUnorderedCompatibility( p.getPlus(), p.getPlus_Left(), p.getPlus_Right() );
						computeCommonType( p.getMulti(), p.getMulti_Left(), p.getMulti_Right());
						ensureFeatureType( p.getMulti(), p.getMulti_Left(), p.getIntType(), p.getFloatType() );
						ensureFeatureType( p.getMulti(), p.getMulti_Right(), p.getIntType(), p.getFloatType() );
						ensureUnorderedCompatibility( p.getMulti(), p.getMulti_Left(), p.getMulti_Right() );

						// ----------------------------------------------------------------
						// Section: Enum Stuff

						useTypeOfFeature( p.getEnumType(), p.getEnumType_EnumRef() );
						declareTypeComparisonFeature( p.getEnumType(), p.getEnumType_EnumRef() );
						useTypeOfAncestor( p.getEnumLiteral(), p.getEnumDecl() );

						// ----------------------------------------------------------------
						// Section: Array Things

						declareTypeRecursionFeature( p.getArrayType(), p.getArrayType_BaseType() );
						ensureFeatureType( p.getArrayAccess(), p.getArrayAccess_Expr(), p.getArrayType() );
						ensureFeatureType( "Array Index must be Int", p.getArrayAccess(), p.getArrayAccess_Index(), p.getIntType() );

						// ----------------------------------------------------------------
						// Section: Assert

						ensureOrderedCompatibility( p.getAssert(), p.getAssert_Expected(), p.getAssert_Actual() );
						ensureFeatureType( p.getAssert(), p.getAssert_Msg(), p.getStringType() );

						// ----------------------------------------------------------------
						// Section: FUnctions

						useTypeOfFeature( p.getParameter(), p.getParameter_Type() );
						useTypeOfFeature( p.getFunctionDeclaration(), p.getFunctionDeclaration_Type() );

				} catch ( TypesystemConfigurationException ex ) {
				}
			}

			protected abstract EObject type( expr.exprDemo.NumberLiteral element, TypeCalculationTrace trace );
			protected abstract EObject type( expr.exprDemo.EnumDecl element, TypeCalculationTrace trace );
			protected abstract EObject type( expr.exprDemo.ArrayType element, TypeCalculationTrace trace );
			protected abstract EObject type( expr.exprDemo.ArrayAccess element, TypeCalculationTrace trace );

		}
