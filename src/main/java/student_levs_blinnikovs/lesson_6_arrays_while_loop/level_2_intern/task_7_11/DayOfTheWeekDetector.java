package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_2_intern.task_7_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetector {

    String findDayOfTheWeek(int dayNumber) {
        String dayOfTheWeek;
        switch (dayNumber) {
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            case 7 -> dayOfTheWeek = "Sunday";
            default -> dayOfTheWeek = "Not correct day number";
        }
        return dayOfTheWeek;
    }

}
