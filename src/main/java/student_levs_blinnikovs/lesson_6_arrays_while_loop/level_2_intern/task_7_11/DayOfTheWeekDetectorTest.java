package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_2_intern.task_7_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    void shouldReturn(int dayOfTheWeek, String expectedDay) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDayResult = detector.findDayOfTheWeek(dayOfTheWeek);
        checkTestResult(expectedDay.equals(realDayResult), expectedDay + " test");
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        test.shouldReturn(1, "Monday");
        test.shouldReturn(2, "Tuesday");
        test.shouldReturn(3, "Wednesday");
        test.shouldReturn(4, "Thursday");
        test.shouldReturn(5, "Friday");
        test.shouldReturn(6, "Saturday");
        test.shouldReturn(7, "Sunday");
        test.shouldReturn(8, "Not correct day number");

    }
}
