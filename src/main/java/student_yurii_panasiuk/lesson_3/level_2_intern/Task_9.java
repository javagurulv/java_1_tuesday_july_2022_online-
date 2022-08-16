package student_yurii_panasiuk.lesson_3.level_2_intern;

import java.util.Scanner; // инициализация функции сканера

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What is your name");
        String userName = scanner.nextLine();

        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);

    }
}
