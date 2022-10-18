package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorInitializedArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] weekdays = {
                "Please input a valid number between 1 and 7",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };
        return weekdays[number];
    }
}
