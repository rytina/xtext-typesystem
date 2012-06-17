package expr2.interpreter;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MessageList;
import de.itemis.interpreter.logging.LogEntry;
import de.itemis.xtext.typesystem.ITypesystem;
import expr2.expr2Dsl.Model;


public class ExprModelInterpreter {

	public MessageList runModel( Model m, ITypesystem ts ) throws InterpreterException {
		ExecutionContext ctx = new ExecutionContext(ts);
		LogEntry log = LogEntry.root("running model "+m.getName());
		LogEntry.setMostRecentRoot(log);
		new Evaluator(ctx);
		//new GroovxEval(ctx);
		new StatementExecutor(ctx).execute(m.getElements(), log);
		return ctx.messages;
	}
	
}
