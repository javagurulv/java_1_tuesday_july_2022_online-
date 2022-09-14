package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

abstract class LibraryService {

    abstract void takeBook(Book book);

    abstract void returnBook(Book book);

    abstract void findBook(Book book);

    abstract void reserveBook(Book book);

    abstract void notifyUserAboutReturnTerm(User user, Book book);

    abstract void notifyUserAboutReturnTerm(User[] users); //...

    abstract void assignPenalty(User user, Book book);

    void addNewBook(Book book, BookDatabase bookDatabase) {

    }

}
