package teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

class CalculatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();

		Calculator calculator = new Calculator();
		int result = calculator.sum(firstNumber, secondNumber);
		System.out.println("Result = " + result);

		// Test 1: f = -10; s = -3; r = -13
		// Test 2: f = 0; s = 0; r = 0
		// Test 3: f = 10; s = 20; r = 30
		// Test 4: f = 0; s = 20; r = 20
	}

}
