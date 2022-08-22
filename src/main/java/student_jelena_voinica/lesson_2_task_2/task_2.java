package student_jelena_voinica.lesson_2_task_2;


import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Имя класса с большой буквы!")
public class task_2 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);

    }

}
