package student_artjom_vakhromeev.lesson_4.task_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Имя класса с большой буквы!")
public class posOrNeg {
    int userInput ;

    public posOrNeg(int userInput) {
        this.userInput = userInput;
    }
    void printUserNumber(){
        if (this.userInput > 0){
            System.out.println(this.userInput + " is positive !");
        }

        else if (this.userInput == 0){
            System.out.println(this.userInput + " is a zero !");
        }

        else if (this.userInput < 0){
            System.out.println(this.userInput + " is a negative");
        }
    }


    }
