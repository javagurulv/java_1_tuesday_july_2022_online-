package student_yurii_panasiuk.lesson_12.level_2_3_4;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    public Long save(Book book);
    public boolean delete(Long bookId);
    public boolean delete(Book book);
    public Optional<Book> findById(Long bookId);
    public List<Book> findByAuthor(String author);
    public List<Book> findByTitle(String title);
    public int countAllBooks();
    public void deleteByAuthor(String author);
    public void deleteByTitle(String title);
    public List<Book> find(SearchCriteria searchCriteria);
    public Set<String> findUniqueAuthors();
    public Set<String> findUniqueTitles();
    public Set<Book> findUniqueBooks();

}