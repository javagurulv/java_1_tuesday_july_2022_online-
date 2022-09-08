package student_ernest_aleskevics.lesson_4.level_1.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PositiveOrNegative {

    int number;

    PositiveOrNegative(int number){
        this.number = number;
    }

    void printPositiveOrNegative(){
        if (number > 0 ){
            System.out.println("The number " + number + " is positive!");
        } else if (number == 0) {
            System.out.println("The number " + number + " is null");
        } else  {
            System.out.println("The number " + number + " is negative!");
        }


    }
}
