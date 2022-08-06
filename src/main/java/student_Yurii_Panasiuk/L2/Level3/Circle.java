package student_Yurii_Panasiuk.L2.Level3;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

    System.out.println("enter the radius of the circle");
    Scanner scanner = new Scanner(System.in);
    double Number = scanner.nextDouble();

    double perimeter = 2*Math.PI*Number;
    double area = Math.PI*Math.pow(Number, 2);

    System.out.println("Perimeter is = " +  perimeter);
    System.out.println("Area is = " +  area);


    }
}
