package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

public class AndSearchCriteriaTest extends TestCase {
    Book book = new Book("Pushkin", "Skazki");
    Book book1 = new Book("Gogol", "Revizor");
    AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Pushkin");
    TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Skazki");
    AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria,titleSearchCriteria);

    public void testMatch() {
        assertEquals(true,andSearchCriteria.match(book));
        assertEquals(false,andSearchCriteria.match(book1));
    }
}