package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_6;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */

import java.util.Scanner;

class TwoIntComparatorSmaller {

    int numberOne;
    int numberTwo;

    TwoIntComparatorSmaller(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    void printSmallerNumber() {
        if (this.numberOne < this.numberTwo) {
            System.out.println(this.numberOne);
        } else if (this.numberOne > this.numberTwo) {
            System.out.println(this.numberTwo);
        } else System.err.println("N/A! Numbers are equal!");
    }

}

class TwoIntComparatorSmallerDemo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Program will ask 2 integers and will print which one is smaller. Also checks if equal.");
        System.out.println("Enter number one: ");
        int savedUserInputOne = userInput.nextInt();

        System.out.println("Enter number two: ");
        int savedUserInputTwo = userInput.nextInt();

        TwoIntComparatorSmaller testData = new TwoIntComparatorSmaller(savedUserInputOne, savedUserInputTwo);
        System.out.print("Smaller number is ");
        testData.printSmallerNumber();

    }

}
