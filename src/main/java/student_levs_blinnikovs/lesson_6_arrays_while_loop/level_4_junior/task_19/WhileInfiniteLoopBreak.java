package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_4_junior.task_19;

import java.util.Scanner;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        boolean hasUserAcceptedCookies = true;

        while (hasUserAcceptedCookies) {
            System.out.println("Enter password: ");
            if (userInput.next().equals("0000")) {
                System.out.println("Welcome!");
                break;
            }
            System.out.println("Incorrect password!");
        }
    }
}
