package student_artjom_vakhromeev.lesson_1.lesson_2.Task_8;

import java.util.Scanner;

class User {
     public static void main(String[] args) {
         System.out.println("Please enter your name:");

         Scanner sc = new Scanner(System.in);
         String name = sc.next();

         System.out.println("Hello " + name);
     }
}
