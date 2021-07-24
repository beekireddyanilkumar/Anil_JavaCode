/**
 * 
 */
package tempv1;

import javax.swing.JOptionPane;

/**
 * @author Anil Kumar B
 *
 */
public class TempV1 {

	/**
	 * @param args
	 * Calculation of Feel like Temperature  
	 */
	public static void main(String[] args) {
		// Consider user inputs and calculate feel like temperature
		
		//initializing a variable to consider variance(ups/downs) in calculation
		double variance =1.1;
		
		//Reading Temperature from user
		String input1 =JOptionPane.showInputDialog("Please enter Actual Temperature");
		//Convert string to int
		int temperature = Integer.parseInt(input1);
		
		//Reading Humidity from user
		String input2 =JOptionPane.showInputDialog("Please enter Humidity");
		//Convert string to int
		int humidity = Integer.parseInt(input2);
		
		//Reading Wind Speed from user
		String input3 =JOptionPane.showInputDialog("Please enter Wind Speed");
		//Convert string to int
		int wind_speed = Integer.parseInt(input3);
		
		//initializing feel like temperature variable for calculation
		int FLtemp ;
		
		//Calculating feel like temperature based on user inputs
		int temp1 = temperature + (humidity*3/100) - (wind_speed*10/100);
		FLtemp = (int) (temp1 * variance);
		
		
		//Displaying Calculated Feel like temperature to user
		JOptionPane.showMessageDialog(null, "Hello user,\n"+
		"Your Feel Like Temperature is : " +FLtemp + "\n" +
		"Have a great day!");

	}

}
