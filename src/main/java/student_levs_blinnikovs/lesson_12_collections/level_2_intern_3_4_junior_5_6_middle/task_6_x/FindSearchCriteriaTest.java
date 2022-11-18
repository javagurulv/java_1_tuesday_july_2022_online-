package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x;

import java.util.List;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FindSearchCriteriaTest {
    public static void main(String[] args) {
        FindSearchCriteriaTest test = new FindSearchCriteriaTest();
        test.shouldFindBooks();
        test.shouldNotFindBooks();

    }

    void shouldFindBooks() {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Normal People", "Sally Rooney");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Life After Life", "Kate Atkinson");

        BookDatabaseImpl db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);

        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Life After Life");
        List<Book> expectedSearchResult = List.of(book3, book4);
        List<Book> realSearchResult = db.find(titleSearchCriteria);

        printTestResult(expectedSearchResult.equals(realSearchResult), "Title criteria returns books");
    }

    void shouldNotFindBooks() {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Normal People", "Sally Rooney");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Life After Life", "Kate Atkinson");

        BookDatabaseImpl db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);

        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Fairytale");
        List<Book> expectedSearchResult = List.of();
        List<Book> realSearchResult = db.find(titleSearchCriteria);

        printTestResult(expectedSearchResult.equals(realSearchResult), "Title doesn't match and doesn't return any book");
    }

}
