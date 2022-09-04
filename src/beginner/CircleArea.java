package beginner;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		final double pi = 3.14159;
	
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		input.close();
	
		double area = pi*radius*radius;
		
		System.out.printf("A=%.4f\n", area);
	}
}
