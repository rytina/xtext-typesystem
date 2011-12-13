package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;

public class UnexpectedNullException extends InterpreterException {
	private static final long serialVersionUID = 5600204422305738236L;

	public UnexpectedNullException(EObject failedObject, String message) {
		super(failedObject, message);
	}

}
