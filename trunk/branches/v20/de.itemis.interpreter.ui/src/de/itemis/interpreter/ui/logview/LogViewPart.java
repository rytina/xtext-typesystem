package de.itemis.interpreter.ui.logview;

import java.text.SimpleDateFormat;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.itemis.interpreter.logging.LogEntry;

public class LogViewPart extends ViewPart {

	public static final String VIEW_ID = "de.itemis.interpreter.ui.logview";

	private TreeViewer viewer;

	private XtextEditor activeEditor;

	private Rerunner rerunner;

	private IAction rerunAction;
	
	public LogViewPart() {

	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		viewer.setUseHashlookup(true);
		viewer.setAutoExpandLevel(2);

		viewer.setContentProvider(new LogContentProvider());
		
		rerunAction = new Action("Rerun") {
			@Override
			public void run() {
				rerunner.execute();
			}
		};
		rerunAction.setEnabled(false);
		getViewSite().getActionBars().getToolBarManager().add(rerunAction); 
		
		Tree tree = viewer.getTree();

		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);

		TreeViewerColumn column1 = new TreeViewerColumn(viewer, SWT.LEFT);
		column1.getColumn().setText("Time");
		column1.getColumn().setWidth(200);
		column1.getColumn().setResizable(true);
		column1.setLabelProvider(new ColumnLabelProvider() {
			// private SimpleDateFormat df = new
			// SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			private SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss.SSS");

			@Override
			public String getText(Object element) {
				LogEntry entry = (LogEntry) element;

				return df.format(entry.timestamp);
			}
		});

		TreeViewerColumn column2 = new TreeViewerColumn(viewer, SWT.LEFT);
		column2.getColumn().setText("Kind");
		column2.getColumn().setWidth(50);
		column2.getColumn().setResizable(true);
		column2.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				LogEntry entry = (LogEntry) element;

				return entry.kind.name();
			}
		});

		TreeViewerColumn column3 = new TreeViewerColumn(viewer, SWT.LEFT);
		column3.getColumn().setText("Element");
		column3.getColumn().setWidth(125);
		column3.getColumn().setResizable(true);
		column3.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				LogEntry entry = (LogEntry) element;

				return entry.formattedElement();
			}
		});

		TreeViewerColumn column4 = new TreeViewerColumn(viewer, SWT.LEFT);
		column4.getColumn().setText("Message");
		column4.getColumn().setWidth(250);
		column4.getColumn().setResizable(true);
		column4.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				LogEntry entry = (LogEntry) element;
				int indent = entry.getDepth();
				StringBuilder b = new StringBuilder();
				for (int i=0; i<indent; i++) b.append("  ");
				return b.toString()+entry.message;
			}
		});

		TreeViewerColumn column5 = new TreeViewerColumn(viewer, SWT.LEFT);
		column5.getColumn().setText("Exception");
		column5.getColumn().setWidth(250);
		column5.getColumn().setResizable(true);
		column5.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				LogEntry entry = (LogEntry) element;

				if (entry.exception != null) {
					entry.exception.getLocalizedMessage();
				}
				return null;
			}
		});

		
		getSite().setSelectionProvider(viewer);
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				if(!event.getSelection().isEmpty() && (getActiveEditor() != null)) {
					IStructuredSelection sel = (IStructuredSelection) event.getSelection();
					
					LogEntry entry = (LogEntry) sel.getFirstElement();
					
					CompositeNode node =  NodeUtil.getNode(entry.element);
					
					if(node != null) {
						int offset = node.getOffset();
						int length = node.getLength();
						
						getActiveEditor().setHighlightRange(offset, length, true);
						
					}
				}

			}
		});
		
		
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void setInput(LogEntry input, Rerunner r) {
		if ( input != null ) {
			input.postprocess();
			viewer.setInput(input);
			this.rerunner = r;
			rerunAction.setEnabled(this.rerunner != null);
		}
	}

	public TreeViewer getViewer() {
		return viewer;
	}

	public XtextEditor getActiveEditor() {
		return activeEditor;
	}

	public void setActiveEditor(XtextEditor activeEditor) {
		this.activeEditor = activeEditor;
	}
}
