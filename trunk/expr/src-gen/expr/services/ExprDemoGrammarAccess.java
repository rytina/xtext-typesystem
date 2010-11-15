/*
* generated by Xtext
*/

package expr.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ExprDemoGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsElementParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		
		//Model:
		//	"model" name=ID elements+=Element*;
		public ParserRule getRule() { return rule; }

		//"model" name=ID elements+=Element*
		public Group getGroup() { return cGroup; }

		//"model"
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//elements+=Element*
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }

		//Element
		public RuleCall getElementsElementParserRuleCall_2_0() { return cElementsElementParserRuleCall_2_0; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVarDeclParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFormulaParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumDeclParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAssertParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Element:
		//	VarDecl | Formula | EnumDecl | Assert;
		public ParserRule getRule() { return rule; }

		//VarDecl | Formula | EnumDecl | Assert
		public Alternatives getAlternatives() { return cAlternatives; }

		//VarDecl
		public RuleCall getVarDeclParserRuleCall_0() { return cVarDeclParserRuleCall_0; }

		//Formula
		public RuleCall getFormulaParserRuleCall_1() { return cFormulaParserRuleCall_1; }

		//EnumDecl
		public RuleCall getEnumDeclParserRuleCall_2() { return cEnumDeclParserRuleCall_2; }

		//Assert
		public RuleCall getAssertParserRuleCall_3() { return cAssertParserRuleCall_3; }
	}

	public class AssertElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Assert");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprExprParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Assert:
		//	"assert" expr=Expr ";";
		public ParserRule getRule() { return rule; }

		//"assert" expr=Expr ";"
		public Group getGroup() { return cGroup; }

		//"assert"
		public Keyword getAssertKeyword_0() { return cAssertKeyword_0; }

		//expr=Expr
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }

		//Expr
		public RuleCall getExprExprParserRuleCall_1_0() { return cExprExprParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class EnumDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLiteralsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLiteralsEnumLiteralParserRuleCall_3_0 = (RuleCall)cLiteralsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//EnumDecl:
		//	"enum" name=ID "{" literals+=EnumLiteral* "}";
		public ParserRule getRule() { return rule; }

		//"enum" name=ID "{" literals+=EnumLiteral* "}"
		public Group getGroup() { return cGroup; }

		//"enum"
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//literals+=EnumLiteral*
		public Assignment getLiteralsAssignment_3() { return cLiteralsAssignment_3; }

		//EnumLiteral
		public RuleCall getLiteralsEnumLiteralParserRuleCall_3_0() { return cLiteralsEnumLiteralParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EnumLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEnumLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//EnumLiteral returns Symbol:
		//	{EnumLiteral} name=ID;
		public ParserRule getRule() { return rule; }

		//{EnumLiteral} name=ID
		public Group getGroup() { return cGroup; }

		//{EnumLiteral}
		public Action getEnumLiteralAction_0() { return cEnumLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class VarDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VarDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVarDeclAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVarKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEqualsSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInitAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cInitExprParserRuleCall_4_1_0 = (RuleCall)cInitAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VarDecl returns Symbol:
		//	{VarDecl} "var" type=Type name=ID ("=" init=Expr)? ";";
		public ParserRule getRule() { return rule; }

		//{VarDecl} "var" type=Type name=ID ("=" init=Expr)? ";"
		public Group getGroup() { return cGroup; }

		//{VarDecl}
		public Action getVarDeclAction_0() { return cVarDeclAction_0; }

		//"var"
		public Keyword getVarKeyword_1() { return cVarKeyword_1; }

		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("=" init=Expr)?
		public Group getGroup_4() { return cGroup_4; }

		//"="
		public Keyword getEqualsSignKeyword_4_0() { return cEqualsSignKeyword_4_0; }

		//init=Expr
		public Assignment getInitAssignment_4_1() { return cInitAssignment_4_1; }

		//Expr
		public RuleCall getInitExprParserRuleCall_4_1_0() { return cInitExprParserRuleCall_4_1_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrimitiveTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArrayTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	PrimitiveType | ArrayType;
		public ParserRule getRule() { return rule; }

		//PrimitiveType | ArrayType
		public Alternatives getAlternatives() { return cAlternatives; }

		//PrimitiveType
		public RuleCall getPrimitiveTypeParserRuleCall_0() { return cPrimitiveTypeParserRuleCall_0; }

		//ArrayType
		public RuleCall getArrayTypeParserRuleCall_1() { return cArrayTypeParserRuleCall_1; }
	}

	public class PrimitiveTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrimitiveType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBoolTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFloatTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEnumTypeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cStringTypeParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//PrimitiveType:
		//	IntType | BoolType | FloatType | EnumType | StringType;
		public ParserRule getRule() { return rule; }

		//IntType | BoolType | FloatType | EnumType | StringType
		public Alternatives getAlternatives() { return cAlternatives; }

		//IntType
		public RuleCall getIntTypeParserRuleCall_0() { return cIntTypeParserRuleCall_0; }

		//BoolType
		public RuleCall getBoolTypeParserRuleCall_1() { return cBoolTypeParserRuleCall_1; }

		//FloatType
		public RuleCall getFloatTypeParserRuleCall_2() { return cFloatTypeParserRuleCall_2; }

		//EnumType
		public RuleCall getEnumTypeParserRuleCall_3() { return cEnumTypeParserRuleCall_3; }

		//StringType
		public RuleCall getStringTypeParserRuleCall_4() { return cStringTypeParserRuleCall_4; }
	}

	public class ArrayTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ArrayType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArrayTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cArrayKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBaseTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBaseTypeTypeParserRuleCall_3_0 = (RuleCall)cBaseTypeAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ArrayType:
		//	{ArrayType} "array" "[" baseType=Type "]";
		public ParserRule getRule() { return rule; }

		//{ArrayType} "array" "[" baseType=Type "]"
		public Group getGroup() { return cGroup; }

		//{ArrayType}
		public Action getArrayTypeAction_0() { return cArrayTypeAction_0; }

		//"array"
		public Keyword getArrayKeyword_1() { return cArrayKeyword_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//baseType=Type
		public Assignment getBaseTypeAssignment_3() { return cBaseTypeAssignment_3; }

		//Type
		public RuleCall getBaseTypeTypeParserRuleCall_3_0() { return cBaseTypeTypeParserRuleCall_3_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class EnumTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumType");
		private final Assignment cEnumRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cEnumRefEnumDeclCrossReference_0 = (CrossReference)cEnumRefAssignment.eContents().get(0);
		private final RuleCall cEnumRefEnumDeclIDTerminalRuleCall_0_1 = (RuleCall)cEnumRefEnumDeclCrossReference_0.eContents().get(1);
		
		//EnumType:
		//	enumRef=[EnumDecl];
		public ParserRule getRule() { return rule; }

		//enumRef=[EnumDecl]
		public Assignment getEnumRefAssignment() { return cEnumRefAssignment; }

		//[EnumDecl]
		public CrossReference getEnumRefEnumDeclCrossReference_0() { return cEnumRefEnumDeclCrossReference_0; }

		//ID
		public RuleCall getEnumRefEnumDeclIDTerminalRuleCall_0_1() { return cEnumRefEnumDeclIDTerminalRuleCall_0_1; }
	}

	public class IntTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IntType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIntTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIntKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//IntType:
		//	{IntType} "int";
		public ParserRule getRule() { return rule; }

		//{IntType} "int"
		public Group getGroup() { return cGroup; }

		//{IntType}
		public Action getIntTypeAction_0() { return cIntTypeAction_0; }

		//"int"
		public Keyword getIntKeyword_1() { return cIntKeyword_1; }
	}

	public class BoolTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BoolType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBoolTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBoolKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//BoolType:
		//	{BoolType} "bool";
		public ParserRule getRule() { return rule; }

		//{BoolType} "bool"
		public Group getGroup() { return cGroup; }

		//{BoolType}
		public Action getBoolTypeAction_0() { return cBoolTypeAction_0; }

		//"bool"
		public Keyword getBoolKeyword_1() { return cBoolKeyword_1; }
	}

	public class FloatTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FloatType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFloatTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFloatKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FloatType:
		//	{FloatType} "float";
		public ParserRule getRule() { return rule; }

		//{FloatType} "float"
		public Group getGroup() { return cGroup; }

		//{FloatType}
		public Action getFloatTypeAction_0() { return cFloatTypeAction_0; }

		//"float"
		public Keyword getFloatKeyword_1() { return cFloatKeyword_1; }
	}

	public class StringTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStringTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStringKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//StringType:
		//	{StringType} "string";
		public ParserRule getRule() { return rule; }

		//{StringType} "string"
		public Group getGroup() { return cGroup; }

		//{StringType}
		public Action getStringTypeAction_0() { return cStringTypeAction_0; }

		//"string"
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }
	}

	public class FormulaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Formula");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFormulaAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCalcKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExprAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExprExprParserRuleCall_5_0 = (RuleCall)cExprAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Formula returns Symbol:
		//	{Formula} "calc" type=Type name=ID "=" expr=Expr ";";
		public ParserRule getRule() { return rule; }

		//{Formula} "calc" type=Type name=ID "=" expr=Expr ";"
		public Group getGroup() { return cGroup; }

		//{Formula}
		public Action getFormulaAction_0() { return cFormulaAction_0; }

		//"calc"
		public Keyword getCalcKeyword_1() { return cCalcKeyword_1; }

		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"="
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }

		//expr=Expr
		public Assignment getExprAssignment_5() { return cExprAssignment_5; }

		//Expr
		public RuleCall getExprExprParserRuleCall_5_0() { return cExprExprParserRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class ExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expr");
		private final RuleCall cComparisonParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expr:
		//	Comparison;
		public ParserRule getRule() { return rule; }

		//Comparison
		public RuleCall getComparisonParserRuleCall() { return cComparisonParserRuleCall; }
	}

	public class ComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Comparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAdditionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cEqualsLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cEqualsSignEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAdditionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Comparison returns Expression:
		//	Addition ({Equals.left=current} "==" right=Addition)?;
		public ParserRule getRule() { return rule; }

		//Addition ({Equals.left=current} "==" right=Addition)?
		public Group getGroup() { return cGroup; }

		//Addition
		public RuleCall getAdditionParserRuleCall_0() { return cAdditionParserRuleCall_0; }

		//({Equals.left=current} "==" right=Addition)?
		public Group getGroup_1() { return cGroup_1; }

		//{Equals.left=current}
		public Action getEqualsLeftAction_1_0() { return cEqualsLeftAction_1_0; }

		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_1_1() { return cEqualsSignEqualsSignKeyword_1_1; }

		//right=Addition
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Addition
		public RuleCall getRightAdditionParserRuleCall_1_2_0() { return cRightAdditionParserRuleCall_1_2_0; }
	}

	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cPlusLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMultiplicationParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Addition returns Expression:
		//	Multiplication ({Plus.left=current} "+" right=Multiplication)*;
		public ParserRule getRule() { return rule; }

		//Multiplication ({Plus.left=current} "+" right=Multiplication)*
		public Group getGroup() { return cGroup; }

		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }

		//({Plus.left=current} "+" right=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }

		//{Plus.left=current}
		public Action getPlusLeftAction_1_0() { return cPlusLeftAction_1_0; }

		//"+"
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }

		//right=Multiplication
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Multiplication
		public RuleCall getRightMultiplicationParserRuleCall_1_2_0() { return cRightMultiplicationParserRuleCall_1_2_0; }
	}

	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPostfixOperatorsParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMultiLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPostfixOperatorsParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Multiplication returns Expression:
		//	PostfixOperators ({Multi.left=current} "*" right=PostfixOperators)*;
		public ParserRule getRule() { return rule; }

		//PostfixOperators ({Multi.left=current} "*" right=PostfixOperators)*
		public Group getGroup() { return cGroup; }

		//PostfixOperators
		public RuleCall getPostfixOperatorsParserRuleCall_0() { return cPostfixOperatorsParserRuleCall_0; }

		//({Multi.left=current} "*" right=PostfixOperators)*
		public Group getGroup_1() { return cGroup_1; }

		//{Multi.left=current}
		public Action getMultiLeftAction_1_0() { return cMultiLeftAction_1_0; }

		//"*"
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }

		//right=PostfixOperators
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//PostfixOperators
		public RuleCall getRightPostfixOperatorsParserRuleCall_1_2_0() { return cRightPostfixOperatorsParserRuleCall_1_2_0; }
	}

	public class PostfixOperatorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PostfixOperators");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAtomicParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cArrayAccessExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cIndexAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cIndexExprParserRuleCall_1_2_0 = (RuleCall)cIndexAssignment_1_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//PostfixOperators returns Expression:
		//	Atomic ({ArrayAccess.expr=current} "[" index=Expr "]")?;
		public ParserRule getRule() { return rule; }

		//Atomic ({ArrayAccess.expr=current} "[" index=Expr "]")?
		public Group getGroup() { return cGroup; }

		//Atomic
		public RuleCall getAtomicParserRuleCall_0() { return cAtomicParserRuleCall_0; }

		//({ArrayAccess.expr=current} "[" index=Expr "]")?
		public Group getGroup_1() { return cGroup_1; }

		//{ArrayAccess.expr=current}
		public Action getArrayAccessExprAction_1_0() { return cArrayAccessExprAction_1_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1_1() { return cLeftSquareBracketKeyword_1_1; }

		//index=Expr
		public Assignment getIndexAssignment_1_2() { return cIndexAssignment_1_2; }

		//Expr
		public RuleCall getIndexExprParserRuleCall_1_2_0() { return cIndexExprParserRuleCall_1_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_1_3() { return cRightSquareBracketKeyword_1_3; }
	}

	public class AtomicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Atomic");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSymbolRefAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cSymbolAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cSymbolSymbolCrossReference_0_1_0 = (CrossReference)cSymbolAssignment_0_1.eContents().get(0);
		private final RuleCall cSymbolSymbolQIDParserRuleCall_0_1_0_1 = (RuleCall)cSymbolSymbolCrossReference_0_1_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cNumberLiteralAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueNUMBERTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cStringLiteralAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//Atomic returns Expression:
		//	{SymbolRef} symbol=[Symbol|QID] | {NumberLiteral} value=NUMBER | {StringLiteral} value=STRING;
		public ParserRule getRule() { return rule; }

		//{SymbolRef} symbol=[Symbol|QID] | {NumberLiteral} value=NUMBER | {StringLiteral} value=STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//{SymbolRef} symbol=[Symbol|QID]
		public Group getGroup_0() { return cGroup_0; }

		//{SymbolRef}
		public Action getSymbolRefAction_0_0() { return cSymbolRefAction_0_0; }

		//symbol=[Symbol|QID]
		public Assignment getSymbolAssignment_0_1() { return cSymbolAssignment_0_1; }

		//[Symbol|QID]
		public CrossReference getSymbolSymbolCrossReference_0_1_0() { return cSymbolSymbolCrossReference_0_1_0; }

		//QID
		public RuleCall getSymbolSymbolQIDParserRuleCall_0_1_0_1() { return cSymbolSymbolQIDParserRuleCall_0_1_0_1; }

		//{NumberLiteral} value=NUMBER
		public Group getGroup_1() { return cGroup_1; }

		//{NumberLiteral}
		public Action getNumberLiteralAction_1_0() { return cNumberLiteralAction_1_0; }

		//value=NUMBER
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//NUMBER
		public RuleCall getValueNUMBERTerminalRuleCall_1_1_0() { return cValueNUMBERTerminalRuleCall_1_1_0; }

		//{StringLiteral} value=STRING
		public Group getGroup_2() { return cGroup_2; }

		//{StringLiteral}
		public Action getStringLiteralAction_2_0() { return cStringLiteralAction_2_0; }

		//value=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
	}

	public class QIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QID returns ecore::EString:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private ModelElements pModel;
	private ElementElements pElement;
	private AssertElements pAssert;
	private EnumDeclElements pEnumDecl;
	private EnumLiteralElements pEnumLiteral;
	private VarDeclElements pVarDecl;
	private TypeElements pType;
	private PrimitiveTypeElements pPrimitiveType;
	private ArrayTypeElements pArrayType;
	private EnumTypeElements pEnumType;
	private IntTypeElements pIntType;
	private BoolTypeElements pBoolType;
	private FloatTypeElements pFloatType;
	private StringTypeElements pStringType;
	private FormulaElements pFormula;
	private ExprElements pExpr;
	private ComparisonElements pComparison;
	private AdditionElements pAddition;
	private MultiplicationElements pMultiplication;
	private PostfixOperatorsElements pPostfixOperators;
	private AtomicElements pAtomic;
	private TerminalRule tNUMBER;
	private TerminalRule tINT;
	private QIDElements pQID;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ExprDemoGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"model" name=ID elements+=Element*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Element:
	//	VarDecl | Formula | EnumDecl | Assert;
	public ElementElements getElementAccess() {
		return (pElement != null) ? pElement : (pElement = new ElementElements());
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//Assert:
	//	"assert" expr=Expr ";";
	public AssertElements getAssertAccess() {
		return (pAssert != null) ? pAssert : (pAssert = new AssertElements());
	}
	
	public ParserRule getAssertRule() {
		return getAssertAccess().getRule();
	}

	//EnumDecl:
	//	"enum" name=ID "{" literals+=EnumLiteral* "}";
	public EnumDeclElements getEnumDeclAccess() {
		return (pEnumDecl != null) ? pEnumDecl : (pEnumDecl = new EnumDeclElements());
	}
	
	public ParserRule getEnumDeclRule() {
		return getEnumDeclAccess().getRule();
	}

	//EnumLiteral returns Symbol:
	//	{EnumLiteral} name=ID;
	public EnumLiteralElements getEnumLiteralAccess() {
		return (pEnumLiteral != null) ? pEnumLiteral : (pEnumLiteral = new EnumLiteralElements());
	}
	
	public ParserRule getEnumLiteralRule() {
		return getEnumLiteralAccess().getRule();
	}

	//VarDecl returns Symbol:
	//	{VarDecl} "var" type=Type name=ID ("=" init=Expr)? ";";
	public VarDeclElements getVarDeclAccess() {
		return (pVarDecl != null) ? pVarDecl : (pVarDecl = new VarDeclElements());
	}
	
	public ParserRule getVarDeclRule() {
		return getVarDeclAccess().getRule();
	}

	//Type:
	//	PrimitiveType | ArrayType;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//PrimitiveType:
	//	IntType | BoolType | FloatType | EnumType | StringType;
	public PrimitiveTypeElements getPrimitiveTypeAccess() {
		return (pPrimitiveType != null) ? pPrimitiveType : (pPrimitiveType = new PrimitiveTypeElements());
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
	}

	//ArrayType:
	//	{ArrayType} "array" "[" baseType=Type "]";
	public ArrayTypeElements getArrayTypeAccess() {
		return (pArrayType != null) ? pArrayType : (pArrayType = new ArrayTypeElements());
	}
	
	public ParserRule getArrayTypeRule() {
		return getArrayTypeAccess().getRule();
	}

	//EnumType:
	//	enumRef=[EnumDecl];
	public EnumTypeElements getEnumTypeAccess() {
		return (pEnumType != null) ? pEnumType : (pEnumType = new EnumTypeElements());
	}
	
	public ParserRule getEnumTypeRule() {
		return getEnumTypeAccess().getRule();
	}

	//IntType:
	//	{IntType} "int";
	public IntTypeElements getIntTypeAccess() {
		return (pIntType != null) ? pIntType : (pIntType = new IntTypeElements());
	}
	
	public ParserRule getIntTypeRule() {
		return getIntTypeAccess().getRule();
	}

	//BoolType:
	//	{BoolType} "bool";
	public BoolTypeElements getBoolTypeAccess() {
		return (pBoolType != null) ? pBoolType : (pBoolType = new BoolTypeElements());
	}
	
	public ParserRule getBoolTypeRule() {
		return getBoolTypeAccess().getRule();
	}

	//FloatType:
	//	{FloatType} "float";
	public FloatTypeElements getFloatTypeAccess() {
		return (pFloatType != null) ? pFloatType : (pFloatType = new FloatTypeElements());
	}
	
	public ParserRule getFloatTypeRule() {
		return getFloatTypeAccess().getRule();
	}

	//StringType:
	//	{StringType} "string";
	public StringTypeElements getStringTypeAccess() {
		return (pStringType != null) ? pStringType : (pStringType = new StringTypeElements());
	}
	
	public ParserRule getStringTypeRule() {
		return getStringTypeAccess().getRule();
	}

	//Formula returns Symbol:
	//	{Formula} "calc" type=Type name=ID "=" expr=Expr ";";
	public FormulaElements getFormulaAccess() {
		return (pFormula != null) ? pFormula : (pFormula = new FormulaElements());
	}
	
	public ParserRule getFormulaRule() {
		return getFormulaAccess().getRule();
	}

	//Expr:
	//	Comparison;
	public ExprElements getExprAccess() {
		return (pExpr != null) ? pExpr : (pExpr = new ExprElements());
	}
	
	public ParserRule getExprRule() {
		return getExprAccess().getRule();
	}

	//Comparison returns Expression:
	//	Addition ({Equals.left=current} "==" right=Addition)?;
	public ComparisonElements getComparisonAccess() {
		return (pComparison != null) ? pComparison : (pComparison = new ComparisonElements());
	}
	
	public ParserRule getComparisonRule() {
		return getComparisonAccess().getRule();
	}

	//Addition returns Expression:
	//	Multiplication ({Plus.left=current} "+" right=Multiplication)*;
	public AdditionElements getAdditionAccess() {
		return (pAddition != null) ? pAddition : (pAddition = new AdditionElements());
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}

	//Multiplication returns Expression:
	//	PostfixOperators ({Multi.left=current} "*" right=PostfixOperators)*;
	public MultiplicationElements getMultiplicationAccess() {
		return (pMultiplication != null) ? pMultiplication : (pMultiplication = new MultiplicationElements());
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}

	//PostfixOperators returns Expression:
	//	Atomic ({ArrayAccess.expr=current} "[" index=Expr "]")?;
	public PostfixOperatorsElements getPostfixOperatorsAccess() {
		return (pPostfixOperators != null) ? pPostfixOperators : (pPostfixOperators = new PostfixOperatorsElements());
	}
	
	public ParserRule getPostfixOperatorsRule() {
		return getPostfixOperatorsAccess().getRule();
	}

	//Atomic returns Expression:
	//	{SymbolRef} symbol=[Symbol|QID] | {NumberLiteral} value=NUMBER | {StringLiteral} value=STRING;
	public AtomicElements getAtomicAccess() {
		return (pAtomic != null) ? pAtomic : (pAtomic = new AtomicElements());
	}
	
	public ParserRule getAtomicRule() {
		return getAtomicAccess().getRule();
	}

	//terminal NUMBER returns ecore::EBigDecimal:
	//	"0".."9"* ("." "0".."9"+)?;
	public TerminalRule getNUMBERRule() {
		return (tNUMBER != null) ? tNUMBER : (tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NUMBER"));
	} 

	//terminal INT returns ecore::EInt:
	//	"$$$don\'t use this anymore$$$";
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	} 

	//QID returns ecore::EString:
	//	ID ("." ID)*;
	public QIDElements getQIDAccess() {
		return (pQID != null) ? pQID : (pQID = new QIDElements());
	}
	
	public ParserRule getQIDRule() {
		return getQIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
