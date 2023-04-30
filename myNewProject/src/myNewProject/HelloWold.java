package myNewProject;

import javax.swing.JOptionPane;

public class HelloWold {

	public static void main(String[] args) {
		String title;
		String text;
		title = JOptionPane.showInputDialog(
				null,
				"Name for the window:",
				"Title",
				JOptionPane.QUESTION_MESSAGE
				);
		text = JOptionPane.showInputDialog(
				null,
				"Message's text:",
				"Content",
				JOptionPane.PLAIN_MESSAGE
				);
		JOptionPane.showMessageDialog(
				null,
				text,
				title,
				JOptionPane.INFORMATION_MESSAGE
				);
	}

}
