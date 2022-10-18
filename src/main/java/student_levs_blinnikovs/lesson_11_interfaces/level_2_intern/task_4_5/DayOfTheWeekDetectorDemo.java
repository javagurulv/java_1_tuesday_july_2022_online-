package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        System.out.println("Enter day of the week: ");
        Scanner userInput = new Scanner(System.in);
        int day = userInput.nextInt();
        String dayName = this.dayOfTheWeekDetector.detectDayName(day);
        System.out.println(day + " is " + dayName + ". ");
    }

    public static void main(String[] args) {

        System.out.println("Array version demo: ");
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo arrayVersionDemo = new DayOfTheWeekDetectorDemo(arrayVersion);
        arrayVersionDemo.run();

        System.out.println("Initialized array version demo: ");
        DayOfTheWeekDetectorArrayVersion initializedArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo initializedArrayVersionDemo = new DayOfTheWeekDetectorDemo(initializedArrayVersion);
        initializedArrayVersionDemo.run();

        System.out.println("If version demo: ");
        DayOfTheWeekDetectorArrayVersion ifVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo ifVersionDemo = new DayOfTheWeekDetectorDemo(ifVersion);
        ifVersionDemo.run();

        System.out.println("If version single exit point demo: ");
        DayOfTheWeekDetectorArrayVersion ifVersionSingleExitPoint = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo ifVersionSingleExitPointDemo = new DayOfTheWeekDetectorDemo(ifVersionSingleExitPoint);
        ifVersionSingleExitPointDemo.run();

        System.out.println("Switch case version demo: ");
        DayOfTheWeekDetectorArrayVersion switchCaseVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo switchCaseVersionDemo = new DayOfTheWeekDetectorDemo(switchCaseVersion);
        switchCaseVersionDemo.run();

        System.out.println("Switch case version single exit point demo: ");
        DayOfTheWeekDetectorArrayVersion switchCaseVersionSingleExitPoint = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo switchCaseVersionSingleExitPointDemo = new DayOfTheWeekDetectorDemo(switchCaseVersionSingleExitPoint);
        switchCaseVersionSingleExitPointDemo.run();

        System.out.println("Switch case enhanced (with lambdas) demo: ");
        DayOfTheWeekDetectorArrayVersion switchCaseEnhancedVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo switchCaseEnhancedVersionDemo = new DayOfTheWeekDetectorDemo(switchCaseEnhancedVersion);
        switchCaseEnhancedVersionDemo.run();

    }
}
