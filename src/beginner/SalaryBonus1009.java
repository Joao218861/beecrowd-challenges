/**
 * Title: Salary with Bonus
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 05/09/2022
 * 
 * Description: Make a program that reads a seller's name, his/her fixed salary and the sale's total made by 
 * 			himself/herself in the month (in money). Considering that this seller receives 15% over all products 
 * 			sold, write the final salary (total) of this seller at the end of the month , with two decimal places.
 * 
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryBonus1009 {
	public static void main(String[] args) throws IOException {
		final double bonus = 0.15;
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		//String name = in.readLine();
		double fixedSalary = Double.parseDouble(in.readLine());
		double sales = Double.parseDouble(in.readLine());
		
		double total = fixedSalary + sales*bonus;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
	}
}
