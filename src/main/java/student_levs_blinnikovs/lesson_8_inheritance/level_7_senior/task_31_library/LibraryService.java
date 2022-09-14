package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

abstract class LibraryService {

    void takeBook(Book book, User user) {
        // todo check if not reserved by other
        // todo check if reserved by user
        // todo check if not taken
        book.setTakenBy(user);
    }

    void returnBook(Book book) {
        // todo check if taken
        book.setTakenBy(null);         // maybe with 'Library type user..?'
    }

    abstract void findBook(Book book);

    void reserveBook(Book book, User user) {
        // todo check if not reserved
        // todo check if not taken
        book.setReservedBy(user);
    }

    void unReserveBook(Book book) {
        // todo check if not taken
        book.setReservedBy(null);
    }

    abstract void notifyUserAboutReturnTerm(User user, Book book);

    abstract void notifyUserAboutReturnTerm(User[] users); //...

    abstract void assignPenalty(User user, Book book);

    void addNewBook(Book book, BookDatabase bookDatabase) {

    }

}
