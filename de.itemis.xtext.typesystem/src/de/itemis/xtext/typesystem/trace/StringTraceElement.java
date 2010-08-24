package de.itemis.xtext.typesystem.trace;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import static de.itemis.xtext.util.Utils.eString;

public class StringTraceElement implements ITraceStep {
	
	private String info;

	public StringTraceElement(String info) {
		this.info = info;
	}
	

	@Override
	public void appendTraceInfo(List<String> collector, EObject element, String level) {
		collector.add( level+"["+eString(element)+"] "+info);
		
	}


}
