/**
 * 
 */
package week6_private_fields;

/**
 * @author Anil Kumar B
 * examples of objects
 */
public class Class_1 {

	/**
	 * @param args
	 * Create two object and use them
	 */
	public static void main(String[] args) {
		// Create a student object and use it
	    Class_2 student1 = new Class_2();
	    //Set values for 3 variables in class 2
	    student1.setFirstName("Sam");
	    student1.setLastName("curran");
	    student1.setTotal(75.56);
	    //Print values using get method
	    System.out.println(student1.getFirstName()+" "+student1.getLastName()+" "+student1.getTotal());;
	    

	}

}
