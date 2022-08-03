package student_ernest_aleskevics.lesson_2.homework.task_8;

import java.util.Scanner;

public class AddYourName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
