package student_levs_blinnikovs.lesson_12_collections.level_2_intern.task_6_x;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    private static Long lastId = 0L;

    @Override
    public Long save(Book book) {
        lastId++;
        book.setId(lastId);
        books.add(book);
        return lastId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return books.remove(book);
            }
        }
        return false;
    }

}
