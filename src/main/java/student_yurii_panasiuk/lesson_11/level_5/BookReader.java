package student_yurii_panasiuk.lesson_11.level_5;

import java.util.ArrayList;

public interface BookReader {

  //  Book newBook;

    boolean bookAdd(Book newBook, BookList library);

    boolean bookDel(Book newBook, BookList library);
    void libraryToConsole (BookList library);

    BookList findBooksByAutor (String author, BookList library);

}
