package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

public class OrSearchCriteriaTest extends TestCase {
    Book book = new Book("Pushkin", "Skazki");
    Book book1 = new Book("Gogol", "Revizor");
    Book book2 = new Book("Gogol","Skazki");
    AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Pushkin");
    TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Skazki");
    OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria,titleSearchCriteria);

    public void testMatch() {
        assertEquals(true,orSearchCriteria.match(book));
        assertEquals(false,orSearchCriteria.match(book1));
        assertEquals(true,orSearchCriteria.match(book2));
    }
}