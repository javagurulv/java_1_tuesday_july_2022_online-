package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class AndSearchCriteriaTest {
    public static void main(String[] args) {
        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.shouldMatchCriteria();
        test.shouldNotMatchDifferentRightAndCriteria();
        test.shouldNotMatchDifferentLeftAndCriteria();
        test.shouldNotMatchDifferentBothAndCriteria();
        test.shouldNotMatchPartiallyNullBookWithRealAndCriteria();
        test.shouldNotMatchNullBookWithRealAndCriteria();
        test.shouldNotMatchRightNullAndCriteriaWithRealBook();
        test.shouldNotMatchLeftNullAndCriteriaWithRealBook();
        test.shouldNotMatchBothNullAndCriteriaWithRealBook();
        test.shouldNotMatchAllNull();
    }

    void shouldMatchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(andSearchCriteria.match(book), "Both criteria matches");
    }

    void shouldNotMatchDifferentRightAndCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1983");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!andSearchCriteria.match(book), "Shouldn't match with right criteria different from the book");
    }

    void shouldNotMatchDifferentLeftAndCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Clooney");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!andSearchCriteria.match(book), "Shouldn't match with left criteria different from the book");
    }

    void shouldNotMatchDifferentBothAndCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Clooney");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1983");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!andSearchCriteria.match(book), "Shouldn't match with both criteria different from the book");
    }

    void shouldNotMatchPartiallyNullBookWithRealAndCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", null);
        printTestResult(!andSearchCriteria.match(book), "Both real criteria shouldn't match partially null book");
    }

    void shouldNotMatchNullBookWithRealAndCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book(null, null);
        printTestResult(!andSearchCriteria.match(book), "Both real criteria shouldn't match null book");
    }

    void shouldNotMatchRightNullAndCriteriaWithRealBook() {
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(null, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!andSearchCriteria.match(book), "Shouldn't match with right criteria being null");
    }

    void shouldNotMatchLeftNullAndCriteriaWithRealBook() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, null);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!andSearchCriteria.match(book), "Shouldn't match with left criteria being null");
    }

    void shouldNotMatchBothNullAndCriteriaWithRealBook() {
        SearchCriteria andSearchCriteria = new AndSearchCriteria(null, null);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!andSearchCriteria.match(book), "Both criteria as null shouldn't match real book");
    }

    void shouldNotMatchAllNull() {
        SearchCriteria andSearchCriteria = new AndSearchCriteria(null, null);
        Book book = new Book(null, null);
        printTestResult(!andSearchCriteria.match(book), "Shouldn't match all null");
    }

}
