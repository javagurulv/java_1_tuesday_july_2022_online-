package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_1;

class SignCheckerDemo {
    public static void main(String[] args) {

        SignChecker pos = new SignChecker(1);
        pos.printPosOrNeg();

        SignChecker nill = new SignChecker(0);
        nill.printPosOrNeg();

        SignChecker neg = new SignChecker(-1);
        neg.printPosOrNeg();

    }
}
