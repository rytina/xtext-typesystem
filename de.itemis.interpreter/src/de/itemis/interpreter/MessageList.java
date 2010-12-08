package de.itemis.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class MessageList {

	private List<MessageItem> items = new ArrayList<MessageItem>();
	
	public MessageList() {
		
	}
	
	public void addMessage( EObject element, Kind kind, String message ) {
		items.add(new MessageItem(element, kind, message));
	}
	
	public void addError( EObject element, String message ) {
		addMessage(element, Kind.error, message);
	}
	
	public void addWarning( EObject element, String message ) {
		addMessage(element, Kind.warning, message);
	}
	
	public List<MessageItem> getMessages() {
		return items;
	}
	
	public static enum Kind {
		warning, error
	}
	
	public static class MessageItem {
		public final Kind kind;
		public final  EObject element;
		public final String message;
		public MessageItem( EObject element, Kind kind, String message ) {
			this.element = element;
			this.kind = kind;
			this.message = message;
		}
	}
	
	
}
