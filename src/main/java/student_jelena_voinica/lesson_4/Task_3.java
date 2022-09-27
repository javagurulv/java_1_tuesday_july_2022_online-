package student_jelena_voinica.lesson_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Input number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case(1):System.out.println("Monday");break;
            case(2):System.out.println("Tuesday");break;
            case(3):System.out.println("Wednesday");break;
            case(4):System.out.println("Thursday");break;
            case(5):System.out.println("Friday");break;
            case(6):System.out.println("Saturday");break;
            case(7):System.out.println("Sunday");break;

        }

    }
}