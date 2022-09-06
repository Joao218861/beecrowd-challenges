/**
 * Title: Consumption
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 06/09/2022
 * 
 * Description: Calculate a car's average consumption being provided the total distance traveled (in Km) and 
 * 			the spent fuel total (in liters).
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consumption1014 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int km = Integer.parseInt(in.readLine());
		double liter = Double.parseDouble(in.readLine());
		
		System.out.printf("%.3f km/l\n",km/liter);
	}
}
