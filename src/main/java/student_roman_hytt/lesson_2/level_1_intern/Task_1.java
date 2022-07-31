package student_roman_hytt.lesson_2.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    public static void main (String [] args) {
        System.out.println (" Please write number 1 or 2");

        Scanner scanner= new Scanner (System.in);
        int firstNumber = scanner.nextInt();
        int a= 1;
        int b=2;
        int x=a+b;
        if ( firstNumber < 3){
        System.out.println( " Result= " + x);}
        if (firstNumber >3) {
            System.out.println(" ERROR! Please write 1 or 2");
        }


    }
}
