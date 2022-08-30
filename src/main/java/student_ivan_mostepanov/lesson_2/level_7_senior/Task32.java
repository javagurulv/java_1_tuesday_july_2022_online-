package student_ivan_mostepanov.lesson_2.level_7_senior;

import java.util.Scanner;

class Task32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you?  ");
        int howOld = scanner.nextInt();
        System.out.println("What year is now?  ");
        int thisYear = scanner.nextInt();
        int age = thisYear - howOld;
        System.out.print("Your birthday year is " + age);

    }
}