package student_artjom_vakhromeev.lesson_4.task_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Имя класса с большой буквы!")
public class positiveNegative {
    int num;

    public positiveNegative(int num) {this.num = num;}

    void printPositiveOrNegative(){
        if (this.num >= 0){System.out.println(this.num + " is positive !");}

        else System.out.println(this.num + " is negative !");



    }
}
