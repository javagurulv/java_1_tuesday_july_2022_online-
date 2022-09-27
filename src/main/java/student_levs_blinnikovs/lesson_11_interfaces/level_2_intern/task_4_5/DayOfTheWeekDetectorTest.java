package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

class DayOfTheWeekDetectorTest {

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    void arrayVersionTest(int dayNumber, String dayName) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorArrayVersion().detectDayName(dayNumber)), dayName + " test");
    }

    void initializedArrayVersionTest(int dayNumber, String dayName) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorInitializedArrayVersion().detectDayName(dayNumber)), dayName + " test");
    }

    void ifVersionTest(int dayNumber, String dayName) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersion().detectDayName(dayNumber)), dayName + " test");
    }

    void ifVersionSingleExitPointTest(int dayNumber, String dayName) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test");
    }

    void switchCaseVersionTest(int dayNumber, String dayName) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test");
    }

    void switchCaseVersionSingleExitPointTest(int dayNumber, String dayName) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test");
    }

    void switchCaseEnhancedLambdaTest(int dayNumber, String dayName) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test");
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        test.arrayVersionTest(1, "Monday");
        test.arrayVersionTest(2, "Tuesday");
        test.arrayVersionTest(3, "Wednesday");
        test.arrayVersionTest(4, "Thursday");
        test.arrayVersionTest(5, "Friday");
        test.arrayVersionTest(6, "Saturday");
        test.arrayVersionTest(7, "Sunday");
        test.arrayVersionTest(0, "Please input a valid number between 1 and 7");

        test.initializedArrayVersionTest(1, "Monday");
        test.initializedArrayVersionTest(2, "Tuesday");
        test.initializedArrayVersionTest(3, "Wednesday");
        test.initializedArrayVersionTest(4, "Thursday");
        test.initializedArrayVersionTest(5, "Friday");
        test.initializedArrayVersionTest(6, "Saturday");
        test.initializedArrayVersionTest(7, "Sunday");
        test.initializedArrayVersionTest(0, "Please input a valid number between 1 and 7");

        test.ifVersionTest(1, "Monday");
        test.ifVersionTest(2, "Tuesday");
        test.ifVersionTest(3, "Wednesday");
        test.ifVersionTest(4, "Thursday");
        test.ifVersionTest(5, "Friday");
        test.ifVersionTest(6, "Saturday");
        test.ifVersionTest(7, "Sunday");
        test.ifVersionTest(0, "Please input a valid number between 1 and 7");

        test.ifVersionSingleExitPointTest(1, "Monday");
        test.ifVersionSingleExitPointTest(2, "Tuesday");
        test.ifVersionSingleExitPointTest(3, "Wednesday");
        test.ifVersionSingleExitPointTest(4, "Thursday");
        test.ifVersionSingleExitPointTest(5, "Friday");
        test.ifVersionSingleExitPointTest(6, "Saturday");
        test.ifVersionSingleExitPointTest(7, "Sunday");
        test.ifVersionSingleExitPointTest(0, "Please input a valid number between 1 and 7");

        test.switchCaseVersionTest(1, "Monday");
        test.switchCaseVersionTest(2, "Tuesday");
        test.switchCaseVersionTest(3, "Wednesday");
        test.switchCaseVersionTest(4, "Thursday");
        test.switchCaseVersionTest(5, "Friday");
        test.switchCaseVersionTest(6, "Saturday");
        test.switchCaseVersionTest(7, "Sunday");
        test.switchCaseVersionTest(0, "Please input a valid number between 1 and 7");

        test.switchCaseVersionSingleExitPointTest(1, "Monday");
        test.switchCaseVersionSingleExitPointTest(2, "Tuesday");
        test.switchCaseVersionSingleExitPointTest(3, "Wednesday");
        test.switchCaseVersionSingleExitPointTest(4, "Thursday");
        test.switchCaseVersionSingleExitPointTest(5, "Friday");
        test.switchCaseVersionSingleExitPointTest(6, "Saturday");
        test.switchCaseVersionSingleExitPointTest(7, "Sunday");
        test.switchCaseVersionSingleExitPointTest(0, "Please input a valid number between 1 and 7");

        test.switchCaseEnhancedLambdaTest(1, "Monday");
        test.switchCaseEnhancedLambdaTest(2, "Tuesday");
        test.switchCaseEnhancedLambdaTest(3, "Wednesday");
        test.switchCaseEnhancedLambdaTest(4, "Thursday");
        test.switchCaseEnhancedLambdaTest(5, "Friday");
        test.switchCaseEnhancedLambdaTest(6, "Saturday");
        test.switchCaseEnhancedLambdaTest(7, "Sunday");
        test.switchCaseEnhancedLambdaTest(0, "Please input a valid number between 1 and 7");

    }
}
