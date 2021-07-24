/**
 * 
 */
package week3;

import javax.swing.JOptionPane;

/**
 * @author Anil Kumar
 * Example of dialog box
 */
public class InputJOptionPane {

	/**
	 * @param args
	 *Usage of Input and output dialog boxes
	 */
	public static void main(String[] args) {
		//String Example
		//Take input from the user		
		String name =JOptionPane.showInputDialog("Please enter your name");
		//Print the output
		JOptionPane.showMessageDialog(null, "My name is " +name);
		
		/*---------------------------------------------------------*/
		
		//int example
		//Take input from the user	
		String input = JOptionPane.showInputDialog("Please enter your age");
		//Convert string to int
		int age = Integer.parseInt(input);
		//Print the output
		JOptionPane.showMessageDialog(null, "My age is " +age);
		//Exit
		System.exit(0);
	}

}
