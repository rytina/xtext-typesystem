package de.itemis.interpreter;

import de.itemis.xtext.typesystem.ITypesystem;

public class ExecutionContext {

	public final MessageList messages = new MessageList();
	
	public final Environment environment = new Environment();
	
	public final ITypesystem typesystem;

	protected AbstractExpressionEvaluator evaluator;
	
	protected AbstractStatementExecutor executor;
	
	public ExecutionContext( ITypesystem ts ) {
		this.typesystem = ts;
	}
	
	public AbstractExpressionEvaluator getEvaluator() {
		return evaluator;
	}

	public void setEvaluator(AbstractExpressionEvaluator evaluator) {
		this.evaluator = evaluator;
	}

	public AbstractStatementExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(AbstractStatementExecutor executor) {
		this.executor = executor;
	}
	
}
