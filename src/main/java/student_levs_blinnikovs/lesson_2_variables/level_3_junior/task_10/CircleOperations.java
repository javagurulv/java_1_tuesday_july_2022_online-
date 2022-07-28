package student_levs_blinnikovs.lesson_2_variables.level_3_junior.task_10;

/*

7,Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

 */

import java.util.Scanner;

public class CircleOperations {

    static double pi = Math.PI;
    static double getCircumference(double radius) {
        return 2 * pi * radius;
    }

    static double getArea(double radius) {
        return pi * radius * radius;
    }



    public static void main(String[] args) {

        System.out.println("This program will calculate circle perimeter and area. Program expects radius with a type of double.");
        System.out.println("Please input circle radius: ");

        Scanner userInput = new Scanner(System.in);
        double circleRadius = userInput.nextDouble();

        System.out.println("Your radius of choice is " + circleRadius + " units. \n");

        System.out.println("Circumference is " + getCircumference(circleRadius));
        System.out.println("Area is " + getArea(circleRadius));


    }

}
