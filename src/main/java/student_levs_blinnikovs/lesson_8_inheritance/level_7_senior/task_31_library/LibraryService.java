package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

abstract class LibraryService {

    private boolean isTaken(Book book) {
        return book.getBookStatus().equals(BookStatus.TAKEN);
    }

    private boolean isReserved(Book book) {
        return book.getBookStatus().equals(BookStatus.RESERVED);
    }

    void takeBook(Book book) {
        if (!isTaken(book) && !isReserved(book)) {
            book.setBookStatus(BookStatus.TAKEN);
        } else {
            System.out.println("Can't take book which is already taken!");
        }
    }

    void returnBook(Book book) {
        if (isTaken(book)) {
            book.setBookStatus(BookStatus.AVAILABLE);
        } else {
            System.out.println("Can't return not taken book!");
        }
    }

    abstract void findBook(Book book);


    void addNewBook(Book book, BookDatabase bookDatabase) {
        bookDatabase.addBook(book);
    }

}
