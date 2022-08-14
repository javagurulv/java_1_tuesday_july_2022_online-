package student_yurii_panasiuk.lesson_2.level_3_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Лучшее название класса - MultiplicationTable")
public class Table {

    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(Number + " * " + i + " = " + Number*i);
        }

}
}