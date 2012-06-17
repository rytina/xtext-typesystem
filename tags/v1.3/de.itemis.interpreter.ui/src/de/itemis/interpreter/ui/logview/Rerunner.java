package de.itemis.interpreter.ui.logview;

public abstract class Rerunner {
	
	private String label;

	public Rerunner( String buttonLabel ) {
		this.label = buttonLabel;
	}
	
	public String getLabel() {
		return label;
	}
	
	public abstract void execute();

}
