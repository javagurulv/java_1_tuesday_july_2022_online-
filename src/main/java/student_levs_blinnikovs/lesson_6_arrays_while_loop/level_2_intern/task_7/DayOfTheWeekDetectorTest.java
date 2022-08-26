package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_2_intern.task_7;

class DayOfTheWeekDetectorTest {

    void findDayOfTheWeekTest() {
        int userInput = 1;
        String expectedResult = "Monday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(userInput);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else System.out.println("Test NOT OK");
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.findDayOfTheWeekTest();
    }
}
