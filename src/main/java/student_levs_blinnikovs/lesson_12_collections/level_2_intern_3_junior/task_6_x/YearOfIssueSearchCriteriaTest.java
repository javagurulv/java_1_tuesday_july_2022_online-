package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_junior.task_6_x;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class YearOfIssueSearchCriteriaTest {
    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest test = new YearOfIssueSearchCriteriaTest();
        test.shouldMatchYearsOfIssue();
        test.shouldNotMatchDifferentCriteriaYearOfIssue();
        test.shouldNotMatchNullCriteriaYearOfIssue();
        test.shouldNotMatchNullBookYearOfIssue();
        test.shouldNotMatchBothNullYearOfIssue();
        test.shouldNotMatchNullBookYearOfIssueVariationWithObjectWithUninitializedYear();
        test.shouldNotMatchBothNullYearOfIssueVariationWithObjectWithUninitializedYear();
    }

    void shouldMatchYearsOfIssue() {
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1949");
        Book book = new Book("1984", "George Orwell", "1949");
        printTestResult(yearOfIssueSearchCriteria.match(book), "Year of issue matches");
    }

    void shouldNotMatchDifferentCriteriaYearOfIssue() {
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1984");
        Book book = new Book("1984", "George Orwell", "1949");
        printTestResult(!yearOfIssueSearchCriteria.match(book), "Different criteria year of issue doesn't match with real book year of issue");
    }

    void shouldNotMatchNullCriteriaYearOfIssue() {
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(null);
        Book book = new Book("1984", "George Orwell", "1949");
        printTestResult(!yearOfIssueSearchCriteria.match(book), "null criteria year of issue doesn't match with real book year of issue");
    }

    void shouldNotMatchNullBookYearOfIssue() {
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1949");
        Book book = new Book("1984", "George Orwell", null);
        printTestResult(!yearOfIssueSearchCriteria.match(book), "null book year of issue doesn't match with real criteria year of issue");
    }

    void shouldNotMatchNullBookYearOfIssueVariationWithObjectWithUninitializedYear() {
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1949");
        Book book = new Book("1984", "George Orwell");
        printTestResult(!yearOfIssueSearchCriteria.match(book), "null book year of issue doesn't match with real criteria year of issue - variation with object with uninitialized year");
    }

    void shouldNotMatchBothNullYearOfIssue() {
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(null);
        Book book = new Book("1984", "George Orwell", null);
        printTestResult(!yearOfIssueSearchCriteria.match(book), "null book year of issue doesn't match with null criteria year of issue");
    }

    void shouldNotMatchBothNullYearOfIssueVariationWithObjectWithUninitializedYear() {
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(null);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!yearOfIssueSearchCriteria.match(book), "null book year of issue doesn't match with null criteria year of issue - variation with object with uninitialized year");
    }

    // maybe add empty string tests, should not equal empty string.. similar as null check (if empty string then false...)

}
