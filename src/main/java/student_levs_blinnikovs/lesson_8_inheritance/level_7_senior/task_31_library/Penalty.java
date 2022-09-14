package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class Penalty {

    private int penaltyAmount;
    private String penaltyReason;
    private User forUser;
    private Book forBook;

    Penalty(int penaltyAmount, User forUser, Book forBook) {
        this.penaltyAmount = penaltyAmount;
        this.penaltyReason = "For overdue book";
        this.forUser = forUser;
        this.forBook = forBook;
    }

    void assign() {

    }

}
