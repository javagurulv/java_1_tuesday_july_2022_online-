package student_olegs_radigins.lesson_4.level_1.task_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7: ");
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default: System.out.println("No such day of the week!");
        }


    }
}
