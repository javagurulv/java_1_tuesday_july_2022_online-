package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class Librarian {

    Search searchObj;
    BookIssueService issueService;
    BookDatabase bookDatabase;

    public void addBook(Book book) {
        bookDatabase.addBook(book);
    }
    // deleteBook... Could be done as BookItem extends Book, book remains as just title, and them BookItems as physical books... fields id/barcode etc.

    public void deleteBook(Book book) {
        //
    }

    // edit book item.. args bookItem

}
