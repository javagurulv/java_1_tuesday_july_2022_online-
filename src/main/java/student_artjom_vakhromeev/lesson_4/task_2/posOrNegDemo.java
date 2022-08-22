package student_artjom_vakhromeev.lesson_4.task_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Имя класса с большой буквы!")
public class posOrNegDemo {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner userInput = new Scanner(System.in);
        int savedUserInput = userInput.nextInt();

        posOrNeg numberToCheck = new posOrNeg(savedUserInput);
        numberToCheck.printUserNumber();


    }
}
