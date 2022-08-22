package student_artjom_vakhromeev.lesson_4.task_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Имя класса с большой буквы!")
public class evenOrOdd {
    int userinput;

    public evenOrOdd(int userinput) {
        this.userinput = userinput;
    }
    boolean even(){return this.userinput % 2 == 0;}
}
