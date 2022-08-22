package student_artjom_vakhromeev.lesson_4.task_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
public class evenOrOddDemo {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int savedInput = sc.nextInt();

        evenOrOdd test = new evenOrOdd(savedInput);
        System.out.println("It's " + test.even() + " that " + savedInput + " is even.");
    }

}
