package student_levs_blinnikovs.lesson_12_collections.level_2_intern.task_6_x;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class BookDatabaseTest {

    public static void main(String[] args) {

        BookDatabaseTest test = new BookDatabaseTest();

        test.resultOfFirstSaveShouldReturnOne();
        test.resultOfSecondSaveShouldReturnTwo();
        test.resultOfThirdSaveShouldReturnThree();

        test.idOfFirstBookShouldReturnOne();
        test.idOfSecondBookShouldReturnTwo();
        test.idOfThirdBookShouldReturnThree();

        test.shouldDelete();
        test.shouldNotDeleteNotExisting();
        test.shouldNotDeleteFromEmptyReader();
        test.shouldNotDeletePreviouslyDeleted();

    }

    void resultOfFirstSaveShouldReturnOne() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        Long expected = 1L;

        Long real = db.save(book1);

        printTestResult(expected.equals(real), "Result of 1st save should return 1");
    }

    void resultOfSecondSaveShouldReturnTwo() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");

        Long expected = 2L;

        db.save(book1);
        Long real = db.save(book2);

        printTestResult(expected.equals(real), "Result of 2nd save should return 2");
    }

    void resultOfThirdSaveShouldReturnThree() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");

        Long expected = 3L;

        db.save(book1);
        db.save(book2);
        Long real = db.save(book3);

        printTestResult(expected.equals(real), "Result of 3rd save should return 3");
    }

    void idOfFirstBookShouldReturnOne() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        Long expected = 1L;

        db.save(book1);
        Long real = book1.getId();

        printTestResult(expected.equals(real), "Id of 1st book should return 1");
    }

    void idOfSecondBookShouldReturnTwo() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");

        Long expected = 2L;

        db.save(book1);
        db.save(book2);
        Long real = book2.getId();

        printTestResult(expected.equals(real), "Id of 2nd book should return 2");
    }

    void idOfThirdBookShouldReturnThree() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");

        Long expected = 3L;

        db.save(book1);
        db.save(book2);
        db.save(book3);
        Long real = book3.getId();

        printTestResult(expected.equals(real), "Id of 3rd book should return 3");
    }

    void shouldDelete() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        db.save(book1);

        boolean expectedDeleted = true;
        boolean reallyDeleted = db.delete(1L);

        printTestResult(expectedDeleted == reallyDeleted, "Should delete");
    }

    void shouldNotDeleteNotExisting() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        boolean expectedDeleted = false;

        db.save(book1);
        boolean reallyDeleted = db.delete(5L);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete not existing ids");
    }

    void shouldNotDeleteFromEmptyReader() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        boolean expectedDeleted = false;
        boolean reallyDeleted = db.delete(1L);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete not existing ids from empty reader");
    }

    void shouldNotDeletePreviouslyDeleted() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        boolean expectedDeleted = false;

        db.delete(3L);
        boolean reallyDeleted = db.delete(3L);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete previously deleted - testing list functionality");
    }

}
