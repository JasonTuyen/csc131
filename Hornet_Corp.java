import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Hornet_Corp {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Hornet_Corp window = new Hornet_Corp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(759, 547);
		shell.setText("SWT Application");
		
		Label lblQuestion = new Label(shell, SWT.NONE);
		lblQuestion.setBounds(189, 35, 360, 63);
		lblQuestion.setText("Question");  								//input Question here
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(67, 144, 55, 40);
		btnNewButton.setText("1");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setBounds(128, 144, 55, 40);
		btnNewButton_1.setText("2");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setBounds(189, 144, 55, 40);
		btnNewButton_2.setText("3");
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.setBounds(250, 144, 55, 40);
		btnNewButton_3.setText("4");
		
		Button btnNewButton_4 = new Button(shell, SWT.NONE);
		btnNewButton_4.setBounds(311, 144, 55, 40);
		btnNewButton_4.setText("5");
		
		Button btnNewButton_5 = new Button(shell, SWT.NONE);
		btnNewButton_5.setBounds(372, 144, 55, 40);
		btnNewButton_5.setText("6");
		
		Button btnNewButton_6 = new Button(shell, SWT.NONE);
		btnNewButton_6.setBounds(433, 144, 55, 40);
		btnNewButton_6.setText("7");
		
		Button btnNewButton_7 = new Button(shell, SWT.NONE);
		btnNewButton_7.setBounds(494, 144, 55, 40);
		btnNewButton_7.setText("8");
		
		Label lblStronglyDisagree = new Label(shell, SWT.NONE);
		lblStronglyDisagree.setBounds(53, 123, 102, 15);
		lblStronglyDisagree.setText("Strongly Disagree");
		
		Label lblStronglyAgree = new Label(shell, SWT.NONE);
		lblStronglyAgree.setBounds(543, 123, 92, 15);
		lblStronglyAgree.setText("Strongly Agree");
		
		Button btnNewButton_8 = new Button(shell, SWT.NONE);
		btnNewButton_8.setBounds(555, 144, 55, 40);
		btnNewButton_8.setText("9");
		
		Label lblResult = new Label(shell, SWT.NONE);
		lblResult.setBounds(189, 255, 55, 15);
		lblResult.setText("Result");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(189, 296, 315, 105);
		lblNewLabel.setText("New Label");								//insert Result here

	}
}

