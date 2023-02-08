package student_levs_blinnikovs.lesson_13_exceptions.level_3_junior.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        boolean isValidDataType = false;
        while (!isValidDataType) {
            System.out.println("Please enter Integer below: ");
            try {
                Scanner userInput = new Scanner(System.in);
                int number = userInput.nextInt();
                isValidDataType = true;
            } catch (InputMismatchException e) {
                System.out.println("It's not an integer, please try again!");
            }
        }
    }
}
