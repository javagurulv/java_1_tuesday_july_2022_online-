package student_yurii_panasiuk.lesson_10.level_1_4.task_1_16;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_1.txt")
public class Rule_5 {

    private String state = "Germany";
    private int maximumAmount = 1000;

     String getState() {
        return state;
    }

     int getMaximumAmount() {
        return maximumAmount;
    }

// можно все правила вынести отдельно. но слишком уж они простые
}
