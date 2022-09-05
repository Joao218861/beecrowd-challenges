package beginner;

import java.util.Scanner;

public class Difference1007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		input.close();
		
		int difference = a*b-c*d;
		
		System.out.printf("DIFERENCA = %d\n", difference);
	}
}
