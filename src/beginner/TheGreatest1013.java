/**
 * Title: The Greatest
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 06/09/2022
 * 
 * Description: Make a program that reads 3 integer values and present the greatest one followed by the 
 * 			message "eh o maior". Use the following formula: MaiorAB = (a+b+abs(a-b))/2.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheGreatest1013 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		Values input = new Values(in.readLine());
		
		System.out.printf("%d eh o maior\n", input.greatest());
	}
	
	static class Values {
		int A;
		int B;
		int C;
		
		Values(String input){
			String[] s = input.split(" ");
			
			A = Integer.parseInt(s[0]);
			B = Integer.parseInt(s[1]);
			C = Integer.parseInt(s[2]);
		}
		
		int greatest() {
			int AB = (A+B+Math.abs(A-B))/2;
			int ABC = (AB+C+Math.abs(AB-C))/2;
			
			return ABC;
		}
	}
}
