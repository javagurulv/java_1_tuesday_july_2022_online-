package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

public class BookDatabaseImplTest extends TestCase {

    public void testDelete() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Pushkin","Onegin"));
        bookDatabase.save(new Book("Pushkin","Skazki"));
        assertEquals(bookDatabase.delete(3L),false);
        assertEquals(bookDatabase.delete(2L), true);
    }
}