package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

abstract class BookIssueService {

    PenaltyService penaltyService;

    public abstract BookReservationDetail getReservationDetail(Book book);
    public abstract void updateReservationDetail(BookReservationDetail bookReservationDetail);
    public abstract BookReservationDetail reserveBook(Book book, SystemUser user);
    public abstract BookIssueDetail issueBook(Book book, SystemUser user);
    public abstract BookIssueDetail renewBook(Book book, SystemUser user);
    public abstract void returnBook(Book book, SystemUser user);

}
