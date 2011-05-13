package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;

public class MethodNotImplementedException extends InterpreterException {

	public MethodNotImplementedException(EObject failedObject, String message) {
		super(failedObject, message);
	}

}
