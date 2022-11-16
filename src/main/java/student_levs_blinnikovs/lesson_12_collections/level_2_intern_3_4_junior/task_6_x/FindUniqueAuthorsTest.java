package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior.task_6_x;

import java.util.List;
import java.util.Set;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FindUniqueAuthorsTest {
    public static void main(String[] args) {
        FindUniqueAuthorsTest test = new FindUniqueAuthorsTest();
        test.shouldFindUniqueAuthors();
    }

    void shouldFindUniqueAuthors() {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Animal Farm", "George Orwell");
        Book book3 = new Book("Life After Life", "Kate Atkinson");

        BookDatabaseImpl db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);

        Set<String> expectedSearchResult = Set.of("George Orwell", "Kate Atkinson");
        Set<String> realSearchResult = db.findUniqueAuthors();

        printTestResult(expectedSearchResult.equals(realSearchResult), "Returns unique authors");
    }

}
