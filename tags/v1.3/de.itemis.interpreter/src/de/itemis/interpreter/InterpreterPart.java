package de.itemis.interpreter;

public abstract class InterpreterPart {

	protected ExecutionContext ctx;

	public InterpreterPart( ExecutionContext ctx ) {
		this.ctx = ctx; 
	}

	
}
