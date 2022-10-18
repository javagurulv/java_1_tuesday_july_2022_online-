package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        String[] weekdays = {
                "Please input a valid number between 1 and 7",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };

        for (int day = 0; day < weekdays.length; day++) {
            test.arrayVersionTest(day, weekdays[day], "array version");
            test.initializedArrayVersionTest(day, weekdays[day], "initialized array version");
            test.ifVersionTest(day, weekdays[day], "if version");
            test.ifVersionSingleExitPointTest(day, weekdays[day], "if version with single exit point");
            test.switchCaseVersionTest(day, weekdays[day], "switch case version");
            test.switchCaseEnhancedLambdaTest(day, weekdays[day], "enhanced switch case version (lambdas)");
        }

    }


    void arrayVersionTest(int dayNumber, String dayName, String scenario) {
        printTestResult(dayName.equals(new DayOfTheWeekDetectorArrayVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void initializedArrayVersionTest(int dayNumber, String dayName, String scenario) {
        printTestResult(dayName.equals(new DayOfTheWeekDetectorInitializedArrayVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void ifVersionTest(int dayNumber, String dayName, String scenario) {
        printTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void ifVersionSingleExitPointTest(int dayNumber, String dayName, String scenario) {
        printTestResult(dayName.equals(new DayOfTheWeekDetectorIfVersionSingleExitPoint().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void switchCaseVersionTest(int dayNumber, String dayName, String scenario) {
        printTestResult(dayName.equals(new DayOfTheWeekDetectorSwitchCaseVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

    void switchCaseEnhancedLambdaTest(int dayNumber, String dayName, String scenario) {
        printTestResult(dayName.equals(new DayOfTheWeekDetectorSwitchEnhancedLambdaVersion().detectDayName(dayNumber)), dayName + " test with " + scenario);
    }

}
