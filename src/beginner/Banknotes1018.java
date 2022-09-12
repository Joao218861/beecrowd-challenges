/**
 * Title: Banknotes
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 11/09/2022
 * 
 * Description: In this problem you have to read an integer value and calculate the smallest possible number of 
 * 			banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banknotes1018 {
	public static void main(String[] args) throws IOException {
		int[] notes = {100,50,20,10,5,2,1};
		int[] qnt = new int[7];
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int value = Integer.parseInt(in.readLine());
		
		in.close();
		
		String print = String.format("%d\n", value);
		System.out.print(print);
		
		for(int i = 0; i < notes.length; i++) {
			if(value != 0) {
				qnt[i] = value/notes[i];
				value -= qnt[i]*notes[i];
			}
			
			print = String.format("%d nota(s) de R$ %d,00\n", qnt[i],notes[i]);
			System.out.print(print);
		}
		
	}
}
