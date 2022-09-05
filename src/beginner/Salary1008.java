package beginner;

import java.util.Scanner;

public class Salary1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int id = input.nextInt();
		int hoursWorked = input.nextInt();
		double payPerHour = input.nextDouble();
		
		input.close();
		
		double salary = hoursWorked*payPerHour;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", id, salary);
	}
}
