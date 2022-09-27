package student_olegs_radigins.lesson_6.level_2.task_7_11;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_6_arrays_while_loop/codereview/CleanCodeWarning_5.txt")
class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            int dayNumber = detector.getDayNumberFromUser();
            String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
            System.out.println(dayOfTheWeek);

    }
}
