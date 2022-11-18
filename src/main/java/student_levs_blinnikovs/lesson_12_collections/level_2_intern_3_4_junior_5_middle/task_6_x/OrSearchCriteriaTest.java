package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class OrSearchCriteriaTest {
    public static void main(String[] args) {
        OrSearchCriteriaTest test = new OrSearchCriteriaTest();
        test.shouldMatchBothMatchingOrCriteria();
        test.shouldMatchRightMatchingOrCriteria();
        test.shouldMatchLeftMatchingOrCriteria();
        test.shouldNotMatchDifferentBothOrCriteria();
        test.shouldMatchPartiallyNullBookWithRealOrCriteria();
        test.shouldNotMatchNullBookWithRealOrCriteria();
        test.shouldNotMatchBothNullOrCriteriaWithRealBook();
        test.shouldNotMatchAllNull();
    }

    void shouldMatchBothMatchingOrCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(orSearchCriteria.match(book), "Both matching OR criteria");
    }

    void shouldMatchRightMatchingOrCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Clooney");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(orSearchCriteria.match(book), "Right matching OR criteria");
    }

    void shouldMatchLeftMatchingOrCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1983");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(orSearchCriteria.match(book), "Left matching OR criteria");
    }

    void shouldNotMatchDifferentBothOrCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Clooney");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1983");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!orSearchCriteria.match(book), "Shouldn't match with both criteria different from the book");
    }

    void shouldMatchPartiallyNullBookWithRealOrCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("1984", null);
        printTestResult(orSearchCriteria.match(book), "Both real criteria should match partially null book");
    }

    void shouldNotMatchNullBookWithRealOrCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book(null, null);
        printTestResult(!orSearchCriteria.match(book), "Both real criteria shouldn't match null book");
    }

    void shouldNotMatchBothNullOrCriteriaWithRealBook() {
        SearchCriteria orSearchCriteria = new OrSearchCriteria(null, null);
        Book book = new Book("1984", "George Orwell");
        printTestResult(!orSearchCriteria.match(book), "Both criteria as null shouldn't match real book");
    }

    void shouldNotMatchAllNull() {
        SearchCriteria orSearchCriteria = new OrSearchCriteria(null, null);
        Book book = new Book(null, null);
        printTestResult(!orSearchCriteria.match(book), "Shouldn't match all null");
    }

}
