package de.itemis.interpreter.ui.logview;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.itemis.interpreter.logging.LogEntry;

public class LogContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		return ((LogEntry) parentElement).children.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return ((LogEntry) element).getParent();
	}

	@Override
	public boolean hasChildren(Object element) {
		return ((LogEntry) element).children.size() > 0;
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}

	@Override
	public Object[] getElements(Object inputElement) {	
		return ((LogEntry) inputElement).children.toArray();
	}

}
