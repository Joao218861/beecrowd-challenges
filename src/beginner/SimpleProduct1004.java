package beginner;

import java.util.Scanner;

public class SimpleProduct1004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		input.close();
		
		int PROD = a*b;
		
		System.out.printf("PROD = %d\n",PROD);
	}
}
