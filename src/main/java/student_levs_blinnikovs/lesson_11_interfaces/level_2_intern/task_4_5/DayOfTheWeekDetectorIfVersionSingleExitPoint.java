package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

class DayOfTheWeekDetectorIfVersionSingleExitPoint implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String result;
        if (number == 1) {
            result = "Monday";
        } else if (number == 2) {
            result = "Tuesday";
        } else if (number == 3) {
            result = "Wednesday";
        } else if (number == 4) {
            result = "Thursday";
        } else if (number == 5) {
            result = "Friday";
        } else if (number == 6) {
            result = "Saturday";
        } else if (number == 7) {
            result = "Sunday";
        } else {
            result = "Please input a valid number between 1 and 7";
        }
        return result;
    }
}
