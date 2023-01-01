package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

public  class TitleSearchCriteriaTest extends TestCase {
    Book book = new Book("Pushkin", "Skazki");
    Book book1 = new Book("Gogol", "Revizor");
    TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Skazki");

    public void testMatch() {
        assertEquals(false,titleSearchCriteria.match(book1));
        assertEquals(true, titleSearchCriteria.match(book));

    }
}