/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.itemis.xtext.typesystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Function;

/**
 * @author "Karsten Thoms (karsten.thoms@itemis.de)" - Initial contribution and API
 */
public class RenamingScope implements IScope {
	private IScope delegate;
	private IScope outer;

	private Function<String, String> renameFunction;

	public RenamingScope (IScope delegate, Function<String, String> renameFunction) {
		this.delegate = delegate;
		this.renameFunction = renameFunction;
		outer = delegate.getOuterScope()!=IScope.NULLSCOPE ? new RenamingScope (delegate.getOuterScope(), renameFunction) : IScope.NULLSCOPE;
	}

	public IScope getOuterScope() {
		return outer;
	}

	public Iterable<IEObjectDescription> getAllContents() {
		return delegate.getAllContents();
	}

	public Iterable<IEObjectDescription> getContents() {
		return delegate.getContents();
	}

	public IEObjectDescription getContentByName(String name) {
		return delegate.getContentByName(renameFunction.apply(name));
	}

	public IEObjectDescription getContentByEObject(EObject object) {
		return delegate.getContentByEObject(object);
	}

	public Iterable<IEObjectDescription> getAllContentsByEObject(EObject object) {
		return delegate.getAllContentsByEObject(object);
	}

}
