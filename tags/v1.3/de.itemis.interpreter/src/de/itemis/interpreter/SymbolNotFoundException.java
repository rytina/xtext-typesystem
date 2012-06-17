package de.itemis.interpreter;


public class SymbolNotFoundException extends InterpreterException {

	private static final long serialVersionUID = -2045164405526939634L;

	private final Object symbol;

	public SymbolNotFoundException(Object symbol, String message) {
		super(null, message);
		this.symbol = symbol;
	}

	public Object getSymbol() {
		return symbol;
	}
}
