package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_10;


import java.util.Scanner;

class HighestCheckerDemo {

    public static void main(String[] args) {

        // Tests
        // all three different
        // highest first
        HighestChecker test1 = new HighestChecker(3,2,1);
        System.out.println("Should return first position (value 3) as highest (smaller are later - medium is next, smallest is last): " + test1.getHighest());

        HighestChecker test2 = new HighestChecker(3,1,2);
        System.out.println("Should return first position (value 3) as highest (smallest are later - smallest is next, medium is last): " + test2.getHighest());

        HighestChecker test3 = new HighestChecker(3,1,1);
        System.out.println("Should return first position (value 3) as highest (smaller are later): " + test3.getHighest());


        // highest second (middle)
        HighestChecker test4 = new HighestChecker(1,3,2);
        System.out.println("Should return middle position (value 3) as highest (smallest is first, medium is last): " + test4.getHighest());

        HighestChecker test5 = new HighestChecker(2,3,1);
        System.out.println("Should return middle position (value 3) as highest (medium is first, smallest is last): " + test5.getHighest());

        HighestChecker test6 = new HighestChecker(1,3,1);
        System.out.println("Should return middle position (value 3) as highest (smallest is first and last): " + test6.getHighest());

        // highest last
        HighestChecker test7 = new HighestChecker(1,2,3);
        System.out.println("Should return last position (value 3) as highest (smallest is first, medium is second): " + test7.getHighest());

        HighestChecker test8 = new HighestChecker(2,1,3);
        System.out.println("Should return last position (value 3) as highest (medium is first, smallest is second): " + test8.getHighest());

        HighestChecker test9 = new HighestChecker(1,1,3);
        System.out.println("Should return last position (value 3) as highest (smallest is first and second): " + test9.getHighest());

        // some (two of) are the same, and they are also highest (each of them/both considered highest)
        // highest middle and last
        HighestChecker test10 = new HighestChecker(1,3,3);
        System.out.println("Second and third are equally high, first is the smallest: " + test10.getHighest());

        // highest first and second (middle)
        HighestChecker test11 = new HighestChecker(3,3,1);
        System.out.println("First and second are equally high, last is the smallest: " + test11.getHighest());

        // highest first and last
        HighestChecker test12 = new HighestChecker(3,1,3);
        System.out.println("First and third are equally high, middle is the smallest: " + test12.getHighest());

        // all three the same
        HighestChecker test13 = new HighestChecker(3,3,3);
        System.out.println("All three equally high. Should return any: " + test13.getHighest());

        // and now user input

        /*

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("System expects three numbers and will check whether whey are increasing, decreasing or neither.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int savedUserInputFirst = userInput.nextInt();

        System.out.println("Enter second number: ");
        int savedUserInputSecond = userInput.nextInt();

        System.out.println("Enter third number: ");
        int savedUserInputThird = userInput.nextInt();

        HighestChecker test = new HighestChecker(savedUserInputFirst, savedUserInputSecond, savedUserInputThird);
        System.out.println(test.getHighest());

        */

    }

}
