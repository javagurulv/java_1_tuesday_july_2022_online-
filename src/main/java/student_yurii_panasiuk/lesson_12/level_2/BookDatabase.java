package student_yurii_panasiuk.lesson_12.level_2;

import java.util.Optional;

public interface BookDatabase {



    public Long save(Book book);
    public boolean delete(Long bookId);
    public boolean delete(Book book);
    public Optional<Book> findById(Long bookId); //

}
