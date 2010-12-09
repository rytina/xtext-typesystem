package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;

public class UnexpectedNullException extends InterpreterException {

	public UnexpectedNullException(EObject failedObject, String message) {
		super(failedObject, message);
	}

}
