package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "")
interface Builder {

    void reset();
    void setReleaseYear(int releaseYear);

}
