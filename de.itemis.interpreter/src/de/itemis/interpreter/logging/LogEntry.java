package de.itemis.interpreter.logging;

import java.util.LinkedList;
import java.util.List;


import org.eclipse.emf.ecore.EObject;

import de.itemis.xtext.typesystem.util.Utils;


public class LogEntry {

	public static enum Kind {
		root, debug, info, error, exception, success, fail, eval, result
	}

	private static LogEntry mostRecentRoot;

	public Kind kind;
	public final EObject element;
	public String message;
	public List<LogEntry> children = new LinkedList<LogEntry>();
	public final long timestamp;
	public final Exception exception;
	private LogEntry parent;
	
	public LogEntry( LogEntry parent, Kind kind, EObject element, String message, Exception ex ) {
		this.timestamp = System.currentTimeMillis();
		this.kind = kind;
		this.element = element;
		this.message = message;
		this.exception = ex;
		this.parent = parent;
	}
	
	public LogEntry getParent() {
		return parent;
	}
	
	public int getDepth() {
		if ( parent == null ) return 0;
		return getParent().getDepth()+1;
	}
	
	public LogEntry( LogEntry parent, Kind kind, EObject element, String message ) {
		this( parent, kind, element, message, null );
	}

	public static LogEntry root( String message ) {
		return new LogEntry( null, Kind.root, null, message );
	}
	
	public LogEntry child( Kind kind, EObject element, String message ) {
		LogEntry e = new LogEntry(this, kind, element, message );
		children.add(e);
		return e;
	}
	
	public LogEntry childException( EObject element, Exception ex ) {
		LogEntry e = new LogEntry(this, Kind.exception, element, ex.getMessage(), ex );
		children.add(e);
		return e;
	}

	public void dump(StringBuilder b, String indent) {
		b.append("\n");
		append(b, ""+timestamp, 10);
		append(b, kind.toString(), 10);
		b.append( indent );
		if ( element != null ) {
			if ( parent != null && parent.element == element ) {
				append(b, "" , 20);
			} else {
				String s = element.eClass().getName();
				append(b, s , 20);
			}
		} else {
			append(b, "-", 20);
		}
		append(b, message, 0);
		for (LogEntry e: children) {
			e.dump(b, indent+"  ");
		}
	}

	private void append(StringBuilder b, String s, int l) {
		b.append(pad(s,l)+"  ");
	}
	
	private String pad( String s, int l ) {
		if ( s == null ) return pad("", l);
		if ( l == 0 ) return s;
		if ( s.length() > l ) return s.substring(s.length()-l,s.length());
		if ( s.length() < l ) {
			StringBuilder r = new StringBuilder(s);
			while ( r.length() < l ) r.append(" ");
			return r.toString();
		}
		return s;
	}

	public static void setMostRecentRoot(LogEntry r) {
		mostRecentRoot = r;
	}
	
	public static LogEntry getMostRecentRoot() {
		return mostRecentRoot;
	}

	public String formattedElement() { 
		if ( element == null ) return "<no element>";
		String name = Utils.name(element);
		if ( name != null ) return element.eClass().getName()+" "+name;
		return element.eClass().getName();
	}

	public void postprocess() {
		for ( int i=children.size()-1; i>=0; i--) {
			LogEntry e1 = children.get(i);
			e1.postprocess();
			if ( i == 0 ) return;
			LogEntry e2 = children.get(i-1);
			if ( e1.kind == Kind.result && e2.kind == Kind.eval ) {
				e2.message += " "+e1.message;
				children.remove(i);
			}
		}
		
	}

	
	
}