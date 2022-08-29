package student_ivan_mostepanov.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

class Task3 {
int number;
    public static void main(String[] args) {
        Scanner newDay = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7 ");
        int number = newDay.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        }
        else if (number == 2) {
            System.out.println("Tuesday");
        }
        else if (number == 3) {
            System.out.println("Wednesday");
        }
        else if (number == 4) {
            System.out.println("Thursday");
        }
        else if (number == 5) {
            System.out.println("Friday");
        }
        else if (number == 6) {
            System.out.println("Saturday");
        }
        else if (number == 7) {
            System.out.println("Sunday");
        }

        else {
            System.out.println("Try again");
            /*Как сделать чтобы программа нчиналась заново?*/
        }

    }
}
