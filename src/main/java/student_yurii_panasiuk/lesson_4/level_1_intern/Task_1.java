package student_yurii_panasiuk.lesson_4.level_1_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Task_1 {

    public static void main(String[] args) {

        System.out.println("Введите целое чило");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            if (number > 0) {
                System.out.println("Число положительное");
            }
        }
    }
}



