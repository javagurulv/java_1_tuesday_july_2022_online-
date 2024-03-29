package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6;

import junit.framework.TestCase;

public class TitleSearchCriteriaTest extends TestCase {

    public void testMatch() {

        BookDatabaseImpl bookDatabaseImplTest = new BookDatabaseImpl();
        Book book1 = new Book("Tolkien", "The Fellowship of the Ring");
        Book book2 = new Book("Tolkien", "The Two Towers");
        Book book3 = new Book("Tolkien", "The Return of the King");
        Book book4 = new Book("Isaac Asimov", "Foundation");
        Book book5 = new Book("Asimov", "Foundation");


        TitleSearchCriteria test1 = new TitleSearchCriteria("Foundation");
        assertTrue(test1.match(book5));
        assertFalse(test1.match(book1));

    }
}