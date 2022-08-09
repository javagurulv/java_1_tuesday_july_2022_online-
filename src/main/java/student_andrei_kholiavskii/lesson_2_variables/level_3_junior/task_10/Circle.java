package student_andrei_kholiavskii.lesson_2_variables.level_3_junior.task_10;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Circle {

    public static void main(String[] args){

        Scanner radiusInput = new Scanner(System.in);

        System.out.println("Enter circle radius: ");

        double userNumber = radiusInput.nextDouble();

        System.out.println("Radius = " + userNumber);

        double perimeter = 2 * 3.14159265359 * userNumber; // как извлечь число "Пи"?

        System.out.println("Perimeter is = " + perimeter);

        double area = 3.14159265359 * userNumber * userNumber; // как возвести в квадрат?

        System.out.println("Area is = " + area);

    }
}
