package student_sobit_eshniyozov.lesson_2.homework.level_3;


import java.util.Scanner;
import java.lang.Math;

public class ArithmeticMean {
    public static void main(String[] args) {

        Scanner ScannerOne = new Scanner( System.in );
        System.out.println("Enter the first number:");
        double nomberOne = ScannerOne.nextDouble();

            Scanner ScannerTwo = new Scanner( System.in );
            System.out.println("Enter the second number:");
            double nomberTwo = ScannerTwo.nextDouble();

            Scanner ScannerThree = new Scanner( System.in );
            System.out.println("Enter the third number:");
            double nomberThree = ScannerThree.nextDouble();

            double result = (nomberOne+nomberTwo+nomberThree)/3;
            System.out.println("Arithmetic mean = " + result);

    }
}
