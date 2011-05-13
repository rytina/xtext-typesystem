package de.itemis.xtext.typesystem.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * Filters out all {@link IEObjectDescription}s for which the given {@link Predicate} returns false.
 *  
 * @author Sven Efftinge
 */
public class FilteringScope implements IScope {
	
	private IScope delegate;
	private Predicate<IEObjectDescription> filter;
	
	public FilteringScope(IScope delegate, Predicate<IEObjectDescription> filter) {
		this.delegate = delegate;
		this.filter = filter;
	}
	
	public FilteringScope(IScope delegate, final EClass ...allowedTypes) {
		this.delegate = delegate;
		this.filter = new Predicate<IEObjectDescription>(){

			public boolean apply(IEObjectDescription input) {
				for (EClass eClass : allowedTypes) {
					if (eClass.isSuperTypeOf(eClass))
						return true;
				}
				return false;
			}};
	}

	public IScope getOuterScope() {
		return new FilteringScope(delegate.getOuterScope(), filter);
	}

	public Iterable<IEObjectDescription> getAllContents() {
		return filtered(delegate.getAllContents());
	}
	
	public Iterable<IEObjectDescription> getContents() {
		return filtered(delegate.getContents());
	}

	public IEObjectDescription getContentByName(String name) {
		return filtered(delegate.getContentByName(name));
	}


	public IEObjectDescription getContentByEObject(EObject object) {
		return filtered(delegate.getContentByEObject(object));
	}

	public Iterable<IEObjectDescription> getAllContentsByEObject(EObject object) {
		return filtered(delegate.getAllContentsByEObject(object));
	}

	protected Iterable<IEObjectDescription> filtered(
			Iterable<IEObjectDescription> elements) {
		return Iterables.filter(elements, filter);
	}
	
	protected IEObjectDescription filtered(IEObjectDescription element) {
		if (element==null)
			return null;
		if (filter.apply(element))
			return element;
		return null;
	}
	
	
}
