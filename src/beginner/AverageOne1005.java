package beginner;

import java.util.Scanner;

public class AverageOne1005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		input.close();
		
		double average = (3.5*a + 7.5*b)/(3.5+7.5);
		
		System.out.printf("MEDIA = %.5f\n",average);
	}
}
