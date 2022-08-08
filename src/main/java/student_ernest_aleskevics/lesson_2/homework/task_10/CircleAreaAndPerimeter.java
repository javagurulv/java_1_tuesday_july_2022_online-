package student_ernest_aleskevics.lesson_2.homework.task_10;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Radius: ");
        double n = in.nextDouble();
        System.out.println("Perimeter is = " + (2 * Math.PI * n));
        System.out.println("Area is = " + (Math.PI * n * n));

    }
}
