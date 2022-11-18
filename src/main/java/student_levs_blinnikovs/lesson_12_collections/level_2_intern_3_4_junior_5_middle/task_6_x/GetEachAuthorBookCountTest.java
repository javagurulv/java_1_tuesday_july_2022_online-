package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import java.util.Map;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class GetEachAuthorBookCountTest {

    public static void main(String[] args) {
        GetEachAuthorBookCountTest test = new GetEachAuthorBookCountTest();
        test.shouldCreateEachAuthorBookCountMap();
    }

    void shouldCreateEachAuthorBookCountMap() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Normal People", "Sally Rooney");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Financier", "Theodore Dreiser");
        Book book4 = new Book("Life After Life", "Jill McCorkle");
        Book book5 = new Book("Life After Life", "Kate Atkinson");
        Book book6 = new Book("Animal Farm", "George Orwell");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);
        db.save(book6);

        Map<String, Integer> expectedMap = Map.of(
                "Kate Atkinson", 1,
                "Theodore Dreiser", 1,
                "Sally Rooney", 1,
                "George Orwell", 2,
                "Jill McCorkle", 1);

        Map<String, Integer> realMap = db.getEachAuthorBookCount();

        printTestResult(expectedMap.equals(realMap), "Should create each author book count map");
    }

}
