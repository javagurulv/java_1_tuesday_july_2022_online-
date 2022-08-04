package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_10;


import java.util.Scanner;

class HighestCheckerDemo {

    public static void main(String[] args) {

        // Tests
        // all three different
        // highest first
        HighestChecker test1 = new HighestChecker(3,2,1);
        System.out.println("Should return first position (value 3) as highest (smaller are later - medium is next, smallest is last): " + test1.checkHighest());

        HighestChecker test2 = new HighestChecker(3,1,2);
        System.out.println("Should return first position (value 3) as highest (smallest are later - smallest is next, medium is last): " + test2.checkHighest());

        // highest second (middle)
        HighestChecker test3 = new HighestChecker(1,3,2);
        System.out.println("Should return middle position (value 3) as highest (smallest is first, medium is last): " + test3.checkHighest());

        HighestChecker test4 = new HighestChecker(2,3,1);
        System.out.println("Should return middle position (value 3) as highest (medium is first, smallest is last): " + test4.checkHighest());

        // highest last
        HighestChecker test5 = new HighestChecker(1,2,3);
        System.out.println("Should return last position (value 3) as highest (smallest is first, medium is second): " + test5.checkHighest());

        HighestChecker test6 = new HighestChecker(2,1,3);
        System.out.println("Should return last position (value 3) as highest (medium is first, smallest is second): " + test6.checkHighest());

        // some (two of) are the same but there is one highest
        // highest first
        HighestChecker test7 = new HighestChecker(3,1,1);
        System.out.println("Should return first position (value 3) as highest (smaller are later): " + test7.checkHighest());

        // highest second (middle)
        HighestChecker test8 = new HighestChecker(1,3,1);
        System.out.println("Should return middle position (value 3) as highest (smallest is first and last): " + test8.checkHighest());

        // highest last
        HighestChecker test9 = new HighestChecker(1,1,3);
        System.out.println("Should return last position (value 3) as highest (smallest is first and second): " + test9.checkHighest());


        // some (two of) are the same and there are two highest (both)
        // highest middle and last
        HighestChecker test10 = new HighestChecker(1,3,3);
        System.out.println("Should return that there are no highest number: " + test10.checkHighest());

        // highest first and second (middle)
        HighestChecker test11 = new HighestChecker(3,3,1);
        System.out.println("Should return that there are no highest number: " + test11.checkHighest());

        // highest first and last
        HighestChecker test12 = new HighestChecker(3,1,3);
        System.out.println("Should return that there are no highest number: " + test12.checkHighest());


        // all three the same
        HighestChecker test13 = new HighestChecker(3,3,3);
        System.out.println("Should return that there are no highest number (all three equal): " + test13.checkHighest());

        // and now user input

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
        System.out.println(test.checkHighest());

    }

}
