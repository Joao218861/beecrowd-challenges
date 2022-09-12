/**
 * Title: FuelSpent
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 11/09/2022
 * 
 * Description: Little John wants to calculate and show the amount of spent fuel liters on a trip, using a car 
 * 			that does 12 Km/L. For this, he would like you to help him through a simple program. To perform the 
 * 			calculation, you have to read spent time (in hours) and the same average speed (km/h). In this way, 
 * 			you can get distance and then, calculate how many liters would be needed. Show the value with three 
 * 			decimal places after the point.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuelSpent1017 {
	public static void main(String[] args) throws IOException {
		final double efficiency = 12; // In km/L
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int time = Integer.parseInt(in.readLine()); // In hours
		int velocity = Integer.parseInt(in.readLine()); // In km/h
		
		in.close();
		
		int distance = velocity*time;
		
		double liters = distance/efficiency;
		
		String print = String.format("%.3f", liters);
		System.out.println(print);
	}
}
