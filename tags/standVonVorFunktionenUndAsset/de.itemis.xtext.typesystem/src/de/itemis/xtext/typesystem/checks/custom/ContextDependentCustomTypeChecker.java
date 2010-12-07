package de.itemis.xtext.typesystem.checks.custom;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public abstract class ContextDependentCustomTypeChecker {  

	private EClass ctxClass;
	
	public static abstract class Result {}
	public static class TypeIsValid extends Result{}
	public static class TypeIsInvalid extends Result{
		private EObject expected;
		private EObject actual;
		private int featureID;
		public TypeIsInvalid( EObject expected, EObject actual, int featureID ) {
			this.expected = expected;
			this.actual = actual;
			this.featureID = featureID;
		}
		public EObject getExpectedType() {
			return expected;
		}
		public EObject getActualType() {
			return actual;
		}
		public int getFeatureID() {
			return featureID;
		}
	}
	
	public ContextDependentCustomTypeChecker( EClass ctxClass ) {
		this.ctxClass = ctxClass;
	}
	
	public EClass getContextType() {
		return ctxClass;
	}
	
	protected Result ok() {
		return new TypeIsValid();
	}
	
	protected Result fail(EObject expected, EObject actual, int featureID) {
		return new TypeIsInvalid(expected, actual, featureID);
	}

	public abstract Result isValidType( EObject ctx, ITypesystem ts, TypeCalculationTrace trace );
	
	
}
