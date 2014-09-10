package de.itemis.xtext.typesystem.messages;

import org.eclipse.emf.ecore.EObject;

public interface IErrorMessageProvider<T> {
	
	public String create(T element, EObject types);

}
