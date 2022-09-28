package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class DayOfTheWeekDetectorTestWithTypePassed {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTestWithTypePassed test = new DayOfTheWeekDetectorTestWithTypePassed();

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

        // each new ... () can be passed to the for loop as well
        DayOfTheWeekDetector arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetector initializedArrayVersion = new DayOfTheWeekDetectorInitializedArrayVersion();
        DayOfTheWeekDetector ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector ifVersionSingleExitPoint = new DayOfTheWeekDetectorIfVersionSingleExitPoint();
        DayOfTheWeekDetector switchCaseVersion = new DayOfTheWeekDetectorSwitchCaseVersion();
        DayOfTheWeekDetector switchEnhancedLambdaVersion = new DayOfTheWeekDetectorSwitchEnhancedLambdaVersion();


        for (int day = 0; day < weekdays.length; day++) {
            test.hybridVersionTest(day, weekdays[day], arrayVersion);
            test.hybridVersionTest(day, weekdays[day], initializedArrayVersion);
            test.hybridVersionTest(day, weekdays[day], ifVersion);
            test.hybridVersionTest(day, weekdays[day], ifVersionSingleExitPoint);
            test.hybridVersionTest(day, weekdays[day], switchCaseVersion);
            test.hybridVersionTest(day, weekdays[day], switchEnhancedLambdaVersion);
        }
    }

    void hybridVersionTest(int dayNumber, String dayName, DayOfTheWeekDetector detector) {
        printTestResult(dayName.equals(detector.detectDayName(dayNumber)),
                "Is \"" + dayNumber + "\" really \"" + dayName + "\" test with " + detector.getClass().getSimpleName());
    }
}
