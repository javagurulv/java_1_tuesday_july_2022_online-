package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class ContainsBookTest {
    public static void main(String[] args) {
        ContainsBookTest test = new ContainsBookTest();
        test.shouldFindContainingBook();
    }

    void shouldFindContainingBook() {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Normal People", "Sally Rooney");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Life After Life", "Kate Atkinson");

        BookDatabaseImpl db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);

        boolean expectedContains = true;
        boolean reallyContains = db.contains(book3);

        printTestResult(expectedContains == reallyContains, "Contains book");
    }

}
