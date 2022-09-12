/**
 * Title: Age in Days
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 12/09/2022
 * 
 * Description: Read an integer value corresponding to a person's age (in days) and print it in years, months 
 * 			and days, followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.
 * 				Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days 
 * 			every month. In the cases of test there will never be a situation that allows 12 months and some 
 * 			days, like 360, 363 or 364. This is just an exercise for the purpose of testing simple mathematical 
 * 			reasoning.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeInDays1020 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int days = Integer.parseInt(in.readLine());
		
		in.close();
		
		int years = days/365;
		days %= 365;
		int mounths = days/30;
		days %= 30;
		
		String print = String.format("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, mounths, days);
		System.out.print(print);
	}
}
