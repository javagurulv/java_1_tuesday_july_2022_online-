package student_eduard_minajev.lesson_6_arrays_while_loop.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        int dayOfTheWeek = dayOfTheWeekDetector.getDayNumberFromUser();
        dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeek);
        System.out.println(dayOfTheWeek);




        switch (dayOfTheWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not correct day number");
        }
    }
}


