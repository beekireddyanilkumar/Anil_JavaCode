/**
 * 
 */
package week6_public_fields;

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
	    student1.firstName = "Anil";
	    student1.lastName = "Kumar";
	    student1.total = 100.99;
	    System.out.println(student1.firstName+ " "+student1.lastName+" "+student1.total);
	    
	    //Create a student object and use it
	    Class_2 student2 = new Class_2();
	    
	    
	    //Assign value to the object
	    student2.firstName = "Bill" ;
	    System.out.println(student2.firstName+ " "+student2.lastName+" "+student2.total);
	    

	}

}
