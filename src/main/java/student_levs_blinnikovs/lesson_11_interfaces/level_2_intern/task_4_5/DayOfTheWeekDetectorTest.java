package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

class DayOfTheWeekDetectorTest {

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    void arrayVersionTest(int dayNumber, String dayName, String scenario) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorArrayVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void initializedArrayVersionTest(int dayNumber, String dayName, String scenario) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorInitializedArrayVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void ifVersionTest(int dayNumber, String dayName, String scenario) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void ifVersionSingleExitPointTest(int dayNumber, String dayName, String scenario) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void switchCaseVersionTest(int dayNumber, String dayName, String scenario) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void switchCaseVersionSingleExitPointTest(int dayNumber, String dayName, String scenario) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void switchCaseEnhancedLambdaTest(int dayNumber, String dayName, String scenario) {
        checkTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        String[] weekdaysTestData = {
                "Please input a valid number between 1 and 7",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };

        for (int day = 0; day < weekdaysTestData.length; day++) {
            test.arrayVersionTest(day, weekdaysTestData[day], "array version");
            test.initializedArrayVersionTest(day, weekdaysTestData[day], "initialized array version");
            test.ifVersionTest(day, weekdaysTestData[day], "if version");
            test.ifVersionSingleExitPointTest(day, weekdaysTestData[day], "if version with single exit point");
            test.switchCaseVersionTest(day, weekdaysTestData[day], "switch case version");
            test.switchCaseVersionSingleExitPointTest(day, weekdaysTestData[day], "switch case version with single exit point");
            test.switchCaseEnhancedLambdaTest(day, weekdaysTestData[day], "enhanced switch case version (lambdas)");
        }

    }
}
