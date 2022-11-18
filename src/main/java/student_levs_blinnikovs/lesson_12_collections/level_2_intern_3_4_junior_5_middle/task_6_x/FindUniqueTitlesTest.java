package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import java.util.Set;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class FindUniqueTitlesTest {
    public static void main(String[] args) {
        FindUniqueTitlesTest test = new FindUniqueTitlesTest();
        test.shouldFindUniqueTitles();
    }

    void shouldFindUniqueTitles() {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Normal People", "Sally Rooney");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Life After Life", "Kate Atkinson");

        BookDatabaseImpl db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);

        Set<String> expectedSearchResult = Set.of("1984", "Normal People", "Life After Life");
        Set<String> realSearchResult = db.findUniqueTitles();

        printTestResult(expectedSearchResult.equals(realSearchResult), "Returns unique titles");
    }

}
