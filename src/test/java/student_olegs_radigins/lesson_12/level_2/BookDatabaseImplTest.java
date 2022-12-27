package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

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
}