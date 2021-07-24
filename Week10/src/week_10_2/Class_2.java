/**
 * 
 */
package week_10_2;

/**
 * @author Anil Kumar B
 *
 */
public class Class_2 {
	//Static fields
	
	static int number = 0;
	
	//Print number with methodA()
    public static void methodA()
    {
    	number+=5;
    	System.out.println(number);
    }
	
  //Increase the number by 5 by using constructor
  	int number2;
  	
  	public Class_2()
  	{
  		number2 +=5;
  	}
  	
  //Increase the number bya value by using constructor
  	public Class_2(int a)
  	{
  		number2 +=a;
  	}
    public void methodB()
    {
    	System.out.println(number2);
    }

}
