typesystem expr2.typesys.Expr2Typesystem 
	ecore file "platform:/resource/expr2/src-gen/expr2/Expr2Dsl.ecore"
	language package expr2.expr2Dsl.Expr2DslPackage
	 
section "Basic" 
	  
	subtype IntType base FloatType
	   
	// primitive types use clones of themselves as their type
	typeof Type + -> clone

	// string literals have string type 
	typeof StringLiteral -> StringType 
	typeof Equals -> BoolType 
	typeof NumberLiteral -> javacode 
	// variable declarations and formulas use have the type of their type
	typeof VarDecl -> feature type {
		ensureCompatibility type :<=: init
	}
	typeof Formula -> feature type {
		ensureCompatibility type :<=: expr
	}
    typeof Symbol -> abstract
	// a symbol reference has the type of the symbol it references
    typeof SymbolRef -> feature symbol 
	// plus must have ints or floats on either side, and the two
	// have to be compatible. Type of Plus is the common supertype
	// of left and right 
	typeof Plus -> common left right {
		ensureType left :<=: IntType, FloatType
		ensureType right :<=: IntType, FloatType
		ensureCompatibility left :<=>: right
	}
	typeof Minus -> common left right {
		ensureType left :<=: IntType, FloatType
		ensureType right :<=: IntType, FloatType
		ensureCompatibility left :<=>: right
	}
	// same for multi...
    typeof Multi -> common left right {
		ensureType left :<=: IntType, FloatType
		ensureType right :<=: IntType, FloatType
		ensureCompatibility left :<=>: right
	}
	
    typeof Expression -> abstract 
	
section "Enum Stuff"

    typeof EnumDecl -> javacode
	// the type of an EnumType is the type of the referenced enum 
    typeof EnumType -> feature enumRef {
		// when comparing enum types, make sure you also compare
		// the referenced enum (two EnumTypes are only equal if the
		// refernece the same Enum)
		compare enumRef
	}
	
	typeof EnumLiteral -> ancestor EnumDecl
	
section "Array Things"

	typeof ArrayType -> javacode {
		// when comparing two arrays, recurively compare their base types as well
		recurse baseType
	}
	typeof ArrayAccess -> javacode {
		// in an array expression, the expression to which you add [] must be of array type
		ensureType expr :<=: ArrayType
		// the type of the array index expression must be int; notice the 
		// custom error message
		ensureType index :<=: IntType "Array Index must be Int" 
	}
	
	
section "Assert" 

    typeof Expr -> abstract
    typeof Assert -> none {
		ensureCompatibility expected :<=: actual
		ensureType msg :<=: StringType
	}

section "FUnctions"

	typeof Parameter -> feature type
	typeof FunctionDeclaration -> feature type	