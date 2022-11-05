package student_levs_blinnikovs.lesson_12_collections.level_2_intern.task_6_x;

import java.util.List;
import java.util.Optional;

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

        test.shouldDeleteById();
        test.shouldNotDeleteNotExistingById();
        test.shouldNotDeleteFromEmptyReaderById();
        test.shouldNotDeletePreviouslyDeletedById();

        test.shouldDeleteByBookObject();
        test.shouldNotDeleteNotSavedByBookObject();
        test.shouldNotDeleteFromEmptyReaderByBookObject();
        test.shouldNotDeletePreviouslyDeletedByBookObject();

        test.findByIdShouldReturnExisting();
        test.findByIdShouldNotReturnNotExisting();
        test.findByIdShouldNotReturnNotExistingEmptyReader();

        test.findByAuthorShouldReturn();
        test.findByAuthorShouldReturnMultiple();
        test.findByAuthorShouldNotReturnNotExisting();
        test.findByAuthorShouldNotReturnEmptyForEmptyReader();

        test.findByTitleShouldReturn();
        test.findByTitleShouldReturnMultiple();
        test.findByTitleShouldNotReturnNotExisting();
        test.findByTitleShouldNotReturnEmptyForEmptyReader();

        test.shouldCountMultiple();
        test.shouldReturn0ForEmptyReader();
        test.shouldRecalculateAfterBookRemoval();

        test.shouldDeleteByAuthor();
        test.shouldNotDeleteNotExistingByAuthor();
        test.shouldNotDeleteFromEmptyReaderByAuthor();
        test.shouldNotDeletePreviouslyDeletedByAuthor();

        test.shouldDeleteByTitle();
        test.shouldNotDeleteNotExistingByTitle();
        test.shouldNotDeleteFromEmptyReaderByTitle();
        test.shouldNotDeletePreviouslyDeletedByTitle();

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

    void shouldDeleteById() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        db.save(book1);

        boolean expectedDeleted = true;
        boolean reallyDeleted = db.delete(1L);

        printTestResult(expectedDeleted == reallyDeleted, "Should delete");
    }

    void shouldNotDeleteNotExistingById() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        boolean expectedDeleted = false;

        db.save(book1);
        boolean reallyDeleted = db.delete(5L);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete not existing ids");
    }

    void shouldNotDeleteFromEmptyReaderById() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        boolean expectedDeleted = false;
        boolean reallyDeleted = db.delete(1L);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete not existing ids from empty reader");
    }

    void shouldNotDeletePreviouslyDeletedById() {
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

    void shouldDeleteByBookObject() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        db.save(book1);

        boolean expectedDeleted = true;
        boolean reallyDeleted = db.delete(book1);

        printTestResult(expectedDeleted == reallyDeleted, "Should delete by object");
    }

    void shouldNotDeleteNotSavedByBookObject() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");

        boolean expectedDeleted = false;

        db.save(book1);
        boolean reallyDeleted = db.delete(book2);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete not saved book");
    }

    void shouldNotDeleteFromEmptyReaderByBookObject() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");

        boolean expectedDeleted = false;
        boolean reallyDeleted = db.delete(book1);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete not added book from empty reader");
    }

    void shouldNotDeletePreviouslyDeletedByBookObject() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        boolean expectedDeleted = false;

        db.delete(book3);
        boolean reallyDeleted = db.delete(book3);

        printTestResult(expectedDeleted == reallyDeleted, "Should not delete previously deleted by object - testing list functionality");
    }

    void findByIdShouldReturnExisting() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book savedBook = new Book("Sally Rooney", "Normal People");

        db.save(savedBook);

        Optional<Book> dbBook = db.findById(1L);

        printTestResult(dbBook.equals(Optional.of(savedBook)), "Finding by id should return existing book");
    }

    void findByIdShouldNotReturnNotExisting() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book savedBook = new Book("Sally Rooney", "Normal People");

        db.save(savedBook);

        Optional<Book> dbBook = db.findById(2L);

        printTestResult(dbBook.equals(Optional.empty()), "Finding by id should NOT return NOT existing book");
    }

    void findByIdShouldNotReturnNotExistingEmptyReader() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        Optional<Book> dbBook = db.findById(1L);

        printTestResult(dbBook.equals(Optional.empty()), "Finding by id should NOT return NOT existing book in empty reader");
    }

    void findByAuthorShouldReturn() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        List<Book> dbBookSearchResult = db.findByAuthor("George Orwell");

        printTestResult(dbBookSearchResult.equals(List.of(book2)), "Finding by author should return existing book single result");
    }

    void findByAuthorShouldReturnMultiple() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Burmese Days", "George Orwell");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        List<Book> dbBookSearchResult = db.findByAuthor("George Orwell");

        printTestResult(dbBookSearchResult.equals(List.of(book2, book4, book5)), "Finding by author should return existing book multiple result");
    }

    void findByAuthorShouldNotReturnNotExisting() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Burmese Days", "George Orwell");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        List<Book> dbBookSearchResult = db.findByAuthor("Aldous Huxley");

        printTestResult(dbBookSearchResult.isEmpty(), "Finding by author should NOT return books that do not exist");
    }

    void findByAuthorShouldNotReturnEmptyForEmptyReader() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        List<Book> dbBookSearchResult = db.findByAuthor("Aldous Huxley");

        printTestResult(dbBookSearchResult.isEmpty(), "Finding by author should NOT return books from an empty reader");
    }

    void findByTitleShouldReturn() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        List<Book> dbBookSearchResult = db.findByTitle("1984");

        printTestResult(dbBookSearchResult.equals(List.of(book2)), "Finding by title should return existing book single result");
    }

    void findByTitleShouldReturnMultiple() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Life After Life", "Kate Atkinson");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        List<Book> dbBookSearchResult = db.findByTitle("Life After Life");

        printTestResult(dbBookSearchResult.equals(List.of(book3, book5)), "Finding by title should return existing book multiple result");
    }

    void findByTitleShouldNotReturnNotExisting() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Theodore Dreiser", "The Financier");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Burmese Days", "George Orwell");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        List<Book> dbBookSearchResult = db.findByTitle("The Cloud Atlas");

        printTestResult(dbBookSearchResult.isEmpty(), "Finding by title should NOT return books that do not exist");
    }

    void findByTitleShouldNotReturnEmptyForEmptyReader() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        List<Book> dbBookSearchResult = db.findByTitle("The Cloud Atlas");

        printTestResult(dbBookSearchResult.isEmpty(), "Finding by title should NOT return books from an empty reader");
    }

    void shouldCountMultiple() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Life After Life", "Kate Atkinson");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        int dbSize = db.countAllBooks();

        printTestResult(dbSize == 5, "Should calculate multiple");
    }

    void shouldReturn0ForEmptyReader() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        int dbSize = db.countAllBooks();

        printTestResult(dbSize == 0, "Should return 0 for empty reader");
    }

    void shouldRecalculateAfterBookRemoval() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Life After Life", "Kate Atkinson");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        db.delete(book3);

        int dbSize = db.countAllBooks();

        printTestResult(dbSize == 4, "Should recalculate after deletion");
    }

    void shouldDeleteByAuthor() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Life After Life", "Kate Atkinson");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        db.deleteByAuthor("George Orwell");

        printTestResult(db.countAllBooks() == 3, "Should delete by author");
    }

    void shouldNotDeleteNotExistingByAuthor() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("Life After Life", "Jill McCorkle");
        Book book3 = new Book("Life After Life", "Kate Atkinson");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        db.deleteByAuthor("George Orwell");

        printTestResult(db.countAllBooks() == 3, "Should not delete not existing books by author");
    }

    void shouldNotDeleteFromEmptyReaderByAuthor() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        db.deleteByAuthor("George Orwell");

        printTestResult(db.countAllBooks() == 0, "Should not delete not existing books from empty reader"); // not sure how to test this... check that function didn't do anything...
    }

    void shouldNotDeletePreviouslyDeletedByAuthor() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Sally Rooney", "Normal People");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Financier", "Theodore Dreiser");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        db.deleteByAuthor("Theodore Dreiser");
        db.deleteByAuthor("Theodore Dreiser");

        printTestResult(db.countAllBooks() == 2, "Should not delete previously deleted by author - testing list functionality");
    }

    void shouldDeleteByTitle() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Normal People", "Sally Rooney");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Life After Life", "Jill McCorkle");
        Book book4 = new Book("Animal Farm", "George Orwell");
        Book book5 = new Book("Life After Life", "Kate Atkinson");

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);

        db.deleteByTitle("Life After Life");

        printTestResult(db.countAllBooks() == 3, "Should delete by title");
    }

    void shouldNotDeleteNotExistingByTitle() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Normal People", "Sally Rooney");
        Book book2 = new Book("Life After Life", "Jill McCorkle");
        Book book3 = new Book("Life After Life", "Kate Atkinson");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        db.deleteByTitle("1984");

        printTestResult(db.countAllBooks() == 3, "Should not delete not existing books by title");
    }

    void shouldNotDeleteFromEmptyReaderByTitle() {
        BookDatabaseImpl db = new BookDatabaseImpl();

        db.deleteByTitle("1984");

        printTestResult(db.countAllBooks() == 0, "Should not delete not existing books from empty reader by title"); // not sure how to test this... check that function didn't do anything...
    }

    void shouldNotDeletePreviouslyDeletedByTitle() {
        BookDatabaseImpl db = new BookDatabaseImpl();
        Book book1 = new Book("Normal People", "Sally Rooney");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Financier", "Theodore Dreiser");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        db.deleteByTitle("1984");
        db.deleteByTitle("1984");

        printTestResult(db.countAllBooks() == 2, "Should not delete previously deleted by title - testing list functionality");
    }

}
