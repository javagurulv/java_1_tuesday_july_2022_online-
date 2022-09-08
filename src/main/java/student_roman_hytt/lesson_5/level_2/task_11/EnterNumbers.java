package student_roman_hytt.lesson_5.level_2.task_11;

import java.util.Scanner;

public class EnterNumbers {

    public static void main(String[] args) {


        System.out.println("Please write 10 numbers");
        int numbers[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers [i]);

        }
    } }









