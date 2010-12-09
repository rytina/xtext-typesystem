package de.itemis.interpreter.ui.logview;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.itemis.interpreter.logging.LogEntry;

public class LogViewHelper {

	public static void showMostRecentLog() {
		final IEditorPart activeEditor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
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
						view.setInput(e);
					}
				} catch (PartInitException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	
}
