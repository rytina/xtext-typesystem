package de.itemis.interpreter.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.Naming;

public class InterpreterGenerator extends AbstractGeneratorFragment {

	private static List<String> statementLikeClasses;
	private static List<String> exprLikeClasses;
	private static String metaclassesPackage;

	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		Naming n = new Naming();
		String grammarName = grammar.getName();
		String grammarPath = n.asPath(grammarName);
		metaclassesPackage = grammarName.replace("::", ".");
		
		int p = metaclassesPackage.lastIndexOf(".");
		metaclassesPackage = metaclassesPackage.substring(0,p+1)+
							 Character.toLowerCase(metaclassesPackage.charAt(p+1))+
							 metaclassesPackage.substring(p+2);
		
		
		EObject mmroot = loadMetamodel(grammarPath);
		
		EClass statementLikeRoot = null;
		EClass exprLikeRoot = null;
		
		statementLikeClasses = new ArrayList<String>();
		exprLikeClasses = new ArrayList<String>();
		
		TreeIterator<EObject> all = mmroot.eAllContents();
		while ( all.hasNext() ) {
			EObject o = all.next();
			if ( o instanceof EClass ) {
				EClass c = (EClass) o;
				if ( c.getName().equals("Element") ) {
					statementLikeRoot = c;
				}
				if ( c.getName().equals("Expr") ) {
					exprLikeRoot = c;
				}
			}
		}
		
		all = mmroot.eAllContents();
		while ( all.hasNext() ) {
			EObject o = all.next();
			if ( o instanceof EClass ) {
				EClass c = (EClass) o;
				if ( c.getEAllSuperTypes().contains(statementLikeRoot) ) statementLikeClasses.add(c.getName());
				if ( c.getEAllSuperTypes().contains(exprLikeRoot) ) exprLikeClasses.add(c.getName());
			}
		}
		
		System.err.println(statementLikeRoot);
		System.err.println(exprLikeRoot);
		
		XpandFacade.create(ctx).evaluate2(getTemplate() + "::generate", grammar, getParameters(grammar));
	}

	private EObject loadMetamodel(String grammarPath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI("src-gen/"+grammarPath+".ecore");
		Resource resource = resourceSet.getResource(fileURI, true);		
		try {
			resource.load(null);
			EList<EObject> contents = resource.getContents();
			return contents.get(0);
		} catch (IOException e) {
		}
		return null;
	}

	public static List<String> statementLikeClasses() {
		return statementLikeClasses;
	}
	
	public static List<String> expressionLikeClasses() {
		return exprLikeClasses;
	}
	
	public static String metaclassPackage() {
		return metaclassesPackage;
	}
	
}
