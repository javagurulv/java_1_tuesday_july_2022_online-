package student_jelena_voinica.lesson_2_task_8;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Выведи на консоль значение самой переменной myName, а не просто текст.")
public class Hello {
    public static void main(String[]args){
        String myName="Jelena";
        System.out.println("Hello Jelena");
    }
}
