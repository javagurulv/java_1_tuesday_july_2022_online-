package student_levs_blinnikovs.lesson_12_collections.level_2_intern.task_6_x;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    private Long lastId = 0L;

    @Override
    public Long save(Book book) {
        lastId++;
        book.setId(lastId);
        books.add(book);
        return book.getId();
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

    @Override
    public boolean delete(Book book) {
        for (Book bookInList : books) {
            if (bookInList.equals(book)) {      // this way doesn't throw NullPointerException
                return books.remove(bookInList);
            }
        }
        return false;
    }

}
