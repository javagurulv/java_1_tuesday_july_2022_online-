package student_levs_blinnikovs.lesson_12_collections.level_2_intern.task_6_x;

import java.util.List;
import java.util.Optional;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

}
