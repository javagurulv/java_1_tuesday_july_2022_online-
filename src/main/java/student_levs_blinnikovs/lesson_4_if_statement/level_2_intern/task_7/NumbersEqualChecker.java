package student_levs_blinnikovs.lesson_4_if_statement.level_2_intern.task_7;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */

class NumbersEqualChecker {

    int numberOne;
    int numberTwo;

    NumbersEqualChecker(int numberOne, int numberTwo) {
            this.numberOne = numberOne;
            this.numberTwo = numberTwo;
        }

        boolean isNumbersEqual() {
            return this.numberOne == this.numberTwo;
        }

        String printIsNumbersEqual() {
            if (this.isNumbersEqual()) {
                return "Numbers are equal";
            } else return "Numbers are different";
        }

    }

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
