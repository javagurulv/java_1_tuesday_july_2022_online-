package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

public class AuthorSearchCriteriaTest extends TestCase {
    Book book = new Book("Pushkin", "Skazki");
    Book book1 = new Book("Gogol", "Revizor");
    AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Pushkin");

    public void testMatch() {
        assertEquals(false, authorSearchCriteria.match(book1) );
        assertEquals(true,authorSearchCriteria.match(book));

    }
}