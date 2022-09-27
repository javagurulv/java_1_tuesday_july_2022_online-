package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

class DayOfTheWeekDetectorSwitchCaseVersionSingleExitPoint implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String result;
        switch (number) {
            case 1: result = "Monday";
            case 2: result = "Tuesday";
            case 3: result = "Wednesday";
            case 4: result = "Thursday";
            case 5: result = "Friday";
            case 6: result = "Saturday";
            case 7: result = "Sunday";
            default: result = "Please input a valid number between 1 and 7";
        }
        return result;
    }
}
