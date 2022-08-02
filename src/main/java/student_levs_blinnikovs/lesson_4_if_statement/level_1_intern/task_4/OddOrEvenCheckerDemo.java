package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_4;

import java.util.Scanner;

class OddOrEvenCheckerDemo {

    public static void main(String[] args) {

        System.out.println("Enter integer - system will determine whether it's even.");
        Scanner userKeys = new Scanner(System.in);
        int savedUserInput = userKeys.nextInt();

        OddOrEvenChecker testData = new OddOrEvenChecker(savedUserInput);
        System.out.println("It's " + testData.isEven() + " that " + savedUserInput + " is even.");

    }

}
