package de.itemis.interpreter;

import de.itemis.xtext.typesystem.ITypesystem;

public class ExecutionContext {

	public final MessageList messages = new MessageList();
	
	public final SymbolTable symboltable = new SymbolTable();
	
	public final ITypesystem typesystem;
	
	public ExecutionContext( ITypesystem ts ) {
		this.typesystem = ts;
	}
	
}
