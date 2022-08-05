package student_olegs_radigins.lesson_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Sum {
    public static void main(String[] args) {
        int a = 74;
        int b = 36;
        System.out.println("Summa = " + (a + b)); // Первый вариант
        int sum = a + b;
        System.out.println("Summa = " + sum); // Второй вариант
    }
}
