package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

class DayOfTheWeekDetectorSwitchCaseVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Please input a valid number between 1 and 7";
        }
    }
}
