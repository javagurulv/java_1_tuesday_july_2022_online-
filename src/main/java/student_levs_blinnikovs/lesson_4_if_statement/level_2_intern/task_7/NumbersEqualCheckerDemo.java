package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_7;

import java.util.Scanner;

class NumbersEqualCheckerDemo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Program will ask 2 integers and will tell whether they are equal.");
        System.out.println("Enter number one: ");
        int savedUserInputOne = userInput.nextInt();

        System.out.println("Enter number two: ");
        int savedUserInputTwo = userInput.nextInt();

        NumbersEqualChecker testData = new NumbersEqualChecker(savedUserInputOne, savedUserInputTwo);
        System.out.print(testData.printIsNumbersEqual());

    }

}
