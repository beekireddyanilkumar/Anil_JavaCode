/**
 * 
 */
package week_10_2;

/**
 * @author Anil Kumar B
 *
 */
public class Class_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call methodA static
		Class_2.methodA();
		
		//Call methodB non-static
		
		//Create a object from class2
		Class_2 obj1 = new Class_2();
		Class_2 obj2 = new Class_2(10);
		obj1.methodB();
		obj2.methodB();
	}

}
