package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x;

import java.util.Set;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FindUniqueBooksTest {
    public static void main(String[] args) {
        FindUniqueBooksTest test = new FindUniqueBooksTest();
        test.shouldFindUniqueBooks();
    }

    void shouldFindUniqueBooks() {
        Book book1 = new Book("1984", "George Orwell");
        Book book1a = new Book("1984", "George Orwell");
        Book book2 = new Book("Normal People", "Sally Rooney");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book3a = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Life After Life", "Kate Atkinson");

        BookDatabaseImpl db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);

        Set<Book> expectedSearchResult = Set.of(book1, book2, book3, book4);
        Set<Book> realSearchResult = db.findUniqueBooks();

        printTestResult(expectedSearchResult.equals(realSearchResult), "Returns unique books");
    }

}
