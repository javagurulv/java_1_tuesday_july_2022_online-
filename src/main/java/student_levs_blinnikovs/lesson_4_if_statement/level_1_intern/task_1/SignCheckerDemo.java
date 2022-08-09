package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SignCheckerDemo {
    public static void main(String[] args) {

        SignChecker pos = new SignChecker(1);
        pos.printPosOrNeg();

        SignChecker zero = new SignChecker(0);
        zero.printPosOrNeg();

        SignChecker neg = new SignChecker(-1);
        neg.printPosOrNeg();

    }
}
