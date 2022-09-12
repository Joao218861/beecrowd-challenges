/**
 * Title: Distance
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 11/09/2022
 * 
 * Description: Two cars (X and Y) leave in the same direction. The car X leaves with a constant speed of 
 * 			60 km/h and the car Y leaves with a constant speed of 90 km / h.
 * 				In one hour (60 minutes) the car Y can get a distance of 30 kilometers from the X car, in other 
 * 			words, it can get away one kilometer for each 2 minutes.
 * 				Read the distance (in km) and calculate how long it takes (in minutes) for the car Y to take 
 * 			this distance in relation to the other car.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Distance1016 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int distance = Integer.parseInt(in.readLine());
		
		in.close();
		
		final int minPerKm = 2; // min/km
		
		int time = distance*minPerKm;
		
		String print = String.format("%d minutos", time);
		System.out.println(print);
	}
}
