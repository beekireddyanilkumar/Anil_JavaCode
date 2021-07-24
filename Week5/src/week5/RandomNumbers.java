/**
 * 
 */
package week5;

import java.util.Random;

/**
 * @author Anil Kumar
 *
 */
public class RandomNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a random object
		Random obj1 = new Random();
		
		// 1.Generate a random float then print
		float floatNum= obj1.nextFloat();
		System.out.println(floatNum);
		
		// 2.Generate a random double then print
		double doubleNum=obj1.nextDouble();
		System.out.println(doubleNum);
		// 3.Generate a random int then print
		int intNum=obj1.nextInt();
		System.out.println(floatNum);
		// 4.Generate a random int up to 25 then print
		int intNum2=obj1.nextInt(25);
		System.out.println(intNum2);

	}

}
