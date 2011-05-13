package de.itemis.interpreter.ui.logview;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.itemis.interpreter.logging.LogEntry;

public class LogViewUtil {

	public static void showMostRecentLog(Rerunner rr) {
		final IEditorPart activeEditor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		showMostRecentLog(activeEditor, rr);
	}
		
	public static void showMostRecentLog(final IEditorPart activeEditor, final Rerunner rr ) {
		final IWorkbenchPartSite partSite = activeEditor.getSite();
		partSite.getShell().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					IViewPart viewPart = partSite.getWorkbenchWindow().getActivePage()
							.showView(LogViewPart.VIEW_ID);
					if (viewPart != null) {
						LogViewPart view = (LogViewPart) viewPart;
						view.setActiveEditor((XtextEditor)activeEditor);
						LogEntry e = LogEntry.getMostRecentRoot();
						view.setInput(e, rr); 
					}
				} catch (PartInitException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	
}
