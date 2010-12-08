package de.itemis.interpreter.logging;

import java.util.LinkedList;
import java.util.List;


import org.eclipse.emf.ecore.EObject;


public class LogEntry {

	public static enum Kind {
		root, debug, info, error, exception, success, fail
	}
	
	public final Kind kind;
	public final EObject element;
	public final String message;
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

	
	
}
