package student_yurii_panasiuk.lesson_13.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo  {
    public static void main(String[] args) throws InputMismatchException {
        boolean result = false;
    while (!result) {
        try {
            System.out.println("input integer");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            result = true;
        } catch (InputMismatchException exception) {
            System.out.println("incorrect input");
        }
    }


    }
}
