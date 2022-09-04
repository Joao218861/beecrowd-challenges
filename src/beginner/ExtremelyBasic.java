package beginner;

import java.util.Scanner;

public class ExtremelyBasic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		int X = A+B;
		
		System.out.printf("X = %d\n", X);
		
		input.close();
	}
}
