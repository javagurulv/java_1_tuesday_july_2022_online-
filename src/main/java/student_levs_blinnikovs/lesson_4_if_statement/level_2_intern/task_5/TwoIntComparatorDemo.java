package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoIntComparatorDemo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Program will ask 2 integers and will print which one is higher. Also checks if equal.");
        System.out.println("Enter number one: ");
        int savedUserInputOne = userInput.nextInt();

        System.out.println("Enter number two: ");
        int savedUserInputTwo = userInput.nextInt();

        TwoIntComparator testData = new TwoIntComparator(savedUserInputOne, savedUserInputTwo);
        System.out.print(testData.printHigherNumber());

    }

}
