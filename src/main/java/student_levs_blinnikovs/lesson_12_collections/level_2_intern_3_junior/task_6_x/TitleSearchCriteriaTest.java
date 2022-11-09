package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_junior.task_6_x;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class TitleSearchCriteriaTest {
    public static void main(String[] args) {
        TitleSearchCriteriaTest test = new TitleSearchCriteriaTest();
        test.shouldMatchTitles();
        test.shouldNotMatchDifferentCriteriaTitle();
        test.shouldNotMatchNullCriteriaTitle();
        test.shouldNotMatchNullBookTitle();
        test.shouldNotMatchBothNullTitle();
    }

    void shouldMatchTitles() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        Book book = new Book("1984", "George Orwell");
        printTestResult(titleSearchCriteria.match(book), "Title matches");
    }

    void shouldNotMatchDifferentCriteriaTitle() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("1983");
        Book book = new Book("1984", "George Orwell");
        printTestResult(!titleSearchCriteria.match(book), "Different criteria title doesn't match with real book title");
    }

    void shouldNotMatchNullCriteriaTitle() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria(null);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!titleSearchCriteria.match(book), "null criteria title doesn't match with real book title");
    }

    void shouldNotMatchNullBookTitle() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        Book book = new Book(null, "George Orwell");
        printTestResult(!titleSearchCriteria.match(book), "null book title doesn't match with real criteria title");
    }

    void shouldNotMatchBothNullTitle() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria(null);
        Book book = new Book(null, "George Orwell");
        printTestResult(!titleSearchCriteria.match(book), "null book title doesn't match with null criteria title");
    }

    // maybe add empty string tests, should not equal empty string.. similar as null check (if empty string then false...)

}
