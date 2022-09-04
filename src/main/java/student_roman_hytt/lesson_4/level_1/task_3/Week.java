package student_roman_hytt.lesson_4.level_1.task_3;

import java.util.Scanner;

public class Week {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your number");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
            System.out.println("Wednesday");break;
            case 4:
            System.out.println("Thursday");break;
            case 5:
             System.out.println("Friday");break;
            case 6:
             System.out.println("Saturday");break;
            case 7:
            System.out.println("Sunday");break;
            default: System.out.println("Something is wrong");
        }
    }
}