package student_olegs_radigins.lesson_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Division {
    public static void main(String[] args) {
        int a = 50;
        int b = 3;
        System.out.println("Result = " + a/b); // Первый вариант
        int result = a/b;
        System.out.println("Result = " + result); // Второй вариант
    }
}
