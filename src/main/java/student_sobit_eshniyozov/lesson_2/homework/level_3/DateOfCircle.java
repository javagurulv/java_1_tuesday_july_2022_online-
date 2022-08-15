package student_sobit_eshniyozov.lesson_2.homework.level_3;

import java.util.Scanner;
import java.lang.Math;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DateOfCircle {
    public static void main(String[] args) {
        Scanner scannerTwo = new Scanner( System.in );
        System.out.println("Radius of circle:");

        double radiusOfCircle = scannerTwo.nextDouble();
           double pi = 3.14;

              double resultOne = 2 * pi*radiusOfCircle;
              System.out.println("Perimeter of circle = " + resultOne);

              double resultTwo = pi*Math.pow(radiusOfCircle,2);
              System.out.println("Area of circle = " + resultTwo);
         }
    }
