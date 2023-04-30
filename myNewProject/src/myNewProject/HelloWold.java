package myNewProject;

import javax.swing.JOptionPane;

public class HelloWold {

	public static void main(String[] args) {
		
		String title = "Message";
		String text = "Learn Java";
		JOptionPane.showMessageDialog(
				null,
				text,
				title,
				JOptionPane.PLAIN_MESSAGE);
	}

}
