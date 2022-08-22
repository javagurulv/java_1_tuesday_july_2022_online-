package student_artjom_vakhromeev.lesson_4.task_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Имя класса с большой буквы!")
public class positiveNegativeDemo {
    public static void main(String[] args) {
        positiveNegative number = new positiveNegative(2);
        number.printPositiveOrNegative();

        positiveNegative number2 = new positiveNegative(0);
        number2.printPositiveOrNegative();

        positiveNegative number3 = new positiveNegative(-3);
        number3.printPositiveOrNegative();
    }
}
