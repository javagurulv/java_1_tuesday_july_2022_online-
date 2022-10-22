package student_levs_blinnikovs.lesson_12_collections.level_1_intern.task_6;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    private static Long lastId = 0L;

    @Override
    public Long save(Book book) {
        lastId++;
        book.setId(lastId);
        return lastId;
    }
}
