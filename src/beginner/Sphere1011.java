/**
 * Title: Sphere
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 06/09/2022
 * 
 * Description: Make a program that calculates and shows the volume of a sphere being provided the value of 
 * 			its radius (R) . The formula to calculate the volume is: (4/3) * pi * R3. Consider (assign) for pi 
 * 			the value 3.14159.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sphere1011 {
	public static void main(String[] args) throws IOException {
		final double pi = 3.14159;
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		double radius = Double.parseDouble(in.readLine());
		
		in.close();
		
		double volume = (4.0*pi*Math.pow(radius, 3))/3;
		
		System.out.printf("VOLUME = %.3f\n", volume);
	}
}
