package student_yurii_panasiuk.lesson_7.level_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_7_encapsulation/codereview/CleanCodeWarning_3.txt")
class PowerCalculator {

    double exponentiation(double number, double power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }
    boolean verificationPower(double power) {
        return power % 1 != 0;
    }
    void verificationFailedMessage () {
            System.out.println("power must be an integer greater than 0");
    }
}





