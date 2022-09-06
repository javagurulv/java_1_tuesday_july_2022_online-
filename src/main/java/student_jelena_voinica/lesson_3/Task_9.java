package student_jelena_voinica.lesson_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello.What is your name?");
        String userName = scanner.nextLine();

        String greeting = "Hi" + userName + "!";
        System.out.println(greeting);
    }
}
