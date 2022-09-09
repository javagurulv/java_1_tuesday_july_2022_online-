package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_2_intern.task_7_11;

import teacher.codereview.CodeReview;

import java.util.Scanner;


class DayOfTheWeekDetectorDemo {

    private static int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int dayNumber = getDayNumberFromUser();
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }

}

