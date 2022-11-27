package student_yurii_panasiuk.lesson_12.level_2_3;

import junit.framework.TestCase;

public class AndSearchCriteriaTest extends TestCase {

    public void testMatch() {

        Book book5 = new Book("Asimov", "Foundation");

        AndSearchCriteria andSearchCriteriaDemo = new AndSearchCriteria(
                book -> {return book.getAuthor().equals(book5.getAuthor());},
                book -> {return book.getTitle().equals(book5.getTitle());}
        );

       assertTrue(andSearchCriteriaDemo.match(book5));
    }
}