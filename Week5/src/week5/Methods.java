/**
 * 
 */
package week5;

/**
 * @author Anil Kumar
 *
 */
public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1.
		methodA();
		
		//2
		methodB("Anil Kumar B");
		//3
		int sum=methodC(43,54);
		System.out.println(sum);

	}
	
	/**
	 * 1.Create a method called methoda,
	 * that will print your name, call from main
	 * cannot put a method definition within another method
	 */
	
	/*
	 * 2. Create a methodB , pass your name then print it
	 * @param namePassed this is the users name
	 */
	/*
	 * 3. Create a methodC, pass two values, add 
	 * then return then assign to total then print total
	 */
	
	public static void methodA()
	{
		System.out.println("Anil Kumar");
	}
	
	public static void methodB(String name)
	{
		System.out.println(name);
	}
	
	public static int methodC(int x, int y)
	{
		int total = x+y;
		return total;
		
	}

}
