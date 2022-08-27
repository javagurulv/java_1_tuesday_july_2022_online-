package student_sobit_eshniyozov.lesson_4_if_statement.level_2.Task_7;

import java.util.Scanner;

class EqualsOrDifferentDemo {
    public static void main(String[] args) {

        Scanner inPutNumber = new Scanner(System.in);
        System.out.println("Write number one:");
        int savedNumberOne = inPutNumber.nextInt();
        System.out.println("Write number two:");
        int savedNumberTwo = inPutNumber.nextInt();

        EqualsOrDifferent biggerDigit = new EqualsOrDifferent(savedNumberOne, savedNumberTwo);
        biggerDigit.showEqualsOrDifferent();
    }
}
