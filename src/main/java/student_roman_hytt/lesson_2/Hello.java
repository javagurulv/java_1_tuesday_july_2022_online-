package student_roman_hytt.lesson_2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println( "What is Your name?");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
System.out.println( "Hello " + b);
    }
}