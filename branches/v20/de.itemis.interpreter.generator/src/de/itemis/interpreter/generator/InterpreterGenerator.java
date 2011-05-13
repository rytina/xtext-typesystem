package de.itemis.interpreter.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
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

	private static final Logger log = Logger.getLogger(InterpreterGenerator.class);
	
	
	private static String metaclassesPackage;
	private static String langName;
	private static String interpreterPackage;
	private String statementRootClassName;
	private String expressionRootClassName;

	private static List<EClass> statementLikeClasses = new ArrayList<EClass>();
	private static List<EClass> exprLikeClasses = new ArrayList<EClass>();

	private static List<String> statementLikeClassNames = new ArrayList<String>();
	private static List<String> exprLikeClassNames = new ArrayList<String>();

	
	public void setStatementRootClassName( String n ) {
		this.statementRootClassName = n;
	}

	public void setExpressionRootClassName( String n ) {
		this.expressionRootClassName = n;
	}

	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		
		if ( log.isInfoEnabled() )
			log.info("generating interpreter infrastructure");
		
		Naming n = new Naming();
		String grammarName = grammar.getName();
		String grammarPath = n.asPath(grammarName);
		metaclassesPackage = grammarName.replace("::", ".");
		
		int p = metaclassesPackage.lastIndexOf(".");
		langName = metaclassesPackage.substring(p+1);
		metaclassesPackage = metaclassesPackage.substring(0,p+1)+
							 Character.toLowerCase(metaclassesPackage.charAt(p+1))+
							 metaclassesPackage.substring(p+2);
		
		interpreterPackage = metaclassesPackage.substring(0,p)+".interpreter";
		
		EObject mmroot = loadMetamodel(grammarPath);
		EClass statementLikeRoot = findEClassByName(mmroot, statementRootClassName);
		EClass exprLikeRoot = findEClassByName(mmroot, expressionRootClassName);
		
		if ( statementLikeRoot == null ) {
			log.error("class "+statementRootClassName+" not found (specified as statementRootClassName in the workflow)");
			return;
		}
		
		if ( exprLikeRoot == null ) {
			log.error("class "+expressionRootClassName+" not found (specified as expressionRootClassName in the workflow)");
			return;
		}
		
		TreeIterator<EObject> all = mmroot.eAllContents();
		while ( all.hasNext() ) {
			EObject o = all.next();
			if ( o instanceof EClass ) {
				EClass c = (EClass) o;
				if ( c.getEAllSuperTypes().contains(statementLikeRoot) ) statementLikeClasses.add(c);
				if ( c.getEAllSuperTypes().contains(exprLikeRoot) ) exprLikeClasses.add(c);
			}
		}
		
		sortByInheritanceDeepness(statementLikeClasses);
		sortByInheritanceDeepness(exprLikeClasses);
		statementLikeClassNames = classListToStringList(statementLikeClasses);
		exprLikeClassNames = classListToStringList(exprLikeClasses);
		
		XpandFacade.create(ctx).evaluate2(getTemplate() + "::generate", grammar, getParameters(grammar));
	}

	private List<String> classListToStringList(List<EClass> l) {
		List<String> res = new ArrayList<String>();
		for (EClass c : l) {
			res.add(c.getName());
		}
		return res;
	}

	private EClass findEClassByName(EObject mmroot, String name) {
		TreeIterator<EObject> all = mmroot.eAllContents();
		while ( all.hasNext() ) {
			EObject o = all.next();
			if ( o instanceof EClass ) {
				EClass c = (EClass) o;
				if ( c.getName().equals(name) ) {
					return c;
				}
			}
		}
		return null;
	}

	private void sortByInheritanceDeepness(List<EClass> classList ) {
		Collections.sort(classList, new Comparator<EClass>() {
			@Override
			public int compare(EClass o1, EClass o2) {
				return o2.getEAllSuperTypes().size() - o1.getEAllSuperTypes().size();
			}
		});
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
			e.printStackTrace();
		}
		return null;
	}

	public static List<String> statementLikeClasses() {
		return statementLikeClassNames;
	}
	
	public static List<String> expressionLikeClasses() {
		return exprLikeClassNames;
	}
	
	public static String metaclassPackage() {
		return metaclassesPackage;
	}
	
	public static String langName() {
		return langName;
	}
	
	public static String interpreterPackage() {
		return interpreterPackage;
	}
	
}
