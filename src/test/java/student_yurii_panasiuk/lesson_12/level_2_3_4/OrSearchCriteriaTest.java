package student_yurii_panasiuk.lesson_12.level_2_3_4;

import junit.framework.TestCase;

public class OrSearchCriteriaTest extends TestCase {

    public void testMatch() {

        Book book1 = new Book("Tolkien", "The Fellowship of the Ring");
        Book book2 = new Book("Tolkien", "The Two Towers");
        Book book4 = new Book("Isaac Asimov", "Foundation");
        Book book5 = new Book("Asimov", "Foundation");

        OrSearchCriteria orSearchCriteriaDemo = new OrSearchCriteria(
                book -> {
                    return book.getAuthor().equals(book4.getAuthor());
                },
                book -> {
                    return book.getTitle().equals(book1.getTitle());
                }
        );
        assertTrue(orSearchCriteriaDemo.match(book4));
        assertTrue(orSearchCriteriaDemo.match(book1));
        assertFalse(orSearchCriteriaDemo.match(book2));
        assertFalse(orSearchCriteriaDemo.match(book5));
    }
}