package student_yurii_panasiuk.lesson_12.level_2;

public interface BookDatabase {



    public Long save(Book book);
    public boolean delete(Long bookId);
    public boolean delete(Book book);

}
