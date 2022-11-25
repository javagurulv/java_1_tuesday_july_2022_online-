package student_yurii_panasiuk.lesson_12.level_2;

import junit.framework.TestCase;

public class BookDatabaseImplTest extends TestCase {

    BookDatabaseImpl bookDatabaseImplTest = new BookDatabaseImpl();
    Book book1 = new Book("Tolkien", "The Fellowship of the Ring");
    Book book2 = new Book("Tolkien", "The Two Towers");
    Book book3 = new Book("Tolkien", "The Return of the King");


    public void testSave() {
        assertTrue(bookDatabaseImplTest.save(book1) == 1L);
        assertTrue(bookDatabaseImplTest.save(book2) == 2L);
        assertTrue(bookDatabaseImplTest.save(book3) == 3L);
    }

    public void testDelete() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        assertTrue(bookDatabaseImplTest.delete(1L));
        assertTrue(bookDatabaseImplTest.delete(2L));
        assertFalse(bookDatabaseImplTest.delete(3L));
        }

}