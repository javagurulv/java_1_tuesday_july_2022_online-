package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class MemberNotification {

    private String userNotification;
    private Member forMember;
    private Book forBook;

    MemberNotification(String userNotification, Member forMember, Book forBook) {
        this.userNotification = userNotification;
        this.forMember = forMember;
        this.forBook = forBook;
    }

}
