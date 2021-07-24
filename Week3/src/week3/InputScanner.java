/**
 * 
 */
package week3;

import java.util.Scanner;

/**
 * @author Anil Kumar
 * Example of using the Scanner class
 */
public class InputScanner {

	/**
	 * @param args
	 * Using Scanner for input
	 */
	public static void main(String[] args) {
		// Created the scanner object
		Scanner keyboard = new Scanner(System.in);
		//String example
		
		//Ask the user for input
		System.out.println("Please enter your name");
		//Take input from the user
		String name = keyboard.nextLine();
		//print the output
		System.out.println("My name is: " +name);
		/*-------------------------------------------*/
		//int example
		//Ask for input
		System.out.println("Please enter your age");
		//Take input from user
		int age = keyboard.nextInt();
		//print the output
		System.out.println("My Age is: " +age);
		
		
		
		
		
	}

}
