package student_ernest_aleskevics.lesson_4.level_2.task_5;

import java.util.Scanner;

public class HigherNumber {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int numberOne = inPut.nextInt();

        System.out.println("Please enter the second number: ");
        int numberTwo = inPut.nextInt();

        if (numberOne > numberTwo){
            System.out.println("The fist number is higher!");
        } else if (numberOne < numberTwo){
            System.out.println("The second number is higher!");
        } else if (numberOne == numberTwo){
            System.out.println("Both numbers similar");
        }
    }

}
