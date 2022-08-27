package student_sobit_eshniyozov.lesson_4_if_statement.level_2.Task_6;

import java.util.Scanner;

class SmallerDigitDemo {
    public static void main(String[] args) {

        Scanner inPutNumber = new Scanner(System.in);
        System.out.println("Write number one:");
        int savedNumberOne = inPutNumber.nextInt();
        System.out.println("Write number two:");
        int savedNumberTwo = inPutNumber.nextInt();

        SmallerDigit smallerDigit = new SmallerDigit(savedNumberOne, savedNumberTwo);
        smallerDigit.showSmallerDigit();
    }
}
