package student_ernest_aleskevics.lesson_2.homework.level_3_junior.task_11;

import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("First number: ");
        double numberOne = userInput.nextDouble();

        System.out.println("Second number: ");
        double numberTwo = userInput.nextDouble();

        System.out.println("Third 5number: ");
        double numberThree = userInput.nextDouble();

        double total = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("Arithmetic average: " + total);

    }
}
