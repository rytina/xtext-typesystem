
package expr.ui.quickfix;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import de.itemis.interpreter.ui.logview.LogViewUtil;
import expr.validation.ExprDemoJavaValidator;

public class ExprDemoQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(ExprDemoJavaValidator.INTERPRETERFAILED)
	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Show Log", "Show the execution Log of the Test", "upcase.png", new IModification() {
			@SuppressWarnings("restriction")
			public void apply(IModificationContext context) throws BadLocationException {
				LogViewUtil.showMostRecentLog(null);
			}
		});
	}


	
}
