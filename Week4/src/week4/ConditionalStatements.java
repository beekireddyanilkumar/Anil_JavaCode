/**
 * 
 */
package week4;

/**
 * @author Anil Kumar B
 *
 */
public class ConditionalStatements 
{

	/**
	 * @param args
	 * Decision structures with examples
	 */
	public static void main(String[] args) 
	{
		// 
		//1.if condition
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		if (num1<num2)
		{
			System.out.println("#1 is true");
		}
		
		
		//2. if-else
		if(num1==num2)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("#2 is false");
		}	
		
	
		//3. if-else-if
	    if(num1>=num3)
	    {
	    	System.out.println("invalid");
	    }
	    else if(num1!=num2)
	    {
	    	 System.out.println("#3 is true");
	    }
	    else
	    {
	    	System.out.println("invalid");
	    }
	    
		//4.Nested if
	    //check username and password
	    
	    String username = "Bob";
	    String rightUsername = "bob";
	    
	    String password = "bobby";
	    String rightPassword = "bobby";
	    
	    		
	    if(username.equalsIgnoreCase(rightUsername))
	    {
	    	System.out.println("#4 Username is correct");
	    	if(password.equals(rightPassword))
	    	{
	    		System.out.println("#4 Password is correct");
	    	}
	    	else
	    	{
	    		System.out.println("#4 Password is not correct");
	    	}
	    }
	    else
	    {
	    	System.out.println("#4 Username is not correct");
	   
	    }
	    
	    //5. Switch with 7 cases
	    
	    

	}

}
