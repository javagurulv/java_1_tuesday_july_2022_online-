package student_yurii_panasiuk.lesson_14.level_3;

import java.util.Scanner;

class ConsoleInterface {

     String menu() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Conway's Game of Life: ");
         System.out.println("1. random filling");
         System.out.println("2. single Gosper's glider gun");
         String name = scanner.nextLine();

         return name;
     }
}
