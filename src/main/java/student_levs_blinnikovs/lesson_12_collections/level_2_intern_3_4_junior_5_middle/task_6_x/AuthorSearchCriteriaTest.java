package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class AuthorSearchCriteriaTest {
    public static void main(String[] args) {
        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.shouldMatchAuthors();
        test.shouldNotMatchDifferentCriteriaAuthor();
        test.shouldNotMatchNullCriteriaAuthor();
        test.shouldNotMatchNullBookAuthor();
        test.shouldNotMatchBothNullAuthors();
    }

    void shouldMatchAuthors() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        Book book = new Book("1984", "George Orwell");
        printTestResult(authorSearchCriteria.match(book), "Author matches");
    }

    void shouldNotMatchDifferentCriteriaAuthor() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Clooney");
        Book book = new Book("1984", "George Orwell");
        printTestResult(!authorSearchCriteria.match(book), "Different criteria author doesn't match with real book author");
    }

    void shouldNotMatchNullCriteriaAuthor() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(null);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!authorSearchCriteria.match(book), "null criteria author doesn't match with real book author");
    }

    void shouldNotMatchNullBookAuthor() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        Book book = new Book("1984", null);
        printTestResult(!authorSearchCriteria.match(book), "null book author doesn't match with real criteria author");
    }

    void shouldNotMatchBothNullAuthors() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(null);
        Book book = new Book("1984", null);
        printTestResult(!authorSearchCriteria.match(book), "null book author doesn't match with null criteria author");
    }

    // maybe add empty string tests, should not equal empty string.. similar as null check (if empty string then false...)

}
