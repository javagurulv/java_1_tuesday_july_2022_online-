package student_olegs_radigins.lesson_11.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }
    void run(){
        System.out.println("Enter number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = scanner.nextInt();
        System.out.println("It is - " + dayOfTheWeekDetector.detectDayName(enteredNumber));
    }

    public static void main(String[] args) {
        System.out.println("Array version-->");
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo arrayVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorArrayVersion);
        arrayVersion.run();

        System.out.println("Switch version-->");
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo switchVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorSwitchVersion);
        switchVersion.run();

        System.out.println("If version-->");
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorIfVersion);
        ifVersion.run();
    }
}