package student_olegs_radigins.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {
    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        books.add( book);
        book.setId((long) books.size());
        return book.getId();
    }
}
