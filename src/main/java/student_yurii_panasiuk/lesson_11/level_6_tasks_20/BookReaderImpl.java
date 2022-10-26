package student_yurii_panasiuk.lesson_11.level_6_tasks_20;

class
BookReaderImpl implements BookReader {

    @Override
    /*
    у каждой книги генерируется ID при добавлении.
    Для того чтобы отметить прочитанную книгу нужно ввести ID.
    ID можно узнать после вывода всех книг методом libraryToConsole.
     */
    public boolean setReadStatus(int id, BookList library){
        for (int i = 0; i < library.librarySize(); i ++ ) {
            if (library.books.get(i).getId() == id) {
                library.getBookByID(id).setReadStatus();
                return true;
            }
        }
        return false;
    }
    @Override
     public boolean bookAdd (Book newBook, BookList library) {
        int sizeBeforeAddition = library.librarySize();
        library.addBook(newBook);
        return library.librarySize() != sizeBeforeAddition;
      }

    @Override
    public Book getBook(int id, BookList library ) {
       return library.getBookByID(id);
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

    @Override
    public BookList findBooksByAutorPartially(String author, BookList library){
        return library.searchByAutrorPartially(author);
    }
    @Override
    public BookList findBooksByTitle (String title, BookList library){
        return library.searchByTitle(title);
    }
    @Override
    public BookList findBooksByTitlePartially(String title, BookList library){
        return library.searchByTitlePartially(title);
    }

    @Override
    public boolean librariesEquals (BookList o, BookList b) {
        if (b == o) return true;
        if (o == null || b == null || b.getClass() != o.getClass() || b.librarySize() != o.librarySize()) return false;
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < o.librarySize(); i ++ ) {
            counter1++;
            for (int j = 0; j < o.librarySize(); j ++ ) {
                if (b.extractBook(j).equals(o.extractBook(i))) {
                    counter2++;
                }
            }
        }
        return counter1 == counter2;
    }
}
