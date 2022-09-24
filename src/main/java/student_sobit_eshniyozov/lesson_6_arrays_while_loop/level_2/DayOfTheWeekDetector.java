package student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public static int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }
    String findDayOfTheWeek(int dayNumber) {
        String dayOfTheWeek;
        switch (dayNumber) {
            case 1 -> dayOfTheWeek="Monday";
            case 2 -> dayOfTheWeek=("Tuesday");
            case 3 -> dayOfTheWeek=("Wednesday");
            case 4 -> dayOfTheWeek=("Thursday");
            case 5 -> dayOfTheWeek=("Friday");
            case 6 -> dayOfTheWeek=("Saturday");
            case 7 -> dayOfTheWeek=("Sunday");
            default -> dayOfTheWeek=("Not correct day number");
        }
        return dayOfTheWeek;
    }

}