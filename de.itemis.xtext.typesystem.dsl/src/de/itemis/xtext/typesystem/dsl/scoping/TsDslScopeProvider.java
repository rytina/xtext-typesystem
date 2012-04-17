/*
 * generated by Xtext
 */
package de.itemis.xtext.typesystem.dsl.scoping;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import de.itemis.xtext.typesystem.dsl.tsDsl.MetaclassSpec;
import de.itemis.xtext.typesystem.dsl.tsDsl.TypesystemSpec;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class TsDslScopeProvider extends AbstractDeclarativeScopeProvider {

	private EPackage pack = null;
	
	public IScope scope_EClass( TypesystemSpec s, EReference ref ) {
		EPackage p = load( s.getEcoreUri() );
		return Scopes.scopeFor(p.getEClassifiers());
	}
	
	public IScope scope_EStructuralFeature( MetaclassSpec s, EReference ref ) {
		return Scopes.scopeFor(s.getClazz().getEAllStructuralFeatures());
	}
	
	
	public EPackage load( String uri ) {
		if ( pack == null ) {
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.createResource(URI.createURI(uri));
			try {
				r.load(null);
				pack = (EPackage) r.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return pack;
	}
	
	
}
