package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import java.util.List;
import java.util.Map;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class GetAuthorToBooksMapTest {

    public static void main(String[] args) {
        GetAuthorToBooksMapTest test = new GetAuthorToBooksMapTest();
        test.shouldCreateAuthorToBooksMap();
    }

    void shouldCreateAuthorToBooksMap() {
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

        Map<String, List<Book>> expectedMap = Map.of(
                "Kate Atkinson", List.of(book5),
                "Theodore Dreiser", List.of(book3),
                "Sally Rooney", List.of(book1),
                "George Orwell", List.of(book2, book6),
                "Jill McCorkle", List.of(book4));

        Map<String, List<Book>> realMap = db.getAuthorToBooksMap();

        printTestResult(expectedMap.equals(realMap), "Should create author to books map.");
    }

}
