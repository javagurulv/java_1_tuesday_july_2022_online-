package student_yurii_panasiuk.lesson_3.level_2;

import java.util.Scanner; // инициализация функции сканера

public class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What is your name");
        String userName = scanner.nextLine();

        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);

    }
}
