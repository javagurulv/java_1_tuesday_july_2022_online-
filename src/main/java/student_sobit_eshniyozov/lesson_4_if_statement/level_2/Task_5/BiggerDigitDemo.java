package student_sobit_eshniyozov.lesson_4_if_statement.level_2.Task_5;

import java.util.Scanner;

class BiggerDigitDemo {
    public static void main(String[] args) {

        Scanner inPutNumber = new Scanner(System.in);
        System.out.println("Write number one:");
        int savedNumberOne = inPutNumber.nextInt();
        System.out.println("Write number two:");
        int savedNumberTwo = inPutNumber.nextInt();

        BiggerDigit biggerDigit = new BiggerDigit(savedNumberOne, savedNumberTwo);
        biggerDigit.showBiggerDigit();
    }
}