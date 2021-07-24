/**
 * 
 */
package tempv2;

/**
 * @author Anil Kumar B
 *
 */
public class Temp {
	
	public int FLTemp(int t1, int h1, int w1, double v1)
	{
		int FLT1 = t1 + (h1*3/100) - (w1*10/100) ;
		int FLT = (int) (FLT1 * v1);
		return FLT;
	}

}
