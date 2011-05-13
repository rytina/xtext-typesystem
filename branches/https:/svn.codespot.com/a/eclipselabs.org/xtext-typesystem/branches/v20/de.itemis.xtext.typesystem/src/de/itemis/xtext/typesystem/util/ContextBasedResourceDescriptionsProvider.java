/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.itemis.xtext.typesystem.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class ContextBasedResourceDescriptionsProvider {
	
	@Inject
	@Named(AbstractGlobalScopeProvider.NAMED_BUILDER_SCOPE)
	private Provider<IResourceDescriptions> builderScopeResourceDescriptions;

	@Inject
	private Provider<IResourceDescriptions> resourceDescriptions;
	
	public IResourceDescriptions getResourceDescriptions(EObject ctx) {
		Map<Object, Object> loadOptions = ctx.eResource().getResourceSet().getLoadOptions();
		IResourceDescriptions result = createResourceDescriptions();
		if (loadOptions.containsKey(AbstractGlobalScopeProvider.NAMED_BUILDER_SCOPE)) {
			result = createBuilderScopeResourceDescriptions();
		}
		if (result instanceof IResourceDescriptions.IContextAware) {
			((IResourceDescriptions.IContextAware) result).setContext(ctx);
		}
		return result;
	}

	public IResourceDescriptions createBuilderScopeResourceDescriptions() {
		return builderScopeResourceDescriptions.get();
	}
	
	public IResourceDescriptions createResourceDescriptions() {
		return resourceDescriptions.get();
	}
	
	public void setBuilderScopeResourceDescriptions(Provider<IResourceDescriptions> resourceDescriptions) {
		this.builderScopeResourceDescriptions = resourceDescriptions;
	}

	public void setResourceDescriptions(Provider<IResourceDescriptions> resourceDescriptions) {
		this.resourceDescriptions = resourceDescriptions;
	}
}
