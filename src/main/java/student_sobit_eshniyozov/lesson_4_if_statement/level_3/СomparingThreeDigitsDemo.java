package student_sobit_eshniyozov.lesson_4_if_statement.level_3;

import java.util.Scanner;

class СomparingThreeDigitsDemo {
    public static void main(String[] args) {

        Scanner inPutNumber = new Scanner(System.in);
        System.out.println("Write number one:");
        int savedNumberOne = inPutNumber.nextInt();
        System.out.println("Write number two:");
        int savedNumberTwo = inPutNumber.nextInt();
        System.out.println("Write number three:");
        int savedNumberThree = inPutNumber.nextInt();

        СomparingThreeDigits biggerDigit = new СomparingThreeDigits(savedNumberOne, savedNumberTwo, savedNumberThree);
        biggerDigit.showСomparingThreeDigits();
    }
}
