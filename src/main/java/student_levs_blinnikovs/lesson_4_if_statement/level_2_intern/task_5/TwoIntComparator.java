package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_5;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */

import java.util.Scanner;

class TwoIntComparator {

    int numberOne;
    int numberTwo;

    TwoIntComparator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    void printHigherNumber() {
        if (this.numberOne > this.numberTwo) {
            System.out.println(this.numberOne);
        } else if (this.numberOne < this.numberTwo) {
            System.out.println(this.numberTwo);
        } else System.err.println("N/A! Numbers are equal!");
    }

}

class TwoIntComparatorDemo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Program will ask 2 integers and will print which one is higher. Also checks if equal.");
        System.out.println("Enter number one: ");
        int savedUserInputOne = userInput.nextInt();

        System.out.println("Enter number two: ");
        int savedUserInputTwo = userInput.nextInt();

        TwoIntComparator testData = new TwoIntComparator(savedUserInputOne, savedUserInputTwo);
        System.out.print("Higher number is ");
        testData.printHigherNumber();

    }

}
