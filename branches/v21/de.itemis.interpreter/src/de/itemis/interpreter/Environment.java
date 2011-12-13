package de.itemis.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Environment {

	private Stack<Table> stack = new Stack<Table>();
	
	
	
	public Environment() {
		stack.add(new Table(null, "default"));
	}
	
	public void put(Object e, Object o) {
		Table t = stack.peek();
		t.put(e,o);
	}
	
	public Object get( Object e ) {
		Table t = stack.peek();
		return t.get(e);
	}
	
	public Object getCheckNull( Object e ) throws SymbolNotFoundException {
		Object o = get(e);
		if ( o == null ) {
			throw new SymbolNotFoundException(e, "the symbol "+e.toString()+" was not found in the symbol table");
		}
		return o;
	}
	
	
	public void push(String name) {
		Table tnew = new Table(stack.peek(), name);
		stack.push(tnew);
	}
	
	public void pop() {
		stack.pop();
	}	
	
	private static class Table {
		private Map<Object, Object> symbols;
		private Table parent;
		private String name;
		
		public Table( Table parent, String name ) {
			this.parent = parent;
			this.name = name;
		}
		
		public synchronized void put( Object e, Object o) {
			symbols().put(e, o);
		}
		
		public synchronized Object get( Object e ) {
			Object found = null;
			Table t = this;
			while ( found == null ) {
				found = symbols().get(e);
				if ( found != null ) return found;
				t = t.parent;
				if ( t == null ) return null;
			}
			return null;
		}
		
		private synchronized Map<Object, Object> symbols() {
			if ( symbols == null ) {
				symbols = new HashMap<Object, Object>();
			}
			return symbols;
		}
	}
	
}
