package student_olegs_radigins.lesson_11.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        for (int day = 0; day <= 7; day++) {
            DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
            DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
            DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
            if (dayOfTheWeekDetectorIfVersion.detectDayName(day).equals(dayOfTheWeekDetectorSwitchVersion.detectDayName(day)) &&
                    dayOfTheWeekDetectorSwitchVersion.detectDayName(day).equals(dayOfTheWeekDetectorArrayVersion.detectDayName(day))) {
                System.out.println("Test Ok");
            } else {
                System.out.println("Test Fail");
            }
        }
    }
}
