package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {

		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(100);
		System.out.println("Random number: " + randomNumber);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number: ");
		int guessedNumber = scanner.nextInt();

		while (guessedNumber != randomNumber) {
			System.out.println("Enter number: ");
			guessedNumber = scanner.nextInt();
		}

		System.out.println("YOU WIN! NUMBER = " + guessedNumber);

	}

}
