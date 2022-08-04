package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_8;

import java.util.Scanner;

class ThreeNumComparatorDemo {

    public static void main(String[] args) {

        System.out.println("System expects three numbers and will compare them.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int savedUserInputFirst = userInput.nextInt();

        System.out.println("Enter second number: ");
        int savedUserInputSecond = userInput.nextInt();

        System.out.println("Enter third number: ");
        int savedUserInputThird = userInput.nextInt();

        ThreeNumComparator test = new ThreeNumComparator(savedUserInputFirst, savedUserInputSecond, savedUserInputThird);
        System.out.println(test.compareNumbers());


        /*
        Tests

        ThreeNumComparator test1 = new ThreeNumComparator(1,1,1);
        ThreeNumComparator test2 = new ThreeNumComparator(1,2,3);
        ThreeNumComparator test3 = new ThreeNumComparator(1,2,1);

        System.out.println(test1.compareNumbers());
        System.out.println(test2.compareNumbers());
        System.out.println(test3.compareNumbers());
         */

    }

}

