package student_olegs_radigins.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {
    List<Book> books = new ArrayList<>();
    Long bookNewId = 0L;

    @Override
    public Long save(Book book) {
        bookNewId++;
        book.setId(bookNewId);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books){
            if (book.getId().equals(bookId)){
                return books.remove(book);
            }
        }
        return false;

}


}
