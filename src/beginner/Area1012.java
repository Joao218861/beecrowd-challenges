/**
 * Title: Area
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 06/09/2022
 * 
 * Description: Make a program that reads three floating point values: A, B and C. Then, calculate and show:
 *			a) the area of the rectangled triangle that has base A and height C.
 *			b) the area of the radius's circle C. (pi = 3.14159)
 *			c) the area of the trapezium which has A and B by base, and C by height.
 *			d) the area of ​​the square that has side B.
 *			e) the area of the rectangle that has sides A and B.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area1012 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		Areas area = new Areas(in.readLine());
		
		in.close();
		
		System.out.printf("TRIANGULO: %.3f\n",area.triRec());
		System.out.printf("CIRCULO: %.3f\n",area.circle());
		System.out.printf("TRAPEZIO: %.3f\n",area.trapezium());
		System.out.printf("QUADRADO: %.3f\n",area.square());
		System.out.printf("RETANGULO: %.3f\n",area.rectangle());
	}
	
	static class Areas{
		private double A;
		private double B;
		private double C;
		
		final double pi = 3.14159;
		
		Areas(String input){
			String[] s = input.split(" ");
			A = Double.parseDouble(s[0]);
			B = Double.parseDouble(s[1]);
			C = Double.parseDouble(s[2]);
		}
		
		double triRec() {
			return A*C/2.0;
		}
		
		double circle() {
			return pi*Math.pow(C, 2);
		}
		
		double trapezium() {
			return (A+B)*C/2.0;
		}
		
		double square() {
			return Math.pow(B, 2);
		}
		
		double rectangle() {
			return A*B;
		}
	}
}
