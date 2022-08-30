package student_ivan_mostepanov.lesson_2.level_3_junior;

import java.util.Scanner;

class Task10 {

    static final double PI = 3.14159265;


    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter circle radius");

        double radius = scanner.nextDouble();

        double circlePerimeter = 2 * PI * radius;

        System.out.println("Perimeter is = " + circlePerimeter);



        double areaOfCircle = PI * (radius * radius);

        System.out.println("Area of a circle is = " + areaOfCircle);



    }





}
