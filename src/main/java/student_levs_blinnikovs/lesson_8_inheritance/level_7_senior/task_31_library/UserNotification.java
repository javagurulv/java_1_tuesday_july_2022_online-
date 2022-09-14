package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class UserNotification {

    private String userNotification;
    private User forUser;
    private Book forBook;

    UserNotification(String userNotification, User forUser, Book forBook) {
        this.userNotification = userNotification;
        this.forUser = forUser;
        this.forBook = forBook;
    }

}
