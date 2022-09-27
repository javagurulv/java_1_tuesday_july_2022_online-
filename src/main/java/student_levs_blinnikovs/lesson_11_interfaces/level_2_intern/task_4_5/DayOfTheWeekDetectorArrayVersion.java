package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] weekdays = new String[8];
        weekdays[1] = "Monday";
        weekdays[2] = "Tuesday";
        weekdays[3] = "Wednesday";
        weekdays[4] = "Thursday";
        weekdays[5] = "Friday";
        weekdays[6] = "Saturday";
        weekdays[7] = "Sunday";
        weekdays[0] = "Please input a valid number between 1 and 7";
        return weekdays[number];
    }
}
