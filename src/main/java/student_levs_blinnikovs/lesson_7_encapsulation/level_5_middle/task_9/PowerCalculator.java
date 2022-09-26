package student_levs_blinnikovs.lesson_7_encapsulation.level_5_middle.task_9;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_7_encapsulation/codereview/CleanCodeWarning_3.txt")
class PowerCalculator {

    int power(int base, int power) {
        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }

}
