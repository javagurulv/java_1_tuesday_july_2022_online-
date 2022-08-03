package teacher.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//String text = scanner.nextLine();

		// Step 1 - zaprositj pervoe chislo
		System.out.println("Enter first number:");
		int firstNumber = scanner.nextInt();

		// Step 2 - zaprositj vtoroe chislo
		System.out.println("Enter second number:");
		int secondNumber = scanner.nextInt();

		// Step 3 - sum two numbers
		int sum = firstNumber + secondNumber;

		// Step 4 - vivesti na ekran rezultat
		System.out.println("Sum = " + sum);



		int number1 = 5;
		int number2 = 3;
		int resultI = number1 / number2;
		System.out.println("Result = " + resultI);

		double number1D = 5;
		double number2D = 3;
		double resultD = number1D / number2D;
		System.out.println("Result = " + resultD);
	}

}
