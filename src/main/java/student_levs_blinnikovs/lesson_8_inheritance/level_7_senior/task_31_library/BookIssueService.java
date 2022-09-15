package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.Date;

class BookIssueService {

    PenaltyService penaltyService;
    BookReservationDetail bookReservationDetail;
    BookIssueDetail bookIssueDetail;

    public BookReservationDetail getReservationDetail(Book book) {
        return bookReservationDetail; // I'm not sure what it does, honestly I've just copied it - need to check in the viedeo
    }
    public void updateReservationDetail(BookReservationDetail bookReservationDetail) {
        bookReservationDetail.setReservationStatus(ReservationStatus.SUCCESS_RESERVATION); // todo if logic if not reserved... and not taken
    }
    public BookReservationDetail reserveBook(Book book, SystemUser user) { // why it's even expected to return BookReservationDetail..?
        if (book.getBookStatus().equals(BookStatus.AVAILABLE)) {
            book.setBookStatus(BookStatus.RESERVED);
            bookReservationDetail.setReservationStatus(ReservationStatus.SUCCESS_RESERVATION);
        } else if (book.getBookStatus().equals(BookStatus.TAKEN)) {
            System.out.println("Can't reserve book because it's already taken."); // todo remove println
        }
        return bookReservationDetail;
    }
    public BookIssueDetail issueBook(Book book, SystemUser user) {
        if (book.getBookStatus().equals(BookStatus.AVAILABLE)) {
            book.setBookStatus(BookStatus.TAKEN);
        } else if (book.getBookStatus().equals(BookStatus.TAKEN)) {
            System.out.println("Can't issue book because it's already taken.");
        } // todo if is reserved by NOT user trying to reserve.. need BookIssueDetail enhancements.
        return bookIssueDetail;
    }
//    public BookIssueDetail renewBook(Book book, SystemUser user) {
////        bookIssueDetail.setDueDate(dueDateIncrease);
//    }
    public void returnBook(Book book, SystemUser user) {
        if (book.getBookStatus().equals(BookStatus.TAKEN)) {
            book.setBookStatus(BookStatus.AVAILABLE);
        } else System.out.println("Book is not taken");
    }

}
