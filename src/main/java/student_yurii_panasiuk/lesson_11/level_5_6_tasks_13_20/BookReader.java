package student_yurii_panasiuk.lesson_11.level_5_6_tasks_13_20;

public interface BookReader {

    boolean bookAdd(Book newBook, BookList library);

    boolean bookDel(Book newBook, BookList library);
    void libraryToConsole (BookList library);

    BookList findBooksByAutor (String author, BookList library);

    BookList findBooksByAutorPartially(String author, BookList library);

    BookList findBooksByTitle (String title, BookList library);

    BookList findBooksByTitlePartially(String title, BookList library);

    boolean librariesEquals(BookList o, BookList b);
}
