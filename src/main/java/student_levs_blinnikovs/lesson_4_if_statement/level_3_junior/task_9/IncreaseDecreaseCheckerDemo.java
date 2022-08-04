package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_9;

import java.util.Scanner;

class IncreaseDecreaseCheckerDemo {

    public static void main(String[] args) {

        System.out.println("System expects three numbers and will check whether whey are increasing, decreasing or neither.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int savedUserInputFirst = userInput.nextInt();

        System.out.println("Enter second number: ");
        int savedUserInputSecond = userInput.nextInt();

        System.out.println("Enter third number: ");
        int savedUserInputThird = userInput.nextInt();

        IncreaseDecreaseChecker test = new IncreaseDecreaseChecker(savedUserInputFirst, savedUserInputSecond, savedUserInputThird);
        System.out.println(test.checkNumbers());

        /*
        Tests

        IncreaseDecreaseChecker test1 = new IncreaseDecreaseChecker(1,2,3);
        IncreaseDecreaseChecker test2 = new IncreaseDecreaseChecker(3,2,1);
        IncreaseDecreaseChecker test3 = new IncreaseDecreaseChecker(1,2,1);

        System.out.println(test1.checkNumbers());
        System.out.println(test2.checkNumbers());
        System.out.println(test3.checkNumbers());
         */

    }

}
