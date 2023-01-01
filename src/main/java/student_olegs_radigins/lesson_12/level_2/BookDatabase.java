package student_olegs_radigins.lesson_12.level_2;

import java.util.Optional;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
}
