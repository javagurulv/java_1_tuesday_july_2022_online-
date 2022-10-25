package student_yurii_panasiuk.lesson_11.level_5;

 class BookReaderImpl implements BookReader {
    @Override
    public boolean bookAdd(Book newBook, BookList library) {
        int sizeBeforeAddition = library.librarySize();
        library.setBook(newBook);
        return library.librarySize() != sizeBeforeAddition;
      }
}
