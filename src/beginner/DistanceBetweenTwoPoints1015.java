/**
 * Title: Distance Between Two Points
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 11/09/2022
 * 
 * Description: Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) 
 * 			and p2 (x2, y2) and calculate the distance between them, showing four decimal places after the 
 * 			comma.
 *
 */


package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenTwoPoints1015 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		Point one = new Point(in.readLine());
		Point two = new Point(in.readLine());
		
		in.close();
		
		Double xSquare = Math.pow((two.x-one.x), 2);
		Double ySquare = Math.pow((two.y-one.y), 2);
		Double distance = Math.pow((xSquare+ySquare),0.5);
		
		String print = String.format("%.4f", distance);
		System.out.println(print);
	}
	
	static class Point{
		double x;
		double y;
		
		Point(String input){
			String[] s = input.split(" ");
			x = Double.parseDouble(s[0]);
			y = Double.parseDouble(s[1]);
			
		}
	}
}
