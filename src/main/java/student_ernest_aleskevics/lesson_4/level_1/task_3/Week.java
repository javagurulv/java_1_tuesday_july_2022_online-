package student_ernest_aleskevics.lesson_4.level_1.task_3;

import java.util.Scanner;

public class Week {

    public static void main(String[] args) {

        Scanner inPut = new Scanner (System.in);
        System.out.println("Please enter integer number from 1 until 7: ");
        int number = inPut.nextInt();

        if (number == 1) {
            System.out.println ("Monday");
        } else if (number == 2) {
            System.out.println ("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Wednesday");
        }
    }
}
