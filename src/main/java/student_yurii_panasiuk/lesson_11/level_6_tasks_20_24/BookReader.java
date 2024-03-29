package student_yurii_panasiuk.lesson_11.level_6_tasks_20_24;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface BookReader {

    boolean bookAdd(Book newBook, BookList library);
    boolean bookDel(Book newBook, BookList library);
    void libraryToConsole (BookList library);
    BookList findBooksRead(BookList library);
    BookList findBooksUnread(BookList library);
    void libraryToConsoleSimple(BookList library);
    BookList findBooksByAutor (String author, BookList library);
    BookList findBooksByAutorPartially(String author, BookList library);
    BookList findBooksByTitle (String title, BookList library);
    BookList findBooksByTitlePartially(String title, BookList library);
    boolean librariesEquals(BookList o, BookList b);
    Book getBook (int id, BookList library);
    boolean setReadStatus(int id, BookList library);
    boolean setUnreadStatus(int id, BookList library);
}
