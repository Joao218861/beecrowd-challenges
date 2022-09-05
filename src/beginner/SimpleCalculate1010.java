/**
 * Title: Simple Calculate
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 05/09/2022
 * 
 * Description: n this problem, the task is to read a code of a product 1, the number of units of product 1, 
 * 			the price for one unit of product 1, the code of a product 2, the number of units of product 2 and 
 * 			the price for one unit of product 2. After this, calculate and show the amount to be paid.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculate1010 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		Product p1 = new Product(in.readLine(),in);
		Product p2 = new Product(in.readLine(),in);
		
		double total = p1.qnt*p1.price + p2.qnt*p2.price;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
	}
	
	static class Product {
		String name;
		double qnt;
		double price;
		
		Product(String input, BufferedReader in) throws IOException{
			String[] s = input.split(" ");
			name = s[0];
			qnt = Double.parseDouble(s[1]);
			price = Double.parseDouble(s[2]);
		}
	}
}
