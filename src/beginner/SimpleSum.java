package beginner;

import java.util.Scanner;

public class SimpleSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		int SOMA = A+B;
		
		System.out.printf("SOMA = %d\n",SOMA);
		
		input.close();
	}
}
