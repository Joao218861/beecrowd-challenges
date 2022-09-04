package beginner;

import java.util.Scanner;

public class AverageTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		input.close();
		
		double average = (2*a + 3*b + 5*c)/(2+3+5);
		
		System.out.printf("MEDIA = %.1f\n",average);
	}
}
