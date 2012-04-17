package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;

public class MethodNotImplementedException extends InterpreterException {
	private static final long serialVersionUID = 530129530635288740L;

	public MethodNotImplementedException(EObject failedObject, String message) {
		super(failedObject, message);
	}

}
