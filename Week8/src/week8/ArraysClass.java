/**
 * 
 */
package week8;

/**
 * @author Anil
 *Examples of Arrays
 */
public class ArraysClass {

	/**
	 * @param args
	 * Using arrays
	 */
	public static void main(String[] args) {
		// 1.Create a fixed size array that can hold 10 elements called arr1
		int[] arr1= new int[10];
		// 2.Create and initialize an array with 5 elements called arr2
		int[] arr2 = {1,2,3,4,5};
		//3.Add two elements to arr1
		arr1[0] = 43;
		arr1[1] = 65;
		//4.Print the first two elements from arr1
		System.out.println("1st value "+arr1[0]+", 2nd value " +arr1[1]);
		//5.print arr2
		for (int val:arr2)
		{
			System.out.println("#5   "+val);
		}
		//6.Print arr2 using a normal for loop
		for (int i = 0; i<arr2.length;i++)
		{
			System.out.println("#6   " +arr2[i]);
		}
		//7.Print arr2 by using the enhanced for loop
		
		for(int val:arr2)
		{
			System.out.println("#7   "+val);
		}

	}

}
