package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

public class YearOfIssueSearchCriteriaTest extends TestCase {
    Book book = new Book("Pushkin", "Skazki");
    Book book1 = new Book("Gogol", "Revizor");

    YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1988");

    public void testMatch() {
        book.setYearOfIssue("1988");
        assertEquals(true,yearOfIssueSearchCriteria.match(book));
        assertEquals(false, yearOfIssueSearchCriteria.match(book1));

    }
}