package student_yurii_panasiuk.lesson_8.level_2.task_8;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Зачем в классе ComputerPlayer свойство name?")
class ComputerPlayer extends Player {

    String name;

    ComputerPlayer(String name) {
        super(name);
    }
}