package student_olegs_radigins.lesson_4.level_1.task_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "А при чём тут dayOfTheWeek?")
class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int dayOfTheWeek = scanner.nextInt();
        if(dayOfTheWeek%2 == 0){
            System.out.println("You entered an even number.");
        }else {
            System.out.println("You enteres an odd number.");
        }
    }
}
