package student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_2;

import static student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_2.DayOfTheWeekDetector.getDayNumberFromUser;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        int dayNumber = getDayNumberFromUser();
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }
}
