package myNewProject;

import javax.swing.JOptionPane;

public class HelloWold {

	public static void main(String[] args) {
		
		String text;
		text = JOptionPane.showInputDialog("Enter tne text:");
		JOptionPane.showMessageDialog (null,
				"You have entered this text: \n" + text);
	}

}
