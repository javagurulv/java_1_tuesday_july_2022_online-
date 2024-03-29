package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorSwitchEnhancedLambdaVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please input a valid number between 1 and 7";
        };
    }
}
