package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;

public class InterpreterException extends Exception {

	private EObject failedObject;

	public InterpreterException( EObject failedObject, String message ){
		super(message);
		this.failedObject = failedObject;
	}
	
	public EObject getFailedObject() {
		return failedObject;
	}
	
}
