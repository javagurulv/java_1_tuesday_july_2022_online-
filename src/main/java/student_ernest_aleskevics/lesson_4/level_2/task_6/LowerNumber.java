package student_ernest_aleskevics.lesson_4.level_2.task_6;

import java.util.Scanner;

public class LowerNumber {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int numberOne = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberTwo = inPut.nextInt();

        if (numberOne > numberTwo){
            System.out.println("The second number " + numberTwo + " the lowest number");
        } else {
            System.out.println("The second number " + numberOne + " the lowest number");
        }

}
    }
