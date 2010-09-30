package de.itemis.xtext.testing;

import static de.itemis.xtext.util.Utils.ancestor;
import static de.itemis.xtext.util.Utils.eString;
import static de.itemis.xtext.util.Utils.egetAndResolve;
import static de.itemis.xtext.util.Utils.getEObject;
import static de.itemis.xtext.util.Utils.name;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.Issue.Severity;



public class IssueCollection {

	private static Logger LOGGER = Logger.getLogger(IssueCollection.class);

	private List<Issue> issues;
	private XtextResource resource;
	
	private boolean state;
	private boolean stateIsSet;

	public IssueCollection( XtextResource res, List<Issue> issues ) {
		this.resource = res;
		this.issues = issues;
	}

	public IssueCollection(XtextResource res) {
		this.issues = new ArrayList<Issue>();
		this.resource = res;
	}
	
	public void addIssue( Issue issue ) {
		issues.add( issue );
	}
	
	public IssueCollection forType( Class<? extends EObject> cls ) {
		IssueCollection res = new IssueCollection(resource);
		for (Issue i : issues) {
			URI uri = i.getUriToProblem();
			EObject eObject = resource.getEObject(uri.fragment());
			if ( cls.isInstance(eObject)) {
				res.addIssue(i);
			}
		}
		if (res.getIssueCount() == 0 ) {
			LOGGER.warn("no elements of type "+cls.getName()+" found");
		}
		return res;
	}

	public IssueCollection get( int index ) {
		IssueCollection res = new IssueCollection(resource);
		if ( index >= getIssueCount() ) {
			LOGGER.warn("trying to get element at "+index+", but only have "+getIssueCount()+" elements -> creating empty collection!");
		} else {
			res.addIssue( getIssues().get(index) );
		}
		return res;
	}

	public IssueCollection inLine( int lineNo ) {
		IssueCollection res = new IssueCollection(resource);
		for (Issue i: issues) {
			if ( i.getLineNumber() == lineNo )
				res.addIssue( i );
		}
		return res;
	}

	
	
	public IssueCollection withStringFeatureValue( String featureName, String value ) {
		IssueCollection res = new IssueCollection(resource);
		for (Issue i: issues) {
			EObject eObject = getEObject(i, resource);
			String v = eString(egetAndResolve(eObject, featureName, resource.getResourceSet()));
			if ( v.contains(value)) {
				res.addIssue( i );
			}
		}
		if (res.getIssueCount() == 0 ) {
			LOGGER.warn("no elements found with feature "+featureName+" valued '"+value+"'");
		}
		return res;
	}

	public IssueCollection errorsOnly() {
		IssueCollection res = new IssueCollection(resource);
		for (Issue i: issues) {
			if ( i.getSeverity() == Severity.ERROR ) {
				res.addIssue( i );
			}
		}
		return res;
	}

	public IssueCollection named( String expectedName ) {
		IssueCollection res = new IssueCollection(resource);
		for (Issue i: issues) {
			EObject eObject = getEObject(i, resource);
			String name = name(eObject);
			if ( name.contains(expectedName)) {
				res.addIssue( i );
			}
		}
		if (res.getIssueCount() == 0 ) {
			LOGGER.warn("no elements found with name "+expectedName);
		}
		return res;
	}


	
	public IssueCollection forElement( Class<? extends EObject> cls, String name ) {
		IssueCollection res = new IssueCollection(resource);
		for (Issue i : issues) {
			EObject eObject = getEObject(i, resource);
			if ( cls.isInstance(eObject)) {
				if ( name.equalsIgnoreCase(name(eObject)) ) {
					res.addIssue(i);
				}
			}
		}
		if (res.getIssueCount() == 0 ) {
			LOGGER.warn("no elements of type "+cls.getName()+" named "+name+" found");
		}
		return res;
	}

	private int getIssueCount() {
		return issues.size();
	}

	public IssueCollection under( Class<? extends EObject> cls ) {
		return under(cls,null);
	}

	
	public IssueCollection under( Class<? extends EObject> cls, String name ) {
		IssueCollection res = new IssueCollection(resource);
		for (Issue i : issues) {
			URI uri = i.getUriToProblem();
			EObject eObject = resource.getEObject(uri.fragment());
			EObject p = ancestor( eObject, cls );
			if ( p != null ) {
				if ( name != null ) {
					if ( name.equals(name(p))) {
						res.addIssue(i);
					}
				} else {
					res.addIssue(i);
				}
			} 
		}
		if ( res.getIssueCount() == 0 ) {
			LOGGER.warn("nothing found under a "+cls.getName()+" named "+name);
		}
		return res;
	}
	

	public IssueCollection sizeIs(int i) {
		if ( issues.size() == i ) {
			state = true;
		} else {
			LOGGER.warn("size mismatch; expected "+i+", actual "+issues.size());
			for (Issue issue : issues) {
				LOGGER.debug("  line "+issue.getLineNumber()+": "+issue.getMessage()+" / "+issue.getUriToProblem());
			}
			state = false;
		}
		return this;
	}
	
	public IssueCollection oneOfThemContains(String substring) {
		boolean found = false;
		for (Issue i: issues) {
			if ( i.getMessage().toLowerCase().contains(substring.toLowerCase()) ) { 
				found = true;
			}
		}
		if ( found ) reportOk(); else reportError();
		return this;
	}
	
	public IssueCollection allOfThemContain(String substring) {
		for (Issue i: issues) {
			if ( !i.getMessage().toLowerCase().contains(substring.toLowerCase()) ) {
				reportError();
			}
		}
		reportOk(); 
		return this;
	}
	
	public IssueCollection theOneAndOnlyContains(String substring) {
		if ( issues.size() > 1 ) {
			reportError();
			LOGGER.warn("expecting a single issue (theSingleOneReads) but found: "+issues.size());
			for (Issue issue : issues) {
				LOGGER.debug("  line "+issue.getLineNumber()+": "+issue.getMessage()+" / "+issue.getUriToProblem());
			}			
			return this;
		}
		return oneOfThemContains(substring);
	}
	
	public boolean evaluate() {
		return state;
	}
	
	
	protected void reportOk() {
		if ( stateIsSet ) {
			if ( state ) state = true;
			if ( !state ) state = false;
		} else  {
			state = true;
		}
		stateIsSet = true;
	}

	protected void reportError() {
		if ( stateIsSet ) {
			if ( state ) state = false;
			if ( !state ) state = false;
		} else  {
			state = false;
		}
		stateIsSet = true;
	}

	public List<Issue> getIssues() {
		return issues;
	}

	public void dumpIssues() {
		LOGGER.debug("--- Issues ---");
		for (Issue i: issues) {
			dumpIssue(resource, i);
		}
	}
	
	public static void dumpIssue(XtextResource resource, Issue issue) {
		EObject eObject =  resource.getEObject(issue.getUriToProblem().fragment());
		EClass cls = eObject.eClass();
		LOGGER.debug(cls.getName()+"(line "+issue.getLineNumber()+"): "+issue.getMessage());
	}


}
