package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

import java.util.List;
import java.util.Optional;

public class BookDatabaseImplTest extends TestCase {
    Book book = new Book("Pushkin", "aaaa");
    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    public void testDelete() {
        bookDatabase.save(new Book("Pushkin","Onegin"));
        bookDatabase.save(new Book("Pushkin","Skazki"));
        assertEquals(false,bookDatabase.delete(3L));
        assertEquals(true,bookDatabase.delete(2L));
    }

    public void testTestDelete() {
        bookDatabase.save(new Book("Pushkin","Onegin"));
        bookDatabase.save(new Book("Pushkin","Skazki"));
        assertEquals( false,bookDatabase.delete(book));
        bookDatabase.save(book);
        assertEquals(true,bookDatabase.delete(book));
    }

    public void testFindById() {
        bookDatabase.save(new Book("Pushkin","Onegin"));
        bookDatabase.save(new Book("Pushkin","Skazki"));
        assertEquals(Optional.empty(),bookDatabase.findById(3L));
        bookDatabase.save(book);
        assertEquals(Optional.of(book),bookDatabase.findById(3L));
    }

    public void testFindByAuthor() {
        assertEquals(List.of(),bookDatabase.findByAuthor("aaa"));
        bookDatabase.save(book);
        assertEquals(List.of(book),bookDatabase.findByAuthor("Pushkin"));
    }

    public void testFindByTitle() {
        assertEquals(List.of(),bookDatabase.findByTitle("bbb"));
        bookDatabase.save(book);
        assertEquals(List.of(book),bookDatabase.findByTitle("aaaa"));
    }

    public void testCountAllBooks() {
        assertEquals(0,bookDatabase.countAllBooks());
        bookDatabase.save(book);
        assertEquals(1,bookDatabase.countAllBooks());
    }

    public void testDeleteByAuthor() {
        bookDatabase.save(new Book("Pushkin","Onegin"));
        bookDatabase.save(new Book("Pushkin","Skazki"));
        bookDatabase.deleteByAuthor("Pushkin");
        assertEquals(List.of(),bookDatabase.findByAuthor("Pushkin"));
    }

    public void testDeleteByTitle() {
        bookDatabase.save(new Book("Pushkin","Onegin"));
        bookDatabase.save(new Book("Pushkin","Skazki"));
        bookDatabase.deleteByTitle("Skazki");
        assertNotSame(List.of(),bookDatabase.findByTitle("Skazki"));
    }

    public void testFind() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Pushkin");
        SearchCriteria searchCriteria1 = new TitleSearchCriteria("Skazki");
        assertEquals(true,searchCriteria.match(book));
        assertEquals(false, searchCriteria1.match(book));
    }
}