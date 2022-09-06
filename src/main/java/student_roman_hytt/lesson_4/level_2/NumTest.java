package student_roman_hytt.lesson_4.level_2;

import student_roman_hytt.lesson_4.level_4.Calculator;

public class NumTest {
    public static void main(String[] args) {
        NumTest numTest = new NumTest();

        numTest.maxOfTwo();
        numTest.minOfTwo();
        numTest.EqualsOrDifferent();

    }

    private void maxOfTwo() {
        int firstNumber = 1;
        int secondNumber = 2;
        int result = 2;

        Num num = new Num();

        int realResult = num.maxOfTwo(firstNumber, secondNumber);
        if (realResult == result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

    private void minOfTwo() {
        int firstNumber = 1;
        int secondNumber = 2;
        int result = 1;

        Num num = new Num();

        int realResult = num.minOfTwo(firstNumber, secondNumber);
        if (realResult == result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }


    boolean EqualsOrDifferent() {
        int firstNumber = 1;
        int secondNumber = 1;
        boolean result = true;

        Num num = new Num();

        boolean realResult = num.equalsOrDifferent(firstNumber, secondNumber);
        if (realResult == result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        return result;
    }
}


