package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_1;

/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */

class SignChecker {

    int number;

    SignChecker(int number) {
        this.number = number;
    }

    void printPosOrNeg() {
        if (this.number >= 0) { System.out.println("Number " + this.number + " is positive."); }
        else System.out.println("Number " + this.number + " is negative.");
    }

}

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
