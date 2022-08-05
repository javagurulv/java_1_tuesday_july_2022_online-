package student_olegs_radigins.lesson_2.homework.level3.task10;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Radius {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.println("напишите радиус круга: ");

        double radius = scanner.nextDouble();

        double perimetr = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Perimeter is " + perimetr);
        System.out.println("Area is " + area);
    }
}
