package student_ernest_aleskevics.lesson_2.homework.level_3_junior.task_10;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Radius: ");
        double n = in.nextDouble();
        System.out.println("Perimeter is = " + (2 * Math.PI * n));
        System.out.println("Area is = " + (Math.PI * n * n));

    }
}
