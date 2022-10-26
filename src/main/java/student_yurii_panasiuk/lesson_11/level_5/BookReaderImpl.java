package student_yurii_panasiuk.lesson_11.level_5;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {
    @Override
    public boolean bookAdd (Book newBook, BookList library) {
        int sizeBeforeAddition = library.librarySize();
        library.addBook(newBook);
        return library.librarySize() != sizeBeforeAddition;
      }

     @Override
     public boolean bookDel (Book newBook, BookList library) {
         int sizeBeforeAddition = library.librarySize();
         library.delBook(newBook);
         return library.librarySize() != sizeBeforeAddition;
     }

     @Override
     public void libraryToConsole(BookList library){
         library.printBooks();
     }

     @Override
     public BookList findBooksByAutor(String author, BookList library){

        return library.searchByAutror(author);
     }
}
