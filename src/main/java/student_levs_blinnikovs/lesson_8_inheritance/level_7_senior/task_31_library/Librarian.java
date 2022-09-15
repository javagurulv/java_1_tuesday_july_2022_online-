package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

abstract class Librarian {

    Search searchObj;
    BookIssueService issueService;

    public abstract void addBook(Book book);
    // deleteBook.. need item and Book remains as just title. Items as physical books.. args id/barcode etc.
    // edit book item.. args bookItem

}
