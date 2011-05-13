package de.itemis.interpreter;

import org.eclipse.emf.ecore.EObject;

public class SymbolNotFoundException extends InterpreterException {

	private final Object symbol;

	public SymbolNotFoundException(Object symbol, String message) {
		super(null, message);
		this.symbol = symbol;
	}

}
