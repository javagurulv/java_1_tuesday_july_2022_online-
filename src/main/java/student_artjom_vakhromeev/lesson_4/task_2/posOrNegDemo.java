package student_artjom_vakhromeev.lesson_4.task_2;

import java.util.Scanner;

public class posOrNegDemo {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner userInput = new Scanner(System.in);
        int savedUserInput = userInput.nextInt();

        posOrNeg numberToCheck = new posOrNeg(savedUserInput);
        numberToCheck.printUserNumber();


    }
}
