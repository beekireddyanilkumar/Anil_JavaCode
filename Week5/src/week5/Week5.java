/**
 * 
 */
package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Anil Kumar
 *
 */
public class Week5 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// 1. Create a file called name.txt with your name
		PrintWriter obj1 = new PrintWriter("name.txt");
		obj1.println("Anil Kumar");
		obj1.close();
		
		//2.Add your id to the same file
		FileWriter obj2 = new FileWriter("name.txt", true);
		PrintWriter obj3 = new PrintWriter(obj2);
		obj3.println(101);
		obj3.close();
		
		//3. Read the first line of your file
		File myFile = new File("name.txt");
		Scanner inputFile = new Scanner(myFile);
		String str = inputFile.nextLine();
		
		System.out.println(str);
		//4. Read all line from name.txt
		while (inputFile.hasNext())
		{
		   String str1 = inputFile.nextLine();
		   System.out.println(str1);
		}
		inputFile.close();


	}

}
